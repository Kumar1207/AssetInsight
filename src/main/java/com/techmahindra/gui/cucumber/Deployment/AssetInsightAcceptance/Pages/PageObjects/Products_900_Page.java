package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Util.Utility;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Map;

public class Products_900_Page extends BasePage {

    @FindBy(xpath = "//*[text()='New Product']")
    private WebElement createNewProduct;

    @FindBy(xpath = "//*[@id='Name']")
    private WebElement productName;

    @FindBy(xpath = "//*[@id='BusinessUnitId']")
    private WebElement businessUnit;

    @FindBy(xpath = "//*[@id='BusinessSubSegmentId']")
    private WebElement businessSubSegmentID;

    @FindBy(xpath = "//*[@id='Status']")
    private WebElement productstatus;

    @FindBy(xpath = "//*[@id='ProductLevel']")
    private WebElement productLevel;

    @FindBy(xpath = "//*[@id='widget_DataGovernanceProduct_Status']")
    private WebElement productsHomePage;

    @FindBy(xpath = "//*[@id='_ac_ContactsMarketingCSV']")
    private WebElement marketingCOntact;

    @FindBy(xpath = "//*[text()='Products'])[2]")
    private WebElement products;

    @FindBy(xpath = "//*[text()='3E']")
    private WebElement selectAnyProduct;

    @FindBy(xpath = "//*[contains(text(),'Please provide a short description of the product')])[2]")
    private WebElement newFieldInProducts;

    @FindBy(xpath = "//*[@id='DescriptionOfPersonalDataUsage']")
    private WebElement newFieldtxtBox;


    @FindBy(xpath = "//*[contains(text(),'recipients of the personal data and a general statement on why and how the personal data is used.')])[2]")
    private WebElement newFieldHelptxtBox;

    @FindBy(xpath = "//*[@class='tipsLink2 navigate-away-disable'])[1]")
    private WebElement informationSymbol;

    @FindBy(xpath = "//*[contains(text(),'Please provide a short description of the product')])[1]")
    private WebElement newFieldInInformationBox;

    @FindBy(xpath = "//*[contains(text(),'In order to determine the purpose for which personal data is being processed')])[1]")
    private WebElement helpTextInInformationBox;

    @FindBy(xpath = "//*[contains(text(),'Please provide a short description of the product')]//span")
    private WebElement mandatorySymbol;

    @FindBy(xpath = "//*[text()='short description of the product use of personal data']")
    private WebElement updatedFieldInAuditHistory;

    @FindBy(xpath = "//*[contains(text(),'3E Product short description')]")
    private WebElement updatedFieldInDetailsPage;

    public Products_900_Page() throws Exception {
        super();
    }

    @Override
    protected WebElement elementForLoading() throws Exception {
        return productsHomePage;
    }

    @Override
    public boolean isPageDisplayed() throws Exception {
        return productsHomePage.isDisplayed();
    }

    @Override
    protected void pageName() throws Exception {

    }

    public boolean createNewProduct(String productType, Map<String, String> CreateProductFields) {

        createNewProduct.click();
        WebDriverUtils.waitForElementLoading(5);
        String productFieldName = "";

        switch (productType.toLowerCase()) {
            case "create":
                for (String key : CreateProductFields.keySet()) {
                    //applicationFieldName = createApplicationFields.get(key) + timeStamp;
                    productFieldName = CreateProductFields.get(key) + "_" + Utility.genRand5DigitNum();
                    switch (key.toLowerCase()) {
                        case "product name":
                            productName.sendKeys(productFieldName);
                            break;
                        case "business unit":
                            Select select = new Select(businessUnit);
                            select.selectByVisibleText(CreateProductFields.get(key));
                            break;
                        case "business sub segment":
                            //div[@class='k-multiselect-wrap k-floatwrap']
                            Select select1 = new Select(businessSubSegmentID);
                            select1.selectByVisibleText(CreateProductFields.get(key));
                            break;
                        case "product status":
                            Select sel = new Select(productstatus);
                            sel.selectByVisibleText(CreateProductFields.get(key));
                            break;
                        case "product level":
                            Select product = new Select(productLevel);
                            product.selectByVisibleText(CreateProductFields.get(key));
                            break;

                        case "marketing contact":
                            WebDriverUtils.waitForElementLoading(2);
                            marketingCOntact.sendKeys(CreateProductFields.get(key));
                            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", marketingCOntact);
                            marketingCOntact.click();
                            WebDriverUtils.waitForElementLoading(1);

                            try {
                                Robot robot = new Robot();
                                marketingCOntact.sendKeys("Prashanthi Modium");
                                WebDriverUtils.waitForElementLoading(2);
                                WebElement mc = driver.findElement(By.xpath("//*[@id='ui-id-2']/li/div[contains(text(),'Prashanthi')]"));
                                WebDriverUtils.waitForElementLoading(2);
                                Actions actions = new Actions(driver);
                                actions.moveToElement(mc).click().perform();
                            } catch (AWTException e) {
                                e.printStackTrace();
                            }
                            break;
                        default:
                            return false;
                    }
                }
                break;
            default:
                return false;
        }
        return true;
    }

    public boolean selectAnyExistingProduct() {
        products.click();
        return products.isSelected();

    }

    public boolean verifyNewField() {
        return newFieldInProducts.isDisplayed();
    }

    public boolean verifyTypeOfTheField() {
        boolean flag = false;
        if (newFieldtxtBox.getAttribute("tagName").equals("textarea")) {
            flag = true;
        }
        return flag;

    }

    public boolean verifyHelpText() {
        return newFieldHelptxtBox.isDisplayed();
    }

    public boolean clickOnInformationNextToGeneralSection() {
        informationSymbol.click();

        return informationSymbol.isSelected();
    }

    public boolean verifyNewFieldandHelpTextInInformatioBox() {
        if (newFieldInInformationBox.isDisplayed() && helpTextInInformationBox.isDisplayed()) {
            return true;
        }
        return false;
    }

    public boolean verifyNewFieldShouldBeMandatoryField() {
        return mandatorySymbol.isDisplayed();
    }

    public boolean verifyUpdatedFieldInAuditHistory() {
        return updatedFieldInAuditHistory.isDisplayed();
    }

    public boolean verifyUpdatedFieldInDetailsPage() {
        return updatedFieldInDetailsPage.isDisplayed();
    }
}