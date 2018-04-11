package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Stepdefinintion;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects.DataGovernance11Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class DataGovernanceTab11StepDef extends PageInstances{

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

    @And("^I verify that it should be mandatory field$")
    public void iVerifyThatItShouldBeMandatoryField() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyMandatoryField());
    }

    @When("^I dont select Yes/No option validation message should be displayed$")
    public void iDontSelectYesNoOptionValidationMessageShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifyValidationMessage());

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


    @Then("^I Verify if the limit exceeds for \"([^\"]*)\" validation message should get displayed$")
    public void iVerifyIfTheLimitExceedsForValidationMessageShouldGetDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySubQue1FieldLimit());
    }

    @Then("^I Verify if the limit exceeds \"([^\"]*)\" validation message should get displayed$")
    public void iVerifyIfTheLimitExceedsValidationMessageShouldGetDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(dataGovernance11Page.verifySubQue2FieldLimit());

    }

}
