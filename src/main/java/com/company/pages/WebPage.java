package com.company.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class WebPage{

    protected WebDriver driver;

    public WebPage(WebDriver driver){
        this.driver = driver;
        initWebElements();
    }

    public void initWebElements(){
        PageFactory.initElements(driver, this);
    }
}
