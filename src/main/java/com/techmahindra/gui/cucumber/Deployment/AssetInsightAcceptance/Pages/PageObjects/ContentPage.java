package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


/**
 * Created by SK00447696 on 2/23/18.
 */
public class ContentPage extends BasePage {
    public ContentPage() throws Exception {
        super();
    }

    @FindBy(xpath = ".//*[@id='widget_content_ContentType']")
    private WebElement contentHomePage;

    @Override
    protected WebElement elementForLoading() throws Exception {
        return contentHomePage;
    }

    @Override
    public boolean isPageDisplayed() throws Exception {
        WebDriverUtils.waitForElementIsPresent(contentHomePage,10);
        return contentHomePage.isDisplayed();
    }

    @Override
    protected void pageName() throws Exception {

    }
}
