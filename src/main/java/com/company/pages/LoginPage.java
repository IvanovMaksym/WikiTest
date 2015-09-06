package com.company.pages;

import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by Max on 9/6/2015.
 */
public class LoginPage extends WikiBasePage {

    public LoginPage(WebDriver driver){
        super(driver);
    }

    @FindBy(id = "wpName1")
    WebElement loginInputField;
    @FindBy(id = "wpPassword1")
    WebElement passwordInputField;
    @FindBy(id = "wpLoginAttempt")
    WebElement loginButton;

    private WebElement getLoginInputField(){
        return loginInputField;
    }

    private WebElement getPasswordInputField(){
        return passwordInputField;
    }

    public void setLoginInputField(String login){
        getLoginInputField().sendKeys(login);
    }

    public void setPasswordInputField(String password){
        getPasswordInputField().sendKeys(password);
    }

    public void clickLogin(){
        loginButton.click();
        //return new WikiMainEn(driver);
    }

    public WikiBasePage loginAction(String username, String password) {
        getLoginInputField().sendKeys(username);
        getPasswordInputField().sendKeys(password);
        clickLogin();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        if (isLoggedIn()) {
            return new WikiMainEn(driver);
        }
        else return new LoginPage(driver);

    }

}
