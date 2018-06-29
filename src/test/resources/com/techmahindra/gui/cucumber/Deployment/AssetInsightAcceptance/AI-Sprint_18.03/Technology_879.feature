@Feature_TechnologyPage_879
Feature: I verify Where possible please specify the retention period applied to personal data on your application and its basis is added.

  Background:
    Given Asset Insight Home page should be displayed

  @TechnologyPage_879_01
  Scenario: Creating a New Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I create New Application in the Technology page for below mandatory fields
      | Application Name                | Data Management System   |
      | Short  Name                     | DM                       |
      | Launch Year                     | 1998                     |
      | Business Unit (BU)              | Financial & Risk         |
      | Application Type                | Software Sale            |
      | Description                     | Data Management System   |
      | Application Development Contact | Prashanthi Modium        |
      | AML Business Contact            | Beaumont, Stewart (TRGR) |
      | Platform Classification         | No Intent to Migrate     |
    Then I click on "SAVE/VALIDATE" button

  @TechnologyPage_879_02
  Scenario Outline: I Verify new New field in the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify the "<Newfield>" is present in the Data Governance page
    When I select 'others' from ITEMS "<SubField>" should be displayed
    Then I validate "<SubField>" should not displayed when i donot select 'others' from ITEMS
    Then I Verify if limit -exceeds validation message should be displayed
      | Recipients of personal data Recipients of personal data Recipients of personal data Recipients of personal data Recipients of personal data Recipients of personal data Recipients of personal data Recipients of personal data Recipients of personal data Recip |
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And  I verify Updated field should be displayed in the Audit History tab
    Then I click on "Back to detail" button respective application details page should be displayed
    Then I verify Updated field should get displayed in the Data Governance tab present in the Details page


    Examples:
      | Newfield                                          | SubField                            |
      | Who receives personal data from your application? | Recipients of personal data - Other |


