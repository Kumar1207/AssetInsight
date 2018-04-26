package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Stepdefinintion;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects.Products_900_Page;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
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



    @Then("^I verify that Help text should be displayed for the \"([^\"]*)\"$")
    public void iVerifyThatHelpTextShouldBeDisplayedForThe(String arg0) throws Throwable {
            Assert.assertTrue(products_900_page.verifyHelpText());

    }

    @And("^I click on information box present next to General section$")
    public void iClickOnInformationBoxPresentNextToGeneralSection() throws Throwable {
        Assert.assertTrue(products_900_page.clickOnInformationNextToGeneralSection());
    }

    @Then("^I verify the \"([^\"]*)\" and help text should be displayed$")
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

    @When("^I click on the \"([^\"]*)\" below the lists in the homepage$")
    public void iClickOnTheBelowTheListsInTheHomepage(String arg0) throws Throwable {
        Assert.assertTrue(products_900_page.ClickOnTheBelowTheListsInTheHomepage());
    }


    @Then("^I verify the \"([^\"]*)\" and help text should be displayed in information textbox$")
    public void iVerifyTheAndHelpTextShouldBeDisplayedInInformationTextbox(String arg0) throws Throwable {
        Assert.assertTrue(products_900_page.verifyNewFieldandHelpTextInInformatioBox());

    }

    @Then("^I verify Updated fields should get displayed in the Data Governance tab present in the Details page$")
    public void iVerifyUpdatedFieldsShouldGetDisplayedInTheDataGovernanceTabPresentInTheDetailsPage() throws Throwable {
        Assert.assertTrue(products_900_page.verifyUpdatedFieldInDataGovernance());
    }

    @Then("^I verify \"([^\"]*)\" default value should be blank$")
    public void iVerifyDefaultValueShouldBeBlank(String arg0) throws Throwable {
        Assert.assertTrue(products_900_page.verifyDefaultValueShouldBeBlank());

    }


    @When("^I do not select any option i verify validation message should be displayed$")
    public void iDoNotSelectAnyOptionIVerifyValidationMessageShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(products_900_page.verifyValidationMessage());

    }

    @Then("^Validate whether any checkbox is selected for the options available from the list$")
    public void validateWhetherAnyCheckBoxIsSelectedForTheOptionsAvailableFromTheList() throws Throwable {
        Assert.assertTrue(products_900_page.validateWhetherAnyCheckBoxIsSelected());


    }

    @Then("^I verify with out selecting any option available from the list Validation message should be displayed$")
    public void iVerifyWithOutSelectingAnyOptionAvailableFromTheListValidationMessageShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(products_900_page.verifyValidationMessageForCheckbox());

    }

    @And("^I select any checkbox and fill all mandatory fields$")
    public void iSelectAnyCheckboxAndFillAllMandatoryFields() throws Throwable {
        Assert.assertTrue(products_900_page.selectAnyCheckBox());

    }

    @And("^I fill below mandatory fields$")
    public void iFillBelowMandatoryFields(DataTable requiredFields) throws Throwable {
        Map<String, String> values = requiredFields.asMap(String.class, String.class);
        products_900_page.fillMandatoryFields("Mandatory", values);



    }

    @And("^I Check the type of the \"([^\"]*)\" filed$")
    public void iCheckTheTypeOfTheFiled(String arg0) throws Throwable {
        Assert.assertTrue(products_900_page.checkTheTypeOfTheField());
    }

    @And("^I verify field type of\"([^\"]*)\" should be same as Existing filed \"([^\"]*)\" type$")
    public void iVerifyFieldTypeOfShouldBeSameAsExistingFiledType(String arg0, String arg1) throws Throwable {
        Assert.assertTrue(products_900_page.verifyFieldTypeOfShouldBeSameAsExistingFiledType());

    }

    @When("^I click on Yes option below subquestions should be displayed$")
    public void iClickOnYesOptionBelowSubquestionsShouldBeDisplayed(DataTable ListItems) throws Throwable {
        List<String> listitems = ListItems.asList(String.class);
        products_900_page.clickOnYesOption("ListOptions", listitems);

    }

    @Then("^I verify Data Governance 'Sign off' button should be displayed$")
    public void iVerifyDataGovernanceSignOffButtonShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(products_900_page.verifyDataGovernanceSignOffButton());
    }

    @And("^I click on 'Return to edit page' button$")
    public void iCLickOnReturnToEditPageButton() throws Throwable {
        Assert.assertTrue(products_900_page.clickOnReturnToEdit());
    }

    @And("^I click on 'Sign off' button$")
    public void iClickOnSignOffButton() throws Throwable {
        Assert.assertTrue(products_900_page.clickOnSignOff());
    }

    @Then("^I Verify if the -limit exceeds validation message should get displayed$")
    public void iVerifyIfTheLimitExceedsValidationMessageShouldGetDisplayed(List<String> textbox) throws Throwable {
        for (String validation : textbox) {
            Assert.assertTrue(products_900_page.verifyLimitValidationMessage(validation));
        }
    }

    @Then("^I verify \"([^\"]*)\" should present in the DataGovernance page$")
    public void iVerifyShouldPresentInTheDataGovernancePage() throws Throwable {
        Assert.assertTrue(products_900_page.verifyNewField());

    }

    @And("^I Check the type of the \"([^\"]*)\" field$")
    public void iCheckTheTypeOfTheField(String arg0) throws Throwable {
        Assert.assertTrue(products_900_page.verifyTypeOfTheField());
    }


    @Then("^I Verify if limit exceeds validation -message should get displayed$")
    public void iVerifyIfLimitExceedsValidationMessageShouldGetDisplayed(List<String> limitvalue) throws Throwable {
        for (String limit : limitvalue) {
            Assert.assertTrue(products_900_page.verifyLimitValidationMessage(limit));
        }
    }
}






