package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Helpers;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CommonMethods extends PageInstances {

    public static String ValidateAndUpdateField(WebElement element,String text1) {

        int i;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);

        i = text1.length();
        element.clear();
        WebDriverUtils.waitForElementLoading(1);
        if (i > 512 | i > 255) {
            WebDriverUtils.waitForElementLoading(1);
            element.sendKeys(text1);
            text1 = text1.substring(0, 512);
            element.clear();
            WebDriverUtils.waitForElementLoading(1);
            element.sendKeys(text1);

        } else {
            element.sendKeys(text1);

        }
        return text1;
    }

}
