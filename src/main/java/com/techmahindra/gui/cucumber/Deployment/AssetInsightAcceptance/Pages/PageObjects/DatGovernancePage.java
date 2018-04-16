package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DatGovernancePage extends BasePage {

    @FindBy(xpath = "//*[text()='Does the retention period vary according to the types of data stored?']")
    private WebElement retentionPeriodtypes;


    @FindBy(xpath = "//*[text()='Does the retention period vary according to the types of data stored?']/..//td[2]/div/input")
    private WebElement newFieldRadioBtn;

    @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity_PersonalDataDoesRetentionPeriodVary']")
    private WebElement radioButton;


    @FindBy(xpath = "(//*[@id='ApplicationDataPrivacySecurity_PersonalDataDoesRetentionPeriodVary'])[1]")
    private WebElement radioButtonYes;

    @FindBy(xpath = "(//*[@id='ApplicationDataPrivacySecurity_PersonalDataDoesRetentionPeriodVary'])[2]")
    private WebElement radioButtonYNo;


    @FindBy(xpath = "//*[@id='BusinessCriticalitySpecialFactor_StandardCustomerOrPartnerData']")
    private WebElement radioButtonExistnfField;

    @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity_PersonalDataDoesRetentionPeriodVary']")
    private WebElement radioButtonNewField;

    @FindBy(xpath = "//*[text()='Does the retention period vary according to the types of data stored?']//span")
    private WebElement mandatoryfield;

    @FindBy(xpath = "//*[@id='trperiodanswer']//td")
    private WebElement subQue;

    @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity_PersonalDataRetentionPeriodVaryDescription']")
    private WebElement newSubQuetextField;

    @FindBy(xpath = "//*[@id='BusinessCriticalitySpecialFactor_DataSensitiveToHostingContextDescription']")
    private WebElement existingField;

    @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity_PersonalDataRetentionPeriodVaryDescription-error']")
    private WebElement errorMsg;

    @FindBy(xpath = ".//*[text()='Technology']")
    private WebElement technologyHomePage;
/*
    @FindBy(xpath = "//*[text()='Data Sensitive to Hosting Context Description ' and //*[@id='BusinessCriticalitySpecialFactor_DataSensitiveToHostingContextDescription']]")
    private WebElement existingFieldtxtBox;*/

    public DatGovernancePage() throws Exception {
        super();
    }


    public boolean verifyTheNewFieldInTheDataGovernancePag() {

        return retentionPeriodtypes.isDisplayed();
    }


    public boolean TypeOfFieldInTheDataGovernancePage() {
        /*       System.out.println(radioButton.getAttribute("type"));*/

        boolean flag = false;
        if (radioButton.getAttribute("type").equals("radio")) {
            flag = true;
        }
        return flag;
    }

    public boolean VerifyThatFieldTypeOfShouldBeSameAsExistingFieldType() {

        WebDriverUtils.waitForElementLoading(5);
        /* System.out.println(newFieldRadioBtn.getAttribute("type"));*/

        boolean flag = false;
        if (newFieldRadioBtn.getAttribute("type").equals(radioButtonExistnfField.getAttribute("type"))) {
            flag = true;
        }
        return flag;

    }

    public boolean verifyThatItShouldBeAMandatoryField() {

        return mandatoryfield.isDisplayed();
    }

    public boolean DoNotSelectAnyOption() {

        boolean flag = true;
        if (!radioButtonNewField.isSelected()) {
            flag = false;
        }
        return flag;
    }

    public boolean ClickOnYesSubquestionShouldBeDisplayed() {

        boolean flag = false;
        if (radioButtonYes.isSelected() && subQue.isDisplayed()) {
            flag = true;
        }
        return flag;
    }

    public boolean clickOnNo() {
        WebDriverUtils.waitForElementLoading(4);
        radioButtonYNo.click();

        boolean flag = false;
        if (radioButtonYNo.isSelected()) {
            return !subQue.isDisplayed();

        }
        return flag;
    }

    public boolean verifyTheTypeOfTheNewSubquestionField() {
        WebDriverUtils.waitForElementLoading(3);
        boolean flag = false;
        if (newSubQuetextField.getTagName().equals("textarea")) {
            flag = true;
        }
        return flag;
    }

    public boolean VerifyThatItShouldBeSameAsExistingField() {
        WebDriverUtils.waitForElementLoading(5);
        boolean flag = false;
        if (newSubQuetextField.getTagName().equals(existingField.getTagName())) {
            flag = true;
        }
        return flag;
    }

    public boolean verifySubquestionFieldShouldBeMandatoryWhenMainQuestionValueIsYes() {
        WebDriverUtils.waitForElementLoading(5);
        radioButtonYes.click();

        boolean flag = false;
        if (radioButtonYes.isSelected() && newSubQuetextField.isDisplayed()) {
            flag = true;
        }
        return flag;

    }

    public boolean verifyIfTheLimitExceedsValidationMessageShouldGetDisplayed(String textvalue) {
        //CommonMethods.ValidateAndUpdateField(newSubQuetextField, textvalue);
        return true;
    }

    @Override
    protected WebElement elementForLoading() throws Exception {
        return technologyHomePage;
    }

    @Override
    public boolean isPageDisplayed() throws Exception {
        return technologyHomePage.isDisplayed();
    }

    @Override
    protected void pageName() throws Exception {

    }
}

