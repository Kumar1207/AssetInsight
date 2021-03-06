@Feature_ProductsPage_906
Feature: I verify a new field "Who receives personal data from your product?" for Product

  Background: Given Asset Insight Home page should be displayed

  @AC_HomePage_906_01
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @AC_ProductPage_906_02
  Scenario: Creating a New Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    Then I create New Product in the product page for below mandatory fields
      | Product Name         | Product                           |
      | Business Unit        | Intellectual Property and Science |
      | Business Sub Segment | EBS                               |
      | Product Status       | Not Yet Launched                  |
      | Product Level        | Base                              |
      | Marketing Contact    | Modium, Prashanthi                |
    Then I click on "SAVE/VALIDATE" button


  @AC_ProductPage_906_03
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" in the homepage
    Then I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<NewfieldName>" field is present under "Additional Article 30 Questions"
    And I verify that HelpText displayed for Recipients of PData fields
    Then I search for "<Searchfield>" field in searchbox
    And only search item in Recipients of PData should be displayed
    Then clear the search "<Searchfield>" field in searchbox
    And I Select the below list of values under the "<NewfieldName>" product sub field
      | Thomson Reuters customers                                                         |
      | Thomson Reuters service providers                                                 |
      | Thomson Reuters partners                                                          |
      | Third parties in connection with the sale of a Thomson Reuters business or assets |
      | Authorities and tribunals (e.g. courts, regulators)                               |
      | International organizations (e.g. United Nations)                                 |
      | Other                                                                             |
    And check Recipients of PData "Other" field is manadatory
    And I verify that HelpText dispalyed for Recipients of PData Other in the Data Governance page
    Then I Verify if the limit exceeds -validation message should get displayed
      | Text Box for Product Text Box for Product Text Box for Product Text Box for Product Text Box for Product Text Box for Product 5677898 && 99  NMMKL %b & * Text Box for Product Text Box for Product Text Box for Product Text Box for Product Text Box for Product |
    And I check Recipients of "Other" field for PDATA Product in the Data Governance page
    And Validate each item of "<NewfieldName>" present in SELECTED ITEMS box should have a 'X'
      | Thomson Reuters customers                                                         |
      | Thomson Reuters service providers                                                 |
      | Thomson Reuters partners                                                          |
      | Third parties in connection with the sale of a Thomson Reuters business or assets |
      | Authorities and tribunals (e.g. courts, regulators)                               |
      | International organizations (e.g. United Nations)                                 |
      | Other                                                                             |
    And when i Click on 'X' symbol for "<Items>" available in SELECT ITEMS box
    And Recipients of PData "Other" textbox should not be displayed
    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And Validate each item of present in Audit History values
      | Thomson Reuters customers                                                         |
      | Thomson Reuters service providers                                                 |
      | Thomson Reuters partners                                                          |
      | Third parties in connection with the sale of a Thomson Reuters business or assets |
      | Authorities and tribunals (e.g. courts, regulators)                               |
      | International organizations (e.g. United Nations)                                 |
    Then I click on "Back to detail" button respective application details page should be displayed
    Examples:
      | NewfieldName                                 | Searchfield               | Items |
      | Who receives personal data from your product | Thomson Reuters customers | Other |






