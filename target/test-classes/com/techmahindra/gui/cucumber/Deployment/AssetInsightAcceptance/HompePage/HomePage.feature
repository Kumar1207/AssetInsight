@Features_Deployment @Feature_HomePage
Feature: HomePage
  This is the main landing page of the application.Here we verify the products avialable for the user along with Header and footer display.

  @deployment @pageDisplay @AC_HomePage_1
  Scenario: Home page display
    Given Asset Insight Home page should be displayed
    When I perform Quick search for the term "content tool"
    Then Results page should be displayed
    Then I navigate to AssetInsight Homepage
    Then Asset Insight Home page should be displayed


  @deployment @pageDisplay @AC_HomePage_2
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

