package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by cca_student on 04/08/2018.
 */
public class LoginPage {
    WebDriver driver;
    public LoginPage(WebDriver driver)
    {
     this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public boolean checkCorrectPage()
    {
        return driver.getTitle().contains("Sign In");
    }
}
