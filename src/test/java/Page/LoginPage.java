package Page;
import Page.AbstractPage;
import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class LoginPage extends AbstractPage {
    @FindBy(name="username")
    private WebElement usernameField;
    @FindBy(name = "password")
    private WebElement passwordField;
    @FindBy(xpath = "//button[@type='submit']")
    private WebElement submitButton;
    @FindBy(xpath = "//p[text()='Time at Work']")
    private WebElement timeAtWorkText;
    @FindBy(xpath = "//p[text()='Invalid credentials']")
    private WebElement invalidCredentials;


//    @FindBy (xpath = "(//p[@class='oxd-text oxd-text--p'])[1]")
//    private WebElement U;
//    @FindBy (xpath = "(//p[@class='oxd-text oxd-text--p'])[2]")
//    private WebElement P;
//    @FindBy (xpath = "//input[@name='username']")
//    private WebElement CasetutaUsername;
//    @FindBy (xpath = "//input[@type='password']")
//    private WebElement CasetutaParola;
//    @FindBy (xpath = "//button[@type='submit']")
//    private WebElement submitButton;
//    @FindBy (xpath = "//p[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']")
//    private WebElement forgetPassword;
    @FindBy (xpath = "//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")
    private WebElement InvalidCredText;
    @FindBy (xpath = "//img[@alt='company-branding']")
    private WebElement LogoCompanyImg;
//    @FindBy (xpath = "(//p[@class='oxd-text oxd-text--p orangehrm-copyright'])[1]")
//    private WebElement versia;
//    @FindBy (xpath = "(//*[@role='presentation'])[1]")
//    private WebElement IconLinkdin;
//    @FindBy (xpath = "(//*[@role='presentation'])[2]")
//    private WebElement IconFacebook;
//    @FindBy (xpath = "(//*[@role='presentation'])[3]")
//    private WebElement IconTwitter;
//    @FindBy (xpath = "(//*[@role='presentation'])[4]")
//    private WebElement IconYoutube;
//    @FindBy (xpath = "(//img[@src='/web/images/ohrm_logo.png'])[2]")
//    private WebElement ImagineCerc;
//    @FindBy (xpath ="(//p[normalize-space('© 2005 - 2026')])[5]" )
//    private WebElement TextJos;
//    @FindBy (xpath = "//h5[text()='Login']")
//    private WebElement TextLoginMare;


    public LoginPage(WebDriver driver){
        super(driver);
    }
}
