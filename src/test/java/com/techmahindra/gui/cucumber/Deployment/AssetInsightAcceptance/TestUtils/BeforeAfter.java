package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.TestUtils;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Helpers.Driver;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.LoginPage;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


/**
 * Created by SK00447696 on 2/21/18.
 */
public class BeforeAfter extends PageInstances {
   LoginPage loginPage;
    String browser = "FF";

    @Before



    public void setUp() throws Exception {
        try {
            Driver.setWebdriver(browser,true);
            driver = Driver.getDriver();
            driver.manage().deleteAllCookies();
           // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
         loginPage = PageFactory.initElements(Driver.getDriver(),LoginPage.class);
            goToStartPosition();
             } catch (Exception ex) {
            ex.printStackTrace();
        }
      }

    @After
    public void tearDown() throws IOException {
    }

    public void goToStartPosition() throws Exception {
        driver.manage().window().maximize();
        driver.get("https://assetsdev.int.thomsonreuters.com/");
       loginPage.login();
        WebDriverUtils.waitForElementLoading(1);
    }
}
