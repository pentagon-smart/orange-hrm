package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class AdminPage extends Utility {

    //UserManagement, Job, Organization Tabs Locators and it's actions

    By userManagement = By.xpath("//li[@class='--active oxd-topbar-body-nav-tab --parent --visited']");
    By job = By.xpath("//span[normalize-space()='Job']");
    By organization = By.xpath("//span[normalize-space()='Organization']");

    public void clickOnUserManagementTab(){
        clickOnElement(userManagement);
    }
    public void clickOnJobTab(){
        clickOnElement(job);
    }
    public void clickOnOrganizationTab(){
        clickOnElement(organization);
    }
}
