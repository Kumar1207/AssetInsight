package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Stepdefinintion;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.PageInstances;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects.AssetHomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by SK00447696 on 2/21/18.
 */
public class HomePageStepDef extends PageInstances {

    AssetHomePage assetHomePage = PageFactory.initElements(driver,AssetHomePage.class);

    @Given("^Asset Insight Home page should be displayed$")
    public void assetInsightHomePageShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(assetHomePage.isPageDisplayed());
    }

    @And("^I verify following options are avialable in the homepage$")
    public void iVerifyFollowingOptionsAreAvialableInTheHomepage(List<String> Options) throws Throwable {
        Assert.assertTrue(assetHomePage.validateOptions(Options));
    }

    @When("^I perform Quick search for the term \"([^\"]*)\"$")
    public void iPerformQuickSearchForTheTerm(String searchTerm) throws Throwable {
        Assert.assertTrue(assetHomePage.performSearch(searchTerm));
    }

    @Then("^Results page should be displayed$")
    public void resultsPageShouldBeDisplayed() throws Throwable {
        Assert.assertTrue(assetHomePage.validateResultPage());
    }
    @Then("^I navigate to AssetInsight Homepage$")
    public void iNavigateToAssetInsightHomepage() throws Throwable {
        Assert.assertTrue(assetHomePage.navigateToAssetInsightHomePage());
    }


    @When("^I click on the \"([^\"]*)\" in the homepage$")
    public void iClickOnTheInTheHomepage(String option) throws Throwable {
        Assert.assertTrue(assetHomePage.clickOnHeaderOptions(option,"header"));
    }

    @Then("^I verify the respective \"([^\"]*)\" page is displayed$")
    public void iVerifyTheRespectivePageIsDisplayed(String option) throws Throwable {
        Assert.assertTrue(assetHomePage.verifyRespectivePage(option,"header"));
    }

    @And("^I click on the random links under \"([^\"]*)\"$")
    public void iClickOnTheRandomLinksUnder(String link) throws Throwable {
        Assert.assertTrue(assetHomePage.clickOnRandomLink(link));
    }

    @And("^I click on the \"([^\"]*)\" on Content Page$")
    public void iClickOnTheOnContentPage(String link) throws Throwable {
        Assert.assertTrue(assetHomePage.clickOnRandomLink(link));

    }

    @And("^I click on \"([^\"]*)\" under most popular list on Content Page$")
    public void iClickOnUnderMostPopularListOnContentPage(String arg0) throws Throwable {
        Assert.assertTrue(assetHomePage.clickOnRandomLink(arg0));
    }


    }
