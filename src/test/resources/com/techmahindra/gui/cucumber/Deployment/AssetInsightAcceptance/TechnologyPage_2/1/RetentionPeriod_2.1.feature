@Feature_TechnologyPage_2.1_1
Feature: I verify Where possible please specify the retention period applied to personal data on your application and its basis is added.

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
    Then I verify the "<NewfieldName>" field present in the Data Governance page
    And  I Check the type of "<NewfieldName>" filed in the Data Governance page
    When I click on "Yes" button All the subquestions under 'Sensitive PII Data' field should get displayed
    And  I verify that it should be a mandatory field
    When I click on Yes All the subquestions under 'Sensitive PII Data' field should get displayed
    And  I verify that "Help text" should get displayed in the same format as 'Standard PII Data'
    And  I verify that Character limit for this field should be 512 characters
    Then I Verify if the limit exceeds a validation message should get displayed

    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And  I verify Updated field should get displayed in the Audit History tab
    Then I click on "Back to detail" button respective application details page should be displayed
    Then I verify Updated field should get displayed in the Data Governance tab present in the Details page


    Examples:
      | NewfieldName                                                                                                  | ExistingfieldName                                      |
      | Sensitive PII Data | Data Sensitive to Hosting Context Description Customer |


  @pageDisplay @AC_TechnologyPage_2.1_03
  Scenario: I verify Excel should be downloaded with the updated values
    Given Asset Insight Home page should be displayed
    Then  I click on the "Technology" in the homepage
    Then  I verify the respective "Technology" page is displayed
    Then  I click on the "Applications" present in the Technology page
    And   I click on "export to Excel" button and Excel should be downloaded


  @pageDisplay @AC_TechnologyPage_2.1_04
  Scenario: Verifying Downloaded Excel data with GUI
    Given I navigate to URL "https://assetsdev.int.thomsonreuters.com/Technology/tgo"
    When  I click on Application- Full Extract should be downloaded
#   Then  Application- Full Extract should be downloaded



  @pageDisplay @AC_TechnologyPage_2.1_05
  Scenario: Navigating To The AssetInsight HomePage
    Given Asset Insight Home page should be displayed
    Then  I click on the "Technology" in the homepage
    Then  I verify the respective "Technology" page is displayed
    Then  I click on the "Applications" present in the Technology page
    And   I select any Existing Application present in the Result Page
    Then  I verify that excel document "./Excel/Technology-Application.xlsx" with sheet name "Technology" , row number "1" and cell number "59" in report page and downloaded excel report are matching

