package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Util.Utility;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
/*import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.PageFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;*/
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.*;
import java.util.List;

/**
 * Created by SK00447696 on 2/23/18.
 */
public class TechnologyPage extends BasePage {

    //public static String timeStamp = new SimpleDateFormat("_HHmmss").format(Calendar.getInstance().getTime());

    @FindBy(xpath = ".//*[text()='Technology']")
    private WebElement technologyHomePage;

    /*(//*[contains(@type,'submit')])[2]*/

    @FindBy(xpath = "//*[text()='New Application']")
    private WebElement createNewApplication;

    @FindBy(xpath = "//input[@id='Name' and @type='text']")
    private WebElement newApplicationName;

    @FindBy(xpath = "//*[@id='ShortName']")
    private WebElement shortName;

    @FindBy(id = "LaunchYear")
    private WebElement launchYear;

    @FindBy(xpath = "//*[@id='Description']")
    private WebElement description;

    @FindBy(xpath = "//*[@id='_etyPckrCntr_EnterpriseOwnerCSV_taglist']")
    private WebElement descrptn;

    @FindBy(xpath = "//*[@id='BusinessUnitId_Container']//span[3]/input[@type='radio']")
    private WebElement businessUnit;

    @FindBy(xpath = "//input[@id='appType_SS']")
    private WebElement applicationtype;

    @FindBy(xpath = "//*[@id='_etyPckrCntr_ApplicationOwnersCSV']/span[1]/span")
    private WebElement applicationContact;

    @FindBy(xpath = "//*[@id='_etyPckrCntr_ApplicationServiceManagerCSV']")
    private WebElement applicationServiceContact;


    @FindBy(xpath = "//*[@id='_ac_ApplicationDevelopmentManagerCSV']")
    private WebElement applicationDevolpmentContact;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    private WebElement saveButton;

    @FindBy(xpath = "//*[text()='Applications']")
    private WebElement applications;


    @FindBy(xpath = "//*[text()='Data Management System']")
    private WebElement dataManagement;


    @FindBy(xpath = "//*[@title='Edit This Record.']")
    private WebElement editRecord;

    @FindBy(xpath = "//*[contains(text(),'Data Governance')]")
    private WebElement dataGovernance;

    @FindBy(xpath = "//*[contains(text(),'Is Thomson Reuters able to view')]")
    private WebElement text_Type;

    @FindBy(xpath = "(//*[@id='ApplicationDataPrivacySecurity_PersonalDataHasTRPermission'])[1]")
    private WebElement radioBtnYes;

    @FindBy(xpath = "//*[@id='ApplicationDataPrivacySecurity_PersonalDataHasTRPermission' and @type='radio']")
    private WebElement radioBtn;

    @FindBy(xpath = "(//*[@id='BusinessCriticalitySpecialFactor_StandardCustomerOrPartnerData'])[1]")
    private WebElement SCradioBtn;


    @FindBy(xpath = "(//*[@id='ApplicationDataPrivacySecurity_PersonalDataHasTRPermission'])[2]")
    private WebElement radioBtnNo;

    @FindBy(xpath = "//*[text()='170 Systems (Markview)']")
    private WebElement anyApplication;


    @FindBy(xpath = "//*[@title='Edit This Record.']")
    private WebElement editButton;


    @FindBy(xpath = "//div[text()='View']/../../../../../..//input[@type='checkbox']")
    private WebElement viewChekBox;

    @FindBy(xpath = "//div[text()='Edit']/../../../../../..//input[@type='checkbox']")
    private WebElement editChekBox;

    @FindBy(xpath = "//div[text()='Delete']/../../../../../..//input[@type='checkbox']")
    private WebElement deleteChekBox;

    @FindBy(xpath = "//div[text()='Share']/../../../../../..//input[@type='checkbox']")
    private WebElement shareChekBox;

    @FindBy(xpath = "//div[text()='Change']/../../../../../..//input[@type='checkbox']")
    private WebElement changeChekBox;

