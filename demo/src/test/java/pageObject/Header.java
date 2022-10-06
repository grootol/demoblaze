package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends Page{
    
    public Header(WebDriver driver) {
        super(driver);
    }
    
    @FindBy(linkText = "Log in")
    WebElement link_Login;

    @FindBy(linkText = "Sign up")
    WebElement link_Signup;

    @FindBy(linkText = "Log out")
    WebElement link_Logout;

    @FindBy(id = "nameofuser")
    WebElement link_Welcome_User;

    public void clickOnLogin() {
        clickElement(link_Login);
    }

    public void clickOnSignup() {
        clickElement(link_Signup);
    }

    public void clickOnLogout() {
        clickElement(link_Logout);
    }

    public boolean isWelcomeUserDisplayed() {
        visibilityWait(link_Welcome_User);
        return link_Welcome_User.isDisplayed();
    }

    public boolean isLoginDisplayed() {
        visibilityWait(link_Login);
        return link_Login.isDisplayed();
    }

    public boolean isSignupDisplayed(){
        visibilityWait(link_Signup);
        return link_Signup.isDisplayed();
    }

    public boolean isLogoutDisplayed() {
        visibilityWait(link_Logout);
        return link_Logout.isDisplayed();
    }
}
