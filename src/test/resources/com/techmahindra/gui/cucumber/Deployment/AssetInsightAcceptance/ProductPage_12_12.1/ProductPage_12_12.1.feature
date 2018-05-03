@Feature_ProductsPage_12_1
Feature: I verify a new field "Who receives personal data from your product?" for Product

  Background: Given Asset Insight Home page should be displayed

  @pageDisplay @AC_HomePage_12
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @pageDisplay @AC_ProductPage_12_01
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


  @pageDisplay @AC_ProductPage_12_02
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
    And  I verify Updated field should get displayed in the Audit History tab
    Then I click on "Back to detail" button respective application details page should be displayed
    Then I verify Updated field should get displayed in the Data Governance tab present in the Details page



    Examples:
      | NewfieldName                                 | Searchfield               |Items |
      | Who receives personal data from your product | Thomson Reuters customers | Other |

  @pageDisplay @AC_ProductPage_12_03
  Scenario: I verify Excel should be downloaded with the updated values
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" below the lists in the homepage
#    And  I click on "export to Excel" button and Excel should be downloaded

  @pageDisplay @AC_ProductPage_12_04
  Scenario: Verifying Downloaded Excel data with GUI
    Given I navigate to URL "https://assetsdev.int.thomsonreuters.com/Technology/tgo"
#    When  I click on Application- Full Extract should be downloaded





