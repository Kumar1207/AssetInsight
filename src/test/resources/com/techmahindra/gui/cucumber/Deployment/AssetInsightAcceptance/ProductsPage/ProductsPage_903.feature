@Feature_ProductsPage_9_9.1
Feature: I verify Is Thomson Reuters able to view, edit, delete, share, change or use the personal data is present in Data Governance section

  Background:  Given Asset Insight Home page should be displayed

  @pageDisplay @AC_ProductPage_9_01
  Scenario Outline: Creating a New Product
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
    And  I Check the type of "<fieldName>" filed
    And  I verify that field type of "<fieldName>" should be same as Existing filed "<ExistingfieldName>" type
    Then I verify that "Help text" should be displayed below the radio button for the main question filed
    Then I click on 'Save/Validate' button with out selecting any option for "<fieldName>"
    Then I verify Validation message should be displayed
    When I click on Yes option below subquestion should be displayed
      | View   |
      | Edit   |
      | Delete |
      | Share  |
      | Change |
      | Use    |
    Then Validate whether any check box is selected for the options available from the list
    Then I verify By default none of the check box should be selected in the list and value should be Blank
    Then I click on "SAVE/VALIDATE" button
    Then I verify with out selecting any option available from the list Validation message should be displayed
    And  I select any checkbox and fill all mandatory fields
    Then I click on "SAVE/VALIDATE" button
    Then I verify Data Governance 'Sign off' button should be displayed
    And  I click on 'Return to edit page' button
    Then I verify user should be on the same page (Data Governance) Page
    And  I click on 'Sign off' button
    Then I verify Product should be saved successfully
    Then I click on "Back to detail" then respective application details page should be displayed

    Examples:
      | fieldName                                                                              | ExistingfieldName |
      | Is Thomson Reuters able to view, edit, delete, share, change or use the personal data? | Standard Customer |

  @pageDisplay @AC_ProductPage_02
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" below the lists in the homepage
    And  I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<fieldName>" should present in the Data Governance" page
    And  I Check the type of the "<fieldName>" field
    Then I verify that Help text should be displayed for the "<fieldName>"
    And  I click on information box present next to General section
    Then I verify the "<fieldName>" and help text should be displayed in information textbox
    And  I verify that "<fieldName>" should be mandatory field
    Then I Verify if the limit exceeds validation message should get displayed
      | Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E Product Information about 3E |
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    Then I Verify the updated field should get displayed in the Audit History tab
    Then I click on "Back to detail" then respective application details page should be displayed
    Then I verify Updated fields should get displayed in the Data Governance tab present in the Details page

    Examples:
      | fieldName                                                                |
      | Please provide a short description of the product's use of personal data |


  @pageDisplay @AC_ProductPage_03
  Scenario: I verify Excel should be downloaded with the updated values
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" below the lists in the homepage
    And  I click on "export to Excel" button and Excel should be downloaded