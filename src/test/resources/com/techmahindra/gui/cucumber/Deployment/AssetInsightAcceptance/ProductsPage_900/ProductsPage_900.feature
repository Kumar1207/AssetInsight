@Feature_ProductsPage
Feature: I verify Please provide a short description of the product's use of personal data in the DataGovernance Tab Present in the Products Page

  @pageDisplay @AC_ProductPage_01
  Scenario: Creating a New Product
    Given Asset Insight Home page should be displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    Then I create New Product in the product page for below mandatory fields
      | Product Name         | Product                           |
      | Business Unit        | Intellectual Property and Science |
      | Business Sub Segment | EBS                               |
      | Product Status       | Not Yet Launched                  |
      | Product Level        | Base                              |
      | Marketing Contact    | Prashanthi Modium                 |
    Then I click on "SAVE/VALIDATE" button


  @pageDisplay @AC_ProductPage_02
  Scenario Outline: I Verify the Existing Product
    Given Asset Insight Home page should be displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" in the homepage
    And  I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<fieldName>" should present in the Data Governance" page
    And  I Check the type of  the "<fieldName>" field
    Then I verify that Help text should be displayed for the "<fieldName>"
    And  I click on information box present next to General section
    Then I verify the "<fieldName>"  and help text should be displayed
    And  I verify that "<fieldName>" should be mandatory field
    Then I Verify if the limit exceeds validation message should get displayed
      |3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short description 3E Product short desc|
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    Then I Verify the updated field should get displayed in the Audit History tab
    Then I click on "Back to detail" button
    Then I Verify the "<fieldName>" should be displayed in the Details Page

    Examples:
      | fieldName                                                                |
      | Please provide a short description of the product's use of personal data |


  @pageDisplay @AC_ProductPage_03
  Scenario: I verify Excel should be downloaded with the updated values
    Given Asset Insight Home page should be displayed
    Then I click on the Products in the homepage
    Then I verify the respective Products page should be displayed
    Then  I click on the Products present in the Products page
    And   I click on "export to Excel" button and Excel should be downloaded


