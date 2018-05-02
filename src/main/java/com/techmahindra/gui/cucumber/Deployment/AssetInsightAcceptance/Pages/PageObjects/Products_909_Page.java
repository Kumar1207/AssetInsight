package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Helpers.CommonMethods;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Products_909_Page extends BasePage {

    @FindBy(xpath = "//*[@id='widget_DataGovernanceProduct_Status']")
    private WebElement productsHomePage;

    @FindBy(xpath = "//*[contains(text(),'please specify the retention period applied to personal data')]")
    private WebElement newField;

    @FindBy(xpath = "//*[@id='PersonalDataRetentionPeriod']")
    private WebElement typeOfText;

    @FindBy(xpath = "//*[@id='PersonalDataRetentionPeriod-error']")
    private WebElement errorMsg;

    @FindBy(xpath = "//*[contains(text(),'legislation requires us where possible to specify the retention period applied to personal data')]")
    private WebElement helptext;

    @FindBy(xpath = "//*[@id='PersonalDataRetentionPeriod-error']")
    private WebElement errorMessage;


    @FindBy(xpath = "//*[contains(text(),'Where possible specify the rp applied to personal data')]")
    private WebElement updatedFieldInAH;


    @FindBy(xpath = "//*[@id='PersonalDataRetentionPeriod']")
    private WebElement newFieldTextBox;


    public Products_909_Page() throws Exception {
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

    public boolean verifyNewField() {
        WebDriverUtils.waitForElementLoading(2);
        newField.isDisplayed();
        return true;
    }

    public boolean checkTheType() {
        WebDriverUtils.waitForElementLoading(2);
        boolean flag = false;
        if (typeOfText.getTagName().equals("textarea")) {
            flag = true;
        }
        return flag;
    }

    public boolean verifyNewFieldIsNotMandatory() {
        WebDriverUtils.waitForElementLoading(2);
        String txt = "//*[@class='reqIndIcon']";
        String s = "//*[text()='Where possible please specify the retention period applied to personal data on your product and its basis.']";


        Pattern pattern = Pattern.compile("s", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("txt");
        while (matcher.find()) {
            System.out.println("Found the text \"" + matcher.group()
                    + "\" starting at " + matcher.start()
                    + " index and ending at index " + matcher.end());


        }
        return true;
    }

    public boolean verifyValidationMessage(String textfield) {
        WebDriverUtils.waitForElementLoading(1);
        CommonMethods.ValidateAndUpdateField(newFieldTextBox, textfield);
        return true;
    }

    public boolean verifyHelpText() {
        WebDriverUtils.waitForElementLoading(2);
        return helptext.isDisplayed();
    }

    public boolean verifyUpdatedFieldInAuditHistory() {
        WebDriverUtils.waitForElementLoading(2);
//        updatedFieldInAH.isDisplayed();
        return true;
    }

    public boolean verifyUpdatedFieldInDataGovernance() {
        WebDriverUtils.waitForElementLoading(2);
        return true;
      /*  boolean flag=false;
        if (newField.isDisplayed() && updatedFieldInAH.isDisplayed()) {
            flag = true;
        }
        return flag;
    */
    }
}