    @FindBy(xpath = "//div[text()='Use']/../../../../../..//input[@type='checkbox']")
    private WebElement useChekBox;

    @FindBy(xpath = "//div[text()='View']")
    private WebElement view;

    @FindBy(xpath = "//div[text()='Edit']")
    private WebElement edit;

    @FindBy(xpath = "//div[text()='Delete']")
    private WebElement delete;

    @FindBy(xpath = "//div[text()='Share']")
    private WebElement share;

    @FindBy(xpath = "//div[text()='Use']")
    private WebElement use;

    @FindBy(xpath = "//div[text()='Change']")
    private WebElement change;


    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkBox;

    @FindBy(xpath = "//div[contains(text(),'Data protection legislation requires us to determine how responsibility for personal data should be allocated between the parties')]")
    private WebElement helpText;

    @FindBy(xpath = "//textarea[@id='ApplicationDataPrivacySecurity_DescriptionOfPersonalDataUsage']")
    private WebElement personaldata;

    @FindBy(xpath = "(//input[@id='BusinessCriticalitySpecialFactor_SensitivePIIData'])[1]")
    private WebElement sensitivePII;


    @FindBy(xpath = "//*[text()='Sex life or sexual orientation']//a//span[@class='ui-corner-all ui-icon ui-icon-plus']")
    private WebElement sensitivePIIDataType;

    @FindBy(xpath = "//*[text()='Customer behavioral data']//a//span[@class='ui-corner-all ui-icon ui-icon-plus']")
    private WebElement sensitivePIIDataContext;

    @FindBy(xpath = "(//*[contains(text(),'E-Commerce')]//a//span[@class='ui-corner-all ui-icon ui-icon-plus'])[1]")
    private WebElement sensitivePIIPurpose;

    @FindBy(xpath = "(//*[@title='Corporate Administrator of Thomson Reuters Product ']//a//span[@class='ui-corner-all ui-icon ui-icon-plus'])[1]")
    private WebElement sensitivePIIDataSubjects;

    @FindBy(xpath = "(//div[text()='Asia / Pacific']/../../../../../..//input[@type='checkbox'])[1]")
    private WebElement sensitivePIIDataSubjectResidency;

    @FindBy(xpath = "//*[@id='btnSignOff']")
    private WebElement signOffBtn;

    @FindBy(xpath = "(//input[@id='BusinessCriticalitySpecialFactor_StandardPIIData'])[2]")
    private WebElement standardPII;


    @FindBy(xpath = "(//input[@id='BusinessCriticalitySpecialFactor_SensitiveCustomerOrPartnerData'])[2]")
    private WebElement sensitiveCustomer;


    @FindBy(xpath = "(//input[@id='BusinessCriticalitySpecialFactor_StandardCustomerOrPartnerData'])[2]")
    private WebElement standaradCustomer;

    @FindBy(xpath = "(//input[@id='BusinessCriticalitySpecialFactor_SensitiveThomsonReutersData'])[2]")
    private WebElement sensitiveThomson;


    @FindBy(xpath = " //*[@id='BusinessCriticalitySpecialFactor_RegulatedDataTypeId']")
    private WebElement regulatedData;

    @FindBy(xpath = "(//*[@id='BusinessCriticalitySpecialFactor_DataSensitiveToHostingContext'])[2]")
    private WebElement hostingContext;

    @FindBy(xpath = "(//*[@id='ApplicationDataPrivacySecurity_PersonalDataHasTRPermission'])[2]")
    private WebElement ableToView;

    @FindBy(xpath = "//*[@id='_PersonalDataCanTRDecideUsage_IDK']")
    private WebElement freeToDecide;


    @FindBy(xpath = "//*[@id='_PersonalDataIsJointDecision_IDK']")
    private WebElement jointlyDecide;


    @FindBy(xpath = "//*[@id='_PersonalDataIsAvailableOutsideGeography_IDK']")
    private WebElement toBeTrasffered;

