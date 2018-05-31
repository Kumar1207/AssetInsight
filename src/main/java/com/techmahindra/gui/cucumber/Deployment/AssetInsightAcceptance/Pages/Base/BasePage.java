package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Helpers.Driver;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


public abstract class BasePage extends PageInstances {

    protected int _timeOut = 100;

    public BasePage() throws Exception {
        currentWindowHandler = Driver.getDriver().getWindowHandle();
        try {
            WebDriverUtils.waitForElementLoading(2);
            WebDriverUtils.waitForElementIsPresent(elementForLoading(),2);
        } catch (NoSuchElementException e) {
            WebDriverUtils.waitForElementLoading(1);
        } catch (Exception e) {
            WebDriverUtils.waitForElementLoading(2);
        }
        pageName();

    }
    protected abstract WebElement elementForLoading() throws Exception;

    public abstract boolean isPageDisplayed() throws Exception;

    protected abstract void pageName() throws Exception;



}
