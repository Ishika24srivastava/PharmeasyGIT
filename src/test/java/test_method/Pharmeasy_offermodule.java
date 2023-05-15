package test_method;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import test_base.PharmEasy_base;
import test_page.PharmEasy_page;

public class Pharmeasy_offermodule extends PharmEasy_base{
	PharmEasy_page  pharmeasy_offer;
	public ExtentTest test;
	public ExtentReports extent;
	String title;
	String actual;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		pharmeasy_offer=new PharmEasy_page();
	}
	
	@BeforeTest
	public void x() 
	{
		
		extent=new ExtentReports("C:\\Users\\isrivastava\\eclipse-workspace\\Pharmeasy_application\\EXTENT_REPORT\\OfferReport.html",true);	
	
	}
	
	@AfterTest
	public void y() 
	{
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=1)
	public void Offers() throws InterruptedException
	{
		//pharmeasy_offer.Offer().click();
		test=extent.startTest("Verify whether  Offer page load Successfully");
		test.log(LogStatus.INFO, " Offer page load is intiated");
		test.log(LogStatus.INFO," Offer page load  Successfully");
		driver.findElement(By.xpath("(//a[text()='Offers'])[2]")).click();
		Thread.sleep(1000);
		 title=driver.getTitle();
		 System.out.println(title);
		 actual="PharmEasy™ Offers & Coupon Codes: Upto 80% OFF, Cashbacks & more";
		 assertEquals(actual,title);
	}
	
	
	
	@Test(priority=2)
	public void Offers_payment() throws InterruptedException
	{
		test=extent.startTest("Verify whether Payment button click Successfully");
		test.log(LogStatus.INFO, " Payment button  click is intiated");
		test.log(LogStatus.INFO," Payment button click Successfully");
		pharmeasy_offer.Payment().click();
		Thread.sleep(1000);
		 title=driver.getTitle();
		 actual="PharmEasy™ Offers & Coupon Codes: Upto 80% OFF, Cashbacks & more";
		 assertEquals(actual,title);
	}
	@Test(priority=3)
	public void Healthcare_offer() throws InterruptedException
	{
		test=extent.startTest("Verify whether Heatl care button click Successfully");
		test.log(LogStatus.INFO, "Heatl care button  click is intiated");
		test.log(LogStatus.INFO,"Heatl care button click Successfully");
		pharmeasy_offer.Healthoffercare().click();
		Thread.sleep(1000);
		 title=driver.getTitle();
		 actual="PharmEasy™ Offers & Coupon Codes: Upto 80% OFF, Cashbacks & more";
		 assertEquals(actual,title);
	}
	
	
	
	
	@Test(priority=4)
	public void Diagnostic_offer() throws InterruptedException
	{
		test=extent.startTest("Verify whether Diagnostic  button click Successfully");
		test.log(LogStatus.INFO, " Diagnostic button  click is intiated");
		test.log(LogStatus.INFO," Diagnostic button click Successfully");
		pharmeasy_offer.Diagnostic().click();
		Thread.sleep(1000);
		 title=driver.getTitle();
		 actual="PharmEasy™ Offers & Coupon Codes: Upto 80% OFF, Cashbacks & more";
		 assertEquals(actual,title);
	}
	
	@Test(priority=5)
	public void Offers_medicine() throws InterruptedException
	{
		test=extent.startTest("Verify whether Medicine button click Successfully");
		test.log(LogStatus.INFO, "Medicine button  click is intiated");
		test.log(LogStatus.INFO,"Medicine button click Successfully");
		pharmeasy_offer.Medicine_off().click();
		Thread.sleep(1000);
		 title=driver.getTitle();
		 actual="PharmEasy™ Offers & Coupon Codes: Upto 80% OFF, Cashbacks & more";
		 assertEquals(actual,title);
	}
	
	
	@Test(priority=6)
	public void Move1_offer() throws InterruptedException
	{
		test=extent.startTest("Verify whether Offer page 1 load  Successfully");
		test.log(LogStatus.INFO, "Offer page 1 load  is intiated");
		test.log(LogStatus.INFO,"Offer page 1 load  Successfully");
		pharmeasy_offer.Offer1().click();
		Thread.sleep(1000);
		title=driver.getTitle();
		actual="Flat 15% OFF + Rs. 200 OFF";
		 assertEquals(actual,title);
	}
	
	@Test(priority=7,enabled=false)
	public void Code1_offer() throws InterruptedException
	{
		test=extent.startTest("Verify whether code is copied  Successfully");
		test.log(LogStatus.INFO, "code is copied is intiated");
		test.log(LogStatus.INFO,"code is copied Successfully");
		pharmeasy_offer.Code().click();
		Thread.sleep(1000);
		 title=driver.getTitle();
		 actual="PharmEasy™ Offers & Coupon Codes: Upto 80% OFF, Cashbacks & more";
		 assertEquals(actual,title);
	}
	
	@Test(priority=8)
	public void Reback_offer() throws InterruptedException
	{
		test=extent.startTest("Verify whether page reback  Successfully");
		test.log(LogStatus.INFO, "page reback is intiated");
		test.log(LogStatus.INFO,"page reback Successfully");
		pharmeasy_offer.Offerreback().click();
		Thread.sleep(1000);
		 title=driver.getTitle();
		 actual="PharmEasy™ Offers & Coupon Codes: Upto 80% OFF, Cashbacks & more";
		 assertEquals(actual,title);
	}
	
	@Test(priority=9,enabled=false)
	public void Code2_offer() throws InterruptedException
	{
		test=extent.startTest("Verify whether offer second page is loaded Successfully");
		test.log(LogStatus.INFO, "offer second page loaded intiated");
		test.log(LogStatus.INFO,"offer second page is loaded Successfully");
		pharmeasy_offer.Offer2().click();
		Thread.sleep(1000);
		 title=driver.getTitle();
		 actual="PharmEasy™ Offers & Coupon Codes: Upto 80% OFF, Cashbacks & more";
		 assertEquals(actual,title);
		 driver.navigate().back();
	}
	
	@Test(priority=10)
	public void Move3_offer() throws InterruptedException
	{
		test=extent.startTest("Verify whether offer third page is loaded Successfully");
		test.log(LogStatus.INFO, "offer third page loaded intiated");
		test.log(LogStatus.INFO,"offer third page is loaded Successfully");
		pharmeasy_offer.Offer3().click();
		Thread.sleep(1000);
		 title=driver.getTitle();
		 actual="Get flat Rs.150 off on ICICI Debit & Credit cards";
		 assertEquals(actual,title);
		 driver.navigate().back();
	}
	@Test(priority=11)
	public void Reback1_offer() throws InterruptedException
	{
		test=extent.startTest("Verify whether page reback  Successfully");
		test.log(LogStatus.INFO, "page reback is intiated");
		test.log(LogStatus.INFO,"page reback Successfully");
		pharmeasy_offer.Offerreback().click();
		Thread.sleep(1000);
		 title=driver.getTitle();
		 actual="PharmEasy™ Offers & Coupon Codes: Upto 80% OFF, Cashbacks & more";
		 assertEquals(actual,title);
	}
	
	@Test(priority=12)
	public void Table_offer() throws InterruptedException
	{
		test=extent.startTest("Verify  table of details is visible  Successfully");
		test.log(LogStatus.INFO, " table of details is visible  intiated");
		test.log(LogStatus.INFO," table of details is visible  Successfully");
		System.out.println(pharmeasy_offer.table().getText());
		Thread.sleep(1000);
		 title=driver.getTitle();
		 actual="PharmEasy™ Offers & Coupon Codes: Upto 80% OFF, Cashbacks & more";
		 assertEquals(actual,title);
	}
	
	@Test(priority=13)
	public void Q1_offer() throws InterruptedException
	{
		test=extent.startTest("Verify whether offer question 1 is viewed Successfully");
		test.log(LogStatus.INFO, "offer question 1 is viewed intiated");
		test.log(LogStatus.INFO,"offer question 1 is viewed Successfully");
		pharmeasy_offer.Offerq1().click();
		Thread.sleep(1000);
		 title=driver.getTitle();
		 actual="PharmEasy™ Offers & Coupon Codes: Upto 80% OFF, Cashbacks & more";
		 assertEquals(actual,title);
		 
	}
	@Test(priority=14)
	public void Q2_offer() throws InterruptedException
	{
		test=extent.startTest("Verify whether offer question 2 is viewed Successfully");
		test.log(LogStatus.INFO, "offer question 2 is viewed intiated");
		test.log(LogStatus.INFO,"offer question 2 is viewed Successfully");
		pharmeasy_offer.Offerq2().click();
		Thread.sleep(1000);
		 title=driver.getTitle();
		 actual="PharmEasy™ Offers & Coupon Codes: Upto 80% OFF, Cashbacks & more";
		 assertEquals(actual,title);
		
	}
	@Test(priority=15)
	public void Q3_offer() throws InterruptedException
	{
		test=extent.startTest("Verify whether offer question 3 is viewed Successfully");
		test.log(LogStatus.INFO, "offer question 3 is viewed intiated");
		test.log(LogStatus.INFO,"offer question 3 is viewed Successfully");
		pharmeasy_offer.Offerq3().click();
		Thread.sleep(1000);
		 title=driver.getTitle();
		 actual="PharmEasy™ Offers & Coupon Codes: Upto 80% OFF, Cashbacks & more";
		 assertEquals(actual,title);
		
	}
	
	@AfterMethod
	public void run1()
	{
		
			if(actual.equals(title)) 
			{
				test.log(LogStatus.PASS, "Pages as well as functionality work properly");
			}
			else
			{
				test.log(LogStatus.FAIL, "Pages as well as functionality is not work  properly");
			}
		}
		

	
	@AfterSuite
	public void close()
	{
		terminate();
	}
	
	@AfterSuite
	public void close1()
	{
		terminate();
	}
	
}
