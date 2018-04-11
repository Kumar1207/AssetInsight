package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Stepdefinintion;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects.Products_900_Page;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class Products_900_StepDef extends PageInstances{

    Products_900_Page products_900_page= PageFactory.initElements(driver, Products_900_Page.class);

    @Then("I create New Product in the product page for below mandatory fields$")
    public void iCreateNewProductInTheProductPageForBelowMandatoryFields(DataTable CreateProductFields) throws Throwable {
        Map<String, String> data = CreateProductFields.asMap(String.class, String.class);
        products_900_page.createNewProduct("Create", data);
    }

    @And("^I select any Existing Product present in the Result Page$")
    public void iSelectAnyExistingProductPresentInTheResultPage() throws Throwable {
        Assert.assertTrue(products_900_page.selectAnyExistingProduct());
    }

    @Then("^I verify \"([^\"]*)\" should present in the Data Governance\" page$")
    public void iVerifyShouldPresentInTheDataGovernancePage(String arg0) throws Throwable {
        Assert.assertTrue(products_900_page.verifyNewField());
    }

    @And("^I Check the type of  the \"([^\"]*)\" field$")
    public void iCheckTheTypeOfTheField(String arg0) throws Throwable {
        Assert.assertTrue(products_900_page.verifyTypeOfTheField());
    }

    @Then("^I verify that Help text should be displayed for the \"([^\"]*)\"$")
    public void iVerifyThatHelpTextShouldBeDisplayedForThe(String arg0) throws Throwable {
            Assert.assertTrue(products_900_page.verifyHelpText());

    }

    @And("^I click on information box present next to General section$")
    public void iClickOnInformationBoxPresentNextToGeneralSection() throws Throwable {
        Assert.assertTrue(products_900_page.clickOnInformationNextToGeneralSection());
    }

    @Then("^I verify the \"([^\"]*)\"  and help text should be displayed$")
    public void iVerifyTheAndHelpTextShouldBeDisplayed(String arg0) throws Throwable {
        Assert.assertTrue(products_900_page.verifyNewFieldandHelpTextInInformatioBox());
    }

    @And("^I verify that \"([^\"]*)\" should be mandatory field$")
    public void iVerifyThatShouldBeMandatoryField(String arg0) throws Throwable {
        Assert.assertTrue(products_900_page.verifyNewFieldShouldBeMandatoryField());
    }

    @Then("^I Verify the updated field should get displayed in the Audit History tab$")
    public void iVerifyTheUpdatedFieldShouldGetDisplayedInTheAuditHistoryTab() throws Throwable {
        Assert.assertTrue(products_900_page.verifyUpdatedFieldInAuditHistory());
    }

    @Then("^I Verify the \"([^\"]*)\" should be displayed in the Details Page$")
    public void iVerifyTheShouldBeDisplayedInTheDetailsPage(String arg0) throws Throwable {
        Assert.assertTrue(products_900_page.verifyUpdatedFieldInDetailsPage());
    }
}

