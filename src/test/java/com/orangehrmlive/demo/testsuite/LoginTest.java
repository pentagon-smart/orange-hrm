package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.DashboardPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.pages.LogoutPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    LogoutPage logoutPage = new LogoutPage();

    @Test
    public void verifyUserShouldLoginSuccessFully(){
        //Enter username
        loginPage.enterUserName();
        //   Enter password
        loginPage.enterPassword();
        //   Click on Login Button
        loginPage.clickOnLoginButton();
        //   Verify "Dashboard" Message
        dashboardPage.getDashBoardText();

    }

    @Test
    public void VerifyThatTheLogoDisplayOnLoginPage(){
        //Launch the application
        // Verify Logo is Displayed
        loginPage.verifyLogo();
    }

    @Test
    public void VerifyUserShouldLogOutSuccessFully() throws InterruptedException {
        //Login To The application
        loginPage.enterUserName();
        Thread.sleep(1000);
        //   Enter password
        loginPage.enterPassword();
        Thread.sleep(1000);
        //   Click on Login Button
        loginPage.clickOnLoginButton();
        Thread.sleep(1000);
        //   Click on User Profile logo
        logoutPage.clickOnProfile();
        Thread.sleep(1000);
        //   Mouse hover on "Logout" and click
        logoutPage.mouseHoverAndClickOnLogout();
        Thread.sleep(1000);
        //   Verify the text "Login Panel" is displayed
        logoutPage.getLogin();

    }
}
