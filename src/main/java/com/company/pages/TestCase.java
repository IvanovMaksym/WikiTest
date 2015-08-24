package com.company.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class TestCase{

    public WebDriver browser;

    @BeforeClass
    public void setUp(){
        browser = new ChromeDriver();
    }

    @AfterClass
    public void tearDown(){
        browser.quit();
    }

    public WebPage getWikiMain(){
        browser.get("https://www.wikipedia.org/");
        return new WikiMain(browser);
    }
}
