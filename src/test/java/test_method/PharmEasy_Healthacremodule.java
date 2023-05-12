package test_method;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

public class PharmEasy_Healthacremodule extends PharmEasy_base{

	PharmEasy_page Pharmeasyhealthcare;
	public ExtentTest test;
	public ExtentReports extent;
	String actual;
	String url;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		Pharmeasyhealthcare=new PharmEasy_page();
	}
	
	
	
	@BeforeTest
	public void x() 
	{
		
		extent=new ExtentReports("C:\\Users\\isrivastava\\eclipse-workspace\\Pharmeasy_application\\EXTENT_REPORT\\Report.html",true);	
	}
	
	@AfterTest
	public void y() 
	{
		extent.endTest(test);
		extent.flush();
	}
	
	@Test(priority=1)
	public void Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether  Health care  Page Loads Successfully");
		test.log(LogStatus.INFO, "Health care  Page load Test is intiated");
		test.log(LogStatus.INFO,"Health care  Page Loads Successfully");
		Pharmeasyhealthcare.Health_Care().click();
		Thread.sleep(1000);
		url=driver.getCurrentUrl();
		actual="https://pharmeasy.in/health-care?src=homecard";
		assertEquals(actual,url);
	}
	
	
	@Test(priority=2)
	public void Topcare_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether Top care  Page Loads Successfully");
		test.log(LogStatus.INFO, "Top care  Page load Test is intiated");
		test.log(LogStatus.INFO,"Top care  Page Loads Successfully");
		Pharmeasyhealthcare.Top_product().click();
		Thread.sleep(1000);
		 url=driver.getTitle();
		actual="Buy Top Products Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	@Test(priority=3)
	public void Diabetic_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether Diabetic care radio button click Successfully");
		test.log(LogStatus.INFO, "Diabetic care radio button click is intiated");
		test.log(LogStatus.INFO,"Diabetic care radio button click Successfully");
		Pharmeasyhealthcare.Dibatetic_care().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Buy Top Products Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	@Test(priority=4)
	public void Everherb_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether Ever herb  radio button click Successfully");
		test.log(LogStatus.INFO, "Ever herb radio button click is intiated");
		test.log(LogStatus.INFO,"Ever herb radio button click Successfully");
		Pharmeasyhealthcare.Ever_herb().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Buy Top Products Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	@Test(priority=5)
	public void Pharmeasy_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether Pharmeasy radio button click Successfully");
		test.log(LogStatus.INFO, "Pharmeasy radio button click is intiated");
		test.log(LogStatus.INFO,"Diabetic care radio button click Successfully");
		Pharmeasyhealthcare.Pharmeasy().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Buy Top Products Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	@Test(priority=6)
	public void Popularity_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether Popularity drop down button click Successfully");
		test.log(LogStatus.INFO, "Popularity drop down button  click is intiated");
		test.log(LogStatus.INFO,"Popularity drop down button click Successfully");
		Pharmeasyhealthcare.Price().click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//li[text()='Price low to high']"));
		ac.moveToElement(w1);
		w1.click();
		Thread.sleep(3000);
		url=driver.getTitle();
		actual="Buy Top Products Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	@Test(priority=7)
	public void All_categories_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether All categories page load Successfully");
		test.log(LogStatus.INFO, " All categories page load is intiated");
		test.log(LogStatus.INFO," All categories page load Successfully");
		Pharmeasyhealthcare.All_categories().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Upto 80% OFF: Buy Healthcare & Wellness Products Online | PharmEasy";
		assertEquals(actual,url);
	}
	
		
	
	@Test(priority=8)
	public void Mostloved_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether All categories page load Successfully");
		test.log(LogStatus.INFO, " All categories page load is intiated");
		test.log(LogStatus.INFO," All categories page load Successfully");
		Pharmeasyhealthcare.Most_loved().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Buy Most Loved Brands Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}

	
	@Test(priority=9)
	public void Mostlovedpopularity_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether Popularity drop down button click Successfully");
		test.log(LogStatus.INFO, "Popularity drop down button  click is intiated");
		test.log(LogStatus.INFO,"Popularity drop down button click Successfully");
		Pharmeasyhealthcare.Mostloved_popularity().click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//li[text()='Discount']"));
		ac.moveToElement(w1);
		w1.click();
		Thread.sleep(3000);
		url=driver.getTitle();
		actual="Buy Most Loved Brands Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}

	
	@Test(priority=10)
	public void All_categoriesback_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether All categories page load Successfully");
		test.log(LogStatus.INFO, " All categories page load is intiated");
		test.log(LogStatus.INFO," All categories page load Successfully");
		Pharmeasyhealthcare.All_categories().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Upto 80% OFF: Buy Healthcare & Wellness Products Online | PharmEasy";
		assertEquals(actual,url);
	}
	
	
	
	
	@Test(priority=11)
	public void Personalcare_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether Personal care  page load Successfully");
		test.log(LogStatus.INFO, " Personal care  page load is intiated");
		test.log(LogStatus.INFO,"  Personal care  page load Successfully");
		Pharmeasyhealthcare.Personal_care().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Buy Personal Care Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	@Test(priority=12)
	public void Appliacnes_Personalcare_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether Appliacnes radio button click Successfully");
		test.log(LogStatus.INFO, "Appliacnesradio button click is intiated");
		test.log(LogStatus.INFO,"Appliacnes radio button click Successfully");
		Pharmeasyhealthcare.Applicanes().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Buy Personal Care Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	@Test(priority=13)
	public void Oralcare_Personalcare_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether Oral care radio button click Successfully");
		test.log(LogStatus.INFO, " Oral careradio button click is intiated");
		test.log(LogStatus.INFO," Oral care radio button click Successfully");
		Pharmeasyhealthcare.Oral_care().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Buy Personal Care Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	@Test(priority=14)
	public void Anchor_Personalcare_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether Anchor radio button click Successfully");
		test.log(LogStatus.INFO, " Anchor radio button click is intiated");
		test.log(LogStatus.INFO," Anchor radio button click Successfully");
		Pharmeasyhealthcare.Anchor().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Buy Personal Care Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	@Test(priority=15)
	public void Brand_Personalcare_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether 3m radio button click Successfully");
		test.log(LogStatus.INFO, " 3m radio button click is intiated");
		test.log(LogStatus.INFO," 3m radio button click Successfully");
		Pharmeasyhealthcare.Brand_pc().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Buy Personal Care Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	@Test(priority=16)
	public void Popularitypc_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether Popularity drop down button click Successfully");
		test.log(LogStatus.INFO, "Popularity drop down button  click is intiated");
		test.log(LogStatus.INFO,"Popularity drop down button click Successfully");
		Pharmeasyhealthcare.Popularity_pc().click();
		Thread.sleep(1000);
		Actions ac=new Actions(driver);
		WebElement w1=driver.findElement(By.xpath("//li[text()='Price high to low']"));
		ac.moveToElement(w1);
		w1.click();
		Thread.sleep(3000);
		url=driver.getTitle();
		actual="Buy Personal Care Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	@Test(priority=17)
	public void All_categoriesReback_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether All categories page load Successfully");
		test.log(LogStatus.INFO, " All categories page load is intiated");
		test.log(LogStatus.INFO," All categories page load Successfully");
		Pharmeasyhealthcare.Healthecare().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Upto 80% OFF: Buy Healthcare & Wellness Products Online | PharmEasy";
		assertEquals(actual,url);
	}
	@Test(priority=18)
	public void Fitness_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether Fitness supplements page load Successfully");
		test.log(LogStatus.INFO, "  Fitness supplements page load is intiated");
		test.log(LogStatus.INFO," Fitness supplements load Successfully");
		Pharmeasyhealthcare.Fitness_supplemnets().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Buy Fitness Supplements Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	@Test(priority=19)
	public void   Viewmore_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether view more button visible  Successfully");
		test.log(LogStatus.INFO, " view more button visible intiated");
		test.log(LogStatus.INFO," view more button visible Successfully");
		Pharmeasyhealthcare.View_more1().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Buy Fitness Supplements Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	@Test(priority=20)
	public void Specialitysupplements_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether  Specialty supplements radio button visible  Successfully");
		test.log(LogStatus.INFO, " Specialty supplements radio button visible intiated");
		test.log(LogStatus.INFO," Specialty supplements radio button visible Successfully");
		Pharmeasyhealthcare.Speciality_supplemnets().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Buy Fitness Supplements Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	@Test(priority=21)
	public void Apply_Healthcare_module() throws InterruptedException
	{
		test=extent.startTest("Verify whether  Apply button visible  Successfully");
		test.log(LogStatus.INFO, "Apply button visible intiated");
		test.log(LogStatus.INFO," Apply button visible Successfully");
		Pharmeasyhealthcare.Apply().click();
		Thread.sleep(1000);
		url=driver.getTitle();
		actual="Buy Fitness Supplements Online & Get Upto 60% OFF at PharmEasy";
		assertEquals(actual,url);
	}
	
	
	@AfterMethod
	public void run()
	{
		if(actual.equals(url)) {
			test.log(LogStatus.PASS, "Pages as well as functionality work properly");
		}
		else {
			test.log(LogStatus.FAIL, "Pages as well as functionality is not work  properly");
		}
	}
	@AfterSuite
	public void close()
	{
		terminate();
	}
}
