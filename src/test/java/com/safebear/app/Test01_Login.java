package com.safebear.app;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by cca_student on 04/08/2018.
 */
public class Test01_Login extends BaseTest {
    @Test
    public void testLogin(){
        //Step 1 Confirm on Welcome page
        assertTrue(welcomePage.checkCorrectPage());
        //Step 2 click on the Login page  and the Login Page loads
        welcomePage.clickOnLogin();
        //Step 3 Confirm that we are on the login page
        assertTrue(loginPage.checkCorrectPage());

    }
}
