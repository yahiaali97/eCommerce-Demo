import org.testng.annotations.Test;

public class TC01_RegistrationTest extends TestBase{
    @Test
    public void ValidRegister() {
        P01_RegistrationPage a01P01RegistrationPage = new P01_RegistrationPage(driver);
        a01P01RegistrationPage.OpenRegistrationPage();
        a01P01RegistrationPage.Register("Yahya","Ali","test@outlook.com","yahya123","yahya123");
        //Assert.assertTrue(driver.findElement(By.xpath("//form/div[1]/ul/li")).getText().contains("The specified email already exists"));
    }

}