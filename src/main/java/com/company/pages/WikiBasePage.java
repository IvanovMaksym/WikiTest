package com.company.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.NoSuchElementException;

public class WikiBasePage {

    protected WebDriver driver;

    public WikiBasePage(WebDriver driver){
        this.driver = driver;
        initWebElements();
    }

    @FindBy(id = "pt-createaccount")
    WebElement createAccountButton;
    @FindBy(id = "pt-logout")
    WebElement logOutButton;
    @FindBy(id = "pt-login")
    WebElement loginButon;
    @FindBy(xpath = ".//*[@id='pt-userpage']/a")
    WebElement loggedInUser;

    public void initWebElements(){
        PageFactory.initElements(driver, this);
    }

    public boolean isLoggedIn(){
        if (driver.findElements(By.id("pt-createaccount")).isEmpty()){
            return true;
        }else return false;
    }

    public void logOut(){
        logOutButton.click();
    }

    public WebElement getLoginButton(){
        return loginButon;
    }

    public WebElement getLoggedInUser(){
        return loggedInUser;
    }

    public WebElement getCreateAccountButton(){
        return createAccountButton;
    }
}
