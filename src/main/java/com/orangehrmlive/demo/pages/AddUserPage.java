package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AddUserPage extends Utility {

    //User Role Drop Down, Employee Name, Username, Status Drop Down, Password, Confirm Password,
    //  Save and Cancle Button Locators and it's actions

    By eName = By.xpath("//input[@placeholder='Type for hints...']");
    By userName = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By password = By.xpath("(//input[@type='password'])[1]");
    By cPassword = By.xpath("(//input[@type='password'])[2]");
    By saveButton = By.xpath("//button[normalize-space()='Save']");
    By cancelButton = By.xpath("//button[normalize-space()='Cancel']");
    By verifyAddUser = By.xpath("//h6[normalize-space()='Add User']");
    By verifySuccssesText = By.xpath("//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text']");

    public void enterEname(){
        sendTextToElement(eName,"Ananya Dash");
    }
    public void enterUName(){
        sendTextToElement(userName,"Poonam123");
    }
    public void enterPassword(){
        sendTextToElement(password,"Poonam123");
    }
    public void enterConfirmPassword(){
        sendTextToElement(cPassword,"Poonam123");
    }
    public void clickOnSaveButton(){
        clickOnElement(saveButton);
    }
    public void clickOnCancelButton(){
        clickOnElement(cancelButton);
    }
    public void getAddUser(){
        assertVerifyText(verifyAddUser,"Add User","Text is not displayed");
    }
    public void getSuccsee(){
        assertVerifyText(verifySuccssesText,"Successfully Saved","Text is not displayed");
    }


}
