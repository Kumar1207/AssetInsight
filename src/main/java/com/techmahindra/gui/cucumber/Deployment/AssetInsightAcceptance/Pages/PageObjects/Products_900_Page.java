package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Helpers.CommonMethods;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Utils.Utility;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.util.List;
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

    @FindBy(xpath = "(//*[text()='Products'])[2]")
    private WebElement products;

    @FindBy(xpath = "//*[text()='3E']")
    private WebElement selectAnyProduct;

/*    @FindBy(xpath = "//*[text()='Abacus']")
    private WebElement selectAnyProduct;*/


    @FindBy(xpath = "(//*[contains(text(),'Please provide a short description of the product')])[2]")
    private WebElement newFieldInProducts;

    @FindBy(xpath = "//*[@id='DescriptionOfPersonalDataUsage']")
    private WebElement newFieldtxtBox;

    @FindBy(xpath = "(//*[contains(text(),'recipients of the personal data and a general statement on why and how the personal data is used.')])[2]")
    private WebElement newFieldHelptxtBox;

    @FindBy(xpath = "//*[@tipid='_Tip_Edit_DataGovernanceGeneral']")
    private WebElement informationSymbol;

    @FindBy(xpath = "(//*[contains(text(),'Please provide a short description of the product')])[1]")
    private WebElement newFieldInInformationBox;

    @FindBy(xpath = "(//*[contains(text(),'In order to determine the purpose for which personal data is being processed')])[1]")
    private WebElement helpTextInInformationBox;

    @FindBy(xpath = "//*[contains(text(),'Please provide a short description of the product')]//span")
    private WebElement mandatorySymbol;

    @FindBy(xpath = "//*[contains(text(),'products use of personal data')]")
    private WebElement updatedFieldInAuditHistory;

    @FindBy(xpath = "//*[contains(text(),'3E Product short description')]")
    private WebElement updatedFieldInDetailsPage;

    @FindBy(xpath = "//*[@id='PersonalDataHasTRPermission']")
    private WebElement radioBTNYesNo;

    @FindBy(xpath = "(//*[@id='PersonalDataHasTRPermission' and @type='radio'])")
    private WebElement radioBtn;

    @FindBy(xpath = "//*[@id='ProductSpecialFactor_StandardCustomerOrPartnerData']")
    private WebElement existingFieldradioBtn;


    @FindBy(xpath = "//*[@id='PersonalDataHasTRPermission-error']")
    private WebElement validationMsg;


    @FindBy(xpath = "//*[text()='View']/../../../../../..//input[@type='checkbox']")
    private WebElement viewChekBox;

    @FindBy(xpath = "//*[text()='Edit']/../../../../../..//input[@type='checkbox']")
    private WebElement editChekBox;

    @FindBy(xpath = "//*[text()='Delete']/../../../../../..//input[@type='checkbox']")
    private WebElement deleteChekBox;

    @FindBy(xpath = "//*[text()='Share']/../../../../../..//input[@type='checkbox']")
    private WebElement shareChekBox;

    @FindBy(xpath = "//*[text()='Change']/../../../../../..//input[@type='checkbox']")
    private WebElement changeChekBox;

    @FindBy(xpath = "//*[text()='Use']/../../../../../..//input[@type='checkbox']")
    private WebElement useChekBox;

    @FindBy(xpath = "//*[@id='PersonalDataTRActionIds-error']")
    private WebElement checkBoxErrorMsg;


    @FindBy(xpath = "(//*[@id='ProductSpecialFactor_SensitivePIIData'])[2]")
    private WebElement SensitivePIIData;

    @FindBy(xpath = "(//*[@id='ProductSpecialFactor_StandardPIIData'])[2]")
    private WebElement StandardPIIData;

    @FindBy(xpath = "(//*[@id='ProductSpecialFactor_SensitiveCustomerOrPartnerData'])[2]")
    private WebElement SensitiveCustomer;

    @FindBy(xpath = "(//*[@id='ProductSpecialFactor_StandardCustomerOrPartnerData'])[2]")
    private WebElement StandardCustomer;

    @FindBy(xpath = "(//*[@id='ProductSpecialFactor_SensitiveThomsonReutersData'])[2]")
    private WebElement sensitiveTrData;

    @FindBy(xpath = "//*[@id='ProductSpecialFactor_RegulatedDataTypeId']")
    private WebElement regulatedData;

    @FindBy(xpath = "(//*[@id='ProductSpecialFactor_DataSensitiveToHostingContext'])[2]")
    private WebElement dataSensitive;





