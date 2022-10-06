package stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import pageObject.Header;
import pageObject.LoginPage;
import utilities.WebDriverFactory;

public class LoginStep {
    
    private LoginPage loginPage;
    private Header header;

	public LoginStep() {
        loginPage = new LoginPage(WebDriverFactory.getDriver());
        header = new Header(WebDriverFactory.getDriver());
	}

    @Given("user is on login page")
    public void user_is_on_login_page(){
        assertTrue("The user is not on login page.", header.isLoginDisplayed());
        header.clickOnLogin();
    }

    @When("user enters login username as {string}")
    public void user_enters_login_username_as(String username){
        loginPage.loginUsername(username);
    }

    @When("user enters login password as {string}")
    public void user_enters_login_password_as(String password){
        loginPage.loginPassword(password);
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button(){
        loginPage.buttonLogin();
    }
    
    @Then("user is navigated to the home page")
    public void user_is_navigated_to_the_home_page(){
        assertTrue("welcome user is not displayed", header.isWelcomeUserDisplayed());
        assertTrue("log out button is not displayed", header.isLogoutDisplayed());
    }

    @Then("login message {string}")
    public void login_message(String message) throws InterruptedException{
        assertEquals(message, loginPage.getAlertMessage());
        Thread.sleep(500);
    }
}
