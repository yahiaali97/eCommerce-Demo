import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class P03_Search extends PageBase{
    public P03_Search(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@type='text' and @class='search-box-text ui-autocomplete-input']")
    WebElement SearchBar;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement SearchButton;
    @FindBy(xpath = "//input[@type = 'checkbox']")
    WebElement AdvancedSearchCB;
    @FindBy(xpath = "//button[@class='button-1 search-button']")
    WebElement SearchSubmit;

    public void GoSearch() {
        SearchButton.click();
    }

    public void SearchFill(String s) {
        SearchBar.sendKeys(s);
    }

    public void AdvancedSearchCB() {
        AdvancedSearchCB.click();
    }

    public void SearchBtn () {
        SearchSubmit.click();
    }

    public static void selectCategory(String text) {
        WebElement dropdownElement = driver.findElement(By.xpath("//*[@data-val-required='The Category field is required.']"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(text);
    }

    public static void selectManufacturer(String text) {
        WebElement dropdownElement = driver.findElement(By.xpath("//*[@data-val-required='The Manufacturer field is required.']"));
        Select dropdown = new Select(dropdownElement);
        dropdown.selectByVisibleText(text);
    }
}
