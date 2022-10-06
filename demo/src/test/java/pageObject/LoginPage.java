package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Page{
    
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "loginusername")
    WebElement txt_Login_Username;

    @FindBy(id = "loginpassword")
    WebElement txt_Login_Password;

    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement btn_Login;

    public void loginUsername(String username) {
        txt_Login_Username.sendKeys(username);
    }

    public void loginPassword(String password){
        txt_Login_Password.sendKeys(password);
    }

    public void buttonLogin(){
        clickElement(btn_Login);
    }
}
