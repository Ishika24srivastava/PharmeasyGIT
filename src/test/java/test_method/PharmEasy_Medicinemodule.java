package test_method;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import test_base.PharmEasy_base;
import test_page.PharmEasy_page;

public class PharmEasy_Medicinemodule  extends PharmEasy_base{
	
	PharmEasy_page pharmeasy_medicinemodule;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 pharmeasy_medicinemodule=new PharmEasy_page();
		 
	}
	
	
	
	@Test(priority=1)
	public void Medicine_module() throws InterruptedException
	{
		pharmeasy_medicinemodule.Medicine_module().click();
		String title=driver.getTitle();
		Thread.sleep(2000);
		System.out.println(title);
		Assert.assertEquals(title,"💊 Online Medicine Order - Buy Medicines Online with Discount | PharmEasy");
	}
	
	@Test(priority=2,enabled=false)
	public void Search_module() throws InterruptedException
	{
		pharmeasy_medicinemodule.Search_Medicinemodule().click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"💊 Online Medicine Order - Buy Medicines Online with Discount | PharmEasy");
		
	}
	
	@Test(priority=3)
	public void Order_Prescription() throws InterruptedException
	{
		pharmeasy_medicinemodule.Order_Prescription().click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	
	
	@Test(priority=4)
	public void Upload_Prescription() throws InterruptedException
	{
		
		pharmeasy_medicinemodule.Upload().sendKeys("C:\\Users\\isrivastava\\Documents\\Prescription.png");
		Thread.sleep(3000);
		System.out.println("file successgfully ");
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/upload-prescription?trigger_upload=true");
	}
	
	@Test(priority=5)
	public void Boxfirst_order() throws InterruptedException
	{
		String text= pharmeasy_medicinemodule.First_boxtext().getText();
		System.out.println("The text present at first box= "+text);
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Online Medicine Order - Buy Medicines Online with Discount in India at PharmEasy.in");
	}
	
	@Test(priority=6)
	public void Login() throws InterruptedException
	{
		pharmeasy_medicinemodule.Login().click();;
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Online Medicine Order - Buy Medicines Online with Discount in India at PharmEasy.in");
	}
	
	@Test(priority=7)
	public void Mobile_number()
	{
		pharmeasy_medicinemodule.Mobile_no().sendKeys("8533904286");
		String title=driver.getTitle();
		Assert.assertEquals(title,"Online Medicine Order - Buy Medicines Online with Discount in India at PharmEasy.in");
	}
	
	@Test(priority=8)
	public void Send_otp() throws InterruptedException
	{
		pharmeasy_medicinemodule.Send_otp().click();
		Thread.sleep(5000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Online Medicine Order - Buy Medicines Online with Discount in India at PharmEasy.in");
	}
	
	@Test(priority=9)
	public void Continue() throws InterruptedException
	{
		Thread.sleep(1000);
		pharmeasy_medicinemodule.Continue_login().click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Online Medicine Order - Buy Medicines Online with Discount in India at PharmEasy.in");
	}
	
	@Test(priority=10,enabled =false)
	public void Prescriptions_fromPharmeasy() throws InterruptedException
	{
		pharmeasy_medicinemodule.Prescription_pharmeasy().click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Online Medicine Order - Buy Medicines Online with Discount in India at PharmEasy.in");
		
	}
	
	@Test(priority=11,enabled =false)
	public void Prescriptions_fromPharmeasy_uploadimage() throws InterruptedException
	{
		pharmeasy_medicinemodule.Upload_image().click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Online Medicine Order - Buy Medicines Online with Discount in India at PharmEasy.in");
		
	}
	
	@Test(priority=12)
	public void Uploaded_prescription() throws InterruptedException
	{
		pharmeasy_medicinemodule.Uploaded_prescription().click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Online Medicine Order - Buy Medicines Online with Discount in India at PharmEasy.in");
	}
	
	@Test(priority=13,enabled =false)
	public void Uploaded_image2() throws InterruptedException
	{
		pharmeasy_medicinemodule.Upload_image2().click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Online Medicine Order - Buy Medicines Online with Discount in India at PharmEasy.in");
	}
	
	@Test(priority=14,enabled =false)
	public void Secondtext_box()
	{
		String text=pharmeasy_medicinemodule.Second_text().getText();
		System.out.println("The text under second box= "+text);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Online Medicine Order - Buy Medicines Online with Discount in India at PharmEasy.in");
	}
	
	
	
	@AfterSuite
	public void close()
	{
		terminate();
	}

}
