@Feature_Technology_886
Feature: Verifying all the new fields added under the section "ADDITIONAL ARTICLE 30 QUESTIONS" in DataGovernance tab are getting reflected correclty in Audit History tab as per the requirement for Applications of  Technology

  Background:
    Given Asset Insight Home page should be displayed

  @AdditionalArticle30Fields_886_01
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

  @AdditionalArticle30Fields_886_02
  Scenario Outline: I Verify the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<NewHeader>" is present in the DataGovernance Tab
    And  I edit all the new fields under the new section
      | Is Thomson Reuters able to view, edit, delete, share, change or use the personal data?                                                                                                                                                                 | No           |
      | Is Thomson Reuters free to decide whether/how the personal data is viewed, edited, deleted, shared, changed or used?                                                                                                                                   | Yes          |
      | Does Thomson Reuters jointly decide how to use personal data in your application with any other party?                                                                                                                                                 | I don't know |
      | Will any personal data be transferred to or accessed outside the geographic locations where it was originally collected?                                                                                                                               | No           |
      | If your application involves the transfer of personal data to a third party (e.g. vendor, service provider, customer), is there a contract in place with the third party that contains data transfer privacy clauses approved by the Legal Department? | No           |
      | Does the retention period vary according to the types of data stored?                                                                                                                                                                                  | No           |
    Then I click on "SAVE/VALIDATE" button
    And  I click on "Audit history"
    Then I verify all updated fields below "<NewHeader>" in DataGovernance Tab should be displayed in audit History tab
    And  I click on BACK TO DETAIL button
    Then I verify all fields should get reflect in Audit History tab with correct values
      | Is Thomson Reuters able to view, edit, delete, share, change or use the personal data?                                                                                                                                                                 |
      | Is Thomson Reuters free to decide whether/how the personal data is viewed, edited, deleted, shared, changed or used?                                                                                                                                   |
      | Does Thomson Reuters jointly decide how to use personal data in your application with any other party?                                                                                                                                                 |
      | Will any personal data be transferred to or accessed outside the geographic locations where it was originally collected?                                                                                                                               |
      | If your application involves the transfer of personal data to a third party (e.g. vendor, service provider, customer), is there a contract in place with the third party that contains data transfer privacy clauses approved by the Legal Department? |
      | Does the retention period vary according to the types of data stored?                                                                                                                                                                                  |

    Examples:
      | NewHeader                       |
      | ADDITIONAL ARTICLE 30 QUESTIONS |