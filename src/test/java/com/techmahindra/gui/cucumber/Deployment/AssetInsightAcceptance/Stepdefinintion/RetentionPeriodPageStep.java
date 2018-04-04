package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Stepdefinintion;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects.RetentionPeriodPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

public class RetentionPeriodPageStep extends PageInstances{

    RetentionPeriodPage retentionPeriodPage= PageFactory.initElements(driver, RetentionPeriodPage.class);

    @Then("^I verify \"([^\"]*)\" field present in the Data Governance page$")
    public void iVerifyFieldPresentInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(retentionPeriodPage.VerifyFieldPresentInTheDataGovernancePage());
    }

    @And("^I Check the type of \"([^\"]*)\" filed in the Data Governance page$")
    public void iCheckTheTypeOfFiledInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(retentionPeriodPage.checkTheTypeOfTheField());
    }

    @And("^I verify that field type of \"([^\"]*)\" should be same as Existing filed \"([^\"]*)\" type in the Data Governance page$")
    public void iVerifyThatFieldTypeOfShouldBeSameAsExistingFiledTypeInTheDataGovernancePage(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(retentionPeriodPage.VerifyThatFieldTypeOfShouldBeSameAsExistingFiledType());

    }

    @And("^I verify that it should not a mandatory field$")
    public void iVerifyThatItShouldNotAMandatoryField() throws Throwable {
        Assert.assertTrue(retentionPeriodPage.VerifyThatItShouldNotAMandatoryField());

    }


    @And("^I verify that Character limit for this field should be (\\d+) characters$")
    public void iVerifyThatCharacterLimitForThisFieldShouldBeCharacters(int arg0) throws Throwable {
        Assert.assertTrue(retentionPeriodPage.verifyTheCharacterLimit());
    }

/*
    @Then("^I Verify if the limit exceeds a validation message should get displayed$")
    public void iVerifyIfTheLimitExceedsAValidationMessageShouldGetDisplayed() throws Throwable {
        Assert.assertTrue(retentionPeriodPage.verifyErrMsgIsDisplayedIfTheLimitExceeds());
    }*/

    @Then("^I verify that \"([^\"]*)\" should be displayed below the text field$")
    public void iVerifyThatShouldBeDisplayedBelowTheTextField(String arg0) throws Throwable {
        Assert.assertTrue(retentionPeriodPage.verifyHelpTextShouldBeDispalyed());
    }

    @And("^I verify Updated field should get displayed in the Audit History tab$")
    public void iVerifyUpdatedFieldShouldGetDisplayedInTheAuditHistoryTab() throws Throwable {
        Assert.assertTrue(retentionPeriodPage.verifyUpdatedFieldInAuditHistory());
    }

    @Then("^I verify Updated field should get displayed in the Data Governance tab present in the Details page$")
    public void iVerifyUpdatedFieldShouldGetDisplayedInTheDataGovernanceTabPresentInTheDetailsPage() throws Throwable {
        Assert.assertTrue(retentionPeriodPage.verifyUpdatedFieldInDataGovernance());
    }

    @Then("^I Verify if the limit exceeds a validation message should get displayed$")
    public void iVerifyIfTheLimitExceedsAValidationMessageShouldGetDisplayed() throws Throwable {
        Assert.assertTrue(retentionPeriodPage.verifyErrMsgIsDisplayedIfTheLimitExceeds());
    }



}
