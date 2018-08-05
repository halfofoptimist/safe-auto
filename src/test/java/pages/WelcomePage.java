package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by cca_student on 04/08/2018.
 */
public class WelcomePage {
    WebDriver driver;

    @FindBy(linkText = "Login")

    WebElement loginLink;



    public WelcomePage(WebDriver driver){
        this.driver = driver;

        PageFactory.initElements(driver,this);
    }
        public boolean checkCorrectPage(){

        return driver.getTitle().startsWith("Welcome");
    }
    public void clickOnLogin(){
        loginLink.click();
    }
    }

