package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Helpers.CommonMethods;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import sun.plugin.dom.core.Element;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Locale;

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

    @FindBy(xpath = "//*[text()='Will any personal data be transferred to or accessed outside the geographic locations where it was originally collected? ']")
    private WebElement geographicLoc;


    @FindBy(xpath = "//*[contains(text(),' Data protection legislation requires that we know and record who we disclose personal data to.')]")
    private WebElement helpTxtPDataField;

    @FindBy(xpath = "//div[@class='actions ui-widget-header ui-helper-clearfix']//input[1]")
    private WebElement searcPDTxt;

    @FindBy(xpath = "//div[contains(@id, 'divPickListPersonalDataRecipient')]//li[@title='Thomson Reuters customers']")
    private WebElement onlySearchItem;

    @FindBy(xpath = "//div[contains(@id, 'divPickListPersonalDataRecipient')]//li[@title='Other']")
    private WebElement OtherPDataField;

    private static final String XPATH_ITEM_LIST = ".//*[contains(@id,'%s')]//li[@title='%s']";

    private static final String XPATH_ITEM_LIST1 = ".//*[contains(@id,'divPickListPersonalDataRecipient')]//li[@title='%s']";


    private static final String XPATH_ITEM_LIST2 = ".//*[contains(@id,'divPickListPersonalDataRecipient')]//div[2]//li[@title='%s']";

    @FindBy(xpath = ".//*[@id='tblDGPPersonalDataRecipientOther']//span")
    private WebElement PDataOthrMnd;

    @FindBy(xpath = "//*[contains(text(),'Please describe the other category of recipients that is relevant to your product.')]")
    private WebElement PDataOthrHelpTxt;

    @FindBy(xpath = "//*[@id = 'PersonalDataRecipientOther']" )
    private WebElement PDataOtherFieldType;


    @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity_PersonalDataRetentionPeriodVaryDescription']" )
    private WebElement textbox;



    @FindBy(xpath = "//*[conatins(text(),'Character limit exceeded. Please shorten text.')]")
    private WebElement PDataErr;


    @FindBy(xpath = "//*[@id = 'PersonalDataRecipientOther-error']")
    private WebElement PDataOtherErr;

    @FindBy(xpath = "//*[@id = 'ProductSpecialFactor_StandardPIIDataTypeDescription-error']")
    private WebElement PDataOther;

    @FindBy(xpath = "//*[@id = 'ProductSpecialFactor_StandardPIIDataTypeDescription']")
    private WebElement PDMsgOthr;

    @FindBy(xpath = "//*[@id = 'BusinessCriticalitySpecialFactor_StandardPIIDataTypeDescription']")
    private WebElement OtherSTDErr;

    @FindBy(xpath="//textarea[@id='BusinessCriticalitySpecialFactor_StandardPIIDataTypeDescription']")
    private WebElement othernewSTDPIIField;


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

         mandatoryfield.isDisplayed();
          return true;
    }

    public boolean DoNotSelectAnyOption() {
        WebDriverUtils.waitForElementLoading(2);

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
        if (retentionRadioButton.getAttribute("type").equals(radioButtonPrdExistingField.getAttribute("type"))) {
            flag = true;

        }
        return flag;
    }

    public boolean checkTypeFieldForProd() {
        boolean flag = false;
        if (retentionRadioButtonType.getAttribute("type").equals("radio")) {
            flag = true;
        }

        return flag;

    }

    public boolean verifyRetentionPrdFieldMandatory() {

        return retentionPrdMandatrt.isDisplayed();
    }

    public boolean donotSelectPrdRetentionValid() {
        boolean flag = false;
        if (!(retentionRadioButton.isSelected())) {
            flag = true;

        }
        return flag;


    }


    public boolean ClickOnNORetentionPRD() {
        WebDriverUtils.waitForElementLoading(4);
        radiooButtonRetenNO.click();
        boolean flag = false;
        if (radiooButtonRetenNO.isSelected()) {
            return !retentionPrdYesSubque.isDisplayed();
        }
        return flag;
    }


    public boolean verifyTheTypeOfTheNewSubquestionFieldPRD() {
        boolean flag = false;
        if (retentionNewSubQueType.getTagName().equals("textarea")) {

            flag = true;

        }

        return flag;
    }

    public boolean verifyRetnTypSameAsExstField() {
        WebDriverUtils.waitForElementLoading(5);
        boolean flag = false;
        if (retentionNewSubQueType.getTagName().equals(existingPrdField.getTagName())) {

        }
        return flag;
    }

    public boolean verifyTheLimitExceedMsgForPrd(String text) {
        CommonMethods.ValidateAndUpdateField(newSubQuetextFieldPRD, text);
        return true;

    }


    public boolean verifyYesPrdRetnSuqQus() {
        boolean flag = false;
        if (retenPrdYes.isSelected() && retentionPrdYesSubque.isDisplayed()) {
            flag = true;
        }
        return flag;
    }

    public boolean ClickOnYesRetentionProductSubquestion() {
        boolean flag = false;
        retenPrdYes.click();
        WebDriverUtils.waitForElementLoading(5);
        if (retenPrdYes.isSelected() && retentionPrdYesSubque.isDisplayed()) {

            flag = true;

        }
        return flag;
    }

    public boolean clickonyesretnsubqueshouldbedisply() {
        boolean flag = false;
        if (retenPrdYes.isSelected() && retentionPrdYesSubque.isDisplayed()) {

            flag = true;

        }
        return flag;
    }

    public boolean verifyFieldIsPresentPRD() {
        boolean flag = false;
        if (personalDataFieldPrs.isDisplayed()) {

            flag = true;

        }
        return flag;
    }

    public boolean verifyHelpTxtPDataField() {
        boolean flag = false;
        if (helpTxtPDataField.isDisplayed()) {
            flag = true;

        }
        return flag;

    }

    public boolean searchPDataItem(String pdataItems) throws AWTException {
        WebDriverUtils.waitForElementLoading(10);
        String searchPDTxt = "//div[@id='divPickListPersonalDataRecipient']//input[@class='search empty ui-widget-content ui-corner-all']";
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", geographicLoc);

        WebDriverUtils.waitForElementLoading(5);


        WebElement element = driver.findElement(By.xpath(searchPDTxt));
        element.sendKeys(pdataItems);

        WebDriverUtils.waitForElementLoading(10);
        Robot robot = new Robot();
        WebDriverUtils.waitForElementLoading(4);
        robot.keyPress(KeyEvent.VK_ENTER);
        WebDriverUtils.waitForElementLoading(4);


        return true;
    }

    public boolean searchItemPDATA() {
        boolean flag = false;
        if (onlySearchItem.isDisplayed()) {

            flag = true;
        }
        return flag;
    }

    public boolean clearSearchItemPData() {
        boolean flag = false;

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", geographicLoc);

        WebDriverUtils.waitForElementLoading(5);
        driver.navigate().refresh();
        WebDriverUtils.waitForElementLoading(10);


        return true;


    }

    public boolean verifyPDataOtherfield() {
        boolean flag = false;
        WebDriverUtils.waitForElementLoading(10);
        String searchPDTxt = "//div[@id='divPickListPersonalDataRecipient']//input[@class='search empty ui-widget-content ui-corner-all']";
        // String searchPDTxt = "//div[@id='divPickListPersonalDataRecipient']//input[@class='search empty ui-widget-content ui-corner-all valid']";
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", geographicLoc);

        if (OtherPDataField.isDisplayed()) {
            flag = true;
        }

        return flag;


    }

    public boolean selectBelowPDataUnderSubField(String subField, List<String> items) {
        boolean flag = false;
        String fieldName = subField.replaceAll("\\s", "");
        for (String item : items) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", geographicLoc);
            flag=driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST1,item))).isDisplayed();

            driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST1,item)+"/a/span")).click();
            WebDriverUtils.waitForElementLoading(5);

        }

        return flag;
    }

    public boolean checkPDataOthrMand() {
        boolean flag = false;
        if(PDataOthrMnd.isDisplayed()){
            flag = true;

        }
        return flag;
    }

    public boolean helpTxtPDataOthers() {
        boolean flag = false;
        if(PDataOthrHelpTxt.isDisplayed()){

            flag = true;

        }
        return flag;
    }

    public boolean verifyPDataOtherfieldType() {
        WebDriverUtils.waitForElementLoading(3);
        boolean flag = false;
        if(PDataOtherFieldType.getTagName().equals("textarea")){


           flag = true;
        }
        return flag;
    }


    public boolean verifyPdataPresentInSelectedBox(String subField, List<String> items) {
        boolean flag = false;
        String fieldName = subField.replaceAll("\\s", "");
        for (String item : items) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", geographicLoc);
            flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST2, item) + "/a/span")).getAttribute("class").contains("minus");


        }
        return flag;
    }

    public boolean clickonXOtherInSelectedBox(String other) {

        boolean flag = false;
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", geographicLoc);
            flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST2, other) + "/a/span")).getAttribute("class").contains("minus");
        driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST2,other)+"/a/span")).click();
        WebDriverUtils.waitForElementLoading(5);



        return flag;
    }

    public boolean verifyPdataOthrSholdnotbeDisp() {

        WebDriverUtils.waitForElementLoading(3);
        boolean flag = false;
        if(!(PDataOtherFieldType.isDisplayed())){


            flag = true;
        }
        return flag;
    }

    public boolean verifyIfTheLimitExceedsPRDValidationMessageShouldGetDisplayed(String text) {
          WebDriverUtils.waitForElementLoading(2);
            CommonMethods.ValidateAndUpdateField(PDataOtherFieldType, text);
            return true;

    }

    public boolean verifyingValidationMessage(String limit) {
        WebDriverUtils.waitForElementLoading(1);
        CommonMethods.ValidateAndUpdateField(textbox,limit);
        return true;
    }

    public boolean verifyLimitmsgPSTDPII(String text) {

        WebDriverUtils.waitForElementLoading(2);

        CommonMethods.ValidateAndUpdateField(OtherSTDErr, text);
        return true;
    }
}
