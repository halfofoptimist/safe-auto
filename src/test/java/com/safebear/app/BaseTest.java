package com.safebear.app;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;
import pages.WelcomePage;

import java.util.concurrent.TimeUnit;

/**
 * Created by cca_student on 04/08/2018.
 */
public class BaseTest
{
    WebDriver driver;
    WelcomePage welcomePage;
    LoginPage loginPage;
    @Before
    public void setUp(){
        driver = new ChromeDriver();
        welcomePage = new WelcomePage(driver);
        loginPage = new LoginPage(driver);
        driver.get("http://automate.safebear.co.uk/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
    @After
    public void tearDown(){

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
