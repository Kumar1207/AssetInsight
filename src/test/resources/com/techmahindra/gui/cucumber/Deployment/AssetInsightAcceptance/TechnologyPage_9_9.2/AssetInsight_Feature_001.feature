@Feature_TechnologyPage
Feature: I verify Is Thomson Reuters able to view, edit, delete, share, change or use the personal data

  Background:
    Given Asset Insight Home page should be displayed

  @pageDisplay @AC_HomePage_9
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @pageDisplay @AC_TechnologyPage_01
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

  @pageDisplay @AC_TechnologyPage_02
  Scenario Outline: I Verify the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
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
    Then I click on "Back to detail" button respective application details page should be displayed


    Examples:
      | fieldName                                                                              | ExistingfieldName |
      | Is Thomson Reuters able to view, edit, delete, share, change or use the personal data? | Standard Customer |


  @pageDisplay @AC_TechnologyPage_03
  Scenario: I verify Excel should be downloaded with the updated values
    Then  I click on the "Technology" in the homepage
    Then  I verify the respective "Technology" page is displayed
    Then  I click on the "Applications" present in the Technology page
   # And   I click on "export to Excel" button and Excel should be downloaded

  @pageDisplay @AC_TechnologyPage_04
  Scenario: Verifying Downloaded Excel data with GUI
    Given I navigate to URL "https://assetsdev.int.thomsonreuters.com/Technology/tgo"
    #When  I click on Application- Full Extract should be downloaded

