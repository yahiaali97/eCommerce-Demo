import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
    public LoginPage (WebDriver driver)
    {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/login?returnUrl=%2F']")
    WebElement LoginButton;
    @FindBy(className = "email")
    WebElement Email;
    @FindBy(className = "password")
    WebElement Password;
    @FindBy(xpath = "//input[@type='checkbox']")
    WebElement RemeberMe;

    @FindBy(xpath = "//button[@type='submit' and @class='button-1 login-button']")
    WebElement SubmitLogin;

    public void OpenLoginPage()
    {
        LoginButton.click();
    }

    public void Login(String e, String p)
    {
        Email.sendKeys(e);
        Password.sendKeys(p);
        RemeberMe.click();
        SubmitLogin.click();
    }

}
