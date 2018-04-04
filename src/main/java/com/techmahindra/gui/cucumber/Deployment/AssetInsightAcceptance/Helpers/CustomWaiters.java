package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Class with waiters
 */
public class CustomWaiters {
    private WebDriver _driver;

    public CustomWaiters(WebDriver driver) {
        _driver = driver;
    }

    /**
     * Check if loading balls are displayed on page
     *
     * @return true - if display
     */
    private boolean isLoading() {
        WebElement element = null;
        String cssLocator = "img[src *= 'loading.gif'], .pageLoader, .filterLoader>img";
        String script = "return $('" + cssLocator.replaceAll("'", "\"").replaceAll(":eq(0)", "") + "').first()[0];";
        element = (WebElement) ((JavascriptExecutor) _driver).executeScript(script.replaceAll("\r\n", ""));
        if (element == null)
            return false;
        else
            return true;
    }

    /**
     * Check if loading balls are displayed in portlet
     *
     * @return true - if display
     */
    private boolean isLoadingPortlet() {
        WebElement element = null;
        String cssLocator = "[class = 'portlet-loading']>img";
        String script = "return $('" + cssLocator.replaceAll("'", "\"").replaceAll(":eq(0)", "") + "').first()[0];";
        element = (WebElement) ((JavascriptExecutor) _driver).executeScript(script.replaceAll("\r\n", ""));
        if (element == null)
            return false;
        else
        if (element.isDisplayed())
            return true;
        else
            return false;
    }


    public WebElement firstTab() {
        WebElement toReturn = null;
        try {
            toReturn = _driver.findElement(By.xpath("//*[@id = 'id0']//div[contains(@class,'HtmlTextArea')]//table//img[@title = '']"));
        } catch (Exception e) {
        }
        return toReturn;
    }
    @FindBy(xpath = ".//div[contains(@class,'progressAnimation')]//img")
    private WebElement IsLoadingSpotfireTab;
}
