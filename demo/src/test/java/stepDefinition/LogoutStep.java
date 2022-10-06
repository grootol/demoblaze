package stepDefinition;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;
import pageObject.Header;
import utilities.WebDriverFactory;

public class LogoutStep {
    
    private Header header;

	public LogoutStep() {
        header = new Header(WebDriverFactory.getDriver());
	}

    @When("user clicks on logout button")
    public void user_clicks_on_logout_button(){
        header.clickOnLogout();
    }
    
    @Then("account has logged out")
    public void account_has_logged_out(){
        assertTrue("account hasn't logged out", header.isLoginDisplayed());
        assertTrue("account hasn't logged out", header.isSignupDisplayed());
    }
}
