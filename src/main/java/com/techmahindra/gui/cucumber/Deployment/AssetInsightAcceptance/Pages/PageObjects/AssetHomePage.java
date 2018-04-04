package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SK00447696 on 2/22/18.
 */
public class AssetHomePage extends BasePage {
    public ContentPage contentPage;
    public TrademarkNOptionPage trademarkOptionsPage;
    public ProductsPage productsPage;
    public TechnologyPage technologyPage;

    public AssetHomePage() throws Exception {
        super();
        contentPage=PageFactory.initElements(driver,ContentPage.class);
        trademarkOptionsPage=PageFactory.initElements(driver,TrademarkNOptionPage.class);
        productsPage=PageFactory.initElements(driver,ProductsPage.class);
        technologyPage=PageFactory.initElements(driver,TechnologyPage.class);
    }
    @FindBy(xpath = "//*[@id='homeDiv']")
    private  WebElement assetIncitesHomePage;

    @FindAll({@FindBy(xpath = "//*[@id='menuTable']/tbody/tr/td[*]/a")})
    List<WebElement> headerMenuOptions;

    @FindBy(xpath = ".//*[@id='txtSearch']")
    private  WebElement searchTextField;

    @FindBy(xpath = ".//*[@id='imgSearch']")
    private  WebElement searchSubmit;

    @FindBy(xpath = ".//*[@id='searchResultTable']")
    private  WebElement resultPage;


    @FindBy(xpath = ".//*[@id='headerProductTitle']/a/img")
    private  WebElement assetInsightHeader;

    private static String XPATH_HEADER_MENU_OPTIONS = "//*[@id='menuTable']/tbody/tr/td[*]/a[contains(text(),'%s')]";

    protected WebElement elementForLoading() throws Exception {
        return assetIncitesHomePage;
    }

    public boolean isPageDisplayed() throws Exception {
        assetIncitesHomePage.isDisplayed();
        return true;
    }

    protected void pageName() throws Exception {

    }

    public boolean validateOptions(List<String> expectedProfileMenuOptions) {
        List<String> actualProfileMenuOptions = new ArrayList<>();
        for (WebElement menuOption : headerMenuOptions) {
            actualProfileMenuOptions.add(menuOption.getText().trim());
        }
        return expectedProfileMenuOptions.equals(actualProfileMenuOptions);
    }

    public boolean performSearch(String searchTerm) {
        WebDriverUtils.waitForElementLoading(30);
        searchTextField.sendKeys(searchTerm);
        WebDriverUtils.waitForElementLoading(5);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",searchSubmit);
        WebDriverUtils.waitForElementIsPresent(resultPage,10);
        return resultPage.isDisplayed();
    }

    public boolean validateResultPage() {
        return resultPage.isDisplayed();
    }

    public boolean navigateToAssetInsightHomePage() {
        assetInsightHeader.click();
        WebDriverUtils.waitForElementIsPresent(assetIncitesHomePage,10);
        return assetIncitesHomePage.isDisplayed();
    }

    public boolean clickOnHeaderOptions(String option,String Menu) {
         switch (Menu.toLowerCase()) {
                case "header":
                    try {
                        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath(String.format(XPATH_HEADER_MENU_OPTIONS, option))));
                    } catch (Exception e) {
                        return false;
                    }
                    break;

                default:
                    return false;

            }
            return true;
     }

    public boolean verifyRespectivePage(String option, String Menu) throws Exception {
        switch (Menu.toLowerCase()) {
            case "header":
                switch (option.toLowerCase()){
                    case "home":WebDriverUtils.waitForElementIsPresent(assetIncitesHomePage,10);
                        return assetIncitesHomePage.isDisplayed();
                    case "content": return contentPage.isPageDisplayed();
                    case "trademark": return trademarkOptionsPage.isPageDisplayed();
                    case "technology":return technologyPage.isPageDisplayed();
                    case "products": return productsPage.isPageDisplayed();
                    case "business unit": return driver.findElement(By.xpath("//div[contains(text(),'Business Unit')]")).isDisplayed();
                    case "content type": return driver.findElement(By.xpath("//div[@class='browse-heading' and contains(text(),'Content Type')]")).isDisplayed();
                    case "region": return driver.findElement(By.xpath("//div[@class='browse-heading' and contains(text(),'Region')]")).isDisplayed();
                    case "product status": return driver.findElement(By.xpath("//div[@class='browse-heading' and contains(text(),'Product Status')]")).isDisplayed();
                    case "all records": return driver.findElement(By.xpath("//*[@id='filter']/div[1][contains(text(),'NARROW SEARCH')]")).isDisplayed();
                    case "most popular": return true;
                    default: return false;
                }
            default:
                return false;

        }
    }

    public boolean clickOnRandomLink(String link) {
        WebDriverUtils.waitForElementLoading(40);
        switch (link.toLowerCase()){
            case "content type":
                 driver.findElement(By.xpath("//a[contains(text(),'Metadata')]")).click(); break;
            case "business unit":
                 driver.findElement(By.xpath("//a[contains(text(),'Reuters - ALL')]")).click(); break;
            case "region":
                 driver.findElement(By.xpath("//a[contains(text(),'EMEA')]")).click(); break;
            case "all records":
                 driver.findElement(By.xpath("//a[contains(text(),'All Records')]")).click(); break;
            case "most popular":
                 driver.findElement(By.xpath("//a[contains(text(),'Turkey Power')]")).click(); break;
        }
        return true;
    }
}
