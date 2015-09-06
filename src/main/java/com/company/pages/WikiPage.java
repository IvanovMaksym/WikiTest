package com.company.pages;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Max on 8/23/2015.
 */
public class WikiPage extends WikiBasePage {

    @FindBy(id = "firstHeading")
    private WebElement firstHeading;

    public WikiPage(WebDriver driver){
        super(driver);
    }

    public String getFirstHeading(){
        while (true){
            try{
                firstHeading.getText();
                break;
            }
            catch (StaleElementReferenceException e){
                e.getCause();
            }
        }
        return firstHeading.getText();

    }
}
