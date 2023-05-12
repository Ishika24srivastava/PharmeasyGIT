package test_method;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import test_base.PharmEasy_base;
import test_page.PharmEasy_page;

public class PharmEasy_Signin extends PharmEasy_base {
	PharmEasy_page  pharmeasysigin;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 pharmeasysigin=new PharmEasy_page();
		 
	}
	
	@Test(priority=1)
	public void Logo()
	{
		boolean logo=driver.findElement(By.xpath("(//img[@alt='pharmeasy-logo'])[2]")).isDisplayed();
		System.out.println("The logo is displayed= "+logo);
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy: Online Pharmacy & Medical Store in India | 50 Lakhs+ Customers.");
	}
	
	@Test(priority=2,enabled=false)
	public void Delivery()
	{
		pharmeasysigin.Pin().click();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"PharmEasy: Online Pharmacy & Medical Store in India | 50 Lakhs+ Customers.");
		
	}
	
	@Test(priority=3,enabled=false)
	public void Pin_Enter() throws InterruptedException
	{
		pharmeasysigin.Pin_enter().sendKeys("133301");
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy: Online Pharmacy & Medical Store in India | 50 Lakhs+ Customers.");
		
	}
	
	@Test(priority=4,enabled=false)
	public void Check() throws InterruptedException
	{
		pharmeasysigin.Check().click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"PharmEasy: Online Pharmacy & Medical Store in India | 50 Lakhs+ Customers.");
	}
	
	@Test(priority=5)
	public void Sign_in()
	{
		pharmeasysigin.Sign_in().click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/#login");
	}
	
	@Test(priority=6)
	public void Mobile()
	{
		pharmeasysigin.Mobile().sendKeys("9389657367");
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/#login");
	}
	
	@Test(priority=7)
	public void OTP() throws InterruptedException
	{
		pharmeasysigin.Otp().click();
		Thread.sleep(20000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/#login");
	}
	
	@Test(priority=8)
	public void Continue() throws InterruptedException
	{
		Thread.sleep(5000);
		pharmeasysigin.Continue().click();
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test(priority=9,enabled=false)
	public void User()
	{
		pharmeasysigin.User().click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/#login");
	}
	
	@Test(priority=10,enabled=false)
	public void Sign_out()
	{
		pharmeasysigin.Log_out().click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}
	

	@AfterSuite
	public void close()
	{
		terminate();
	}


}
