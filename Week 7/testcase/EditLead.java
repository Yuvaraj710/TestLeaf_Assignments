package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class EditLead extends BaseClass{
	
	@Test
	public void runEditLead() throws InterruptedException {
		
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickFindLeads()
		.clickPhoneTab()
		.enterPhoneNumber()
		.clickFindLeadsButton()
		.clickLead()
		.clickEditButton()
		.updateCompanyName()
		.clickUpdateButton()
		.printLeadUpdated();
	}
	
}
