import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class P04_AddtoCart extends PageBase{
    public P04_AddtoCart(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(@class, 'button-2') and contains(@class, 'product-box-add-to-cart-button') and contains(@onclick, '/addproducttocart/catalog/5/1/1')]\n")
    WebElement AddtoCartBtn;

//    @FindBy(xpath = "//a[text() = 'shopping cart']")
//    WebElement GoToCartLink;

    public void AddtoCartBtnSubmit() {
        AddtoCartBtn.click();
    }

//    public void clickGoToCartLink() {
//        GoToCartLink.click();
//    }
}
