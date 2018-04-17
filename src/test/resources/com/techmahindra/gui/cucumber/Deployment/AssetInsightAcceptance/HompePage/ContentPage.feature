  @Features_Deployment @Feature_ContentPage
Feature: ContentPage
  This page provides the search operation based on the Contenttype, Business Unit and Region

  Background:  Given Asset Insight Home page should be displayed

  @deployment @pageDisplay @AC_ContentPage_1
  Scenario: I verify on click of the links under Content Type/Businessunit/Region will navigate to respective result page
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    And I click on the random links under "Content Type"
    And I verify the respective "Content Type" page is displayed
    And I click on the "Content" in the homepage
    And I click on the random links under "Region"
    And I verify the respective "Business Unit" page is displayed
    And I click on the "Content" in the homepage
    And I click on the random links under "Business Unit"
    And I verify the respective "Business Unit" page is displayed
    And I click on the "Content" in the homepage


  @deployment @pageDisplay @AC_ContentPage_2
  Scenario: I verify on click of the links on Content Page
    #Given Asset Insight Home page should be displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    And I click on the "All Records" on Content Page
    And I verify the respective "All records" page is displayed
    And I click on the "Content" in the homepage
    And I click on "Turkey Power" under most popular list on Content Page
    And I verify the respective "most popular" page is displayed


  @deployment @pageDisplay @AC_ContentPage_3
  Scenario: Content Page Search Operation
    #Given Asset Insight Home page should be displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I perform Quick search for the term "Blue Prism"
    Then Results page should be displayed
    Then I navigate to AssetInsight Homepage
    Then Asset Insight Home page should be displayed



