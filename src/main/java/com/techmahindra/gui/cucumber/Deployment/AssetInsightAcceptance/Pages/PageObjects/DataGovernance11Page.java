package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataGovernance11Page extends BasePage {

    @FindBy(xpath = ".//*[text()='Technology']")
    private WebElement technologyHomePage;

    @FindBy(xpath = "//*[text()='Does Thomson Reuters jointly decide how to use personal data in your application with any other party? ']")
    private WebElement newField;

    @FindBy(xpath = "//*[text()='Does Thomson Reuters jointly decide how to use personal data in your application with any other party? ']/..//td//div//input")
    private WebElement typeOfnewField;

    @FindBy(xpath = "//*[text()='Does Thomson Reuters jointly decide how to use personal data in your application with any other party?']//span")
    private WebElement mandatoryField;

    @FindBy(xpath = "//*[text()='Does Thomson Reuters jointly decide how to use personal data in your application with any other party?']/..//*[@type='radio']")
    private WebElement radioButton;

    @FindBy(xpath = "//*[@id='_PersonalDataIsJointDecision_Yes']")
    private WebElement clikOnYes;

   /* @FindBy(xpath = "//*[text()='Provide a brief description as to why you think this is ']/..//*[@id='ApplicationDataPrivacySecurity_PersonalDataJointDecisionDescription']")
    private WebElement SubQueField1Type;
*/

   @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity_PersonalDataJointDecisionDescription']")
   private WebElement SubQueField1Type;

    @FindBy(xpath = "//*[@id='_PersonalDataIsJointDecision_No']")
    private WebElement clikOnNo;

    @FindBy(xpath = "//*[@id='_PersonalDataIsJointDecision_IDK']")
    private WebElement clickOnIdontKnow;


    @FindBy(xpath = "//*[text()='Provide a brief description as to why you think this is ']")
    private WebElement subQueField1;

    @FindBy(xpath = "//*[text()='If you answered \"Yes\", please identify the name and contact details of the customer, reseller, partner or other party who jointly decides how to use personal data.  Please include for example the contract number and/or TR personnel that negotiated the contract. ']")
    private WebElement subQueField2;

    @FindBy(xpath ="//*[@id='BusinessCriticalitySpecialFactor_DataSensitiveToHostingContextDescription']")
    private WebElement ExistingFieldType;

    @FindBy(xpath ="//*[@id='ApplicationDataPrivacySecurity_PersonalDataJointDecisionDescription']")
    private WebElement SubQueField1txtbox;


    @FindBy(xpath ="//*[@id='ApplicationDataPrivacySecurity_PersonalDataJointDecisionContact']")
    private WebElement SubQueField2txtbox;


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
    }

    public boolean verifyMandatoryField() {
        return mandatoryField.isDisplayed();
    }


    public boolean verifyValidationMessage() {
        boolean flag = true;
        if (!radioButton.isSelected()) {
            flag = false;
        }
        return flag;

    }

    public boolean verifySubQuestionFields() {
        WebDriverUtils.waitForElementLoading(2);

        clikOnYes.click();

        if (clikOnYes.isSelected())
            return subQueField1.isDisplayed();
        if (clikOnYes.isSelected())
            return subQueField2.isDisplayed();
        else return false;
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
        if (SubQueField1Type.getAttribute("tagName").equals("textarea")) {
            flag = true;
        }
        return flag;

    }

    public boolean verifyTypeOfSubQueShouldBeSameAsExistingField() {

         boolean flag = false;
        if (ExistingFieldType.getAttribute("tagName").equals("textarea")) {
            flag = true;
        }
        return flag;
    }

    public boolean verifySubQue1FieldLimit() {
        WebDriverUtils.waitForElementLoading(1);
        clikOnYes.click();
        WebDriverUtils.waitForElementLoading(1);
        int i;
        WebElement textbox = SubQueField1txtbox;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", textbox);

        String textvalue = "Text Box for Retention period Text Box for Retention period " +
                "Text Box for Retention Text Box for Retention period Text Box for Retention period " +
                "Text Box for Retention Text Box for Retention period Text Box for Retention period " +
                "Text Box for Retention Text Box for Retention period Text Box for Retention period Text " +
                "Box for Retention period Text Box for Retention Text Box for Retention period Text Box " +
                "for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period ";


        i = textvalue.length();
        textbox.clear();
        WebDriverUtils.waitForElementLoading(1);

        if (i > 512) {
            WebDriverUtils.waitForElementLoading(1);
            textbox.sendKeys(textvalue);
            textvalue = textvalue.substring(0, 512);
            textbox.clear();
            WebDriverUtils.waitForElementLoading(1);
            textbox.sendKeys(textvalue);

        } else {
            textbox.sendKeys(textvalue);

        }

        return true;
    }

    public boolean verifySubQue2FieldLimit() {
        WebDriverUtils.waitForElementLoading(1);

        WebDriverUtils.waitForElementLoading(1);
        int i;
        WebElement ele = SubQueField2txtbox;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);

        String textvalue = "Text Box for Retention period Text Box for Retention period " +
                "Text Box for Retention Text Box for Retention period Text Box for Retention period " +
                "Text Box for Retention Text Box for Retention period Text Box for Retention period " +
                "Text Box for Retention Text Box for Retention period Text Box for Retention period Text " +
                "Box for Retention period Text Box for Retention Text Box for Retention period Text Box " +
                "for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period ";


        i = textvalue.length();
        ele.clear();
        WebDriverUtils.waitForElementLoading(1);

        if (i > 512) {
            WebDriverUtils.waitForElementLoading(1);
            ele.sendKeys(textvalue);
            textvalue = textvalue.substring(0, 512);
            ele.clear();
            WebDriverUtils.waitForElementLoading(1);
            ele.sendKeys(textvalue);

        } else {
            ele.sendKeys(textvalue);

        }

        return true;
    }


}
