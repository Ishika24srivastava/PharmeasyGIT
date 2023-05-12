package test_method;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import test_base.PharmEasy_base;
import test_page.PharmEasy_page;

public class PharmEasy_medicine1module extends PharmEasy_base{
	
	PharmEasy_page pharmeasy_medicine;
	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 pharmeasy_medicine=new PharmEasy_page();
		 
	}
	
	@Test(priority=1)
	public void Medicine_module() throws InterruptedException
	{
		pharmeasy_medicine.Medicine_module().click();
		String title=driver.getTitle();
		Thread.sleep(2000);
		System.out.println(title);
		Assert.assertEquals(title,"💊 Online Medicine Order - Buy Medicines Online with Discount | PharmEasy");
	}
	
	@Test(priority=15,enabled=false)
	public void Order_Medicine() throws InterruptedException
	{
		pharmeasy_medicine.Order_medicine().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println("The given url = "+url);
	}
	
	@Test(priority=2,enabled=false)
	public void Callon_Medicine() throws InterruptedException
	{
		pharmeasy_medicine.Call_on().click();;
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println("The given url = "+url);
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order");
	}
	@Test(priority=3)
	public void Offer_Medicine() throws InterruptedException
	{
		pharmeasy_medicine.Offer_medicine().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/offers/flat-15-off-rs-300-off-on-medicine-order--11364");
	}
	@Test(priority=4)
	public void Copycodeoffer_Medicine() throws InterruptedException
	{
		pharmeasy_medicine.Copy_Code().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println("The given url = "+url);
	}
	@Test(priority=5)
	public void Offer_leftscroll() throws InterruptedException
	{
		pharmeasy_medicine.Offer_leftscroll().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order");
	}
	@Test(priority=6)
	public void Offerrightscroll_Medicine() throws InterruptedException
	{
		pharmeasy_medicine.Offer_rightscroll().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order");
	}
	
	@Test(priority=7)
	public void Secondscroll_medicine() throws InterruptedException
	{
		pharmeasy_medicine.Second_Scroll().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order");
		
	}
	
	@Test(priority=8)
	public void Whatcustomersay_medicine() throws InterruptedException
	{
		String text= pharmeasy_medicine.What_customers().getText();
		System.out.println("The text under What Customer to say = "+text);
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order");
		
	}
	@Test(priority=9)
	public void Indias1_medicine() throws InterruptedException
	{
		String text= pharmeasy_medicine.Indias1_medicine().getText();
		System.out.println("The text under Indias1 medicine  to say = "+text);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order");
		
	}
	@Test(priority=10)
	public void Online_medicine() throws InterruptedException
	{
		String text= pharmeasy_medicine.Online_medicinetext().getText();
		System.out.println("The text under Indias1 medicine  to say = "+text);
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order");
		
	}
	
	@Test(priority=11)
	public void Order_medicine() throws InterruptedException
	{
		String text= pharmeasy_medicine.Order_medicinetext().getText();
		System.out.println("The text under Order medicine  to say = "+text);
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order");
		
	}
	
	@Test(priority=11)
	public void Question1_medicine() throws InterruptedException
	{
		pharmeasy_medicine.Is_buying().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order");
		
	}
	@Test(priority=12)
	public void Medicine_homedelivery() throws InterruptedException
	{
		String text= pharmeasy_medicine.Chose_homedelivery().getText();
		System.out.println("The text under Order medicine  to say = "+text);
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order");
		
	}
	
	@Test(priority=13)
	public void Question4_medicine() throws InterruptedException
	{
		pharmeasy_medicine.Discount_cashbacks().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order");
		
	}
	
	@Test(priority=14)
	public void Cancel_order() throws InterruptedException
	{
		String text= pharmeasy_medicine.Cancel_order().getText();
		System.out.println("The text under Order medicine  to say = "+text);
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order");
		
	}
	
	@Test(priority=15)
	public void Recived_order() throws InterruptedException
	{
		pharmeasy_medicine.Reciver_order().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order");
		driver.navigate().back();
	}
	
	@AfterSuite
	public void close()
	{
		terminate();
	}
	
	
	
	

}
