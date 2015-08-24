import com.company.pages.*;
import model.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;


public class TestWikiMain extends TestCase {

    @Test(enabled = false)
    public void verifyEnWiki() {

        WikiMainEn wikiMainEn = (WikiMainEn) getWikiApp().getWikiEn();
        Assert.assertTrue(wikiMainEn.getTitleText().contains("Welcome to"));
    }

    @Test
    public void verifySearchField(){

        String sabre = "Sabre Corporation";

        WikiMainEn wikiMainEn = (WikiMainEn) getWikiApp().getWikiEn();
        WikiPage wikiPage = (WikiPage) wikiMainEn.searchForPage(sabre);
        assertThat(wikiPage.getFirstHeading(), equalTo(sabre));

    }

}
