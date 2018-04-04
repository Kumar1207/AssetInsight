
@Feature_ExcelPage
Feature: I verify Is Thomson Reuters able to view, edit, delete, share, change or use the personal data


  @pageDisplay @AC_ExcelPage_01
  Scenario: Navigating To The AssetInsight HomePage
  Given Asset Insight Home page should be displayed
  Then I click on the "Technology" in the homepage
  And I select any Existing Application present in the Result Page
  Then I verify that data in report page and downloaded excel report are matching