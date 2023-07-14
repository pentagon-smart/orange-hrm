package com.orangehrmlive.demo.testbase;


import com.orangehrmlive.demo.propertyreader.PropertyReader;
import com.orangehrmlive.demo.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utility {

    String browser = PropertyReader.getInstance().getProperty("browser");


    @BeforeMethod
    public void setUp(){
        selectBrowser(browser);
    }

    @BeforeClass


    @AfterMethod
    public void tearDown(){
        closebrowser();
    }

}
