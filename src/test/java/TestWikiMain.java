import com.company.pages.*;
import model.TestCase;
import model.XMLTestConfig;
import model.XMLTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestWikiMain extends TestCase {

    @Test(enabled = true)
    public void verifyEnWiki() {

        WikiMainEn wikiMainEn = (WikiMainEn) getWikiApp().getWikiEn();
        Assert.assertTrue(wikiMainEn.getTitleText().contains("Welcome to"));
    }


    @Test(dataProvider = "XMLTestData", dataProviderClass = XMLTestDataProvider.class)
    public void verifySearchField(XMLTestConfig testConfig){
        WikiMainEn wikiMainEn = (WikiMainEn) getWikiApp().getWikiEn();
        WikiPage wikiPage = (WikiPage) wikiMainEn.searchForPage(testConfig.get("input"));
        assertThat(wikiPage.getFirstHeading(), equalTo(testConfig.get("input")));
    }

    @Test
    public void testBranch(){
        
    }





}


