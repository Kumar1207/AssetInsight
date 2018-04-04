package com.techmahindra.gui.cucumber.Deployment.AssetInsightAcceptance.Pages.Base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by SK00447696 on 2/22/18.
 */
public class LoginPage extends BasePage{

   @FindBy(xpath = ".//*[@id='USER']")
    private  WebElement textBoxUserName;

    @FindBy(xpath = ".//*[@id='PASSWORD']")
    private WebElement textBoxPassword;

    @FindBy(xpath = ".//*[@id='safeLoginbtn']")
    private WebElement buttonLogin;
    public String username;
    public String password;

    public LoginPage() throws Exception {
        super();
//        config=new XMLConfiguration("config.xml");
//        username=config.getString("main.userName");
//        password=config.getString("main.password");
       username="X012829";
        password="Soft@2018";
    }


    protected WebElement elementForLoading() throws Exception {
        return textBoxUserName;
    }

    public boolean isPageDisplayed() throws Exception {
        return true;
    }

    protected void pageName() throws Exception {

    }
    /**
     * This method enters default username and password and clicks button 'Log in'.
     *
     * @throws Exception
     * @params Nothing.
     */
    public void login() throws Exception {
        textBoxUserName.sendKeys(username);
        textBoxPassword.sendKeys(password);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", buttonLogin);
    }
}