import org.testng.annotations.Test;

public class SearchTest extends TestBase{
@Test
    public void ValidSearch()
{
    Search search = new Search(driver);
    search.SearchFill("Laptop");
    search.GoSearch();
}
}
