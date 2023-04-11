import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest extends TestBase{
    @Test
    public void ValidRegister()
    {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.OpenRegistrationPage();
        registrationPage.Register("Yahya","Ali","test@outlook.com","yahya123","yahya123");
        //Assert.assertTrue(driver.findElement(By.xpath("//form/div[1]/ul/li")).getText().contains("The specified email already exists"));
    }

}