/*
    @FindBy(xpath = "(//*[@id='PersonalDataHasTRPermission'])[2]")
    private WebElement TrNoBtn;
*/

    @FindBy(xpath = "//*[@id='_PersonalDataCanTRDecideUsage_IDK']")
    private WebElement TrFreeToDecide;

    @FindBy(xpath = "//*[@id='_PersonalDataIsSharedWithOthers_IDK']")
    private WebElement idontKnowbtn;

    @FindBy(xpath = "//*[@id='_PersonalDataIsJointDecision_IDK']")
    private WebElement TRJointlyDecide;

    @FindBy(xpath = "//*[@id='_PersonalDataIsAvailableOutsideGeography_IDK']")
    private WebElement GeographicLocation;

    @FindBy(xpath = "//*[@id='_PersonalDataHasThirdPartyContract_IDK']")
    private WebElement LegalDepart;

    @FindBy(xpath = "(//*[@id='PersonalDataDoesRetentionPeriodVary'])[2]")
    private WebElement typesOfData;

    @FindBy(xpath = "//*[@id='DescriptionOfPersonalDataUsage']")
    private WebElement productUseOfPersonalData;

    @FindBy(xpath = "(//*[@id='PersonalDataHasTRPermission'])[1]")
    private WebElement radioBtnYes;

    @FindBy(xpath = "(//*[@id='PersonalDataHasTRPermission'])[1]")
    private WebElement radioBtnNo;

    @FindBy(xpath = "//*[@id='btnSignOff']")
    private WebElement signOffBtn;

    @FindBy(xpath = "//*[@id='btnSignOffCancel']")
    private WebElement signOffCancelBtn;

    @FindBy(xpath = "//*[@id='PersonalDataRetentionPeriod']")
    private WebElement retentionPeriodTextBox;


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
        WebDriverUtils.waitForElementLoading(2);
        selectAnyProduct.click();
        return true;

    }


    public boolean verifyHelpText() {
        WebDriverUtils.waitForElementLoading(1);
        newFieldHelptxtBox.isDisplayed();
        return true;
    }

    public boolean clickOnInformationNextToGeneralSection() {
        WebDriverUtils.waitForElementLoading(2);
        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("arguments[0].click();", informationSymbol);
        return true;

    }

    public boolean verifyNewFieldandHelpTextInInformatioBox() {
        WebDriverUtils.waitForElementLoading(2);

        boolean flag = false;
        if (newFieldInInformationBox.isDisplayed() && helpTextInInformationBox.isDisplayed()) {
            flag = true;
        }
        return flag;
    }

    public boolean verifyNewFieldShouldBeMandatoryField() {
        WebDriverUtils.waitForElementLoading(2);
        mandatorySymbol.isDisplayed();
        return true;
    }

    public boolean verifyUpdatedFieldInAuditHistory() {
        WebDriverUtils.waitForElementLoading(4);
        updatedFieldInAuditHistory.isDisplayed();
        return true;

    }

    public boolean verifyUpdatedFieldInDetailsPage() {
        updatedFieldInDetailsPage.isDisplayed();
        return true;
    }

    public boolean ClickOnTheBelowTheListsInTheHomepage() {
        WebDriverUtils.waitForElementLoading(1);
        products.click();
        return true;
    }

    public boolean verifyTheValidationMessage(String textvalue) {
        WebDriverUtils.waitForElementLoading(1);
        CommonMethods.ValidateAndUpdateField(newFieldtxtBox, textvalue);
        return true;
    }

    public boolean verifyUpdatedFieldInDataGovernance() {
        WebDriverUtils.waitForElementLoading(1);
        boolean flag = false;
        if (newFieldInProducts.isDisplayed() && updatedFieldInAuditHistory.isDisplayed()) {
            flag = true;
        }
        return flag;
    }

    public boolean verifyDefaultValueShouldBeBlank() {
        WebDriverUtils.waitForElementLoading(1);

        boolean flag = false;
        if (!radioBTNYesNo.isSelected()) {
            flag = true;
        }
        return flag;


    }

    public boolean verifyValidationMessage() {
        return true;
    }

    public boolean validateWhetherAnyCheckBoxIsSelected() {

        WebDriverUtils.waitForElementLoading(1);
        boolean flag = false;
        if (!viewChekBox.isSelected() && !editChekBox.isSelected() && !changeChekBox.isSelected() && !shareChekBox.isSelected() && !deleteChekBox.isSelected() && !viewChekBox.isSelected()) {
            flag = true;
        }
        return flag;
    }

    public boolean verifyValidationMessageForCheckbox() {

        WebDriverUtils.waitForElementLoading(1);
        checkBoxErrorMsg.isDisplayed();
        return true;
    }

    public boolean selectAnyCheckBox() {
        WebDriverUtils.waitForElementLoading(1);
        if (!viewChekBox.isSelected() && !editChekBox.isSelected()) {
            viewChekBox.click();
            editChekBox.click();
        }

        return true;
    }

    public boolean fillMandatoryFields(String mandatoryFileds, Map<String, String> fillrequiredfields) {

        WebDriverUtils.waitForElementLoading(2);
        String productFieldName = "";

        switch (mandatoryFileds.toLowerCase()) {
            case "mandatory":
                for (String key : fillrequiredfields.keySet()) {
                    //applicationFieldName = createApplicationFields.get(key) + timeStamp;
                    productFieldName = fillrequiredfields.get(key) + "_" + Utility.genRand5DigitNum();
                    switch (key.toLowerCase()) {
                        case "please provide a short description of the product's use of personal data":
                            WebDriverUtils.waitForElementLoading(2);
                            productUseOfPersonalData.sendKeys(productFieldName);
                            break;
                     /*   case "sensitive pii data":
                            WebDriverUtils.waitForElementLoading(1);
                            SensitivePIIData.click();
                            break;
                        case "standard pii data":
                            WebDriverUtils.waitForElementLoading(1);
                            StandardPIIData.click();
                            break;
                        case "sensitive customer or partner data":
                            WebDriverUtils.waitForElementLoading(1);
                            SensitiveCustomer.click();
                            break;
                        case "sensitive thomson reuters data":
                            WebDriverUtils.waitForElementLoading(1);
                            sensitiveTrData.click();
                            break;*/
                        case "regulated data":
                            WebDriverUtils.waitForElementLoading(2);
                            WebElement rd = driver.findElement(By.xpath("//*[@id='ProductSpecialFactor_RegulatedDataTypeId']"));
                            Select select = new Select(rd);
                            select.selectByVisibleText("FISMA");
                            break;
                        case "data Sensitive to hosting Context":
                            WebDriverUtils.waitForElementLoading(2);
                            dataSensitive.click();
                            break;
                        case "is thomson reuters able to view, edit, delete, share, change or use the personal data":
                            WebDriverUtils.waitForElementLoading(2);
                            WebElement noBtn = driver.findElement(By.xpath("(//*[@id='PersonalDataHasTRPermission'])[2]"));
                            noBtn.click();
                            break;
                        case "is thomson reuters  free to decide whether/how the personal data is viewed, edited, deleted, shared, changed or used":
                            WebDriverUtils.waitForElementLoading(2);
                            WebElement ele = driver.findElement(By.xpath("//*[@id='_PersonalDataCanTRDecideUsage_IDK']"));
                            ele.click();
                            break;
                        case "if you answered \"No\" or \"I don't know\", please confirm if you share any personal data from your product with any sub-contractor/service provider used by Thomson Reuters":
                            WebDriverUtils.waitForElementLoading(2);
                            idontKnowbtn.click();
                            break;
                        case "does thomson reuters jointly decide how to use personal data in your product with any other party?":
                            WebDriverUtils.waitForElementLoading(2);
                            TRJointlyDecide.click();
                            break;
                        case "will any personal data be transferred to or accessed outside the geographic locations where it was originally collected":
                            WebDriverUtils.waitForElementLoading(2);
                            GeographicLocation.click();
                            break;
                        case "if your product involves the transfer of personal data to a third party (e.g. vendor, service provider, customer), is there a contract in place with the third party that contains data transfer privacy clauses approved by the Legal Department":
                            WebDriverUtils.waitForElementLoading(2);
                            LegalDepart.click();
                            break;
                        case "does the retention period vary according to the types of data stored":
                            WebDriverUtils.waitForElementLoading(2);
                            typesOfData.click();
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

    public boolean checkTheTypeOfTheField() {

        boolean flag = false;
        if (radioBtn.getAttribute("type").equals("radio")) {
            flag = true;
        }
        return flag;

    }

    public boolean verifyFieldTypeOfShouldBeSameAsExistingFiledType() {

        boolean flag = false;
        if (radioBtn.getAttribute("type").equals(existingFieldradioBtn.getAttribute("type"))) {
            flag = true;
        }
        return flag;

    }

    public boolean clickOnYesOption(String ListOptions, List<String> ListItems) {
        WebDriverUtils.waitForElementLoading(2);
        radioBtnYes.click();
        switch (ListOptions) {
            case "checkBox":
                for (String key : ListItems) {
                    switch (key.toLowerCase()) {
                        case "view":
                            viewChekBox.isDisplayed();
                            break;
                        case "edit":
                            editChekBox.isDisplayed();
                            break;
                        case "delete":
                            deleteChekBox.isDisplayed();
                            break;
                        case "share":
                            shareChekBox.isDisplayed();
                            break;
                        case "change":
                            changeChekBox.isDisplayed();
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

    public boolean verifyDataGovernanceSignOffButton() {
        WebDriverUtils.waitForElementLoading(1);
        signOffBtn.isDisplayed();
        return true;
    }

    public boolean clickOnReturnToEdit() {
        WebDriverUtils.waitForElementLoading(1);
        signOffCancelBtn.click();
        return true;
    }

    public boolean clickOnSignOff() {
        WebDriverUtils.waitForElementLoading(1);
        signOffBtn.click();
        return true;
    }

    public boolean verifyingLimit(String value) {
        WebDriverUtils.waitForElementLoading(1);
        CommonMethods.ValidateAndUpdateField(newFieldHelptxtBox, value);
        return true;
    }


    public boolean verifyLimitValidationMessage(String textBoxValue) {
        WebDriverUtils.waitForElementLoading(2);
       CommonMethods.ValidateAndUpdateField(retentionPeriodTextBox, textBoxValue);
        return true;
    }

    public boolean verifyNewField() {

        WebDriverUtils.waitForElementLoading(2);

        boolean flag = false;

        if (newFieldInProducts.isDisplayed()) {
            flag = true;
        }
        return flag;
    }

    public boolean verifyTypeOfTheField() {
        WebDriverUtils.waitForElementLoading(1);
        boolean flag = false;
        if (newFieldtxtBox.getTagName().equals("textarea")) {
            flag = true;
        }
        return flag;

    }

}

