package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Stepdefinintion;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects.DatGovernancePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

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

/*    @Then("^I verify that it should be same as existing \"([^\"]*)\" field$")
    public void iVerifyThatItShouldBeSameAsExistingField(String arg0) throws Throwable {
        Assert.assertTrue(datGovernancePage.VerifyThatItShouldBeSameAsExistingField());
    }*/

    @And("^I verify that subquestion field should be mandatory field whenever main Question value is 'Yes'$")
    public void iVerifyThatSubquestionFieldShouldBeMandatoryFieldWheneverMainQuestionValueIsYes() throws Throwable {
        Assert.assertTrue(datGovernancePage.verifySubquestionFieldShouldBeMandatoryWhenMainQuestionValueIsYes());
    }

    @Then("^I Verify if the limit exceeds -validation message should get displayed$")
    public void iVerifyIfTheLimitExceedsValidationMessageShouldGetDisplayed() throws Throwable {
        Assert.assertTrue(datGovernancePage.verifyIfTheLimitExceedsValidationMessageShouldGetDisplayed());

    }

    @Then("^I verify that subquestion field should be same as existing \"([^\"]*)\" field$")
    public void iVerifyThatSubquestionFieldShouldBeSameAsExistingField(String arg0) throws Throwable {
        Assert.assertTrue(datGovernancePage.VerifyThatItShouldBeSameAsExistingField());
    }
}
