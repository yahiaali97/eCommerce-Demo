import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestBase {
    public static WebDriver driver;
    @BeforeTest
    public void SetupDriver() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com");
        Thread.sleep(1000);
    }

    @AfterTest
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}