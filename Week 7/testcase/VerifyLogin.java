package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class VerifyLogin extends BaseClass {
	
	@Test
	public void LoginVerification() {
		
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.VerifyLogin();
	}

}
