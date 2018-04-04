package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;


public abstract class BasePage extends PageInstances {

    protected int _timeOut = 100;

    public BasePage() throws Exception {
        currentWindowHandler = driver.getWindowHandle();

        try {
            WebDriverUtils.waitForElementLoading(5);
            WebDriverUtils.waitForElementIsPresent(elementForLoading(),5);

        } catch (NoSuchElementException e) {
           e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        pageName();

    }
    protected abstract WebElement elementForLoading() throws Exception;

    public abstract boolean isPageDisplayed() throws Exception;

    protected abstract void pageName() throws Exception;



}
