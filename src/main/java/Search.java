import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Search extends PageBase{
    public Search(WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//input[@type='text' and @class='search-box-text ui-autocomplete-input']")
    WebElement SearchBar;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement SearchButton;

    public void GoSearch()
    {
        SearchButton.click();
    }

    public void SearchFill(String s)
    {
        SearchBar.sendKeys(s);
    }
}
