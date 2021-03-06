@Feature_RetentionPeriodPage_882
Feature: I verify Where possible please specify the retention period applied to personal data on your application and its basis is added.

  Background:  Given Asset Insight Home page should be displayed

  @AC_HomePage_882_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_TechnologyPage_882_02
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

  @AC_TechnologyPage_882_03
  Scenario Outline: I Verify new New field in the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<NewfieldName>" field present in the Data Governance page
    And  I Check the type of "<NewfieldName>" filed in the Data Governance page
    And  I verify that field type of "<NewfieldName>" should be same as Existing filed "<ExistingfieldName>" type in the Data Governance page
    And  I verify that it should not a mandatory field
    And  I verify that Character limit for this field should be 512 characters
    Then I Verify if the limit exceeds a validation message should get displayed
    Then I verify that "Help text" should be displayed below the text field
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And  I verify Updated field should get displayed in the Audit History tab
    Then I click on "Back to detail" button respective application details page should be displayed
    Then I verify Updated field should get displayed in the Data Governance tab present in the Details page


    Examples:
      | NewfieldName                                                                                                  | ExistingfieldName                                      |
      | Where possible please specify the retention period applied to personal data on your application and its basis | Data Sensitive to Hosting Context Description Customer |



