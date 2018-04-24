@Feature_ProductsPage_9_9.1
Feature: I verify Is Thomson Reuters able to view, edit, delete, share, change or use the personal data is present in Data Governance section

  Background: Given Asset Insight Home page should be displayed

  @pageDisplay @AC_ProductPage_9_01
  Scenario Outline: Creating a New Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" below the lists in the homepage
    And  I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
#    Then I create New Product in the product page for below mandatory fields
#      | Product Name         | Product                           |
#      | Business Unit        | Intellectual Property and Science |
#      | Business Sub Segment | EBS                               |
#      | Product Status       | Not Yet Launched                  |
#      | Product Level        | Base                              |
#      | Marketing Contact    | Prashanthi Modium                 |
#    Then I click on "SAVE/VALIDATE" button
#    And  I click on "Edit This Record" Details Page
#    And  I click on "Data Governance" tab
#    Then I verify "<fieldName>" field present in the "Data Governance" page
#    Then I verify "<fieldName>" default value should be blank
#    And  I Check the type of the "<fieldName>" filed
#    And  I verify field type of"<fieldName>" should be same as Existing filed "<ExistingfieldName>" type
#    Then I verify that "Help text" should be displayed below the radio button for the main question filed
    Then I click on "SAVE/VALIDATE" button
    When I do not select any option i verify validation message should be displayed
    When I click on Yes option below subquestion should be displayed
      | View   |
      | Edit   |
      | Delete |
      | Share  |
      | Change |
      | Use    |
    Then Validate whether any checkbox is selected for the options available from the list
    Then I click on "SAVE/VALIDATE" button
    Then I verify with out selecting any option available from the list Validation message should be displayed
    And  I select any checkbox and fill all mandatory fields
    Then I click on "SAVE/VALIDATE" button
    And I fill below mandatory fields
    |Please provide a short description of the product's use of personal data|Personal data|
    |Sensitive PII Data                                                      |No           |
    |Standard PII Data                                                       |Yes           |
    |Sensitive Customer or Partner Data                                      |No           |
    |Standard Customer or Partner Data                                       |No           |
    |Sensitive Thomson Reuters Data                                          |No           |
    |Regulated Data                                                          |FISMA        |
    |Data Sensitive to Hosting Context                                       |No           |
    |Is Thomson Reuters able to view, edit, delete, share, change or use the personal data|I don't Know|
    |Is Thomson Reuters free to decide whether/how the personal data is viewed, edited, deleted, shared, changed or used|I don't Know|
    |If you answered "No" or "I don't know", please confirm if you share any personal data from your product with any sub-contractor/service provider used by Thomson Reuters|I don't Know|
    |Does Thomson Reuters jointly decide how to use personal data in your product with any other party?                                                                      |I don't Know|
    |Will any personal data be transferred to or accessed outside the geographic locations where it was originally collected                                                 |I don't Know|
    |If your product involves the transfer of personal data to a third party (e.g. vendor, service provider, customer), is there a contract in place with the third party that contains data transfer privacy clauses approved by the Legal Department|I don't Know|
    |Does the retention period vary according to the types of data stored                                                                                                                                                                             |I dont Know |

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