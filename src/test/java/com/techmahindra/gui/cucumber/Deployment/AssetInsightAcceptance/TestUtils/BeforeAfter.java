package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.TestUtils;

import com.cucumber.listener.Reporter;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Helpers.Driver;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.LoginPage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.dataproviders.ConfigFileReader;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;


import java.util.concurrent.TimeUnit;


/**
 * Created by SK00447696 on 2/21/18.
 */
public class BeforeAfter extends PageInstances {
    private LoginPage loginPage;
    private ConfigFileReader configFileReader= new ConfigFileReader();
    @Before
    public void setUp() throws Exception {
        try {
            Driver.setWebdriver(configFileReader.getBrowser(),true);
            driver = Driver.getDriver();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            goToStartPosition();
             } catch (Exception ex) {
            ex.printStackTrace();
        }
      }


    @After(order = 1)
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            String screenshotName = scenario.getName().replaceAll(" ", "_");
            try {
                //This takes a screenshot from the driver at save it to the specified location
                File sourcePath = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
                //Building up the destination path for the screenshot to save
                //Also make sure to create a folder 'screenshots' with in the cucumber-report folder
                File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
                //Copy taken screenshot from source location to destination location
                FileUtils.copyFile(sourcePath,destinationPath);

                //This attach the specified screenshot to the test
                Reporter.addScreenCaptureFromPath(destinationPath.toString());
            } catch (IOException e) {
            }
        }
    }


//    @After(order = 0)
//    public void AfterSteps() {
//        driver.quit();
//    }

    public void goToStartPosition() throws Exception {
        String userDetails[]=configFileReader.getUsernameAndPassword().split(":");
        driver.manage().window().maximize();
        driver.get(configFileReader.getApplicationUrl());
        try {
            loginPage = PageFactory.initElements(Driver.getDriver(), LoginPage.class);
        }catch(NullPointerException e){
            WebDriverUtils.waitForElementLoading(1);
            }
        loginPage.login(userDetails[0],userDetails[1]);
        WebDriverUtils.waitForElementLoading(1);
    }
}
