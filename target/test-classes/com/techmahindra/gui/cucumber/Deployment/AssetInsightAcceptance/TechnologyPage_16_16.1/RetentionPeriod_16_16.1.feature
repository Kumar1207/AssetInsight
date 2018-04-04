@Feature_TechnologyPage_16
Feature: I verify Where possible please specify the retention period applied to personal data on your application and its basis is added.

  @pageDisplay @AC_TechnologyPage_16_01
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


  @pageDisplay @AC_TechnologyPage_16_02
  Scenario Outline: I Verify new New field in the Existing Application
    Given Asset Insight Home page should be displayed
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify the "<Newfield>" field present in the Data Governance page
    And  I Check the type of "<Newfield>" field in the Data Governance page
    And  I verify that field type of "<Newfield>" should be same as Existing field "<Existingfield>" type in the Data Governance page
    And  I verify that it should be a mandatory field
    When I do not select Yes/No option validation message should be displayed
    When I click on Yes "please explain" subquestion should be displayed
    When I click on "No" option nothing should be displayed below the main question field
    When I click on Yes I verify the type of the new subquestion field
    Then I verify that it should be same as existing "Data Sensitive to Hosting Context Description" field
    And  I verify that subquestion field should be mandatory field whenever main Question value is 'Yes'
    Then I Verify if the limit exceeds a validation message should get displayed
    Then I enter the values in the textbox
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And  I verify Updated field should get displayed in the Audit History tab
    Then I click on "Back to detail" button respective application details page should be displayed
    Then I verify Updated field should get displayed in the Data Governance tab present in the Details page


    Examples:
      | Newfield                                                             | Existingfield                           |
      | Does the retention period vary according to the types of data stored | Standard Customer or Partner Data field |


  @pageDisplay @AC_TechnologyPage_16_03
  Scenario: I verify Excel should be downloaded with the updated values
    Given Asset Insight Home page should be displayed
    Then  I click on the "Technology" in the homepage
    Then  I verify the respective "Technology" page is displayed
    Then  I click on the "Applications" present in the Technology page
    And   I click on "export to Excel" button and Excel should be downloaded


  @pageDisplay @AC_TechnologyPage_16_04
  Scenario: Verifying Downloaded Excel data with GUI
    Given I navigate to URL "https://assetsdev.int.thomsonreuters.com/Technology/tgo"
    When  I click on Application- Full Extract should be downloaded
#   Then  Application- Full Extract should be downloaded



  @pageDisplay @AC_TechnologyPage_16_05
  Scenario: Navigating To The AssetInsight HomePage
    Given Asset Insight Home page should be displayed
    Then  I click on the "Technology" in the homepage
    Then  I verify the respective "Technology" page is displayed
    Then  I click on the "Applications" present in the Technology page
    And   I select any Existing Application present in the Result Page
    Then  I verify that excel document "./Excel/Technology-Application.xlsx" with sheet name "Technology" , row number "1" and cell number "59" in report page and downloaded excel report are matching

