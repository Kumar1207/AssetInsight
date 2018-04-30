package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Stepdefinintion;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects.DataGovernance11Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DataGovernanceTab11StepDef extends PageInstances {

    DataGovernance11Page dataGovernance11Page = PageFactory.initElements(driver, DataGovernance11Page.class);

    @Then("^I verify the \"([^\"]*)\" present in the Data Governance page$")
    public void iVerifyThePresentInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyNewField());
    }


    @And("^I Check the type of the \"([^\"]*)\" in the Data Governance page$")
    public void iCheckTheTypeOfTheInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.checkTypeOfField());
    }

    @And("^I verify that type of \"([^\"]*)\" should be same as Existing filed \"([^\"]*)\" type in the Data Governance page$")
    public void iVerifyThatTypeOfShouldBeSameAsExistingFiledTypeInTheDataGovernancePage(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTypeShouldSameAsExisting());
    }

    @And("^I Check the type of Standard PII Data Type filed in the Data Governance page$")
    public void iCheckTheTypeOfStandardPIIDataTypeFiledInTheDataGovernancePage() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.checkTypeOfSTDPIIField());

    }

    @Then("^I verify the \"([^\"]*)\" field present in the \"([^\"]*)\" page$")
    public void iVerifyTheFieldPresentInThePage(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTypeOtherSTDPIIField());

    }

    @Then("^I click on \"([^\"]*)\" field in the Data Governance page$")
    public void iClickOnFieldInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonOtherSTDPIIField());

    }

    @And("^I Check the type of Standard PII Data Type - Other field in the Data Governance page$")
    public void iCheckTheTypeOfStandardPIIDataTypeOtherFieldInTheDataGovernancePage() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.checkOtherSTDPIIField());

    }


    @And("^I click on Standard PII Data 'Yes' radio button$")
    public void iClickOnStandardPIIDataYesRadioButton() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickOnSTDPIIDataYes());
    }


    @When("^Standard PII Data' field is selected as 'Yes' then 'Standard PII Data Type field should be displayed$")
    public void standardPIIDataFieldIsSelectedAsYesThenStandardPIIDataTypeFieldShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.stdPIIDataFieldYesThenStdPIIType());
    }

    @When("^I click on 'Standard PII Data' field is selected as 'No'$")
    public void iClickOnStandardPIIDataFieldIsSelectedAsNo() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickOnSTDPIIDataNo());

    }

    @Then("^'Standard PII Data Type - Other' should not get displayed$")
    public void standardPIIDataTypeOtherShouldNotGetDisplayed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyOtherNotDisSTDPIIField());

    }


    /*@And("^I verify new values which are given in the requirement document also should be added to the picklist:$")
    public void iVerifyNewValuesWhichAreGivenInTheRequirementDocumentAlsoShouldBeAddedToThePicklist(List<String> stdPIIItems) throws Throwable {

    }*/

    /*@And("^I below values which are given in the requirement document also should be added to the picklist:$")
    public void iBelowValuesWhichAreGivenInTheRequirementDocumentAlsoShouldBeAddedToThePicklist(String subField,List<String> stdPIIItems) throws Throwable {

        Assert.assertTrue(dataGovernance11Page.verifyBelowListOfValuesUnderSubField(subField, stdPIIItems));
    }*/


    @And("^I verify that it should be a mandatory field for Standard PII Data Type - Other field in the Data Governance page$")
    public void iVerifyThatItShouldBeAMandatoryFieldForStandardPIIDataTypeOtherFieldInTheDataGovernancePage() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySTDPIIOthrfieldMandrty());
    }

    @And("^I Select the below list of values under \"([^\"]*)\" sub field$")
    public void iSelectTheBelowListOfValuesUnderSubField(String subField, List<String> items) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.selectBelowListOfValuesUnderSubField(subField, items));
    }


    @And("^I verify that HelpText displayed for \"([^\"]*)\" fields$")
    public void iVerifyThatHelpTextDisplayedForFields(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyHelpTxtSTDPIIData());

    }


    /*@And("^I verify that HelpText dispalyed for \"([^\"]*)\" in the Data Governance page$")
    public void iVerifyThatHelpTextDispalyedForInTheDataGovernancePage(String arg0) throws Throwable {
      Assert.assertTrue(dataGovernance11Page.verifyHelpTxtSTDPIIDataOthers());
    }*/

    @And("^I verify that HelpText dispalyed for \"([^\"]*)\" in the Data Governance pageDisplay$")
    public void iVerifyThatHelpTextDispalyedForInTheDataGovernancePageDisplay(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyHelpTxtSTDPIIDataOthers());
    }



    @Then("^I verify \"([^\"]*)\" field is present in the Data Governance page$")
    public void iVerifyFieldIsPresentInTheDataGovernancePage(String fieldName) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyFieldPrescenceInDataGovernancePage(fieldName));
    }

    @And("^I Check the type of \"([^\"]*)\" in the Data Governance page$")
    public void iCheckTheTypeOfInTheDataGovernancePage(String fieldName) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.checkTypeOfField(fieldName));
    }

    @When("^I click on \"([^\"]*)\" button for \"([^\"]*)\" field$")
    public void iClickOnButtonForField(String buttonValue, String fieldName) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickOnRadioButtonForFieldName(buttonValue,fieldName));
    }

    @Then("^I verify All the sub questions under \"([^\"]*)\" field should get displayed$")
    public void iVerifyAllTheSubQuestionsUnderFieldShouldGetDisplayed(String fieldName) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySubQuestionsUnderFieldNameIsDisplayed(fieldName));
    }

    @Then("^I verify \"([^\"]*)\" sub field is present under \"([^\"]*)\" the Data Governance page$")
    public void iVerifySubFieldIsPresentUnderTheDataGovernancePage(String subField, String field) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyPrescenceOfSubFieldUnderField(subField,field));
    }

    @And("^I verify that 'Help text' displayed for \"([^\"]*)\"$")
    public void iVerifyThatHelpTextDisplayedFor(String subField) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyHelpTextDisplayedForSubField(subField));
    }

    @Then("^I verify below list of values should be present under \"([^\"]*)\" sub field:$")
    public void iVerifyBelowListOfValuesShouldBePresentUnderSubField(String subField, List<String> items) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyListOfValuesBePresentUnderSubField(subField,items));
    }


    @And("^I verify that it should be mandatory field$")
    public void iVerifyThatItShouldBeMandatoryField() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyMandatoryField());
    }


    @When("^I click on Yes \"([^\"]*)\" and \"([^\"]*)\" should be displayed$")
    public void iClickOnYesAndShouldBeDisplayed(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySubQuestionFields());
    }

    @When("^I click on No option nothing should be displayed below the main question field$")
    public void iClickOnNoOptionNothingShouldBeDisplayedBelowTheMainQuestionField() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonNO());
    }

    @When("^I click on I dont Know option nothing should be displayed below the main question field$")
    public void iClickOnIDontKnowOptionNothingShouldBeDisplayedBelowTheMainQuestionField() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.clickonIDontKnow());
    }

    @When("^I click on Yes I verify the type of the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void iClickOnYesIVerifyTheTypeOfTheAnd(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTheTypeOfSubQueFields());
    }

    @Then("^I verify type of \"([^\"]*)\" and \"([^\"]*)\" should be same as existing \"([^\"]*)\" field$")
    public void iVerifyTypeOfAndShouldBeSameAsExistingField(String arg0, String arg1, String arg2) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyTypeOfSubQueShouldBeSameAsExistingField());
    }

    @Then("^I Verify if the limit exceeds for first -SubQueField validation message should get displayed$")
    public void iVerifyIfTheLimitExceedsForFirstSubQueFieldValidationMessageShouldGetDisplayed(List<String> subQue1LimitValue) throws Throwable {
        for (String subque1limit : subQue1LimitValue) {
            Assert.assertTrue(dataGovernance11Page.verifySubQue1FieldLimit(subque1limit));
        }

    }

    @Then("^I Verify if the limit exceeds second -SubQueField validation message should get displayed$")
    public void iVerifyIfTheLimitExceedsSecondSubQueFieldValidationMessageShouldGetDisplayed(List<String> subQue2LimitValue) throws Throwable {
        for (String subque2limit : subQue2LimitValue) {
            Assert.assertTrue(dataGovernance11Page.verifySubQue2FieldLimit(subque2limit));
        }

    }

    @When("^I dont select Yes/No option validation message should be displayed$")
    public void iDontSelectYesNoOptionValidationMessageShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyValidationMessage());
    }


}
