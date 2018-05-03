@Feature_ProductsPage_909
Feature: I verify where possible please specify the retention period applied to personal data on your product and its basis

  Background:
    Given Asset Insight Home page should be displayed

  @pageDisplay @AC_HomePage_15
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @pageDisplay @AC_ProductPage_15_01
  Scenario: Creating a New Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    Then I create New Product in the product page for below mandatory fields
      | Product Name         | Product                           |
      | Business Unit        | Intellectual Property and Science |
      | Business Sub Segment | EBS                               |
      | Product Status       | Not Yet Launched                  |
      | Product Level        | Base                              |
      | Marketing Contact    | Modium, Prashanthi                |
    Then I click on "SAVE/VALIDATE" button

  @pageDisplay @AC_ProductPage_15_02
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" below the lists in the homepage
    And  I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify the "<fieldName>" should present in the Data Governance page
    And  I Check the type of the new "<fieldName>"
    And  I verify the"<fieldName>" should not be mandatory field
    Then I Verify that if the limit exceeds validation -message should get displayed
      | Where possible specify the rp applied to personal data on your product Where possible specify the rp applied to personal data on your product Where possible specify the rp applied to personal data on your product Where possible specify the rp applied to personal data on your product Where possible specify the rp applied to personal data on your product Where possible specify the rp applied to personal data on your product Where possible specify the rp applied to personal data on your product Where possible spe |
    Then I verify that Help text should be displayed for the new "<fieldName>"
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    Then I Verify the updated "<fieldName>" should get displayed in the Audit History tab
    Then I click on "Back to detail" button respective application details page should be displayed
    Then I verify Updated "<fieldName>" should get displayed in the Data Governance tab present in the Details page

    Examples:
      | fieldName                                                                                                  |
      | Where possible please specify the retention period applied to personal data on your product and its basis. |


  @pageDisplay @AC_ProductPage_09_03
  Scenario: I verify Excel should be downloaded with the updated values
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" below the lists in the homepage
#    And  I click on "export to Excel" button and Excel should be downloaded


