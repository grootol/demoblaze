package stepDefinition;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import pageObject.Header;
import pageObject.SignupPage;
import utilities.WebDriverFactory;

public class SignupStep {
    
    private SignupPage signupPage;
    private Header header;

	public SignupStep() {
        signupPage = new SignupPage(WebDriverFactory.getDriver());
        header = new Header(WebDriverFactory.getDriver());
	}
    
    @Given("user is on signup page")
    public void user_is_on_signup_page() {
        assertTrue("The user is not on signup page.", header.isSignupDisplayed());
    }

    @When("user enters signup username as {string}")
    public void user_enters_signup_username_as(String username) {
        signupPage.signupUsername(username);
    }

    @When("user enters signup password as {string}")
    public void user_enters_signup_password_as(String password) {
        signupPage.signupPassword(password);
    }

    @When("user clicks on signup button")
    public void user_clicks_on_signup_button() {
        signupPage.buttonSignup();
    }

    @Then("signup message {string}")
    public void signup_message(String message) throws InterruptedException {
        assertEquals(message, signupPage.getAlertMessage());
        Thread.sleep(500);
    }
}
