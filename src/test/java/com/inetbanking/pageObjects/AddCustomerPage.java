package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}

	@FindBy(how=How.XPATH, using="/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how=How.NAME, using="name")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how=How.NAME,using="rad1")
	@CacheLookup
	WebElement rdGender;
	
	@CacheLookup
	@FindBy(how=How.ID_OR_NAME, using="dob")
    WebElement txtdob;
	
	@CacheLookup
	@FindBy(how=How.NAME, using="addr")
	WebElement txtaddress;
	
	@CacheLookup
	@FindBy(how=How.NAME, using="city")
	WebElement txtcity;
	
	@CacheLookup
	@FindBy(how=How.NAME, using="state")
	WebElement txtstate;
	
	@CacheLookup
	@FindBy(how=How.NAME, using="pinno")
	WebElement txtpinno;
	
	@CacheLookup
	@FindBy(how=How.NAME, using="telephoneno")
	WebElement txttelephone;
	
	@CacheLookup
	@FindBy(how=How.NAME, using="emailid")
	WebElement txtemailid ;
	
	@CacheLookup
	@FindBy(how=How.NAME, using="password")
	WebElement txtpassword ;
	
	@CacheLookup
	@FindBy(how=How.NAME, using="sub")
	WebElement btnSubmit ;
	
	public void clickAddNewCustomer()
	{
		lnkAddNewCustomer.click();
	}
	
	
	public void custName(String cname)
	{
		txtCustomerName.sendKeys(cname);
	}
	
	public void custgender(String cgender)
	{
		rdGender.click();
	}
	public void custdob(String mm,String dd,String yy)
	{
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
		
	}
	public void custaddress(String caddress)
	{
		txtaddress.sendKeys (caddress);
	}
	
	public void custcity(String ccity)
	{
		txtcity.sendKeys(ccity);
	}
	
	public void custstate(String cstate)
	{
		txtcity.sendKeys(cstate);
	}
	
	public void custpinno(int cipinno)
	{
	  txtpinno.sendKeys(String.valueOf(cipinno));
	}
	
	public void custtelephoneno(String ctelephoneno)
	{
		txttelephone.sendKeys(ctelephoneno);
	}
	
	public void custemail(String cemailid)
	{
		txtemailid.sendKeys(cemailid);
		
	}

	public void custpassword(String cpassword)
	{
       txtpassword.sendKeys(cpassword);
	}
	
	public void custsubmit()
	{
		btnSubmit.click();
	}
}
