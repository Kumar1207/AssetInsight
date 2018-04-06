package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Stepdefinintion;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects.DataGovernance11Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
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
}
