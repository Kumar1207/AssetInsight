@Feature_TechnologyPage_3.1_1
Feature: To check whether new fields 'Standard PII Data Type' and 'Standard PII Data Type - Other' is added as per the requirement for Applications of  Technology

  Background:  Given Asset Insight Home page should be displayed

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
  Scenario: I Verify new New field in the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    And  I verify the "Standard PII Data Type" field present in the Data Governance page
    And  I Check the type of Standard PII Data Type filed in the Data Governance page
    And  I click on Standard PII Data 'Yes' radio button
    When Standard PII Data' field is selected as 'Yes' then 'Standard PII Data Type field should be displayed
    Then I verify the "Standard PII Data Type - Other" field present in the "Data Governance" page
     Then I click on "Standard PII Data Type - Other" field in the Data Governance page
    Then  I Check the type of Standard PII Data Type - Other field in the Data Governance page
    #Then I Verify if the limit exceeds a validation message should get displayed for 255 characters
    Then I Verify if the limit exceeds -validation message should get displayed
    | Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box |
    And  I verify that it should be a mandatory field for Standard PII Data Type - Other field in the Data Governance page
    And  I verify that HelpText displayed for "Standard PII Data Type" fields
    And I verify that HelpText dispalyed for "Standard PII Data Type - Other" in the Data Governance pageDisplay
     And I Select the below list of values under "Standard PII Data Type" sub field
   | Contact details, such as address, phone number, e-mail address                              |
   | Usernames / Account names / Logon Credentials                                                |
   | Logs of internet usage / system usage (e.g. IP address, log-on/off, user actions, websites) |
   | Unique Device Identifiers (e.g. mobile device IDs)                                          |
   | Other identification numbers such as employee ID, Insurance/patient ID, client number, etc  |
   | Other                                                                                       |
    When I click on 'Standard PII Data' field is selected as 'No'
    Then 'Standard PII Data Type - Other' should not get displayed
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And  I verify Updated field should get displayed in the Audit History tab
    Then I click on "Back to detail" button respective application details page should be displayed
    Then I verify Updated field should get displayed in the Data Governance tab present in the Details page


  @pageDisplay @AC_TechnologyPage_3.1_03
  Scenario: I verify Excel should be downloaded with the updated values
    Then  I click on the "Technology" in the homepage
    Then  I verify the respective "Technology" page is displayed
    Then  I click on the "Applications" present in the Technology page
    And   I click on "export to Excel" button and Excel should be downloaded


  @pageDisplay @AC_TechnologyPage_3.1_04
  Scenario: Verifying Downloaded Excel data with GUI
    Given I navigate to URL "https://assetsdev.int.thomsonreuters.com/Technology/tgo"
    When  I click on Application- Full Extract should be downloaded

  @pageDisplay @AC_TechnologyPage_3.1_05
  Scenario: Verifying Downloaded Excel data with GUI
    Given I navigate to URL "https://assetsdev.int.thomsonreuters.com/Technology/tgo"
    When  I click on Application- Full Extract should be downloaded

