package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Helpers.CommonMethods;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import sun.plugin.dom.core.Element;
import sun.plugin.dom.html.HTMLInputElement;

import javax.management.modelmbean.RequiredModelMBean;
import javax.swing.*;
import javax.swing.plaf.basic.BasicMenuUI;

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

    @FindBy(xpath = ".//*[text()='Does the retention period vary according to the types of data stored? ']")
    private WebElement productRetentionType;

    @FindBy(xpath = ".//*[text()='Does the retention period vary according to the types of data stored? ']/../td[2]/div/input")
    private WebElement retentionRadioButton;

    @FindBy(xpath = "//*[@id='ProductSpecialFactor_StandardCustomerOrPartnerData']")
    private WebElement radioButtonPrdExistingField;

    @FindBy(xpath = "//*[@id='PersonalDataDoesRetentionPeriodVary']")
    private WebElement retentionRadioButtonType;

    @FindBy(xpath = ".//*[text()='Does the retention period vary according to the types of data stored? ']//span")
    private WebElement retentionPrdMandatrt;

    @FindBy(xpath = "//*[@id='PersonalDataDoesRetentionPeriodVary-error']")
    private WebElement donotSelPrd;

    @FindBy(xpath = "//*[@id='PersonalDataDoesRetentionPeriodVary'][1]")
    private WebElement retentnRadiobuttnYes;

    @FindBy(xpath = "//*[@id = 'trprodperiodanswer']//td")
    private WebElement retentionPrdYesSubque;

    @FindBy(xpath = "//*[@id='PersonalDataDoesRetentionPeriodVary'][2]")
    private WebElement radiooButtonRetenNO;

    @FindBy(xpath = "//*[@id = 'PersonalDataRetentionPeriodVaryDescription']")
    private WebElement retentionNewSubQueType;

    @FindBy(xpath = "//*[@id = 'ProductSpecialFactor_DataSensitiveToHostingContextDescription']")
    private WebElement existingPrdField;

    @FindBy(xpath = "//*[@id='PersonalDataDoesRetentionPeriodVary'][1]")
    private WebElement retenPrdYes;

    @FindBy(xpath = "//*[@id='PersonalDataRetentionPeriodVaryDescription']")
    private WebElement newSubQuetextFieldPRD;

    @FindBy(xpath = "//div[@class= 'ai-edit-field pickerLinkWidth']//*[text()='Who receives personal data from your product? ']")
    private WebElement personalDataFieldPrs;

    @FindBy(xpath = "//*[contains(text(),' Data protection legislation requires that we know and record who we disclose personal data to.')]")
    private WebElement helpTxtPDataField;


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
        CommonMethods.ValidateAndUpdateField(newSubQuetextField, textvalue);
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

    public boolean verifyProductRetentionperiod() {
        return productRetentionType.isDisplayed();

    }

    public boolean verifyPrdRetentionType() {
        WebDriverUtils.waitForElementLoading(7);
        boolean flag = false;
        if(retentionRadioButton.getAttribute("type").equals(radioButtonPrdExistingField.getAttribute("type"))){
            flag = true;

        }
        return flag;
    }

    public boolean checkTypeFieldForProd() {
        boolean flag = false;
        if(retentionRadioButtonType.getAttribute("type").equals("radio")){
            flag = true;
        }

        return flag;

    }

    public boolean verifyRetentionPrdFieldMandatory() {

        return retentionPrdMandatrt.isDisplayed();
    }

    public boolean donotSelectPrdRetentionValid() {
        boolean flag = false;
       if(!(retentionRadioButton.isSelected())){
            flag = true;

       }
        return flag;


    }



    public boolean ClickOnNORetentionPRD() {
        WebDriverUtils.waitForElementLoading(4);
        radiooButtonRetenNO.click();
        boolean flag = false;
        if(radiooButtonRetenNO.isSelected()){
            return !retentionPrdYesSubque.isDisplayed();
        }
        return flag;
    }


    public boolean verifyTheTypeOfTheNewSubquestionFieldPRD() {
        boolean flag = false;
        if(retentionNewSubQueType.getTagName().equals("textarea")){

            flag = true;

        }

        return flag;
    }

    public boolean verifyRetnTypSameAsExstField() {
        WebDriverUtils.waitForElementLoading(5);
        boolean flag = false;
        if(retentionNewSubQueType.getTagName().equals(existingPrdField.getTagName())){

        }
        return flag;
    }

    public boolean verifyTheLimitExceedMsgForPrd(String text) {
        CommonMethods.ValidateAndUpdateField(newSubQuetextFieldPRD, text);
        return true;

    }


    public boolean verifyYesPrdRetnSuqQus() {
        boolean flag = false;
        if(retenPrdYes.isSelected() && retentionPrdYesSubque.isDisplayed()){
            flag = true;
        }
        return flag;
    }

    public boolean ClickOnYesRetentionProductSubquestion() {
        boolean flag =false;
        retenPrdYes.click();
        WebDriverUtils.waitForElementLoading(5);
        if(retenPrdYes.isSelected() && retentionPrdYesSubque.isDisplayed()){

            flag = true;

        }
        return flag;
    }

    public boolean clickonyesretnsubqueshouldbedisply() {
        boolean flag =false;
        if(retenPrdYes.isSelected() && retentionPrdYesSubque.isDisplayed()){

            flag = true;

        }
        return flag;
    }

    public boolean verifyFieldIsPresentPRD() {
        boolean flag = false;
        if(personalDataFieldPrs.isDisplayed()){

            flag = true;

        }
        return flag;
    }

    public boolean verifyHelpTxtPDataField() {
    boolean flag = false;
    if(helpTxtPDataField.isDisplayed()){
        flag = true;

    }
    return flag;

    }
}

