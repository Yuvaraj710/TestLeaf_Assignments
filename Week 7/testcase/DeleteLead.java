package testcase;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class DeleteLead extends BaseClass {
	
	@Test
	public void runDeleteLead() throws InterruptedException {
		
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
		.clickDeleteButton()
		.clickFindLeads()
		.enterLeadId(leadID)
		.clickFindLeadsButton()
		.verifyDeletedLead();
		
	}

}
