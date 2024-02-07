package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.inetbanking.pageObjects.LoginPage;


public class TC_LoginTest_001 extends BaseClass{

	
	@Test
	public void LoginTest() throws IOException 
	{
	        logger.info("URL is Opened");
	        
	        
	        LoginPage lp = new LoginPage(driver);
	        lp.setUserName(username);
	        logger.info("Enetered the UserName");
	
	        lp.setpassword(password);
	        logger.info("Enetered the Password");
	        
	        
	        lp.Submit();
	        
	        if(driver.getTitle().equals("Guru99 Bank Manager HomePage"))
	        {
	        	Assert.assertTrue(true);
	        	logger.info("Login Test Passed");
	        	
	        	
	        }
	        else {
	        	captureScreen(driver, "LoginTest");
	        	Assert.assertTrue(false);
	        	logger.info("Login Test failed");
	        }
	       
}
	
}
	     

	
