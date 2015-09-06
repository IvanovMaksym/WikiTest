import com.company.pages.LoginPage;
import com.company.pages.WikiBasePage;
import com.company.pages.WikiMainEn;
import model.TestCase;
import model.XMLTestConfig;
import model.XMLTestDataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

/**
 * Created by Max on 9/6/2015.
 */
public class TestLogin extends TestCase {


    @Test(dataProvider = "XMLTestData", dataProviderClass = XMLTestDataProvider.class)
    public void loginNegative(XMLTestConfig testConfig){

        LoginPage loginPage = (LoginPage) getWikiApp().getLoginPage();
        loginPage.loginAction(testConfig.get("username"), testConfig.get("password"));

        assertTrue("Should be instance of LoginPage class", LoginPage.class.isInstance(loginPage));
        assertThat(loginPage.getErrorBox().getText(), containsString("Incorrect password entered. Please try again."));
    }


    @Test(dataProvider = "XMLTestData", dataProviderClass = XMLTestDataProvider.class)
    public void loginPositive(XMLTestConfig testConfig){

        LoginPage loginPage = (LoginPage) getWikiApp().getLoginPage();
        WikiBasePage page = loginPage.loginAction(testConfig.get("username"), testConfig.get("password"));

        assertTrue("Should be instance of WikiMainEn class", WikiMainEn.class.isInstance(page));
        assertThat(page.getLoggedInUser().getText(), equalTo(testConfig.get("username")));
    }



}
