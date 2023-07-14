package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LogoutPage extends Utility {

    By logout = By.xpath("//a[normalize-space()='Logout']");
    By profile = By.xpath("//img[@alt='profile picture']");

    By verifyLogin = By.xpath("//h5[normalize-space()='Login']");
    public void clickOnProfile(){
        clickOnElement(profile);
    }
    public void mouseHoverAndClickOnLogout(){
        mouseHoverToElementAndClick(logout);
    }
    public void getLogin(){
        assertVerifyText(verifyLogin,"Login","Login is not displayed");
    }


}
