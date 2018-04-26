package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Stepdefinintion;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects.Products_900_Page;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects.Products_909_Page;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ProductsPage_909_StepDef extends PageInstances {
    Products_909_Page products_909_page = PageFactory.initElements(driver, Products_909_Page.class);

    @Then("^I verify the \"([^\"]*)\" should present in the Data Governance page$")
    public void iVerifyTheShouldPresentInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(products_909_page.verifyNewField());
    }

    @And("^I Check the type of the new \"([^\"]*)\"$")
    public void iCheckTheTypeOfTheNew(String arg0) throws Throwable {
        Assert.assertTrue(products_909_page.checkTheType());
    }

    @And("^I verify the\"([^\"]*)\" should not be mandatory field$")
    public void iVerifyTheShouldNotBeMandatoryField(String arg0) throws Throwable {
        Assert.assertTrue(products_909_page.verifyNewFieldIsNotMandatory());
    }


    @Then("^I verify that Help text should be displayed for the new \"([^\"]*)\"$")
    public void iVerifyThatHelpTextShouldBeDisplayedForTheNew(String arg0) throws Throwable {
        Assert.assertTrue(products_909_page.verifyHelpText());
    }

    @Then("^I Verify the updated \"([^\"]*)\" should get displayed in the Audit History tab$")
    public void iVerifyTheUpdatedShouldGetDisplayedInTheAuditHistoryTab(String arg0) throws Throwable {
        Assert.assertTrue(products_909_page.verifyUpdatedFieldInAuditHistory());
    }


    @Then("^I verify Updated \"([^\"]*)\" should get displayed in the Data Governance tab present in the Details page$")
    public void iVerifyUpdatedShouldGetDisplayedInTheDataGovernanceTabPresentInTheDetailsPage(String arg0) throws Throwable {
        Assert.assertTrue(products_909_page.verifyUpdatedFieldInDataGovernance());
    }


    @Then("^I Verify that if the limit exceeds validation -message should get displayed$")
    public void iVerifyThatIfTheLimitExceedsValidationMessageShouldGetDisplayed(List<String> textvalue) throws Throwable {
        for (String msg : textvalue) {
            Assert.assertTrue(products_909_page.verifyValidationMessage(msg));
        }
    }


}