package model;

import com.company.pages.WebPage;
import com.company.pages.WikiMain;
import com.company.pages.WikiMainEn;
import org.openqa.selenium.WebDriver;

/**
 * Created by Max on 8/24/2015.
 */
public class WikiApp extends WebPage {

    public WikiApp(WebDriver driver){
        super(driver);
    }

    public WebPage getWikiMain(){
        driver.get("https://www.wikipedia.org/");
        return new WikiMain(driver);
    }

    public WebPage getWikiEn(){
        driver.get("https://en.wikipedia.org/");
        return new WikiMainEn(driver);
    }

}
