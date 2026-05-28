package Page;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Getter
public class HomePage extends AbstractPage {

    @FindBy(xpath = "//h6[text()='Dashboard']")
    private WebElement dashboardSign;

    @FindBy(xpath = "//img[@alt='profile picture']")
    private WebElement userMeniu;

    @FindBy(xpath = "//a[text()='Logout']")
    private WebElement logOutButton;

    @FindBy (xpath = "//span[text()='Admin']")
    private WebElement AdminLink;

    @FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
    private WebElement UsernameFSystem;

    @FindBy (xpath = "//button[@type='submit']" )
    private WebElement SearchButton;

    @FindBy (xpath = "(//button[@type='button'])[8]")
    private WebElement EditButton;

    @FindBy (xpath = "(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")
    private WebElement IconitaStatus;

    @FindBy(xpath = "//input[@placeholder='Type for hints...']")
    private WebElement IconEmployeeName;
@FindBy (xpath = "//button[normalize-space()='Save']")
private WebElement SaveButton;

@FindBy (xpath = "//span[normalize-space()='Job']")
private WebElement JobButton;
@FindBy(xpath = "//a[text()='Job Titles']")
private WebElement Jobtitlesbutton;

@FindBy (xpath = "//button[normalize-space()='Add']")
private WebElement AddButton;

@FindBy (xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
private WebElement IntroduceJobtitle;
@FindBy (xpath = "//textarea[@placeholder='Type description here']")
private WebElement IntroduDescriereaJobului;
@FindBy (xpath = "//button[@type='submit']")
private WebElement Salveazajobul;


    public HomePage(WebDriver driver)
    {super(driver);}
}
