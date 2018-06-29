@Feature_Technology_895
Feature: Verifying new header "ADDITIONAL ARTICLE 30 QUESTIONS" is added as per the requirement for Applications of Technology

  Background:
    Given Asset Insight Home page should be displayed

  @AdditionalArticle30_895_01
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

  @AdditionalArticle30_895_02
  Scenario Outline: I Verify the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<NewHeader>" is present in the DataGovernance Tab
    Then I verify "<NewHeader>" format should be same as "<ExistingHeader>"
    And  I check for the information button present next to the new header added
    When I click on information button an external link to GDPR page should be displayed
    Then I verify external link should be working fine
    And  I click on BACK TO DETAIL button
    Then I verify "<NewHeader>" should be present in the details page

    Examples:
      | NewHeader                       | ExistingHeader  |
      | ADDITIONAL ARTICLE 30 QUESTIONS | SPECIAL FACTORS |

