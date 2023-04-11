import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends TestBase{
    @Test
    public void InValidLogin()
    {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.OpenLoginPage();
        loginPage.Login("test@outlook.com","yahya123");
    }
}