@Features_Deployment @Feature_ProductsPage
Feature: ProductsPage
  This page provides the search operation based on the Contenttype, Business Unit and Region


  @deployment @pageDisplay @AC_ProductsPage_1
  Scenario: Products Page Search Operation
    Given Asset Insight Home page should be displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I perform Quick search for the term "Blue Prism"
    Then Results page should be displayed
    Then I navigate to AssetInsight Homepage
    Then Asset Insight Home page should be displayed

  @deployment @pageDisplay @AC_ProductsPage_2
  Scenario: I verify on click of the links under Businessunit/Product Status will navigate to respective result page
    Given Asset Insight Home page should be displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    And I click on the random links under "Product Status"
    And I verify the respective "Product Status" page is displayed
    And I click on the "Products" in the homepage
    And I click on the random links under "Business Unit"
    And I verify the respective "Business Unit" page is displayed
    And I click on the "Products" in the homepage


  @deployment @pageDisplay @AC_ProductsPage_3
  Scenario: I verify on click of the links under Products Page
    Given Asset Insight Home page should be displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    And I verify the respective "most popular product" page is displayed
