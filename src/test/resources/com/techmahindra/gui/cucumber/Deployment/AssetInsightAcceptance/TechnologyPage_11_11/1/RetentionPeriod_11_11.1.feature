@Feature_TechnologyPage_14
Feature: I verify Where possible please specify the retention period applied to personal data on your application and its basis is added.

  Background:
    Given Asset Insight Home page should be displayed

  @pageDisplay @AC_TechnologyPage_14_01
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


  @pageDisplay @AC_TechnologyPage_14_02
  Scenario Outline: I Verify new New field in the Existing Application
    Then I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    Then I click on the "Applications" present in the Technology page
    And  I select any Existing Application present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify the "<NewfieldName>" present in the Data Governance page
    And  I Check the type of the "<NewfieldName>" in the Data Governance page
    And  I verify that type of "<NewfieldName>" should be same as Existing filed "<ExistingfieldName>" type in the Data Governance page
    And  I verify that it should be mandatory field
    When I dont select Yes/No option validation message should be displayed
    When I click on Yes "<SubQueField1>" and "<SubQueField2>" should be displayed
    When I click on No option nothing should be displayed below the main question field
    When I click on I dont Know option nothing should be displayed below the main question field
    When I click on Yes I verify the type of the "<SubQueField1>" and "<SubQueField2>"
    Then I verify type of "<SubQueField1>" and "<SubQueField2>" should be same as existing "Data Sensitive to Hosting Context Description" field
    Then I Verify if the limit exceeds for first -SubQueField validation message should get displayed
      | Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for |
    Then I Verify if the limit exceeds second -SubQueField validation message should get displayed
      | Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for |
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And  I verify Updated field should get displayed in the Audit History tab
    Then I click on "Back to detail" button respective application details page should be displayed
    Then I verify Updated field should get displayed in the Data Governance tab present in the Details page


    Examples:
      | NewfieldName                                                                                           | ExistingfieldName                 | SubQueField1                                            | SubQueField2                                                                                                                                                                                                                                   |
      | Does Thomson Reuters jointly decide how to use personal data in your application with any other party? | Standard Customer or Partner Data | Provide a brief description as to why you think this is | please identify the name and contact details of the customer, reseller, partner or other party who jointly decides how to use personal data.  Please include for example the contract number and/or TR personnel that negotiated the contract. |


  @pageDisplay @AC_TechnologyPage_14_03
  Scenario: I verify Excel should be downloaded with the updated values
    Then  I click on the "Technology" in the homepage
    Then  I verify the respective "Technology" page is displayed
    Then  I click on the "Applications" present in the Technology page
    And   I click on "export to Excel" button and Excel should be downloaded


  @pageDisplay @AC_TechnologyPage_14_04
  Scenario: Verifying Downloaded Excel data with GUI
    Given I navigate to URL "https://assetsdev.int.thomsonreuters.com/Technology/tgo"
    When  I click on Application- Full Extract should be downloaded

