@Feature_TechnologyPage_2.1_1
Feature: I verify Where possible please specify the retention period applied to personal data on your application and its basis is added.

  Background:  Given Asset Insight Home page should be displayed

  @pageDisplay @AC_TechnologyPage_2.1_01
  Scenario: Creating a New Application
    Given Asset Insight Home page should be displayed
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


  @pageDisplay @AC_TechnologyPage_2.1_02
  Scenario Outline: I Verify new New field in the Existing Application
    Given Asset Insight Home page should be displayed
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<NewfieldName>" field is present in the Data Governance page
    And  I Check the type of "<NewfieldName>" in the Data Governance page
    When I click on "Yes" button for "<NewfieldName>" field
    Then I verify All the sub questions under "<NewfieldName>" field should get displayed
    Then I verify "Sensitive PII Data Type" sub field is present under "<NewfieldName>" the Data Governance page
    And  I verify that 'Help text' displayed for "Sensitive PII Data Type"

    Then I verify below list of values should be present under "Sensitive PII Data Type" sub field:
      |Sex life or sexual orientation|
      |Observations of behavior or conduct of persons (including personal preferences, interests, reliability)|
    #And  I Select the below list of values under "Sensitive PII Data Type" sub field:
    #  |Sex life or sexual orientation|
     # |Observations of behavior or conduct of persons (including personal preferences, interests, reliability)|
    Then I click on "Save/Validate" button
    Then I click on "Back to detail" button respective application details page should be displayed
    Then I verify Updated field should get displayed in the Data Governance tab present in the Details page

    Examples:
      | NewfieldName       |
      | Sensitive PII Data |

  @pageDisplay @AC_TechnologyPage_2.1_03
  Scenario: I verify Excel should be downloaded with the updated values
    Then  I click on the "Technology" in the homepage

    Then  I verify the respective "Technology" page is displayed
    Then  I click on the "Applications" present in the Technology page
    And   I click on "export to Excel" button and Excel should be downloaded


  @pageDisplay @AC_TechnologyPage_2.1_04
  Scenario: Verifying Downloaded Excel data with GUI
    Given I navigate to URL "https://assetsdev.int.thomsonreuters.com/Technology/tgo"
    When  I click on Application- Full Extract should be downloaded
#   Then  Application- Full Extract should be downloaded

