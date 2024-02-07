package com.inetbanking.testCases;

import java.io.IOException;
import org.junit.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddcustomerTest_003 extends BaseClass
{
	
@Test
public void addnewCustomer() throws InterruptedException, IOException
{
	LoginPage lp=new LoginPage(driver);
	lp.setUserName(username);
	lp.setpassword(password);
	lp.Submit();
	
	Thread.sleep(3000);
	
	AddCustomerPage addcust=new AddCustomerPage(driver);
	
	addcust.clickAddNewCustomer();
	Thread.sleep(5000);
	addcust.custName("Unnati");
	addcust.custgender("Female");
	addcust.custdob("10", "12","2000");
	Thread.sleep(3000);
	addcust.custaddress("INDIA");
	addcust.custcity("Noida");
	Thread.sleep(3000);
	addcust.custstate("UP");
	addcust.custpinno(244001);
	addcust.custtelephoneno("009876524");
	
	
	String email=randomestring()+"@gmail.com";
	addcust.custemail(email);
	addcust.custpassword("abcge");
	addcust.custsubmit();
	
	Thread.sleep(5000);
	
	boolean res= driver.getPageSource().contains("Customer Registered Successfully!!!");
	 
	if(res==true)
	{
		Assert.assertTrue(true);
	}
	else
	{
		captureScreen(driver,"addNewCustomer");
		Assert.assertTrue(false);
	}
	
		
}
 
}
