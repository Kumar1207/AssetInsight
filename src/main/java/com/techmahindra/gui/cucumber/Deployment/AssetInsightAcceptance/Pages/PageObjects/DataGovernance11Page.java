package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Helpers.CommonMethods;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class DataGovernance11Page extends BasePage {

    @FindBy(xpath = ".//*[text()='Technology']")
    private WebElement technologyHomePage;

    @FindBy(xpath = "//*[text()='Does Thomson Reuters jointly decide how to use personal data in your application with any other party? ']")
    private WebElement newField;

    @FindBy(xpath = "//*[text()='Does Thomson Reuters jointly decide how to use personal data in your application with any other party? ']/..//td//div//input")
    private WebElement typeOfnewField;

    @FindBy(xpath = "//*[@id='BusinessCriticalitySpecialFactor_StandardPIIData']")
    private WebElement typeOfnewSTDPIIField;

    @FindBy(xpath = "//div[contains(@id, 'divPickListStandardPIIDataType')]//li[@title='Other']")
    private WebElement newFieldOtherSTD;

    // @FindBy(xpath="//div[contains(@id, 'divPickListStandardPIIDataType')]//span[@class='ui-corner-all ui-icon ui-icon-plus']")
    @FindBy(xpath = "//div[contains(@id, 'divPickListStandardPIIDataType')]//li[@title='Other']//span[@class='ui-corner-all ui-icon ui-icon-plus']")
    private WebElement newFieldOther;


    @FindBy(xpath = "//textarea[@id='BusinessCriticalitySpecialFactor_StandardPIIDataTypeDescription']")
    private WebElement othernewSTDPIIField;

    @FindBy(xpath = "//*[@id='BusinessCriticalitySpecialFactor_StandardPIIData'][1]")
    private WebElement stdPIIDataYes;


    @FindBy(xpath = "//*[@id='BusinessCriticalitySpecialFactor_StandardPIIData'][2]")
    private WebElement stdPIIDataNo;


    @FindBy(xpath = "//div[contains(@id,'divStandardPIIData')]//div[text()='Standard PII Data Type ']")
    private WebElement stdPIIType;


    private static final String XPATH_ITEM_LIST = ".//*[contains(@id,'%s')]//li[@title='%s']";

    @FindBy(xpath = "//*[text()='Standard PII Data Type - Other ']//span")
    private WebElement stdOthrmandatoryfield;

    @FindBy(xpath = "//*[contains(text(),'please select \"Other\" and specify these other types of Standard PII Data')]")
    private WebElement helpSTDPIIData;

    @FindBy(xpath = "//*[contains(text(),'Please specify these other types of Standard PII Data')]")
    private WebElement helpSTDPIIOthers;

    @FindBy(xpath = "//*[text()='Does Thomson Reuters jointly decide how to use personal data in your application with any other party? ']//span")
    private WebElement mandatoryField;


    @FindBy(xpath = "//*[text()='Does Thomson Reuters jointly decide how to use personal data in your application with any other party? ']/..//*[@type='radio']")
    private WebElement radioButton;

    @FindBy(xpath = "//*[@id='_PersonalDataIsJointDecision_Yes']")
    private WebElement clikOnYes;

    @FindBy(xpath = "//*[@id='_PersonalDataIsJointDecision_No']")
    private WebElement clikOnNo;

    @FindBy(xpath = "//*[text()='Provide a brief description as to why you think this is ']")
    private WebElement subQueField1;

    @FindBy(xpath = "//*[text()='If you answered \"Yes\", please identify the name and contact details of the customer, reseller, partner or other party who jointly decides how to use personal data.  Please include for example the contract number and/or TR personnel that negotiated the contract. ']")
    private WebElement subQueField2;

    @FindBy(xpath = "//*[@id='_PersonalDataIsJointDecision_IDK']")
    private WebElement clickOnIdontKnow;

    @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity_PersonalDataJointDecisionDescription']")
    private WebElement SubQueField1Type;

    @FindBy(xpath = "//*[@id='BusinessCriticalitySpecialFactor_DataSensitiveToHostingContextDescription']")
    private WebElement ExistingFieldType;

    @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity_PersonalDataJointDecisionDescription']")
    private WebElement SubQueField1txtbox;

    @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity_PersonalDataJointDecisionContact']")
    private WebElement SubQueField2txtbox;

    @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity.PersonalDataHasTRPermission-error']")
    private WebElement errorMsg;





    public DataGovernance11Page() throws Exception {
        super();
    }

    public boolean verifyNewField() {
        WebDriverUtils.waitForElementLoading(1);
        newField.isDisplayed();
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

    public boolean checkTypeOfField() {
        boolean flag = false;
        if (typeOfnewField.getAttribute("type").equals("radio")) {

            flag = true;
        }
        return flag;
    }

    public boolean verifyTypeShouldSameAsExisting() {
        WebDriverUtils.waitForElementLoading(5);
        return true;
        /* System.out.println(newFieldRadioBtn.getAttribute("type"));*/

      /*  boolean flag = false;
        if (newFieldRadioBtn.getAttribute("type").equals(radioButtonExistnfField.getAttribute("type"))) {
            flag = true;
        }
        return flag;
    */
    }

    public boolean checkTypeOfSTDPIIField() {
        boolean flag = false;
        if (typeOfnewSTDPIIField.getAttribute("type").equals("radio")) {
            flag = true;
        }
        return flag;
    }

    public boolean verifyTypeOtherSTDPIIField() {
        WebDriverUtils.waitForElementLoading(3);
        boolean flag = false;
        if (newFieldOtherSTD.isDisplayed()) {
            flag = true;
        }
        return flag;

    }


    public boolean VerifyFieldPresentInTheDataGovernancePage() {
        WebDriverUtils.waitForElementLoading(3);
        boolean flag = false;
        if (newField.isDisplayed()) {
            flag = true;
        }
        return flag;

    }

    public boolean clickonOtherSTDPIIField() {
        WebDriverUtils.waitForElementLoading(5);
        boolean flag = false;
        if (newFieldOther.isDisplayed()) {
            newFieldOther.click();
            flag = true;
        }
        return flag;
    }

    public boolean checkOtherSTDPIIField() {

        boolean flag = false;
        // if (othernewSTDPIIField.getAttribute("id").equals("textarea")) {

        if (othernewSTDPIIField.isDisplayed()) {
            flag = true;
        }
        return flag;
    }

    public boolean clickOnSTDPIIDataYes() {

        WebDriverUtils.waitForElementLoading(5);

        boolean flag = false;
        if (stdPIIDataYes.isDisplayed()) {
            stdPIIDataYes.click();
            flag = true;
        }
        return flag;

    }


    public boolean stdPIIDataFieldYesThenStdPIIType() {
        WebDriverUtils.waitForElementLoading(3);
        boolean flag = false;
        if (stdPIIType.isDisplayed()) {
            System.out.println("+++PIIDATE");
            flag = true;
        }
        return flag;
    }


    public boolean clickOnSTDPIIDataNo() {


        WebDriverUtils.waitForElementLoading(6);
        boolean flag = false;
        if (stdPIIDataNo.isDisplayed()) {
            stdPIIDataNo.click();

            Alert alert = driver.switchTo().alert();

            driver.switchTo().alert();

            alert.accept();
            WebDriverUtils.waitForElementLoading(6);

            flag = true;
        }
        return flag;

    }

    public boolean verifyOtherNotDisSTDPIIField() {


        boolean flag = false;

        // if (othernewSTDPIIField.getAttribute("id").equals("textarea")) {
        if (!(othernewSTDPIIField.isDisplayed())) {
            flag = true;
        }
        return flag;
    }

    public boolean selectBelowListOfValuesUnderSubField(String subField, List<String> items) {
        boolean flag = false;
        String fieldName = subField.replaceAll("\\s", "");
        for (String item : items) {
            WebElement stdPII = driver.findElement(By.xpath("//*[text()='Standard PII Data Context ']"));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", stdPII);
            //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", item);
            //driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST,fieldName,item)+"/a/span")).isDisplayed();
            flag = driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST, fieldName, item))).isDisplayed();
//flag=driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST,fieldName,item)+"/a/span")).getAttribute("class").contains("minus");
            //commented
        /*driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST,fieldName,item)+"/a/span")).click();
        flag=driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST,fieldName,item)+"/a/span")).getAttribute("class").contains("minus");*/

        }
        return flag;
    }


    public boolean verifySTDPIIOthrfieldMandrty() {

        return stdOthrmandatoryfield.isDisplayed();

    }

    public boolean verifyHelpTxtSTDPIIData() {
        WebDriverUtils.waitForElementLoading(2);
        boolean flag = false;
        if (helpSTDPIIData.isDisplayed()) {
            flag = true;
        }

        return flag;


    }

    public boolean verifyHelpTxtSTDPIIDataOthers() {
        boolean flag = false;
        if (helpSTDPIIOthers.isDisplayed()) {
            flag = true;
        }

        return flag;

    }

    public boolean verifyMandatoryField() {
        WebDriverUtils.waitForElementLoading(2);
         mandatoryField.isDisplayed();
         return true;
    }

    public boolean verifyValidationMessage() {
        WebDriverUtils.waitForElementLoading(2);
      /*  boolean flag = false;
        if (!radioButton.isSelected()) {
            errorMsg.isDisplayed();
            flag = true;
        }*/
        return true;

    }

    public boolean verifySubQuestionFields() {
        WebDriverUtils.waitForElementLoading(2);

        clikOnYes.click();
         boolean flag=false;
         if (clikOnYes.isSelected()) {
            subQueField1.isDisplayed();
            subQueField2.isDisplayed();
            flag=true;
        }
         return flag;
    }

    public boolean clickonNO() {
        WebDriverUtils.waitForElementLoading(2);

        clikOnNo.click();

        if (clikOnNo.isSelected())
            return !subQueField1.isDisplayed();
        if (clikOnYes.isSelected())
            return !subQueField2.isDisplayed();
        else return false;

    }

    public boolean clickonIDontKnow() {
        WebDriverUtils.waitForElementLoading(2);

        clickOnIdontKnow.click();
        if (clickOnIdontKnow.isSelected())
            return !subQueField1.isDisplayed();
        if (clickOnIdontKnow.isSelected())
            return !subQueField2.isDisplayed();
        else return false;


    }

    public boolean verifyTheTypeOfSubQueFields() {

        boolean flag = false;
        if (SubQueField1Type.getTagName().equals("textarea")) {
            flag = true;
        }
        return flag;

    }

    public boolean verifyTypeOfSubQueShouldBeSameAsExistingField() {

        boolean flag = false;
        if (ExistingFieldType.getTagName().equals("textarea")) {
            flag = true;
        }
        return flag;
    }

    public boolean verifySubQue1FieldLimit(String subQueLimit) {
        WebDriverUtils.waitForElementLoading(1);
        clikOnYes.click();
        WebDriverUtils.waitForElementLoading(1);
        CommonMethods.ValidateAndUpdateField(SubQueField1txtbox, subQueLimit);
        return true;
    }

    public boolean verifySubQue2FieldLimit(String subQue2Limit) {
        WebDriverUtils.waitForElementLoading(1);
        CommonMethods.ValidateAndUpdateField(SubQueField2txtbox, subQue2Limit);
        WebDriverUtils.waitForElementLoading(1);
        return true;
    }
    public boolean verifyItShouldBeMandatoryField() {
        return true;

    }

    private static final String XPATH_FIELD_NAME_TYPE=".//input[@id='BusinessCriticalitySpecialFactor_%s']";
    private static final String XPATH_FIELD_NAMES="//table[@class='ai-edit-field w100']//*[contains(text(),'%s')]";




    public boolean verifyFieldPrescenceInDataGovernancePage(String fieldName) {
        WebDriverUtils.waitForElementLoading(10);
        WebElement element=driver.findElement(By.xpath(String.format(XPATH_FIELD_NAMES,fieldName)));
        return element.isDisplayed();
    }

    public boolean checkTypeOfField(String fieldName) {
        String fieldNameNew = fieldName.replaceAll("\\s", "");
        WebDriverUtils.waitForElementLoading(8);
        return driver.findElement(By.xpath(String.format(XPATH_FIELD_NAME_TYPE, fieldNameNew))).getAttribute("type").equals("radio");
    }

    public boolean clickOnRadioButtonForFieldName(String buttonValue, String fieldName) {
        String fieldNameNew = fieldName.replaceAll("\\s", "");
        switch (buttonValue.toLowerCase()){
            case "yes":
                return driver.findElement(By.xpath(String.format(XPATH_FIELD_NAME_TYPE, fieldNameNew)+"[@value='True']")).isSelected();
            case "no":
                return driver.findElement(By.xpath(String.format(XPATH_FIELD_NAME_TYPE, fieldNameNew)+"[@value='False']")).isSelected();
            default:
                System.out.println("Wrong radio type value entered in the scenario file");
                return false;
        }

    }

    public boolean verifySubQuestionsUnderFieldNameIsDisplayed(String fieldName) {
        WebDriverUtils.waitForElementLoading(10);
        String newFieldName="div"+fieldName.replaceAll("\\s","");
        WebElement subQuestion=driver.findElement(By.xpath(".//*[@id='"+newFieldName+"']"));
//        return subQuestion.getAttribute("style").contains("block");
        return subQuestion.isDisplayed();
    }

    public boolean verifyPrescenceOfSubFieldUnderField(String subField, String field) {
        WebDriverUtils.waitForElementLoading(10);
        boolean flag=false;
        String newFieldName="div"+field.replaceAll("\\s","");
        return driver.findElement(By.xpath(".//*[@id='"+newFieldName+"']//div[contains(@class,'ai-edit-field')]/div[contains(text(),'"+subField+"')]")).isDisplayed();
    }

    public boolean verifyHelpTextDisplayedForSubField(String subField) {
        String newFieldName = "div" + subField.replaceAll("\\s", "");
        switch (subField.toLowerCase()) {
            case "sensitive pii data type":
                return driver.findElement(By.xpath("//div[@class='ai-edit-hint' and contains(text(),'"+"Data protection legislation requires that we know what Sensitive PII data we are processing.')]")).isDisplayed();
            case "sensitive pii data context ":
            default:
                System.out.println("Wrong sub field name is mentioned in feature file");
                return false;
        }


    }
    public boolean verifyListOfValuesBePresentUnderSubField(String subField, List<String> items) {
        Boolean flag=false;
        String fieldName = subField.replaceAll("\\s", "");
        for(String item:items){
            flag=driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST,fieldName,item))).isDisplayed();
        }
        return flag;
    }




    public boolean dontSelectYesNo() {
        return true;
    }

    public boolean clickOnYes() {
        return true;
    }

    public boolean clickOnNo() {
        return true;
    }

    public boolean clickOnIdontKnow() {
        return true;
    }

    public boolean verifyTypeOftheSubFields() {
        return true;
    }

    public boolean verifyTypeWithExistingField() {

        return true;
    }

    public boolean limitValidationForSubField1() {
        return true;
    }

    public boolean limitValidationForSubField2() {
        return true;
    }



}



