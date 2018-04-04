package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SK00447696 on 2/23/18.
 */
public class TrademarkNOptionPage extends BasePage {
    public TrademarkNOptionPage() throws Exception {
        super();
    }

    @FindBy(xpath = ".//*[@id='domainSales']")
    private WebElement trademarkNOptionHomePage;
    @Override
    protected WebElement elementForLoading() throws Exception {
        return trademarkNOptionHomePage;
    }

    @Override
    public boolean isPageDisplayed() throws Exception {
        WebDriverUtils.waitForElementIsPresent(trademarkNOptionHomePage,10);
        return trademarkNOptionHomePage.isDisplayed();
    }

    @Override
    protected void pageName() throws Exception {

    }
}
