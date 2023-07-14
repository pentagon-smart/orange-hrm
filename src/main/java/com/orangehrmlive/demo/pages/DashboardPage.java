package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class DashboardPage extends Utility {

    //Dashboard text Locator and create appropriate methods for it.
    By verifyDashboard = By.xpath("//h6[normalize-space()='Dashboard']");

    public void getDashBoardText(){
        assertVerifyText(verifyDashboard,"Dashboard","Dashboard is not displayed");

    }
}
