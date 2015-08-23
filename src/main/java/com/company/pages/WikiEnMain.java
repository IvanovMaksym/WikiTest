package com.company.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class WikiEnMain{

    private WebDriver driver;

    public WikiEnMain(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



    @FindBy(xpath = ".//*[@id='mp-topbanner']/tbody/tr/td[1]/table/tbody/tr/td/div[1]")
    private WebElement title;
    @FindBy(id = "searchInput")
    private WebElement searchField;
    @FindBy(id = "searchButton")
    private WebElement searchButton;


    public WebElement getTitle(){
        return title;
    }

    public String getTitleText(){
        return getTitle().getText();
    }

    public WikiPage searchForPage(String input){
        searchField.sendKeys(input);
        searchButton.click();
        return new WikiPage(driver);
    }

}


