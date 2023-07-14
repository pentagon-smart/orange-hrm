package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.*;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class UsersTest extends BaseTest {

    AdminPage adminPage = new AdminPage();
    AddUserPage addUserPage = new AddUserPage();
    HomePage homePage = new HomePage();
    ViewSystemUsersPage viewSystemUsersPage = new ViewSystemUsersPage();
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    ResultPage resultPage = new ResultPage();


    @Test
    public void adminShouldAddUserSuccessFully() throws InterruptedException {
        //Login to Application
        //Enter username
        loginPage.enterUserName();
        Thread.sleep(1000);

        //   Enter password
        loginPage.enterPassword();
        Thread.sleep(1000);

        //   Click on Login Button
        loginPage.clickOnLoginButton();
        //	click On "Admin" Tab
        homePage.clickOnAdmin();
        Thread.sleep(1000);

        //	Verify "System Users" Text
        viewSystemUsersPage.getSystemUser();
        Thread.sleep(1000);

        //	click On "Add" button
        viewSystemUsersPage.clickOnAdd();
        Thread.sleep(1000);

        //	Verify "Add User" Text
        addUserPage.getAddUser();
        Thread.sleep(1000);
        //	Select User Role "Admin"
        viewSystemUsersPage.selectRoll();

        //	enter Employee Name "Ananya Dash"
        addUserPage.enterEname();
        Thread.sleep(1000);

        //	Select status "Disable"
        viewSystemUsersPage.selectStatus();

        //	enter psaaword
        addUserPage.enterPassword();
        Thread.sleep(1000);


        //	enter Username
        addUserPage.enterUName();
        Thread.sleep(1000);

        //	enter Confirm Password
        addUserPage.enterConfirmPassword();
        Thread.sleep(1000);

        //	click On "Save" Button
        addUserPage.clickOnSaveButton();
        Thread.sleep(1000);

        //	verify message "Successfully Saved"
//        addUserPage.getSuccsee();

    }

    @Test
    public void searchTheUserCreatedAndVerifyIt() throws InterruptedException {
        //Login to Application
        //Enter username
        loginPage.enterUserName();
        //   Enter password
        loginPage.enterPassword();
        //   Click on Login Button
        loginPage.clickOnLoginButton();
        //	click On "Admin" Tab
        homePage.clickOnAdmin();
        Thread.sleep(1000);
        //	Verify "System Users" Text
        viewSystemUsersPage.getSystemUser();
        Thread.sleep(1000);

        //	Enter Username
        viewSystemUsersPage.enterUserName();
        Thread.sleep(1000);

        //	Select User Role
        viewSystemUsersPage.selectRoll();
        Thread.sleep(1000);

//        viewSystemUsersPage.enterEmployeeName();
        //	Select Satatus
        viewSystemUsersPage.selectStatus();
        Thread.sleep(1000);
        //	Click on "Search" Button
        viewSystemUsersPage.clickOnSearch();
        Thread.sleep(1000);

        //	Verify the User should be in Result list.
        viewSystemUsersPage.getResult();

    }

    @Test
    public void verifyThatAdminShouldDeleteTheUserSuccessFully() throws InterruptedException {
        //Login to Application
        loginPage.enterUserName();
        //   Enter password
        loginPage.enterPassword();
        //   Click on Login Button
        loginPage.clickOnLoginButton();
        //	click On "Admin" Tab
        homePage.clickOnAdmin();
        Thread.sleep(1000);
        //	Verify "System Users" Text
        viewSystemUsersPage.getSystemUser();
        Thread.sleep(1000);
        //	Enter Username
        viewSystemUsersPage.enterUserName();
        Thread.sleep(1000);
        //	Select User Role
        viewSystemUsersPage.selectRoll();
        Thread.sleep(1000);
        //	Select Satatus
        viewSystemUsersPage.selectStatus();
        Thread.sleep(1000);
        //	Click on "Search" Button
        viewSystemUsersPage.clickOnSearch();
        Thread.sleep(1000);
        //	Verify the User should be in Result list.
        //	Click on Check box
        resultPage.clickOnCheckBox();
        Thread.sleep(1000);
        //	Click on Delete Button
        resultPage.clickOnDelete();
        Thread.sleep(1000);
        //	Popup will display
        //	Click on Ok Button on Popup
//        resultPage.clickOnYesDelete();
        //	verify message "Successfully Deleted"
//        resultPage.getDelete();

    }
    @Test
    public void searchTheDeletedUserAndVerifyTheMessageNoRecordFound() throws InterruptedException {
        //Login to Application
        //Enter username
        loginPage.enterUserName();
        //   Enter password
        loginPage.enterPassword();
        //   Click on Login Button
        loginPage.clickOnLoginButton();
        //	click On "Admin" Tab
        homePage.clickOnAdmin();
        Thread.sleep(1000);
        //	Verify "System Users" Text
        viewSystemUsersPage.getSystemUser();
        Thread.sleep(1000);
        //	Enter Username
        viewSystemUsersPage.enterUserName();
        Thread.sleep(1000);
        //	Select User Role
        viewSystemUsersPage.selectRoll();
        Thread.sleep(1000);
        //	Select Satatus
        viewSystemUsersPage.selectStatus();
        Thread.sleep(1000);
        //	Click on "Search" Button
        viewSystemUsersPage.clickOnSearch();
        Thread.sleep(1000);
        //	verify message "No Records Found"
        viewSystemUsersPage.getResult();
    }


}
