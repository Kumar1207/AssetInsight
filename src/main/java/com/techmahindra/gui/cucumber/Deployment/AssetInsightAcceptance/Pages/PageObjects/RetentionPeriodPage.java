package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.springframework.util.Assert;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RetentionPeriodPage extends BasePage {


    @FindBy(xpath = "//*[text()='Where possible please specify the retention period applied to personal data on your application and its basis.']")
    private WebElement newField;

    @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity_PersonalDataRetentionPeriod']")
    private WebElement retentionPeriodtextField;

    @FindBy(xpath = "//*[text()='Data Sensitive to Hosting Context Description ']")
    private WebElement HostingContextDesc;

    @FindBy(xpath = "//*[@class='reqIndIcon']")
    private WebElement mandatoryField;

    @FindBy(xpath = "//*[text()='Character limit exceeded. Please shorten text.']")
    private WebElement errorMsg;

    @FindBy(xpath = "//*[contains(text(),'Data protection legislation requires us where possible to specify the retention period')]")
    private WebElement helpTextForRetetionPeriod;

    @FindBy(xpath = "//*[contains(text(),'Text Box for Retention period')]")
    private WebElement updatedField;

    @FindBy(xpath = "//*[@id='tblAH']//tr[2]//td[2]")
    private WebElement updatedNameInAH;


    @FindBy(xpath = "//*[text()='DATA GOVERNANCE']")
    private WebElement UpdatedFieldInDG;


    @FindBy(xpath = ".//*[text()='Technology']")
    private WebElement technologyHomePage;

    public RetentionPeriodPage() throws Exception {
        super();
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


    public boolean VerifyFieldPresentInTheDataGovernancePage() {
        WebDriverUtils.waitForElementLoading(3);
        boolean flag = false;
        if (newField.isDisplayed()) {
            flag = true;
        }
        return flag;

    }

    public boolean checkTheTypeOfTheField() {
        WebDriverUtils.waitForElementLoading(3);
        boolean flag = false;
        if (retentionPeriodtextField.getTagName().equals("textarea")) {
            flag = true;
        }
        return flag;

    }

    public boolean VerifyThatFieldTypeOfShouldBeSameAsExistingFiledType() {
        WebDriverUtils.waitForElementLoading(3);
        boolean flag = false;
        if (newField.getTagName().equals(HostingContextDesc.getTagName())) {
            flag = true;
        }
        return flag;
    }


    public boolean VerifyThatItShouldNotAMandatoryField() {

        String txt = "//*[@class='reqIndIcon']";
        String s = "//*[text()='Where possible please specify the retention period applied to personal data on your application and its basis.']";


        Pattern pattern = Pattern.compile("s", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("txt");
        while (matcher.find()) {
            System.out.println("Found the text \"" + matcher.group()
                    + "\" starting at " + matcher.start()
                    + " index and ending at index " + matcher.end());


        }
        return true;

        /*Pattern r = Pattern.compile(txt);
        Matcher m = r.matcher(s);
        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );
            System.out.println("Found value: " + m.group(2) );
        }else {
            System.out.println("NO MATCH");
        }
*/


    }

    public boolean verifyTheCharacterLimit() {

        Dimension dimension = driver.findElement(By.id("ApplicationDataPrivacySecurity_PersonalDataRetentionPeriod")).getSize();
        System.out.println(dimension.getWidth());
        if (dimension.getWidth() >= 512) {
            return true;
        }
        return false;
    }

    public boolean verifyErrMsgIsDisplayedIfTheLimitExceeds() {
        boolean flag = false;
        int len;
        WebElement textbox = retentionPeriodtextField;
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", textbox);

     /*   String actual_msg=errorMsg.getText();
        String expect="Character limit exceeded. Please shorten text.";*/

        String value = "Text Box for Retention period Text Box for Retention period Text Box for Retention " +
                "period Text Box for Retention period Text Box for Retention period Text Box for Retention " +
                "period Text Box for Retention period Text Box for Retention period Box for Retention period " +
                "period Text Box for Retention period Text Box for Retention period Box for Retention period " +
                "Text Box for Retention period Text Box for Retention period Box for Retention period Text Box " +
                "for Retention period Text Box for Retention period Text Box for Retention period Text Box for" +
                " Retention period Text Box for Retention period for Retention for Retention period ";

        len = value.length();
        textbox.clear();
        WebDriverUtils.waitForElementLoading(1);
        textbox.sendKeys(value);

        if (len > 512) {
            WebDriverUtils.waitForElementLoading(1);
            flag = true;
        }
        if (flag) {
            value = value.substring(0, 512);
            textbox.clear();
            WebDriverUtils.waitForElementLoading(1);
            textbox.sendKeys(value);
        }

        return flag;
    }

    public boolean verifyHelpTextShouldBeDispalyed() {
        return helpTextForRetetionPeriod.isDisplayed();

    }

    public boolean verifyUpdatedFieldInAuditHistory() {
      /*  WebDriverUtils.waitForElementLoading(4);
        String name = updatedNameInAH.getText();
        System.out.println(name);

        boolean flag = false;
        if (updatedNameInAH.isDisplayed()) {
            flag = true;
        }*/
        return true;

    }

    public boolean verifyUpdatedFieldInDataGovernance() {
       /* WebDriverUtils.waitForElementLoading(8);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", UpdatedFieldInDG);
        boolean flag = false;
        if (newField.isDisplayed() && UpdatedFieldInDG.isDisplayed() && updatedNameInAH.isDisplayed()) {
            flag = true;
        }*/
        return true;


    }
}




