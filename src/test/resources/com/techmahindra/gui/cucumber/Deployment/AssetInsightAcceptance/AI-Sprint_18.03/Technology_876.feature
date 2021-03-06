@Feature_TechnologyPage_876
Feature: I verify Is Thomson Reuters able to view, edit, delete, share, change or use the personal data

  Background:
    Given Asset Insight Home page should be displayed

  @AC_TechnologyPage_876_01
  Scenario: Creating a New Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I create New Application in the Technology page for below mandatory fields
      | Application Name                | Data Management System   |
      | Short Name                      | DM                       |
      | Launch Year                     | 1998                     |
      | Business Unit (BU)              | Financial & Risk         |
      | Application Type                | Software Sale            |
      | Description                     | Data Management System   |
      | Application Development Contact | Prashanthi Modium        |
      | AML Business Contact            | Beaumont, Stewart (TRGR) |
      | Platform Classification         | No Intent to Migrate     |
    Then I click on "SAVE/VALIDATE" button

  @AC_TechnologyPage_876_02
  Scenario Outline: I Verify the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I verify updated field should be displayed in Data Governance tab present in the Details page
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<fieldName>" field present in the "Data Governance" page
    And  I Check the type of "<fieldName>" filed
    And  I verify that field type of "<fieldName>" should be same as Existing filed "<ExistingfieldName>" type
    When I do not select Yes/No option validation message should be displayed
    When I click on Yes option below subquestion should be displayed
      | View   |
      | Edit   |
      | Delete |
      | Share  |
      | Change |
      | Use    |
    When I click on "No" option nothing should be displayed below the main question field
    And  I verify the type of the "new subquestion" filed
    Then I verify that No search should be avialable for the Checklist
    And  I verify that multiple selection should be possible for this subquestion field
    Then I verify that "Help text" should be displayed below the radio button for the main question filed
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    Then I verify updated field should be displayed in audit History tab
    Then I click on "Back to detail" button respective application details page should be displayed


    Examples:
      | fieldName                                                                              | ExistingfieldName |
      | Is Thomson Reuters able to view, edit, delete, share, change or use the personal data? | Standard Customer |

  @ExcelPage_876_03
  Scenario: I verify data present in both Excel and details Page should be same
    Then  I click on the "Technology" in the homepage
    Then  I verify the respective "Technology" page is displayed
    Then  I click on the "Applications" present in the Technology page
    And   I select any Existing Application present in the Result Page
    Then  I verify the values present in the excel and in details page should be same
      | TR can view and modify personal data   |
      | Actions TR can take with personal data |
