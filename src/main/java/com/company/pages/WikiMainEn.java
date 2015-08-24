package com.company.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WikiMainEn extends WebPage{

    //private WebDriver driver;

    public WikiMainEn(WebDriver driver){
        super(driver);
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

    public WebPage searchForPage(String input){
        searchField.sendKeys(input);
        searchButton.click();
        return new WikiPage(driver);
    }

}


