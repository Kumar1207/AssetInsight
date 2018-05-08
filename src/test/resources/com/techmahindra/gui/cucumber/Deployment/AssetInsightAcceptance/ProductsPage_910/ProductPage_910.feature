@Feature_ProductsPage_16_1
Feature: I verify a new field "Does the retention period vary according to the types of data stored?" for Product
  Background:  Given Asset Insight Home page should be displayed

  @pageDisplay @AC_HomePage_16
  Scenario: Given Asset Insight Home page should be displayed
    When I click on the "Home" in the homepage
    Then I verify the respective "Home" page is displayed
    When I click on the "Content" in the homepage
    Then I verify the respective "Content" page is displayed
    When I click on the "Technology" in the homepage
    Then I verify the respective "Technology" page is displayed
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed

  @pageDisplay @AC_ProductPage_16_01
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


  @pageDisplay @AC_ProductPage_16_02
  Scenario Outline: I Verify the Existing Product
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" in the homepage
    Then I select any Existing Product present in the Result Page
    And  I click on "Edit This Record" Details Page
    And  I click on "Data Governance" tab
    Then I verify "<Newfield>" field in the Data Governance page
    And I check type of "<Newfield>" field for Product in the Data Governance page
    And I verify field type of "<Newfield>" should be same as Existing field "<Existingfield>" type in the Data Governance page
    And I verify Retention Product is mandatory field
    #When I do not select any option for Product in Retention validation message should be displayed
    When I click on No of Product Retention nothing should be displayed below the main question field
    Then I click on yes of Product Retention subquestion should be displayed
    And I click on product Retention yes radio button then subquestion should be displayed
    When I click on Yes of product I verify the type of the new subquestion field
    Then I Verify for product if the limit exceeds -validation message should get displayed
    | Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period |
    |Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box|

    Then I Verify for product new subquestion field save with
      |Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box|



    Then I click on "Save/Validate" button
    And  I click on "Audit history"
    And  I verify Updated field should get displayed in the Audit History
      | Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box for Retention period Text Box for Retention period Text Box for Retention period |
      |Text Box for Retention period Text Box for Retention period Text Box for Retention Text Box|

    Then I click on "Back to detail" button respective application details page should be displayed



       Examples:
      | Newfield                                                             | Existingfield                           |
      | Does the retention period vary according to the types of data stored | Standard Customer or Partner Data field |



  @pageDisplay @AC_ProductPage_16_03
  Scenario: I verify Excel should be downloaded with the updated values
    When I click on the "Products" in the homepage
    Then I verify the respective "Products" page is displayed
    When I click on the "Products" below the lists in the homepage
    #And  I click on "export to Excel" button and Excel should be downloaded


  @pageDisplay @AC_ProductPage_16_04
  Scenario: Verifying Downloaded Excel data with GUI
    Given I navigate to URL "https://assetsdev.int.thomsonreuters.com/Technology/tgo"
#    When  I click on Application- Full Extract should be downloaded