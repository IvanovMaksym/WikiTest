package com.company.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Max on 8/23/2015.
 */
public class WikiPage{

    private WebDriver driver;

    @FindBy(id = "firstHeading")
    private WebElement firstHeading;

    public WikiPage(WebDriver driver){
        super();
        this.driver = driver;
    }

    public String getFirstHeading(){
        return firstHeading.getText();
    }
}
