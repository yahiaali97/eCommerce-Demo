import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage extends PageBase{
    public RegistrationPage(WebDriver driver)
    {
        super(driver); // to inherit the constructor
    }

    @FindBy (xpath = "//a[@href='/register?returnUrl=%2F']")
    WebElement RegisterButton;

    @FindBy (id="gender-male")
    WebElement male;
    @FindBy (id="FirstName")
    WebElement FirstName;

    @FindBy (id="LastName")
    WebElement LastName;

    @FindBy (id="Email")
    WebElement Email;

    @FindBy (id="Password")
    WebElement Password;

    @FindBy (id="ConfirmPassword")
    WebElement ConfirmPassword;
    @FindBy (id = "register-button")
    WebElement SubmitRegister;


    public void OpenRegistrationPage()
    {
        RegisterButton.click();
    }

    public void Register(String f, String l, String e, String p, String cp)
    {
        male.click();
        FirstName.sendKeys(f);
        LastName.sendKeys(l);
        Email.sendKeys(e);
        Password.sendKeys(p);
        ConfirmPassword.sendKeys(cp);
        SubmitRegister.click();
    }
}