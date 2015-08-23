import com.company.pages.TestCase;
import com.company.pages.WikiEnMain;
import com.company.pages.WikiMain;
import com.company.pages.WikiPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestWikiMain extends TestCase{

    @Test
    public void verifyEnWiki() {

        WikiMain wikiMain = new WikiMain(driver);
        WikiEnMain wikiEnMain = wikiMain.getEnWiki();
        Assert.assertTrue(wikiEnMain.getTitleText().contains("Welcome to"));
    }

    @Test(enabled = false)
    public void verifySearchField(){

        String sabre = "Sabre Corporation";

        WikiMain wikiMain = new WikiMain(driver);
        WikiEnMain enPage = wikiMain.getEnWiki();
        WikiPage wikiPage = enPage.searchForPage(sabre);
        Assert.assertTrue(wikiPage.getFirstHeading().equalsIgnoreCase(sabre));

    }


}
