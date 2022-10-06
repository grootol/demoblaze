package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignupPage extends Page{
    
    public SignupPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "sign-username")
    WebElement txt_Signup_Username;

    @FindBy(id = "sign-password")
    WebElement txt_Signup_Password;

    @FindBy(xpath = "//button[contains(text(),'Sign up')]")
    WebElement btn_Signup;

    public void signupUsername(String username) {
        txt_Signup_Username.sendKeys(username);
    }

    public void signupPassword(String password){
        txt_Signup_Password.sendKeys(password);
    }

    public void buttonSignup(){
        clickElement(btn_Signup);
    }
}
