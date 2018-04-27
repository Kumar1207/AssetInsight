package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

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

    @FindBy(xpath="//*[@id='BusinessCriticalitySpecialFactor_StandardPIIData']")
    private WebElement typeOfnewSTDPIIField;

    @FindBy(xpath="//div[contains(@id, 'divPickListStandardPIIDataType')]//li[@title='Other']")
    private WebElement newFieldOtherSTD;

   // @FindBy(xpath="//div[contains(@id, 'divPickListStandardPIIDataType')]//span[@class='ui-corner-all ui-icon ui-icon-plus']")
   @FindBy(xpath="//div[contains(@id, 'divPickListStandardPIIDataType')]//li[@title='Other']//span[@class='ui-corner-all ui-icon ui-icon-plus']")
    private WebElement newFieldOther;


    @FindBy(xpath="//textarea[@id='BusinessCriticalitySpecialFactor_StandardPIIDataTypeDescription']")
    private WebElement othernewSTDPIIField;

    @FindBy(xpath = "//*[@id='BusinessCriticalitySpecialFactor_StandardPIIData'][1]")
    private WebElement stdPIIDataYes;



    @FindBy(xpath = "//*[@id='BusinessCriticalitySpecialFactor_StandardPIIData'][2]")
    private WebElement stdPIIDataNo;


    @FindBy(xpath="//div[contains(@id,'divStandardPIIData')]//div[text()='Standard PII Data Type ']")
    private WebElement stdPIIType;


    private static final String XPATH_ITEM_LIST=".//*[contains(@id,'%s')]//li[@title='%s']";

    @FindBy(xpath="//*[text()='Standard PII Data Type - Other ']//span")
    private WebElement stdOthrmandatoryfield;

    @FindBy(xpath="//*[contains(text(),'please select \"Other\" and specify these other types of Standard PII Data')]")
    private WebElement helpSTDPIIData;

    @FindBy(xpath="//*[contains(text(),'Please specify these other types of Standard PII Data')]")
    private WebElement helpSTDPIIOthers;


    public DataGovernance11Page() throws Exception {
        super();
    }

    public boolean verifyNewField() {
        return newField.isDisplayed();
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

        if (othernewSTDPIIField.isDisplayed()){
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
        if (!(othernewSTDPIIField.isDisplayed())){
            flag = true;
        }
        return flag;
    }

    public boolean selectBelowListOfValuesUnderSubField(String subField, List<String> items) {
        boolean flag=false;
       String fieldName = subField.replaceAll("\\s","");
    for(String item:items){
        WebElement stdPII = driver.findElement(By.xpath("//*[text()='Standard PII Data Context ']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", stdPII);
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", item);
    //driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST,fieldName,item)+"/a/span")).isDisplayed();
        flag=driver.findElement(By.xpath(String.format(XPATH_ITEM_LIST,fieldName,item))).isDisplayed();
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
        boolean flag=false;
       if(helpSTDPIIData.isDisplayed()){
            flag=true;
       }

            return flag;


    }

    public boolean verifyHelpTxtSTDPIIDataOthers() {
        boolean flag = false;
        if(helpSTDPIIOthers.isDisplayed()){
            flag = true;
        }

        return flag;

    }

    public boolean verifyItShouldBeMandatoryField() {
        return true;

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



