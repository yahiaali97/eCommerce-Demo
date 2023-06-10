import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
public class TC04_AddtoCartTest extends TestBase{
    @Test
    public void ValidAddtoCart() {
        P04_AddtoCart addtoCart = new P04_AddtoCart(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver; // Initialize JavascriptExecutor
        js.executeScript("window.scrollBy(0,500)");
        addtoCart.AddtoCartBtnSubmit();
//        addtoCart.clickGoToCartLink();
    }
}
