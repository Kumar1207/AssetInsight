@Feature_ProductsPage_903
Feature: I verify Is Thomson Reuters able to view, edit, delete, share, change or use the personal data is present in Data Governance section

  Background:
    Given Asset Insight Home page should be displayed

  @pageDisplay @AC_ProductPage_9_01
  Scenario: Creating a New Product
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
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<fieldName>" field present in the "Data Governance" page
    Then I verify "<fieldName>" default value should be blank
    And  I Check the type of the "<fieldName>" filed
    And  I verify field type of"<fieldName>" should be same as Existing filed "<ExistingfieldName>" type
    Then I verify that "Help text" should be displayed below the radio button for the main question filed
    Then I click on "SAVE/VALIDATE" button
    When I do not select any option i verify validation message should be displayed
    When I click on Yes option below subquestions should be displayed
      | View   |
      | Edit   |
      | Delete |
      | Share  |
      | Change |
      | Use    |
    Then I click on "SAVE/VALIDATE" button

  @pageDisplay @AC_ProductPage_9_02
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" below the lists in the homepage
    And  I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<fieldName>" should present in the DataGovernance page
    And  I Check the type of the "<fieldName>" field
    Then I verify that Help text should be displayed for the "<fieldName>"
    And  I click on information box present next to General section
    Then I verify the "<fieldName>" and help text should be displayed in information textbox
    And  I verify that "<fieldName>" should be mandatory field
    Then I Verify if limit exceeds validation -message should get displayed
      | short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of the products use of personal data short description of |
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    Then I Verify the updated field should get displayed in the Audit History tab
    Then I click on "Back to detail" button respective application details page should be displayed
    Then I verify Updated fields should get displayed in the Data Governance tab present in the Details page

    Examples:
      | fieldName                                                                |
      | Please provide a short description of the product's use of personal data |
#
#
#  @pageDisplay @AC_ProductPage_9_03
#  Scenario: I verify Excel should be downloaded with the updated values
#    When I click on the "Products" in the homepage
#    Then I verify the respective "Products" page is displayed
#    When I click on the "Products" below the lists in the homepage
#    And  I click on "export to Excel" button and Excel should be downloaded
#
#  @pageDisplay @AC_ProductPage_9_04
#  Scenario: Verifying Downloaded Excel data with GUI
#    Given I navigate to URL "https://assetsdev.int.thomsonreuters.com/Technology/tgo"
#    When  I click on Application- Full Extract should be downloaded