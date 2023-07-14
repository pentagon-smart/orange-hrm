package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ResultPage extends Utility {

    By checkbox = By.xpath("//div[@class='oxd-table-card-cell-checkbox']//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']");
    By deleteButton = By.xpath("//div[@class='orangehrm-container']//button[1]");

    By popUpDelete = By.xpath("//button[normalize-space()='Yes, Delete']");

    By actualTextSuccessfullyDeleted= By.xpath("(//p[@class='oxd-text oxd-text--p oxd-text--toast-message oxd-toast-content-text'])[1]");
    public void clickOnCheckBox(){
        clickOnElement(checkbox);
    }
    public void clickOnDelete(){
        clickOnElement(deleteButton);
    }
    public void clickOnYesDelete(){
        clickOnElement(popUpDelete);
    }
    public void getDelete(){
        assertVerifyText(actualTextSuccessfullyDeleted,"Successfully Deleted","Text is not displayed");
    }

}
