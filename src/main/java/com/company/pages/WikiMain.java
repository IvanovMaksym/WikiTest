package com.company.pages;

import com.sun.webkit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Max on 8/23/2015.
 */
public class WikiMain{

    private WebDriver driver;

    public WikiMain(WebDriver driver){
        super();
        this.driver = driver;
    }


    public WikiEnMain getEnWiki(){
        String link = driver.findElement(By.xpath(".//*[@class= 'central-featured-lang lang1']/a")).getAttribute("href");
        driver.get(link);
        return new WikiEnMain(driver);
    }


}
