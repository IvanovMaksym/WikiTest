package com.company.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WikiMain extends WebPage{

    //private WebDriver driver;

    public WikiMain(WebDriver driver){
        super(driver);
    }


    public WebPage getWikiEn(){
        String linkToWikiEn = driver.findElement(By.xpath(".//*[@class= 'central-featured-lang lang1']/a")).getAttribute("href");
        driver.get(linkToWikiEn);
        return new WikiMainEn(driver);
    }
}
