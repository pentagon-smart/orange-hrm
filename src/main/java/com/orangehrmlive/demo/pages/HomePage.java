package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    //Search, Admin, PIM, Leave, and Dashboard locatores and create appropriate methods for it.

    By search = By.xpath("//input[@placeholder='Search']");
    By admin = By.xpath("//span[text()='Admin']");
    By pim =  By.xpath("//span[normalize-space()='PIM']");
    By leave = By.xpath("//span[normalize-space()='Leave']");
    By dashboard = By.xpath("//a[@class='oxd-main-menu-item active']");

    public void clickOnSearch(){
        clickOnElement(search);
    }
    public void clickOnAdmin(){
        clickOnElement(admin);
    }
    public void clickOnPIM(){
        clickOnElement(pim);
    }
    public void clickOnLeave(){
        clickOnElement(leave);
    }
    public void clickOnDashboard(){
        clickOnElement(dashboard);
    }
}