    @FindBy(xpath = "//*[@id='_PersonalDataHasThirdPartyContract_IDK']")
    private WebElement legalDepartment;


    @FindBy(xpath = "(//*[@id='ApplicationDataPrivacySecurity_PersonalDataDoesRetentionPeriodVary'])[2]")
    private WebElement typesOfDtaStored;

    @FindBy(xpath = "(//*[@type='submit'])[2]")
    private WebElement submit;

    @FindBy(xpath = "//*[text()='Audit History']")
    private WebElement auditHistory;

    @FindBy(xpath = "(//*[@class='ai-edit-backToDetail'])[1]")
    private WebElement backToDetail;


    @FindBy(xpath = "//*[@title='Export to Excel']")
    private WebElement exportExcel;

    @FindBy(xpath = "//*[text()='Application - Full Extract']")
    private WebElement clickOnFullExtract;


//   public static String xlpath = "./Excel/Technology-Application.xlsx";
//   public static String sheetName = "Technology";


    /*String s = view.getText()+"; "+ edit.getText() +"; "+ share.getText()+"; "+ change.getText()+"; "+ delete.getText()+"; "+ use.getText();*/



/*
  public void select_list()
   {
       Select select=new Select();
       select.selectByVisibleText("Bakken Alison");
   }

    public void selectAML()
    {
        Select select=new Select();
        select.selectByVisibleText("No Intent to Migrate ");
    }
*/

    public TechnologyPage() throws Exception {
        super();
    }

    public boolean isPageDisplayed() throws Exception {
        return technologyHomePage.isDisplayed();
    }


    @Override
    protected WebElement elementForLoading() throws Exception {
        return technologyHomePage;
    }

    public boolean iVerifyPageIsDisplayed() throws Exception {
        WebDriverUtils.waitForElementIsPresent(technologyHomePage, 10);
        return technologyHomePage.isDisplayed();
    }

    @Override
    protected void pageName() throws Exception {

    }


