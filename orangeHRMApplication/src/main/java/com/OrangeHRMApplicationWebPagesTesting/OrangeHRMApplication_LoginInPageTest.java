package com.OrangeHRMApplicationWebPagesTesting;

import com.BaseTest.BaseTest;

import junit.framework.Test;

public class OrangeHRMApplication_LoginInPageTest extends BaseTest {
	
	@Test(priority=1,description=" OrangeHRM Application LogIn Page - LOGIN Panel Text Validation")
	public void orangeHRMApplicationLogInPage_LogInPanelTextValidationTest()
	{
	OrangeHRMApplication_LogInPage logInPage = new OrangeHRMApplication_LogInPage();
	logInPage.orangeHRMApplicationLogInPage_LogInPanelValidation();
	}

	@Test(priority=2,description=" OrangeHRM Applicatin LogIn Page- Logo Validation")
	public void orangeHRMApplicationLogInPage_LogoValidationTest()
	{
	OrangeHRMApplication_LogInPage logInPage = new OrangeHRMApplication_LogInPage();
	logInPage.orangeHRMApplicationLogInPage_LogoValidation();
	}


}
