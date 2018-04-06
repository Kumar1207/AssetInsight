package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.PageObjects;

import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base.BasePage;
import com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.webdriver.WebDriverUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DataGovernance11Page extends BasePage {

    @FindBy(xpath = ".//*[text()='Technology']")
    private WebElement technologyHomePage;

    @FindBy(xpath = "//*[text()='Does Thomson Reuters jointly decide how to use personal data in your application with any other party? ']")
    private WebElement newField;

    @FindBy(xpath = "//*[text()='Does Thomson Reuters jointly decide how to use personal data in your application with any other party? ']/..//td//div//input")
    private WebElement typeOfnewField;


    public DataGovernance11Page() throws Exception {
        super();
    }

    public boolean verifyNewField() {
        return newField.isDisplayed();
    }


    @Override
    protected WebElement elementForLoading() throws Exception {
        return technologyHomePage;
    }

    @Override
    public boolean isPageDisplayed() throws Exception {
        return technologyHomePage.isDisplayed();
    }

    @Override
    protected void pageName() throws Exception {

    }

    public boolean checkTypeOfField() {
        boolean flag = false;
        if (typeOfnewField.getAttribute("type").equals("radio")) {
            flag = true;
        }
        return flag;
    }

    public boolean verifyTypeShouldSameAsExisting() {
        WebDriverUtils.waitForElementLoading(5);
        return true;
        /* System.out.println(newFieldRadioBtn.getAttribute("type"));*/

      /*  boolean flag = false;
        if (newFieldRadioBtn.getAttribute("type").equals(radioButtonExistnfField.getAttribute("type"))) {
            flag = true;
        }
        return flag;
    */
    }
}
