package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Stepdefinintion;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects.TechnologyPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class TechnologyPageStep extends PageInstances {

    TechnologyPage technologyPage = PageFactory.initElements(driver, TechnologyPage.class);
//    ExcelPageInstances excelpage=PageFactory.initElements(driver,ExcelPageInstances.class);


    @Then("^I create New Application in the Technology page for below mandatory fields$")
    public void iCreateNewApplicationInTheTechnologyPageForBelowMandatoryFields(DataTable CreateApplicationFields) throws Throwable {
        Map<String, String> data = CreateApplicationFields.asMap(String.class, String.class);

        technologyPage.CreatingApplication("Create", data);
    }

    @Then("^I click on \"([^\"]*)\" button$")
    public void iClickOnButtonOnCreateApplicationPage(String arg0) throws Throwable {
        Assert.assertTrue(technologyPage.clickOnSaveButton());
    }

    @Then("^I click on the \"([^\"]*)\" present in the Technology page$")
    public void iClickOnThePresentInTheTechnologyPage(String arg0) throws Throwable {
        Assert.assertTrue(technologyPage.clickOnApplications());
    }

    @And("^I select any Existing Application present in the Result Page$")
    public void iSelectAnyExistingApplicationPresentInTheResultPage() throws Throwable {
        Assert.assertTrue(technologyPage.clickOnExistingApplications());
    }

    @And("^I click on \"([^\"]*)\" Details Page$")
    public void iClickOnDetailsPage(String arg0) throws Throwable {
        Assert.assertTrue(technologyPage.clickOnEdit());
    }

    @And("^I click on \"([^\"]*)\" tab$")
    public void iClickOnTab(String arg0) throws Throwable {
        Assert.assertTrue(technologyPage.clickOnDataGoveranace());
    }


    @Then("^I verify \"([^\"]*)\" field present in the \"([^\"]*)\" page$")
    public void iVerifyFieldPresentInThePageAndTheTypeOfFiled(String fieldName, String dataGovernance) throws Throwable {
        Assert.assertTrue(technologyPage.verifyNewFieldPresentInThePage());
    }

    @And("^I Check the type of \"([^\"]*)\" filed$")
    public void iCheckTheTypeOfFiled(String arg0) throws Throwable {
        Assert.assertTrue(technologyPage.verifyTypeOfTheField());
    }


    @And("^I verify that field type of \"([^\"]*)\" should be same as Existing filed \"([^\"]*)\" type$")
    public void iVerifyThatFieldTypeOfShouldBeSameAsExistingFiledType(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(technologyPage.verifyThatFieldTypeOfShouldBeSameAsExistingFiledType());
    }

    @When("^I do not select Yes/No option validation message should be displayed$")
    public void iDoNotSelectYesNoOptionValidationMessageShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(technologyPage.doNotSelectAnyOption());


    }


    @When("^I click on \"([^\"]*)\" option nothing should be displayed below the main question field$")
    public void iClickOnOptionNothingShouldBeDisplayedBelowTheMainQuestionField(String arg0) throws Throwable {
        Assert.assertTrue(technologyPage.doNotSelectAnyOption());
    }


    @When("^I click on Yes option below subquestion should be displayed$")
    public void iClickOnYesOptionBelowSubquestionShouldBeDisplayed(DataTable chekBoxList) throws Throwable {
        List<String> list = chekBoxList.asList(String.class);
        technologyPage.clickOnYes("CheckListOptions", list);
        /* Assert.assertTrue(technologyPage.clickOnYes());*/
    }

    @And("^I verify the type of the \"([^\"]*)\" filed$")
    public void iVerifyTheTypeOfTheFiled(String arg0) throws Throwable {
        Assert.assertTrue(technologyPage.verifyTheTypeOfTheField());
    }

 /*   @And("^I verify that \"([^\"]*)\" should be displayed$")
    public void iVerifyThatShouldBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(technologyPage.VerifyCheckListOPtions());
    }
*/
    @Then("^I verify that No search should be avialable for the Checklist$")
    public void iVerifyThatNoSearchShouldBeAvialableForTheChecklist() throws Throwable {
        Assert.assertTrue(technologyPage.NoSearchOptionShouldBeAvailable());

    }

    @And("^I verify that multiple selection should be possible for this subquestion field$")
    public void iVerifyThatMultipleSelectionShouldBePossibleForThisSubquestionField() throws Throwable {
        technologyPage.multipleSelection();
    }

    @Then("^I verify that \"([^\"]*)\" should be displayed below the radio button for the main question filed$")
    public void iVerifyThatShouldBeDisplayedBelowTheRadioButtonForTheMainQuestionFiled(String arg0) throws Throwable {
        Assert.assertTrue(technologyPage.helpTextShouldBeDisplayed());
    }

   /* @And("^I fill the required fields which are present in the \"([^\"]*)\" tab$")
    public void iFillTheRequiredFieldsWhichArePresentInTheTab(String arg0) throws Throwable {
        Assert.assertTrue(technologyPage.fillAllTheReqDetailsInGoveranance());
    }
*/

    @Then("^I click on \"([^\"]*)\" button respective application details page should be displayed$")
    public void iClickOnButtonRespectiveApplicationDetailsPageShouldBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(technologyPage.clickBackToDetail());
    }


    @And("^I click on \"([^\"]*)\" button and Excel should be downloaded$")
    public void iClickOnButtonAndExcelShouldBeDownloaded(String arg0) throws Throwable {
        Assert.assertTrue(technologyPage.clickOnExport());
    }


    @Given("^I navigate to URL \"([^\"]*)\"$")
    public void iNavigateToURL(String arg0) throws Throwable {
        Assert.assertTrue(technologyPage.navigateToURL());
    }

   @When("^I click on Application- Full Extract should be downloaded$")
    public void iClickOnApplicationFullExtractShouldShouldBeDownloaded() throws Throwable {
        Assert.assertTrue(technologyPage.cliconApplicationFullExtract());

    }


  /*  @Then("^I verify that filed names which are present in excel should be \"([^\"]*)\", \"([^\"]*)\"$")
    public void iVerifyThatFiledNamesWhichArePresentInExcelShouldBe(String rowNum, String cellNum) throws Throwable {
        Assert.assertTrue(technologyPage.VerifyThatFiledNamesWhichArePresentInExcel());
    }

*/
  /*  @Then("^I verify that excel document \"([^\"]*)\" with sheet name \"([^\"]*)\" , row number \"([^\"]*)\" and cell number \"([^\"]*)\" in report page and downloaded excel report are matching$")
    public void iVerifyThatDataInReportPageAndDownloadedExcelReportAreMatching(String xlpath,String sheetName,int rowNum,int cellNum )throws Throwable {
        Assert.assertTrue(ExcelPage.display(xlpath,sheetName,rowNum,cellNum));
    }*/

    @And("^I click on \"([^\"]*)\"$")
    public void iClickOn(String arg0) throws Throwable {
        Assert.assertTrue(technologyPage.clickOnAuditHistory());
    }




   /* @Then("^Application- Full Extract should be downloaded$")
    public void applicationFullExtractShouldBeDownloaded() throws Throwable {
        technologyPage.downloadApplicationFullExtract();
    }*/


 /*   @Then("^I verify below filed names which should be present in excel$")
    public void iVerifyBelowFiledNamesWhichShouldBePresentInExcel() throws Throwable {
        technologyPage.getCellValue();
    }*/
}


