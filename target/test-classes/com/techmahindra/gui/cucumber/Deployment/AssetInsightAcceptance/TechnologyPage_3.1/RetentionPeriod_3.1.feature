@Feature_TechnologyPage_3.1_1
Feature: I verify Where possible please specify the retention period applied to personal data on your application and its basis is added.

  @pageDisplay @AC_TechnologyPage_3.1_01
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


  @pageDisplay @AC_TechnologyPage_3.1_02
  Scenario Outline: I Verify new New field in the Existing Application
    Given Asset Insight Home page should be displayed
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    And  I verify the "Standard PII Data Type" field present in the Data Governance page
    And  I Check the type of Standard PII Data Type filed in the Data Governance page
    And  I verify the "Standard PII Data Type" type and it should be same as Existing filed "Standard PII Data Context" type in the Data Governance page
    Then I verify the "Standard PII Data Type - Other" field present in the "Data Governance" page
    And  I Check the type of Standard PII Data Type - Other field in the Data Governance page
    When Standard PII Data' field is selected as 'Yes' then 'Standard PII Data Type field should be displayed
    When Standard PII Data' field is selected as 'No' then 'Standard PII Data Type - Other' should not get displayed
    When Standard PII Data' field is selected as 'yes' and 'Standard PII Data Type' as Other
    Then 'Standard PII Data Type - Other' should get displayed
    And  I verify that in any other case it should not get displayed
    Then I verify that HelpText should be displayed for the two new fields
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And  I verify Updated field should get displayed in the Audit History tab
    Then I click on "Back to detail" button respective application details page should be displayed
    Then I verify Updated field should get displayed in the Data Governance tab present in the Details page


    Examples:
      | NewfieldName                                                                                                  | ExistingfieldName                                      |
      | Where possible please specify the retention period applied to personal data on your application and its basis | Data Sensitive to Hosting Context Description Customer |


  @pageDisplay @AC_TechnologyPage_3.1_03
  Scenario: I verify Excel should be downloaded with the updated values
    Given Asset Insight Home page should be displayed
    Then  I click on the "Technology" in the homepage
    Then  I verify the respective "Technology" page is displayed
    Then  I click on the "Applications" present in the Technology page
    And   I click on "export to Excel" button and Excel should be downloaded


  @pageDisplay @AC_TechnologyPage_3.1_04
  Scenario: Verifying Downloaded Excel data with GUI
    Given I navigate to URL "https://assetsdev.int.thomsonreuters.com/Technology/tgo"
    When  I click on Application- Full Extract should be downloaded
#   Then  Application- Full Extract should be downloaded



  @pageDisplay @AC_TechnologyPage_3.1_05
  Scenario: Navigating To The AssetInsight HomePage
    Given Asset Insight Home page should be displayed
    Then  I click on the "Technology" in the homepage
    Then  I verify the respective "Technology" page is displayed
    Then  I click on the "Applications" present in the Technology page
    And   I select any Existing Application present in the Result Page
    Then  I verify that excel document "./Excel/Technology-Application.xlsx" with sheet name "Technology" , row number "1" and cell number "59" in report page and downloaded excel report are matching

