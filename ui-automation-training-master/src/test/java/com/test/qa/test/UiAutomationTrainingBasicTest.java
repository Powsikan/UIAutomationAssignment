package com.test.qa.test;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.test.qa.pageobjects.pages.ABTestPage;
import com.test.qa.pageobjects.pages.CheckBoxPage;
import com.test.qa.pageobjects.pages.DropDownPage;
import com.test.qa.pageobjects.pages.ForgotPasswordPage;
import com.test.qa.pageobjects.pages.HomePage;
import com.test.qa.pageobjects.pages.LoginPage;
import com.test.qa.pageobjects.pages.LoginSecurePage;
import com.test.qa.pageobjects.utils.Constants;
import com.test.qa.testdata.UserDetailsDataProvider;
import com.test.qa.utils.TestBase;

/**
 * UiAutomationTrainingBasicTest.java - class to execute Tests Created by
 * SrirankanK on 10/3/2018.
 */
public class UiAutomationTrainingBasicTest extends TestBase {

	/**
	 * Verify Home Page Displayed
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 1)
	public void testVerifyHomePage() {
		//Todo - Verify HomePage is displayed
		//Todo - Click Home Page Link
		//Todo - Wait Till Page Loads
		//Todo - Verify ABTest Page is displayed
		//Todo - Navigate Back to Home Page
		//Todo - Verify HomePage is displayed
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.AB_TEST_LINK);
		ABTestPage.waitTillHeaderLoad();
		softAssert.assertTrue(ABTestPage.isABTestPageDisplayed(), "Home Page is not Displayed");
		ABTestPage.navigateBack();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		softAssert.assertAll();
	}

	/**
	 * Verify Home Page Displayed Slow
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 2)
	public void testVerifyHomePage2() {
		//Todo - Static wait
		//Todo - Verify HomePage is displayed
		//Todo - Static wait
		//Todo - Click Home Page Link
		//Todo - Static wait
		//Todo - Wait Till Page Loads
		//Todo - Static wait
		//Todo - Verify ABTest Page is displayed
		//Todo - Static wait
		//Todo - Navigate Back to Home Page
		//Todo - Static wait
		//Todo - Verify HomePage is displayed
		//Todo - Static wait
	}

	/**
	 * Verify Check Box
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 3)
	public void testVerifyCheckBox() {
		//Todo - Verify HomePage is displayed
		//Todo - Click Check Box Link
		//Todo - Wait Till Page Loads
		//Todo - Verify Check Box 1 is displayed
		//Todo - Verify Check Box 2 is displayed
		//Todo - Check Check Box 1
		//Todo - Verify Check Box 1 is Checked
		//Todo - Uncheck Check Box 1
		//Todo - Verify Check Box 1 is Unchecked
		//Todo - Check Check Box 2
		//Todo - Verify Check Box 2 is Checked
		//Todo - Uncheck Check Box 2
		//Todo - Verify Check Box 2 is Unchecked
		//Todo - Navigate Back to Home Page
		//Todo - Verify HomePage is displayed
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home page is not display");
		HomePage.clickLink(Constants.CHECK_BOX_LINK);
		softAssert.assertTrue(CheckBoxPage.isCheckBoxesPageDisplayed(),"CheckBox  page not displayed");
		softAssert.assertTrue(CheckBoxPage.isCheckBox1Displayed(),"CheckBox 1 not displayed");
		softAssert.assertTrue(CheckBoxPage.isCheckBox2Displayed(),"CheckBox 2 not displayed");
		CheckBoxPage.checkCheckBox1();
		softAssert.assertTrue(CheckBoxPage.isCheckBox1Checked(),"CheckBox 1 not checked");
		CheckBoxPage.unCheckCheckBox1();
		softAssert.assertFalse(CheckBoxPage.isCheckBox1Checked(),"CheckBox 1 checked");
		CheckBoxPage.checkCheckBox2();
		softAssert.assertTrue(CheckBoxPage.isCheckBox2Checked(),"CheckBox 2 not checked");
		CheckBoxPage.unCheckCheckBox2();
		softAssert.assertFalse(CheckBoxPage.isCheckBox2Checked(),"CheckBox 2 checked");
		softAssert.assertAll();

	}

	/**
	 * Verify Drop Down
	 */
	@Test(groups = { "test", "regression"}, priority = 4)
	public void testVerifyDropDown() {
		//Todo - Verify HomePage is displayed
		//Todo - Click Drop Down Link
		//Todo - Wait Till Page Loads
		//Todo - Verify Drop Down is displayed
		//Todo - Select Drop Down Option 1
		//Todo - Verify Drop Down Option 1 selected
		//Todo - Select Drop Down Option 2
		//Todo - Verify Drop Down Option 2 selected
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(),"Home page is not display");
		HomePage.clickLink(Constants.DROP_DOWN_LINK);
		softAssert.assertTrue(DropDownPage.isDropDownDisplayed(),"DropDown is not display");
		DropDownPage.setDropDownOption(Constants.OPTION_1);
		softAssert.assertEquals(DropDownPage.getSelectOption(),Constants.OPTION_1,"DropDown value is incorrect");
		DropDownPage.setDropDownOption(Constants.OPTION_2);
		softAssert.assertEquals(DropDownPage.getSelectOption(),Constants.OPTION_2,"DropDown value is incorrect");
		softAssert.assertAll();
	}

	/**
	 * Verify Forgot Password
	 */
	@Test(groups = { "test", "regression", "smoke"}, priority = 5)
	public void testVerifyForgotPassword() {
		//Todo - Verify HomePage is displayed
		//Todo - Click Forgot Password Link
		//Todo - Set Sample Mail
		//Todo - Click Submit
		//Todo - Verify Forgot Password Message
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.FORGOT_PASSWORD_LINK);
		ForgotPasswordPage.setEmail(Constants.SAMPLE_MAIL);
		ForgotPasswordPage.clickSubmit();
		softAssert.assertEquals(ForgotPasswordPage.getResult(),Constants.EMAIL_RESULT,"Email submit result is incorrect");
		softAssert.assertAll();
	}

	/**
	 * Verify Login Valid Scenario
	 */
	@Test(groups = "test", priority = 6)
	public void testVerifyLogin() {
		//Todo - Verify HomePage is displayed
		//Todo - Click Login Link
		//Todo - Set Username and Password
		//Todo - Click Submit
		//Todo - Verify Login Secure Page Displayed
		//Todo - Verify Login Alert Displayed
		//Todo - Verify Login  Alert Message
		//Todo - Click Logout
		//Todo - Verify Login Page Displayed
		//Todo - Verify Logout Alert Displayed
		//Todo - Verify Logout  Alert Message
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.LOGIN_LINK);
		LoginPage.setUserName(Constants.LOGIN_USER_NAME);
		LoginPage.setPassword(Constants.LOGIN_PASSWORD);
		LoginPage.clickLogIn();
		softAssert.assertTrue(LoginSecurePage.isLoginSecurePageDisplayed(), "Login Secure Page is not display");
		softAssert.assertTrue(LoginSecurePage.isLoginAlterDisplayed(),"Login alter is not display");
		softAssert.assertTrue(LoginSecurePage.getAlterMessage().contains(Constants.LOGIN_SUCCESS_MSG) ,"Login alert message is incorrect");
		LoginSecurePage.clickLogOut();
		softAssert.assertTrue(LoginPage.isLoginPageDisplayed(),"Login page is not display");
		softAssert.assertTrue(LoginPage.isAlterDisplayed(),"Logout alter is not display");
		softAssert.assertTrue(LoginPage.getAlterMessage().contains(Constants.LOGOUT_SUCCESS_MSG),"Logout alter message is incorrect");
		softAssert.assertAll();
	}

	/**
	 * Verify Login Invalid Scenario
	 */
	@Test(groups = { "test", "regression"}, priority = 7, dataProvider = "MultipleUserDetails", dataProviderClass = UserDetailsDataProvider.class)
	public void testVerifyLogin(String username, String password) {
		//TODO- SAME ACTION SHOULD BE REPEATED FOR MULTIPLE USERS
		//Todo - Verify HomePage is displayed
		//Todo - Click Login Link
		//Todo - Set Invalid Username and Password
		//Todo - Click Submit
		//Todo - Verify Login Alert Displayed
		//Todo - Verify Login  Alert Message
		softAssert = new SoftAssert();
		softAssert.assertTrue(HomePage.isHomePageDisplayed(), "Home Page is not Displayed");
		HomePage.clickLink(Constants.LOGIN_LINK);
		LoginPage.setUserName(username);
		LoginPage.setPassword(password);
		LoginPage.clickLogIn();
		softAssert.assertTrue(LoginPage.isAlterDisplayed(),"Login alter is not display");
		softAssert.assertTrue(LoginPage.getAlterMessage().contains(Constants.LOGIN_INVALID_MSG),"Login invalid message is incorect");
		softAssert.assertAll();
	}
}