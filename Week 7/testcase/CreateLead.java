package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class CreateLead extends BaseClass {

	@BeforeTest
	public void setFileName() {
		fileName = "yuvi";
	}
	
	@Test(dataProvider = "fetchdata")
	public void runVerifyLogin(String cName, String fName, String lName) {
		
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLeads()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLead()
		.VerifyLead();
	}

}
