package model;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestCase{

    public WebDriver browser;

    @BeforeClass
    public void setUp(){
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        //browser = new FirefoxDriver();

    }

    @AfterClass
    public void tearDown(){
        browser.quit();
    }

    public WikiApp getWikiApp(){
        return new WikiApp(browser);
    }
}
