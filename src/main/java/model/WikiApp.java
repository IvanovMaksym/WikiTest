package model;

import com.company.pages.LoginPage;
import com.company.pages.WikiBasePage;
import com.company.pages.WikiMain;
import com.company.pages.WikiMainEn;
import org.omg.CORBA.TIMEOUT;
import org.openqa.selenium.WebDriver;

/**
 * Created by Max on 8/24/2015.
 */
public class WikiApp extends WikiBasePage {

    public WikiApp(WebDriver driver){
        super(driver);
    }

    public WikiBasePage getWikiMain(){
        driver.get("https://www.wikipedia.org/");
        return new WikiMain(driver);
    }

    public WikiBasePage getWikiEn(){
        driver.get("https://en.wikipedia.org/");
        return new WikiMainEn(driver);
    }

    public WikiBasePage getLoginPage(){
        if (getWikiEn().isLoggedIn()){
            getWikiEn().logOut();
        }
        getWikiEn().getLoginButton().click();
        return new LoginPage(driver);
    }

}
