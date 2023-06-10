import org.testng.annotations.Test;

public class TC02_LoginTest extends TestBase{
    @Test
    public void InValidLogin() {
        P02_LoginPage a02LoginPage = new P02_LoginPage(driver);
        a02LoginPage.OpenLoginPage();
        a02LoginPage.Login("test@outlook.com","yahya123");
    }
}