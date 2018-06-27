package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.TestUtils;

import com.cucumber.listener.Reporter;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.managers.FileReaderManager;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "json:target/cucumber-report.json", "junit:target/cucumber-junit-report/cuc.xml"}
        , glue = {"com.techmahindra.gui.cucumber"}
        , plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report1.html"}
        , features = {"src/test/resources"}
        , monochrome = true
        , tags = {"@AC_TechnologyPage_3.1_01"}
)


public class AssetRunner extends PageInstances {
    @BeforeClass
    public static void BeforeClass() throws Exception
    {
        //ExtentCucumberFormatter.initiateExtentCucumberFormatter();

    }
    @AfterClass
    public static void CreateReport() throws Exception {
        Reporter.loadXMLConfig(new File(FileReaderManager.getInstance().getConfigReader().getReportConfigPath()));
        WebDriverUtils.waitForElementLoading(5);
        driver.quit();
    }
}

