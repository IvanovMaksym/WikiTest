import com.company.pages.*;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestWikiMain extends TestCase{

    @Test
    public void verifyEnWiki() {

        WikiMain wikiMain = (WikiMain) getWikiMain();
        WikiMainEn wikiMainEn = (WikiMainEn) wikiMain.getWikiEn();
        Assert.assertTrue(wikiMainEn.getTitleText().contains("Welcome to"));
    }

/*    @Test(enabled = false)
    public void verifySearchField(){

        String sabre = "Sabre Corporation";

        WikiMain wikiMain = new WikiMain(browser);
        WikiMainEn enPage = wikiMain.getWikiEn();
        WikiPage wikiPage = enPage.searchForPage(sabre);
        Assert.assertTrue(wikiPage.getFirstHeading().equalsIgnoreCase(sabre));

    }*/


}
