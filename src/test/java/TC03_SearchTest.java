import org.testng.annotations.Test;

public class TC03_SearchTest extends TestBase{
@Test
    public void ValidSearch() {
    P03_Search search = new P03_Search(driver);
    search.SearchFill("Laptop");
    search.GoSearch();
    search.AdvancedSearchCB();
    P03_Search.selectCategory("Computers >> Notebooks");
    P03_Search.selectManufacturer("All");
    search.SearchBtn();

    }
}