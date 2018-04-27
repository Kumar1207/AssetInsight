package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Stepdefinintion;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects.DataGovernance11Page;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DataGovernanceTab11StepDef extends PageInstances {

    DataGovernance11Page dataGovernance11Page= PageFactory.initElements(driver,DataGovernance11Page.class);

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

    //Prachi code

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

}
