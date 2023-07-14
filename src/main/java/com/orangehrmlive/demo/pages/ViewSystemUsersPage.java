package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ViewSystemUsersPage extends Utility {

    //System Users Text, Username Field, User Roll dropDown, Employee Name Field,
    //  Status Drop Down, Search Button, Reset Button, Add Button and Delete Button locators and it's actions

    By userText = By.xpath("//h5[normalize-space()='System Users']");
    By userNameField = By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
    By userRoll = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]");
    By selectAdmin= By.xpath("//span[contains(text(),'Admin')]");
    By selectStatus= By.xpath("//span[contains(text(),'Enabled')]");
    By employeeName = By.xpath("//input[@placeholder='Type for hints...']");
    By status = By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]");
    By searchButton = By.xpath("//button[normalize-space()='Search']");
    By resetButton = By.xpath("//button[normalize-space()='Reset']");
    By addButton = By.xpath("//button[normalize-space()='Add']");
    By result = By.xpath("//span[normalize-space()='(1) Record Found']");
    By aName = By.xpath("//p[@class='oxd-userdropdown-name']");

    public void getSystemUser(){
        assertVerifyText(userText,"System Users","System Users is not displayed");
    }
    public void enterUserName(){
        sendTextToElement(userNameField,"Admin");
    }
    public void selectRoll(){
        clickOnElement(userRoll);
        clickOnElement(selectAdmin);
    }
    public void enterEmployeeName(){
        sendTextToElement(aName,"Paul Collings");
    }

    public void selectStatus(){
        clickOnElement(status);
        clickOnElement(selectStatus);
    }
    public void clickOnSearch(){
        clickOnElement(searchButton);
    }
    public void clickOnReset(){
        clickOnElement(resetButton);
    }
    public void clickOnAdd(){
        clickOnElement(addButton);
    }
    public void getResult(){
        assertVerifyText(result,"(1) Record Found","No Records Found is not displayed");
    }

}
