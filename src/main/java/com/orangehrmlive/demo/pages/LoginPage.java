package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage extends Utility {

    //Store usename, password, Login Button, HR for All logo, and LOGIN Panel text Locators and create appropriate methods for it.

    By userName = By.xpath("//input[@placeholder='Username']");
    By password = By.xpath("//input[@placeholder='Password']");

    By loginButton = By.xpath("//button[normalize-space()='Login']");
    By logoImg = By.xpath("//img[@alt='company-branding']");
    public void enterUserName(){
        sendTextToElement(userName,"Admin");
    }
    public void enterPassword(){
        sendTextToElement(password,"admin123");
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }
    public void verifyLogo()
    {
        WebElement logo = driver.findElement(logoImg);
        Assert.assertEquals(true, logo.isDisplayed());

    }
}
