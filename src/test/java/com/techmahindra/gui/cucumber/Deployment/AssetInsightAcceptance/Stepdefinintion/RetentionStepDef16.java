package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Stepdefinintion;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects.DatGovernancePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class RetentionStepDef16 extends PageInstances {


    DatGovernancePage datGovernancePage = PageFactory.initElements(driver, DatGovernancePage.class);

    @Then("^I verify the \"([^\"]*)\" field present in the Data Governance page$")
    public void iVerifyTheFieldPresentInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(datGovernancePage.verifyTheNewFieldInTheDataGovernancePag());
    }


    @And("^I Check the type of \"([^\"]*)\" field in the Data Governance page$")
    public void iCheckTheTypeOfFieldInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(datGovernancePage.TypeOfFieldInTheDataGovernancePage());
    }

    @And("^I verify that field type of \"([^\"]*)\" should be same as Existing field \"([^\"]*)\" type in the Data Governance page$")
    public void iVerifyThatFieldTypeOfShouldBeSameAsExistingFieldTypeInTheDataGovernancePage(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(datGovernancePage.VerifyThatFieldTypeOfShouldBeSameAsExistingFieldType());
    }

    @And("^I verify that it should be a mandatory field$")
    public void iVerifyThatItShouldBeAMandatoryField() throws Throwable {
        Assert.assertTrue(datGovernancePage.verifyThatItShouldBeAMandatoryField());
    }

    @When("^I do not select any option validation message should be displayed$")
    public void iDoNotSelectAnyOptionValidationMessageShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(datGovernancePage.DoNotSelectAnyOption());
    }

    @When("^I click on Yes \"([^\"]*)\" subquestion should be displayed$")
    public void iClickOnYesSubquestionShouldBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(datGovernancePage.ClickOnYesSubquestionShouldBeDisplayed());
    }

    @When("^I click on No nothing should be displayed below the main question field$")
    public void iClickOnNoNothingShouldBeDisplayedBelowTheMainQuestionField() throws Throwable {
        Assert.assertTrue(datGovernancePage.clickOnNo());
    }


    @When("^I click on Yes I verify the type of the new subquestion field$")
    public void iClickOnYesIVerifyTheTypeOfTheNewSubquestionField() throws Throwable {
        Assert.assertTrue(datGovernancePage.verifyTheTypeOfTheNewSubquestionField());
    }


    @And("^I verify that subquestion field should be mandatory field whenever main Question value is 'Yes'$")
    public void iVerifyThatSubquestionFieldShouldBeMandatoryFieldWheneverMainQuestionValueIsYes() throws Throwable {
        Assert.assertTrue(datGovernancePage.verifySubquestionFieldShouldBeMandatoryWhenMainQuestionValueIsYes());
    }

    @Then("^I Verify if the limit exceeds -validation message should get displayed$")
    public void iVerifyIfTheLimitExceedsValidationMessageShouldGetDisplayed(List<String> textList) throws Throwable {
        for (String text : textList) {
            Assert.assertTrue(datGovernancePage.verifyIfTheLimitExceedsPRDValidationMessageShouldGetDisplayed(text));
        }

    }

    @Then("^I verify that subquestion field should be same as existing \"([^\"]*)\" field$")
    public void iVerifyThatSubquestionFieldShouldBeSameAsExistingField(String arg0) throws Throwable {
        Assert.assertTrue(datGovernancePage.VerifyThatItShouldBeSameAsExistingField());
    }


    @Then("^I click on the Products in the homepage$")
    public void iClickOnTheProductsInTheHomepage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I verify the respective Products page should be displayed$")
    public void iVerifyTheRespectiveProductsPageShouldBeDisplayed() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^I verify \"([^\"]*)\" field in the Data Governance page$")
    public void iVerifyFieldInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(datGovernancePage.verifyProductRetentionperiod());
    }

    @And("^I verify field type of \"([^\"]*)\" should be same as Existing field \"([^\"]*)\" type in the Data Governance page$")
    public void iVerifyFieldTypeOfShouldBeSameAsExistingFieldTypeInTheDataGovernancePage(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(datGovernancePage.verifyPrdRetentionType());

    }


    @And("^I check type of \"([^\"]*)\" field for Product in the Data Governance page$")
    public void iCheckTypeOfFieldForProductInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(datGovernancePage.checkTypeFieldForProd());
    }

    @And("^I verify Retention Product is mandatory field$")
    public void iVerifyRetentionProductIsMandatoryField() throws Throwable {
        Assert.assertTrue(datGovernancePage.verifyRetentionPrdFieldMandatory());
    }

    @When("^I do not select any option for Product in Retention validation message should be displayed$")
    public void iDoNotSelectAnyOptionForProductInRetentionValidationMessageShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(datGovernancePage.donotSelectPrdRetentionValid());
    }


    @Then("^I click on yes product Retention please explain subquestion should be displayed$")
    public void iClickOnYesProductRetentionPleaseExplainSubquestionShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(datGovernancePage.ClickOnYesRetentionProductSubquestion());
    }

    @When("^I click on No of Product Retention nothing should be displayed below the main question field$")
    public void iClickOnNoOfProductRetentionNothingShouldBeDisplayedBelowTheMainQuestionField() throws Throwable {
        Assert.assertTrue(datGovernancePage.ClickOnNORetentionPRD());

    }


    @Then("^I verify that subquestion field of product should be same as existing \"([^\"]*)\" field$")
    public void iVerifyThatSubquestionFieldOfProductShouldBeSameAsExistingField(String arg0) throws Throwable {
        Assert.assertTrue(datGovernancePage.verifyRetnTypSameAsExstField());
    }


    @Then("^I Verify for product if the limit exceeds -validation message should get displayed$")
    public void iVerifyForProductIfTheLimitExceedsValidationMessageShouldGetDisplayed(List<String> textList) throws Throwable {
        for (String text : textList) {
            Assert.assertTrue(datGovernancePage.verifyTheLimitExceedMsgForPrd(text));
        }
    }


    @Then("^I click on yes of Product Retention subquestion should be displayed$")
    public void iClickOnYesOfProductRetentionSubquestionShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(datGovernancePage.ClickOnYesRetentionProductSubquestion());

    }

    @When("^I click on Yes of product I verify the type of the new subquestion field$")
    public void iClickOnYesOfProductIVerifyTheTypeOfTheNewSubquestionField() throws Throwable {
        Assert.assertTrue(datGovernancePage.verifyPrdRetentionType());
    }

    @And("^I click on product Retention yes radio button then subquestion should be displayed$")
    public void iClickOnProductRetentionYesRadioButtonThenSubquestionShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(datGovernancePage.clickonyesretnsubqueshouldbedisply());

    }


    @Then("^I verify \"([^\"]*)\" field is present under \"([^\"]*)\"$")
    public void iVerifyFieldIsPresentUnder(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(datGovernancePage.verifyFieldIsPresentPRD());
    }


    @And("^I verify that HelpText displayed for Recipients of PData fields$")
    public void iVerifyThatHelpTextDisplayedForRecipientsOfPDataFields() throws Throwable {
        Assert.assertTrue(datGovernancePage.verifyHelpTxtPDataField());

    }

    @Then("^I search for \"([^\"]*)\" field in searchbox$")
    public void iSearchForFieldInSearchbox(String pdataItems) throws Throwable {
        Assert.assertTrue(datGovernancePage.searchPDataItem(pdataItems));


    }

    @And("^only search item in Recipients of PData should be displayed$")
    public void onlySearchItemInRecipientsOfPDataShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(datGovernancePage.searchItemPDATA());
    }

    @Then("^I verify the  Recipients of PData \"([^\"]*)\" field present in the \"([^\"]*)\" page$")
    public void iVerifyTheRecipientsOfPDataFieldPresentInThePage(String arg0, String arg1) throws Throwable {

        Assert.assertTrue(datGovernancePage.verifyPDataOtherfield());

    }


    @And("^check Recipients of PData \"([^\"]*)\" field is manadatory$")
    public void checkRecipientsOfPDataFieldIsManadatory(String arg0) throws Throwable {
        Assert.assertTrue(datGovernancePage.checkPDataOthrMand());
    }

    @And("^I verify that HelpText dispalyed for Recipients of PData Other in the Data Governance page$")
    public void iVerifyThatHelpTextDispalyedForRecipientsOfPDataOtherInTheDataGovernancePage() throws Throwable {
        Assert.assertTrue(datGovernancePage.helpTxtPDataOthers());
    }


    @Then("^clear the search \"([^\"]*)\" field in searchbox$")
    public void clearTheSearchFieldInSearchbox(String arg0) throws Throwable {
        Assert.assertTrue(datGovernancePage.clearSearchItemPData());
    }


    @And("^I Select the below list of values under the \"([^\"]*)\" product sub field$")
    public void iSelectTheBelowListOfValuesUnderTheProductSubField(String subField, List<String> items) throws Throwable {
        Assert.assertTrue(datGovernancePage.selectBelowPDataUnderSubField(subField, items));

    }


    @And("^I check Recipients of \"([^\"]*)\" field for PDATA Product in the Data Governance page$")
    public void iCheckRecipientsOfFieldForPDATAProductInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(datGovernancePage.verifyPDataOtherfieldType());
    }

    @And("^Validate each item of \"([^\"]*)\" present in SELECTED ITEMS box should have a 'X'$")
    public void validateEachItemOfPresentInSELECTEDITEMSBoxShouldHaveAX(String subField, List<String> items) throws Throwable {
        Assert.assertTrue(datGovernancePage.verifyPdataPresentInSelectedBox(subField, items));
    }

    @And("^when i Click on 'X' symbol for \"([^\"]*)\" available in SELECT ITEMS box$")
    public void whenIClickOnXSymbolForAvailableInSELECTITEMSBox(String other) throws Throwable {
        Assert.assertTrue(datGovernancePage.clickonXOtherInSelectedBox(other));
    }

    @And("^Recipients of PData \"([^\"]*)\" textbox should not be displayed$")
    public void recipientsOfPDataTextboxShouldNotBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(datGovernancePage.verifyPdataOthrSholdnotbeDisp());

    }

    @Then("^I Verify if limit -exceed validation message should be displayed$")
    public void iVerifyIfLimitExceedValidationMessageShouldBeDisplayed(List<String> limitvalue) throws Throwable {
        for (String limit : limitvalue) {
            Assert.assertTrue(datGovernancePage.verifyingValidationMessage(limit));
        }
    }

    @Then("^I Verify if the limit exceeds -validation message should get displayed STDPII Data$")
    public void iVerifyIfTheLimitExceedsValidationMessageShouldGetDisplayedSTDPIIData(List<String> textList) throws Throwable {
        for (String text : textList) {

            Assert.assertTrue(datGovernancePage.verifyLimitmsgPSTDPII(text));
        }
    }



}

