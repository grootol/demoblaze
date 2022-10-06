package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.PropertyReader;
import utilities.WebDriverFactory;

public class Hooks {

    private WebDriverFactory webDriverFactory;
    private WebDriver driver;
    private PropertyReader propertyReader;
    private String url;
    private String web;
    private String browserName;

    public Hooks(){
        propertyReader = new PropertyReader();
        webDriverFactory = new WebDriverFactory();
        propertyReader.initProp();
        url = propertyReader.URL;
        web = url.toString();
        browserName = propertyReader.browser;
    }

    @Before
    public void launchBrowser(){
        driver = webDriverFactory.initDriver(browserName);
        driver.get(web);
        System.out.println(web);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        driver.manage().window().maximize();
    }

    @After
    public void teardown(){
        driver.close();
        driver.quit();
    }
}