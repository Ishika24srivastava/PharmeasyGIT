package test_method;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
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


public class PharmEasy_Labtestmodule  extends PharmEasy_base{
	
	PharmEasy_page pharmeasy_labtests;
	public ExtentTest test;
	public ExtentReports extent;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		pharmeasy_labtests=new PharmEasy_page();
	}
	
	
	
	@BeforeTest
	public void x() 
	{
		
		extent=new ExtentReports("C:\\Users\\isrivastava\\.jenkins\\workspace\\Pharmeasy_labtest1\\LabReport1.html",true);	
	}
	
	@AfterTest
	public void y() 
	{
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=1)
	public void LabTest_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether LabTest  Page Loads Successfully");
		test.log(LogStatus.INFO, "Lab Test  Page load Test is intiated");
		test.log(LogStatus.INFO,"Lab Test  Page Loads Successfully");
		pharmeasy_labtests.LabTests().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String actual="https://pharmeasy.in/diagnostics?src=homecard";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Lab Test page loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Lab Test page is not loaded properly");
		}
		assertEquals(actual,url);
	}
	

	
	@Test(priority=2)
	public void Deliveryto_labtestsmodule() throws InterruptedException
	{
		test=extent.startTest("Verify whether Delivery to page Loads Successfully");
		test.log(LogStatus.INFO, "Delivery to   Page load Test is intiated");
		test.log(LogStatus.INFO,"Delivery to   Page Loads Successfully");
		pharmeasy_labtests.Deliver_to().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String actual="https://pharmeasy.in/diagnostics?src=homecard#selectPincode";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Delivery to page loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Delivery to page is not loaded properly");
		}
		assertEquals(actual,url);
	}
	
	
	@Test(priority=3)
	public void Pinenter_labtestsmodule() throws InterruptedException
	{
		test=extent.startTest("Verify whether  Enter pin code work Successfully");
		test.log(LogStatus.INFO, "Pin code  entering  is intiated");
		test.log(LogStatus.INFO,"Pin code enter  Successfully");
		pharmeasy_labtests.Pin_Enter().sendKeys("134114");
		Thread.sleep(1000);
		String  expected =driver.getTitle();
		String  actual ="Find Diagnostics Centres & Book Pathology Lab Tests Online & Enjoy Discounts Upto 70% | PharmEasy";
		if(actual.equals(expected)) {
			test.log(LogStatus.PASS, "Pin code  entering  loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Pin code  entering is not loaded properly");
		}
		assertEquals(actual,expected);
	}
	

	@Test(priority=4)
	public void Checkpin_labtestsmodule() throws InterruptedException
	{
		test=extent.startTest("Verify whether Check pin  work Successfully");
		test.log(LogStatus.INFO, "Check pin code  is intiated");
		test.log(LogStatus.INFO,"Check pin code works  Successfully");
		pharmeasy_labtests.Check_pin().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diagnostics?src=homecard#selectPincode";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Check pin code works  loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Check pin code works is not loaded properly");
		}
		assertEquals(actual,url);
		}
	
	
	@Test(priority=5)
	public void Leftscroll_labtestmodule() throws InterruptedException
	{
		test=extent.startTest("Verify whether left scroll  work Successfully");
		test.log(LogStatus.INFO, "Left scroll work   is intiated");
		test.log(LogStatus.INFO,"Left scroll  works  Successfully");
		pharmeasy_labtests.Left_scroll().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diagnostics?src=homecard#selectPincode";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Left scroll works  loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Left scroll works is not loaded properly");
		}
		assertEquals(actual,url);
		}
	

	@Test(priority=6)
	public void Rightscroll_labtestmodule() throws InterruptedException
	{
		test=extent.startTest("Verify whether right scroll  work Successfully");
		test.log(LogStatus.INFO, "Right scroll work   is intiated");
		test.log(LogStatus.INFO,"Right scroll  works  Successfully");
		pharmeasy_labtests.Right_scroll().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diagnostics?src=homecard#selectPincode";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Right scroll works  loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Right scroll works is not loaded properly");
		}
		assertEquals(actual,url);
		}
	
	@Test(priority=7)
	public void Searchpackage_labtestmodule() throws InterruptedException
	{
		test=extent.startTest("Verify  Search pacakge bar   work Successfully");
		test.log(LogStatus.INFO, "Search package bar work   is intiated");
		test.log(LogStatus.INFO,"Search package bar   works  Successfully");
		pharmeasy_labtests.Search_packages().sendKeys("Blood groups");
		Thread.sleep(1000);
		pharmeasy_labtests.Search_packages().sendKeys(Keys.ENTER);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diagnostics/search/all?q=Blood+groups&src=homecard";
		if(actual.equals(url))
		{
			test.log(LogStatus.PASS, "Search pacakge bar  works properly");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Search package works not  properly");
		}
		assertEquals(actual,url);
	}


	@Test(priority=8)
	public void Select_labtestmodule() throws InterruptedException
	{
		test=extent.startTest("Verify that Select button work Successfully");
		test.log(LogStatus.INFO, "Select button works    is intiated");
		test.log(LogStatus.INFO,"Select button works  Successfully");
		pharmeasy_labtests.Select().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diagnostics/search/all?q=Blood+groups&src=homecard";
		if(actual.equals(url))
		{
			test.log(LogStatus.PASS, "Search pacakge bar  works properly");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Search package works not  properly");
		}
		
		assertEquals(actual,url);
		}

	
	@Test(priority=9)
	public void Patients_labtestmodule() throws InterruptedException
	{
		test=extent.startTest("Verify that  Patient qunatity  is selected  Successfully");
		test.log(LogStatus.INFO, "Patient qunatity selected work    is intiated");
		test.log(LogStatus.INFO,"Patient qunatity is selected   Successfully");
		pharmeasy_labtests.Patients().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diagnostics/search/all?q=Blood+groups&src=homecard";
		if(actual.equals(url))
		{
			test.log(LogStatus.PASS, "Patient qunatity is selected  properly");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Patient qunatity is not  selected  properly");
		}
		
		assertEquals(actual,url);
		driver.navigate().back();
	}
	
	
	@Test(priority=10)
	public void All_test() throws InterruptedException
	{
		test=extent.startTest("Verify that All test  page load  Successfully");
		test.log(LogStatus.INFO, " All test  page load    is intiated");
		test.log(LogStatus.INFO," All test  page load  Successfully");
		pharmeasy_labtests.All_test().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diagnostics/all-tests";
		if(actual.equals(url))
		{
			test.log(LogStatus.PASS, "All tests page loaded properly");
		}
		else 
		{
			test.log(LogStatus.FAIL, "All tests page  is not loaded   properly");
		}
		
		assertEquals(actual,url);
		}
	
	
	@Test(priority=11)
	public void Lipid_profile() throws InterruptedException
	{
		test=extent.startTest("Verify that  Lipid profile page load  Successfully");
		test.log(LogStatus.INFO, " Lipid profile page load   is intiated");
		test.log(LogStatus.INFO," Lipid profile page load  Successfully");
		pharmeasy_labtests.Lipid_profile().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diagnostics/all-tests#test-drawer";
		if(actual.equals(url))
		{
			test.log(LogStatus.PASS, "Lipid profile page loaded properly");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Lipid profile is not loaded   properly");
		}
		assertEquals(actual,url);
	}	
	
	
	@Test(priority=12)
	public void Cross_lipidprofile() throws InterruptedException
	{
		test=extent.startTest("Verify that  Cross_Lipid profile work  Successfully");
		test.log(LogStatus.INFO, "  Cross_Lipid profile work    is intiated");
		test.log(LogStatus.INFO,"  Cross_Lipid profile work  Successfully");
		pharmeasy_labtests.Cross().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diagnostics/all-tests";
		if(actual.equals(url))
		{
			test.log(LogStatus.PASS, "Cross_Lipid profile work  properly");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Cross_Lipid profile is not work properly");
		}
		assertEquals(actual,url);
		}
	
	
	@Test(priority=13)
	public void Renal_kidneytest() throws InterruptedException
	{
		test=extent.startTest("Verify that  Renal/kidney function page load  Successfully");
		test.log(LogStatus.INFO, " Renal/kidney function page load   is intiated");
		test.log(LogStatus.INFO, "Renal/kidney function  page load  Successfully");
		pharmeasy_labtests.Renal_kidney().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diagnostics/profile/renalkidney-function-test-rftkft-364";
		if(actual.equals(url))
		{
			test.log(LogStatus.PASS, "Renal/kidney function page load  properly");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Renal/kidney function page is not  load properly");
		}
		assertEquals(actual,url);
		}
	
	
	@Test(priority=14)
	public void Reanl_kidneytesttext() throws InterruptedException
	{
		test=extent.startTest("Verify that  Renal/kidney function page  text is load  Successfully");
		test.log(LogStatus.INFO, " Renal/kidney function page  text load   is intiated");
		test.log(LogStatus.INFO, "Renal/kidney function  page text load  Successfully");
		String text= pharmeasy_labtests.Renal_kidneytext().getText();
		System.out.println("The  text = "+text);
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diagnostics/profile/renalkidney-function-test-rftkft-364";
		if(actual.equals(url))
		{
			test.log(LogStatus.PASS, "Renal/kidney function page text is load  properly");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Renal/kidney function page text is not  load properly");
		}
		
		assertEquals(actual,url);
		
	}
	
	
	@Test(priority=15)
	public void Reanl_kidneytestdetails() throws InterruptedException
	{
		test=extent.startTest("Verify that  Renal/kidney function page  detail is visible  Successfully");
		test.log(LogStatus.INFO, " Renal/kidney function page  detail   is intiated");
		test.log(LogStatus.INFO, "Renal/kidney function  page detail is visible  Successfully");
		String text= pharmeasy_labtests.Reanal_kidneyDetails().getText();
		System.out.println("The  text = "+text);
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diagnostics/profile/renalkidney-function-test-rftkft-364";
		if(actual.equals(url))
		{
			test.log(LogStatus.PASS, "Renal/kidney function page details is load  properly");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Renal/kidney function page details is not  load properly");
		}
		
		assertEquals(actual,url);
		
	}
	
	
	@Test(priority=16)
	public void Renal_kidneybook() throws InterruptedException
	{
		test=extent.startTest("Verify that  Renal/kidney function  Book test button work Successfully");
		test.log(LogStatus.INFO, " Renal/kidney function page  Book test button work    is intiated");
		test.log(LogStatus.INFO, "Renal/kidney function  page Book test button  works   Successfully");
		pharmeasy_labtests.Book_test().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diagnostics/profile/renalkidney-function-test-rftkft-364";
		if(actual.equals(url))
		{
			test.log(LogStatus.PASS, "Renal/kidney function  Book button  work properly");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Renal/kidney function page  Book button is not work properly");
		}
		
		assertEquals(actual,url);
		
	}
	
	
	@Test(priority=17)
	public void Renal_kidneyPatients() throws InterruptedException
	{
		test=extent.startTest("Verify that  Renal/kidney function   Patient quantity  is selected Successfully");
		test.log(LogStatus.INFO, " Renal/kidney function Patient quantity   selection  is intiated");
		test.log(LogStatus.INFO, "Renal/kidney function  Patient quantity  is selected  Successfully");
		pharmeasy_labtests.Patients_quan().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diag-pwa/cart";
		if(actual.equals(url))
		{
			test.log(LogStatus.PASS, "Renal/kidney function  Patient quantity  is selected properly");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Renal/kidney function page  Patient quantity  is  not selected  properly");
		}
		assertEquals(actual,url);
	}
	
	
	
	@Test(priority=18)
	public void RTPCR() throws InterruptedException
	{
		test=extent.startTest("Verify that  RTPCR page load Successfully");
		test.log(LogStatus.INFO, "RTPCR page load  is intiated");
		test.log(LogStatus.INFO, "RTPCR page load Successfully");
		pharmeasy_labtests.RTPCR().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println("hh= "+url);
		
		String  actual ="https://pharmeasy.in/diagnostics/tests/coronavirus-test-sars-cov2-covid19-rtpcr-technique-604?src=header";
		if(actual.equals(url))
		{
			test.log(LogStatus.PASS, "RTPCR page load properly");
		}
		else 
		{
			test.log(LogStatus.FAIL, "RTPCR page is  not  load   properly");
		}
		assertEquals(actual,url);
	}
	
	
	@Test(priority=19)
	public void Covid_19() throws InterruptedException
	{
		test=extent.startTest("Verify that  Covid 19 page load Successfully");
		test.log(LogStatus.INFO, " Covid 19  page load  is intiated");
		test.log(LogStatus.INFO, " Covid 19  page load Successfully");
		pharmeasy_labtests.Covid().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diagnostics/tests/coronavirus-test-sars-cov2-covid19-rtpcr-technique-604?src=header";
		if(actual.equals(url))
		{
			test.log(LogStatus.PASS, "Covid 19 page is load  properly");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Covid 19 page is not load   properly");
		}
		assertEquals(actual,url);
	}
	
	
	@Test(priority=20)
	public void Viewmore() throws InterruptedException
	{
		test=extent.startTest("Verify that  Covid 19 text is visible  Successfully");
		test.log(LogStatus.INFO, " Covid 19  text  is intiated");
		test.log(LogStatus.INFO, " Covid 19   text is visible  Successfully");
		pharmeasy_labtests.Covid().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String  actual ="https://pharmeasy.in/diagnostics/tests/coronavirus-test-sars-cov2-covid19-rtpcr-technique-604?src=header";
		if(actual.equals(url))
		{
			test.log(LogStatus.PASS, "Covid 19 page text is visible   properly");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Covid 19 page  text is not visible properly");
		}
		assertEquals(actual,url);
	}
	
	
	

	@Test(priority=21)
	public void Ranges_Covid() throws InterruptedException
	{
		test=extent.startTest("Verify that  Covid 19  range is visible  Successfully");
		test.log(LogStatus.INFO, " Covid 19   range data   is intiated");
		test.log(LogStatus.INFO, " Covid 19    range data is visible  Successfully");
		System.out.println(pharmeasy_labtests.Ranges_covid().getText());
		Thread.sleep(1000);
		String url=driver.getTitle();
		System.out.println(url);
		String  actual ="Book Covid-19 RTPCR (Coronavirus SARS - CoV2) - Procedure, Preparation, Range and Price | PharmEasy";
		if(actual.equals(url))
		{
			test.log(LogStatus.PASS, "Covid 19 range data is visible   properly");
		}
		else 
		{
			test.log(LogStatus.FAIL, "Covid 19  range data  is not visible properly");
		}
		assertEquals(actual,url);
		}
	
	
	@Test(priority=22)
	public void LabTestBack_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether LabTest  Page Loads Successfully");
		test.log(LogStatus.INFO, "Lab Test  Page load Test is intiated");
		test.log(LogStatus.INFO,"Lab Test  Page Loads Successfully");
		pharmeasy_labtests.LabTests().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String actual="https://pharmeasy.in/diagnostics?src=homecard";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Lab Test page loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Lab Test page is not loaded properly");
		}
		assertEquals(actual,url);
	}
	
	
	@Test(priority=23)
	public void Healthpackages_labtestmodule() throws InterruptedException
	{
		test=extent.startTest("Verify whether Health package page  Loads Successfully");
		test.log(LogStatus.INFO, "Health package   Page load Test is intiated");
		test.log(LogStatus.INFO,"Health package  Loads Successfully");
		pharmeasy_labtests.Health_package().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String actual="https://pharmeasy.in/diagnostics/health-checkup-packages";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Health package  page loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Health package  page is not loaded properly");
		}
		assertEquals(actual,url);
	}
	
	@Test(priority=24)
	public void  Hairbasic_healthpackagemodule() throws InterruptedException
	{
		test=extent.startTest("Verify whether Hair basic  Page Loads Successfully");
		test.log(LogStatus.INFO, " Hair basic   Page load Test is intiated");
		test.log(LogStatus.INFO," Hair basic   Page Loads Successfully");
		pharmeasy_labtests.Hairfall_basic().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String actual="https://pharmeasy.in/diagnostics/packages/hair-fall-screening-1629";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Hair basic page loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Hair basic page is not loaded properly");
		}
		assertEquals(actual,url);
	}
	
	
	@Test(priority=25)
	public void Hairbasicbook_healthpackagemodule() throws InterruptedException
	{
		test=extent.startTest("Verify Hair basic appointment   book  Successfully");
		test.log(LogStatus.INFO, "Hair basic appointment   bookis intiated");
		test.log(LogStatus.INFO,"Hair basic appointment   book Successfully");
		pharmeasy_labtests.Hairfall_basicbook().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String actual="https://pharmeasy.in/diagnostics/packages/hair-fall-screening-1629";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Lab Test page loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Lab Test page is not loaded properly");
		}
		assertEquals(actual,url);
	}
	
	@Test(priority=26)
	public void Hairbasicpatient_healthpackagemodule() throws InterruptedException
	{
		test=extent.startTest("Verify Hair basic patient quantity selected Successfully");
		test.log(LogStatus.INFO, "Hair basic patient quantity selected is intiated");
		test.log(LogStatus.INFO,"Hair basic patient quantity selected Successfully");
		pharmeasy_labtests.Hairfall_basicpatient().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String actual="https://pharmeasy.in/diag-pwa/cart";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Hair basic patient quantity is selected  properly");
		}
		else {
			test.log(LogStatus.FAIL, "Hair basic patient quantity is not  selected properly");
		}
		
		assertEquals(actual,url);
	}
	
	@Test(priority=27)
	public void Cart_labtestmodule() throws InterruptedException
	{
		test=extent.startTest("Verify whether Cart summary display Successfully");
		test.log(LogStatus.INFO, "Cart summary display is intiated");
		test.log(LogStatus.INFO,"Cart summary display Successfully");
		String text=pharmeasy_labtests.Cart_Summary().getText();
		System.out.println("The lab test cart  summary= "+text);
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String actual="https://pharmeasy.in/diag-pwa/cart";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Cart summary display properly");
		}
		else {
			test.log(LogStatus.FAIL, "Cart summary is not display properly");
		}
		
		assertEquals(actual,url);
	}
	
	@Test(priority=28)
	public void Detailsproduct1_labtestmodule() throws InterruptedException
	{
		test=extent.startTest("Verify whether Lab test cart page Loads Successfully");
		test.log(LogStatus.INFO, " Lab test cart  Page load Test is intiated");
		test.log(LogStatus.INFO," Lab test cart  Page Loads Successfully");
		String text=pharmeasy_labtests.Uploadprescription_labtest().getText();
		System.out.println("The lab test cart details1= "+text);
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		String actual="https://pharmeasy.in/diag-pwa/cart";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, " Lab test cart  page loaded properly");
		}
		else {
			test.log(LogStatus.FAIL, "Lab test cart page is not loaded properly");
		}
		
		assertEquals(actual,url);
	}
	
	@Test(priority=29)
	public void  Deatilsproduct2_labtestmodule() throws InterruptedException
	{
		test=extent.startTest("Verify whether Cart product deatils visible Successfully");
		test.log(LogStatus.INFO, " Cart product deatils intiated");
		test.log(LogStatus.INFO," Cart product deatils visible Successfully");
		String text=pharmeasy_labtests.Gallery().getText();
		System.out.println("The lab test cart details= "+text);
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String actual="https://pharmeasy.in/diag-pwa/cart";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "  Cart product deatils visible properly");
		}
		else {
			test.log(LogStatus.FAIL, "  Cart product deatils is not  visible properly");
		}
		
		assertEquals(actual,url);
	}
	
	@Test(priority=29)
	public void  Deatilsproduct3_labtestmodule() throws InterruptedException
	{
		test=extent.startTest("Verify whether Cart product deatils visible Successfully");
		test.log(LogStatus.INFO, " Cart product deatils intiated");
		test.log(LogStatus.INFO," Cart product deatils visible Successfully");
		String text=pharmeasy_labtests.Cart_Hairfall().getText();
		System.out.println("The lab test cart details3= "+text);
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		String actual="https://pharmeasy.in/diag-pwa/cart";
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "  Cart product deatils visible properly");
		}
		else {
			test.log(LogStatus.FAIL, "  Cart product deatils is not  visible properly");
		}
		
		assertEquals(actual,url);
	}
	
	@AfterSuite
	public void close()
	{
		terminate();
	}
}
