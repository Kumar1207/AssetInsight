package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Helpers.CommonMethods;
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

    @FindBy(xpath = "(//*[contains(text(),'Please provide a short description of the product')])[2]")
    private WebElement newFieldInProducts;

    @FindBy(xpath = "//*[@id='DescriptionOfPersonalDataUsage']")
    private WebElement newFieldtxtBox;

    @FindBy(xpath = "(//*[contains(text(),'recipients of the personal data and a general statement on why and how the personal data is used.')])[2]")
    private WebElement newFieldHelptxtBox;

    @FindBy(xpath = "(//*[@class='tipsLink2 navigate-away-disable'])[1]")
    private WebElement informationSymbol;

    @FindBy(xpath = "(//*[contains(text(),'Please provide a short description of the product')])[1]")
    private WebElement newFieldInInformationBox;

    @FindBy(xpath = "(//*[contains(text(),'In order to determine the purpose for which personal data is being processed')])[1]")
    private WebElement helpTextInInformationBox;

    @FindBy(xpath = "//*[contains(text(),'Please provide a short description of the product')]//span")
    private WebElement mandatorySymbol;

    @FindBy(xpath = "//*[text()='short description of the product use of personal data']")
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

    @FindBy(xpath = "(//*[@id='ProductSpecialFactor_StandardPIIData'])[1]")
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

    @FindBy(xpath = "(//*[@id='PersonalDataHasTRPermission'])[2]")
    private WebElement TrData;

    @FindBy(xpath = "(//*[@id='_PersonalDataCanTRDecideUsage_IDK'])")
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
    private WebElement personalData;

    @FindBy(xpath = "(//*[@id='PersonalDataHasTRPermission'])[1]")
    private WebElement radioBtnYes;

    @FindBy(xpath = "(//*[@id='PersonalDataHasTRPermission'])[1]")
    private WebElement radioBtnNo;





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

    public boolean verifyNewField() {
        return newFieldInProducts.isDisplayed();
    }

    public boolean verifyTypeOfTheField() {
        WebDriverUtils.waitForElementLoading(1);
        boolean flag = false;
        if (newFieldtxtBox.getTagName().equals("textarea")) {
            flag = true;
        }
        return flag;

    }

    public boolean verifyHelpText()
    {
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

    public boolean ClickOnTheBelowTheListsInTheHomepage() {
        WebDriverUtils.waitForElementLoading(1);
        products.click();
        return true;
    }

    public boolean verifyTheValidationMessage(String textvalue) {
        WebDriverUtils.waitForElementLoading(1);
        CommonMethods.ValidateAndUpdateField(newFieldtxtBox,textvalue);
        return true;
    }

    public boolean verifyUpdatedFieldInDataGovernance() {
        WebDriverUtils.waitForElementLoading(1);
        updatedFieldInDetailsPage.isDisplayed();
        return true;
    }

    public boolean verifyDefaultValueShouldBeBlank() {
        WebDriverUtils.waitForElementLoading(1);

        boolean flag=false;
        if (!radioBTNYesNo.isSelected()){
            flag=true;
        }
      return flag;



    }

    public boolean verifyValidationMessage() {
        WebDriverUtils.waitForElementLoading(2);

        if (!radioBtnYes.isSelected() || !radioBtnNo.isSelected()) {
            return validationMsg.isDisplayed();
        }
        else {
            WebDriverUtils.waitForElementLoading(4);
            radioBtnYes.click();
        }
        return true;
    }

  public boolean validateWhetherAnyCheckBoxIsSelected() {

      WebDriverUtils.waitForElementLoading(1);
        boolean flag=false;
        if (!viewChekBox.isSelected() && !editChekBox.isSelected() && !changeChekBox.isSelected() && !shareChekBox.isSelected() && !deleteChekBox.isSelected() && !viewChekBox.isSelected() )
        {
        flag=true;
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

    public boolean fillMandatoryFields(String RequiredFieldsOptions, Map<String,String> options) {

        WebDriverUtils.waitForElementLoading(1);
        String applicationFieldName = "";

        switch (RequiredFieldsOptions.toLowerCase()) {
            case "create":
                for (String key : options.keySet()) {
                    //applicationFieldName = createApplicationFields.get(key) + timeStamp;
                    applicationFieldName = options.get(key) + "_" + Utility.genRand5DigitNum();
                    switch (key.toLowerCase()) {
                        case "Please provide a short description of the product's use of personal data":
                            WebDriverUtils.waitForElementLoading(1);
                            personalData.sendKeys(applicationFieldName);
                            break;
                        case "Sensitive PII Data":
                            WebDriverUtils.waitForElementLoading(1);
                            SensitivePIIData.click();
                            break;
                        case "Standard PII Data":
                            WebDriverUtils.waitForElementLoading(1);
                           StandardPIIData.click();
                            break;
                        case "Sensitive Customer or Partner Data":
                            WebDriverUtils.waitForElementLoading(1);
                          SensitiveCustomer.click();
                            break;
                        case " Sensitive Thomson Reuters Data":
                            WebDriverUtils.waitForElementLoading(1);
                            sensitiveTrData.click();
                            break;
                        case "Regulated Data":
                            WebDriverUtils.waitForElementLoading(1);
                            Select select=new Select(regulatedData);
                            select.selectByVisibleText("FISMA");
                            break;
                        case "Data Sensitive to Hosting Context":
                            WebDriverUtils.waitForElementLoading(1);
                            dataSensitive.click();
                            break;
                        case "Is Thomson Reuters able to view, edit, delete, share, change or use the personal data":
                            WebDriverUtils.waitForElementLoading(1);
                            TrData.click();
                            break;
                        case "Is Thomson Reuters free to decide whether/how the personal data is viewed, edited, deleted, shared, changed or used":
                            WebDriverUtils.waitForElementLoading(1);
                            TrFreeToDecide.click();
                            break;
                        case "|If you answered \"No\" or \"I don't know\", please confirm if you share any personal data from your product with any sub-contractor/service provider used by Thomson Reuters":
                            WebDriverUtils.waitForElementLoading(1);
                            idontKnowbtn.click();
                            break;
                        case "Does Thomson Reuters jointly decide how to use personal data in your product with any other party?":
                            WebDriverUtils.waitForElementLoading(1);
                            TRJointlyDecide.click();
                            break;
                        case "Will any personal data be transferred to or accessed outside the geographic locations where it was originally collected":
                            WebDriverUtils.waitForElementLoading(1);
                            GeographicLocation.click();
                            break;
                        case "If your product involves the transfer of personal data to a third party (e.g. vendor, service provider, customer), is there a contract in place with the third party that contains data transfer privacy clauses approved by the Legal Department":
                            WebDriverUtils.waitForElementLoading(1);
                            LegalDepart.click();
                            break;
                        case "Does the retention period vary according to the types of data stored":
                            WebDriverUtils.waitForElementLoading(1);
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

    }