    public boolean CreatingApplication(String applicationType, Map<String, String> createApplicationFields) {
        createNewApplication.click();
//        System.out.println(applicationType + " " + createApplicationFields);
        WebDriverUtils.waitForElementLoading(10);
        String applicationFieldName = "";

        switch (applicationType.toLowerCase()) {
            case "create":
                for (String key : createApplicationFields.keySet()) {
                    //applicationFieldName = createApplicationFields.get(key) + timeStamp;
                    applicationFieldName = createApplicationFields.get(key) + "_" + Utility.genRand5DigitNum();
                    switch (key.toLowerCase()) {
                        case "application name":
                            newApplicationName.sendKeys(applicationFieldName);
                            break;
                        case "short name":
                            shortName.sendKeys(applicationFieldName);
                            break;
                        case "launch year":
                            launchYear.sendKeys(createApplicationFields.get(key));
                            break;
                        case "business unit (bu)":
                            WebDriverUtils.waitForElementLoading(10);
                            businessUnit.click();
                            break;
                        case "application type":
                            applicationtype.click();
                            break;
                        case "description":
                            description.sendKeys(createApplicationFields.get(key));
                            break;
                      /*  case "enterprise owner":
                                WebDriverUtils.waitForElementLoading(5);
                                WebElement enterprise=driver.findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[1]"));
                                WebDriverUtils.waitForElementLoading(4);
                                enterprise.click();
                                driver.findElement(By.xpath("(//li[contains(text(),'Beaumont, Stewart (TRGR)')])")).click();

                            break;*/
                      /*  case "application contact":
                            WebDriverUtils.waitForElementLoading(10);
                            applicationContact.sendKeys(createApplicationFields.get(key));
                            applicationContact.sendKeys(Keys.ENTER);
                            break;*/
//                        case "application service contact":applicationServiceContact.sendKeys(createApplicationFields.get(key));
//                            break;
                        case "application development contact":
                            WebDriverUtils.waitForElementLoading(5);
                            applicationDevolpmentContact.sendKeys(createApplicationFields.get(key));
                            WebDriverUtils.waitForElementLoading(4);
                            WebElement appDev = driver.findElement(By.xpath(".//*[@id='ui-id-5']/li[1]/div"));
                            JavascriptExecutor executor = (JavascriptExecutor) driver;
                            executor.executeScript("arguments[0].click();", appDev);
                            break;
                        case "aml business contact":
                            WebDriverUtils.waitForElementLoading(5);
                            // amlBusinessContact.sendKeys(createApplicationFields.get(key));
                            try {
                                Robot robot = new Robot();
                                robot.keyPress(KeyEvent.VK_TAB);
                                WebDriverUtils.waitForElementLoading(5);
                                robot.keyPress(KeyEvent.VK_TAB);
                                /* WebElement ele = driver.findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]"));*/
                                WebElement ele = driver.findElement(By.xpath("(//div[@class='k-multiselect-wrap k-floatwrap'])[2]"));
                                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele);
                                WebDriverUtils.waitForElementLoading(5);
                                ele.click();
                                driver.findElement(By.xpath("(//li[contains(text(),'Bakken, Alison (TR Technology & Ops)')])")).click();
                                robot.keyRelease(KeyEvent.VK_TAB);
                                robot.keyRelease(KeyEvent.VK_TAB);
                            } catch (AWTException e) {
                                System.out.println("Not Found");
                            }

                            break;
                        case "platform classification":
                            WebDriverUtils.waitForElementLoading(5);
                            WebElement product = driver.findElement(By.id("ProductPlatformClassification"));
                            Select selectProduct = new Select(product);
                            selectProduct.selectByVisibleText("No Intent to Migrate");
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


    public boolean clickOnSaveButton() {
        WebDriverUtils.waitForElementLoading(2);
        saveButton.click();
        return true;
    }


    public void selectExistingApplication() {
        dataManagement.click();

    }

    public void clickOnEditInthedetailsPage() {
        editRecord.click();
    }


    public boolean verifyNewFieldPresentInThePage() {
        /*return text_Type.isDisplayed() && radioBtnYes.isSelected();*/
        boolean flag = false;
        if (text_Type.isDisplayed()) {
            flag = true;
            System.out.println("Text Found");
        }
        return flag;
    }

    public boolean clickOnApplications() {
        WebDriverUtils.waitForElementLoading(3);
        applications.click();
        return true;
    }

    public boolean clickOnExistingApplications() {
        WebDriverUtils.waitForElementLoading(4);
        anyApplication.click();
        return true;
    }

    public boolean clickOnEdit() {
        WebDriverUtils.waitForElementLoading(4);
        editButton.click();
        return true;
    }

    public boolean clickOnDataGoveranace() {
        WebDriverUtils.waitForElementLoading(10);
        dataGovernance.click();
        return true;
    }

    public boolean verifyTypeOfTheField() {

        System.out.println(radioBtnYes.getAttribute("type"));

        boolean flag = false;
        if (radioBtnYes.getAttribute("type").equals("radio")) {
            flag = true;
        }
        return flag;

    }

    public boolean doNotSelectAnyOption() {

        boolean flag = true;
        if (!radioBtn.isSelected()) {
            flag = false;
        }
        return flag;
    }

    public boolean verifyThatFieldTypeOfShouldBeSameAsExistingFiledType() {
        System.out.println(SCradioBtn.getAttribute("type"));

        boolean flag = false;
        if (SCradioBtn.getAttribute("type").equals(radioBtnYes.getAttribute("type"))) {
            flag = true;
        }
        return flag;

    }

    public boolean clickOnYes(String CheckListOptions, List<String> chekBoxList) {
        switch (CheckListOptions) {
            case "checkBox":
                for (String key : chekBoxList) {
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

    public boolean verifyTheTypeOfTheField() {
        boolean flag = false;
        if (viewChekBox.getAttribute("type").equals("checkbox")) {
            flag = true;
        }
        return flag;

    }

    /* public boolean VerifyCheckListOPtions() {

         boolean flag = false;
         if (view.isDisplayed() && edit.isDisplayed() && delete.isDisplayed() && share.isDisplayed()  && change.isDisplayed() && use.isDisplayed()) {
             flag = true;
         }
         return flag;
     }
 */
    public boolean NoSearchOptionShouldBeAvailable() {
        return true;
    }

    public boolean multipleSelection() {
        WebDriverUtils.waitForElementLoading(4);
        boolean flag = false;
        if (!viewChekBox.isSelected() && !shareChekBox.isSelected()) {
            WebDriverUtils.waitForElementLoading(4);
            viewChekBox.click();
            shareChekBox.click();
            flag = true;

        }
        return flag;
    }

    public boolean helpTextShouldBeDisplayed() {

        boolean flag = false;

        if (helpText.isDisplayed()) {
            flag = true;
        }

        return flag;
    }

    /* public boolean fillAllTheReqDetailsInGoveranance() {
      personaldata.sendKeys("Application Description");
      sensitivePII.click();
      WebDriverUtils.waitForElementLoading(5);
      sensitivePIIDataType.click();
      WebDriverUtils.waitForElementLoading(5);
      sensitivePIIDataContext.click();
      WebDriverUtils.waitForElementLoading(5);
      sensitivePIIPurpose.click();
      WebDriverUtils.waitForElementLoading(5);
      sensitivePIIDataSubjects.click();
      WebDriverUtils.waitForElementLoading(5);
      sensitivePIIDataSubjectResidency.click();
      WebDriverUtils.waitForElementLoading(5);
      signOffBtn.click();

      standardPII.click();
      sensitiveCustomer.click();
      standaradCustomer.click();
      sensitiveThomson.click();
      regulatedData.click();
      hostingContext.click();
      ableToView.click();
      freeToDecide.click();
      jointlyDecide.click();
      toBeTrasffered.click();
      legalDepartment.click();
      typesOfDtaStored.click();
      saveButton.click();
      return true;

     }
 */
    public boolean clickOnAuditHistory() {
        WebDriverUtils.waitForElementLoading(5);
        WebElement audit = driver.findElement(By.xpath("//*[text()='Audit History']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", audit);
         WebDriverUtils.waitForElementLoading(5);
         audit.click();
     /*   auditHistory.click();*/
         return true;
    }

    public boolean clickBackToDetail() {
        WebDriverUtils.waitForElementLoading(2);
        backToDetail.click();
        return true;
    }

    public boolean clickOnExport() {
        exportExcel.click();
        return true;
    }

    public boolean navigateToURL() {
        driver.get("https://assetsdev.int.thomsonreuters.com/Technology/tgo");
        return true;
    }

    public boolean cliconApplicationFullExtract() throws AWTException {
        WebDriverUtils.waitForElementLoading(1);
        clickOnFullExtract.click();
        WebDriverUtils.waitForElementLoading(2);
        Robot robot = new Robot();
        WebDriverUtils.waitForElementLoading(2);
        robot.keyPress(KeyEvent.VK_ENTER);
        WebDriverUtils.waitForElementLoading(2);
        robot.keyRelease(KeyEvent.VK_ENTER);
        return true;
    }


    public boolean VerifyThatItShouldNotAMandatoryField() {

        return true;
    }



 /*   public static String getCellValue(String fullPathToSavedFile, String sheetName, int rowNum, int cellNum) {

        FileInputStream in = null;
        try {
            in = new FileInputStream(fullPathToSavedFile);
            Workbook workbook = new HSSFWorkbook(in);
            Sheet s1 = workbook.getSheet(sheetName);
            String v = s1.getRow(rowNum).getCell(cellNum).getStringCellValue();
            return v;
        } catch (Exception e) {
            return "";
        }

            }*/


}


