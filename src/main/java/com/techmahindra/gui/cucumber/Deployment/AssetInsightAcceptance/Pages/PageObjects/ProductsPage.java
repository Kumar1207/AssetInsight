package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SK00447696 on 2/23/18.
 */
public class ProductsPage extends BasePage {
    public ProductsPage() throws Exception {
        super();
    }

    @FindBy(xpath = ".//*[@id='widget_DataGovernanceProduct_Status']")
    private WebElement productsHomePage;

    @Override
    protected WebElement elementForLoading() throws Exception {
        return productsHomePage;
    }

    @Override
    public boolean isPageDisplayed() throws Exception {
        WebDriverUtils.waitForElementIsPresent(productsHomePage,10);
        return productsHomePage.isDisplayed();
    }

    @Override
    protected void pageName() throws Exception {

    }
}
