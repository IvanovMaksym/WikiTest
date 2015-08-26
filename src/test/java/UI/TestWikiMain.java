package UI;

import com.company.pages.*;
import model.TestCase;
import model.XMLDataProvider;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestWikiMain extends TestCase {

    @Test(enabled = false)
    public void verifyEnWiki() {

        WikiMainEn wikiMainEn = (WikiMainEn) getWikiApp().getWikiEn();
        Assert.assertTrue(wikiMainEn.getTitleText().contains("Welcome to"));
    }


    @Test(dataProvider = "dataProvider", dataProviderClass = XMLDataProvider.class)
    public void verifySearchField(String s, String s1){

        WikiMainEn wikiMainEn = (WikiMainEn) getWikiApp().getWikiEn();
        WikiPage wikiPage = (WikiPage) wikiMainEn.searchForPage(s);
        assertThat(wikiPage.getFirstHeading(), equalTo(s1));
    }





}


