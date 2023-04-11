import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
    public static WebDriver driver;
    @BeforeTest
    public void SetupDriver() throws InterruptedException
    {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");
        Thread.sleep(2000);
    }

    @AfterTest
    public void CloseDriver() throws InterruptedException
    {
        Thread.sleep(2000);
        //driver.quit();
    }

}