package stepDefinition;

import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static Actions.Action.*;
import static Util.DataKeys.PASSWORD;
import static Util.DataKeys.USERNAME;
import static Util.HighlightElement.highlightElement;
import static Util.ScenarioContext.getData;
import static Util.ScenarioContext.saveData;
import static Util.WaitUntil.waitUntil;

public class Login extends AbstractStepDef {
    @Given("user insert username {string}")
    public void userInsertUsername (String value) throws InterruptedException {
        navigate(loginPageUrl,driver);
        waitUntil(3);
        sendKey(loginPage.getUsernameField(),value);
        saveData(USERNAME,value);
    }
    @And("user insert password {string}")
    public void userInsertPassword(String pass) throws InterruptedException{
        sendKey(loginPage.getPasswordField(),pass);
        isDisplayed(loginPage.getLogoCompanyImg());
        waitUntil(3);
        saveData(PASSWORD,pass);
    }
    @When("user clicks on Login button")
    public void userClicksOnLoginButton() {
        click(loginPage.getSubmitButton(),1);
    }
    @Then("user is redirect to homepage")
    public void userIsRedirectToHomepage(){
        waitUntil(3);
        highlightElement(homePage.getDashboardSign());
        waitUntil(3);
        Assert.assertEquals("Dashboard",homePage.getDashboardSign().getText());
    }
    @And("user is redirect to admin link")
    public void userIsRediretToAdminLink(){
        click(homePage.getAdminLink(),1);
        waitUntil(2);
    }
    @And("user try to find an user")
    public void userTryToFindAnUer(){
        sendKey(homePage.getUsernameFSystem(),"dat1911");
        click(homePage.getSearchButton(),1);
        waitUntil(2);
    }
    @And ("user click on edit button")
    public void userClickOnEditButon (){
        click(homePage.getEditButton(),1);
        waitUntil(2);
    }
    @And("user change the employee name")
    public void userChangeTheEmployeeName(){
        deleteVlada00(homePage.getIconEmployeeName());
        sendKey(homePage.getIconEmployeeName(),"John  Week");
        waitUntil(2);
        click(homePage.getSaveButton(),2);
        waitUntil(2);
    }
    @And("user add a new job")
    public void userClickOnJobButton(){
        click(homePage.getJobButton(),1);
        click(homePage.getJobtitlesbutton(),1);
        waitUntil(3);
        click(homePage.getAddButton(),1);
        waitUntil(4);
        sendKey(homePage.getIntroduceJobtitle(),"IT");
        waitUntil(1);
        sendKey(homePage.getIntroduDescriereaJobului(),"Activități obișnuite: scrierede cod,rezolvarea bugurilor,dezvoltarea plicatiilor si siteurilor" );
        click(homePage.getSalveazajobul(),1);
        waitUntil(4);
    }
    @And("Invalid credentials")
    public void invalidCredentials (){
        waitUntil(3);
        highlightElement(loginPage.getInvalidCredentials());
        waitUntil(3);
        Assert.assertEquals("Invalid credentials",loginPage.getInvalidCredentials().getText());
    }
    @And("user clicks LogOut button")
    public void userClickOnLogOutButton(){
        click(homePage.getUserMeniu(),1);
        highlightElement(homePage.getLogOutButton());
        waitUntil(5);
        click(homePage.getLogOutButton(),1);
    }
    @And("insert username")
    public void insertUsername(){
        waitUntil(3);
        sendKey(loginPage.getUsernameField(),getData(USERNAME).toString());
    }
    @And("insert password")
    public void insertPassword(){
        waitUntil(3);
        sendKey(loginPage.getPasswordField(),getData(PASSWORD).toString());
    }
}
