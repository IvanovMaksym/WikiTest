package model;

import com.company.pages.WebPage;
import com.company.pages.WikiMain;
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

    public WikiApp getWikiApp(){
        return new WikiApp(browser);
    }
}
