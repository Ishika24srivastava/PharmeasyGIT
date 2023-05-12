package test_method;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import test_base.PharmEasy_base;
import test_page.PharmEasy_page;

public class PharmEasy_Homepage extends PharmEasy_base{
	
	PharmEasy_page pharmhomepage;

	
	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		
		intilization();
		 pharmhomepage=new PharmEasy_page();
		 
	}
	
	@Test(priority=1,enabled=false)
	public void Search_bar() throws InterruptedException
	{
		
		pharmhomepage.Search_bar().click();
		pharmhomepage.Search_bar().sendKeys("shampoo");
		Thread.sleep(1000);
		pharmhomepage.Search_bar().sendKeys(Keys.ENTER);
		
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Order SHAMPOO Online - PharmEasy");
		
	}
	
	@Test(priority=2)
	public void Medicine() throws InterruptedException
	{
		pharmhomepage.Medicine().click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		System.out.println(url);
		Assert.assertEquals(url,"💊 Online Medicine Order - Buy Medicines Online with Discount | PharmEasy");
		//driver.navigate().back();
	}
	
	@Test(priority=3)
	public void Health_care() throws InterruptedException
	{
		pharmhomepage.Healthecare().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/health-care?src=header");
	}
	@Test(priority=4)
	public void LabTests() throws InterruptedException
	{
		pharmhomepage.LabTests();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/health-care?src=header");
		driver.navigate().back();
	}
	@Test(priority=5)
	public void Offers() throws InterruptedException
	{
		pharmhomepage.Offers().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/offers?src=header");
		driver.navigate().back();
	}
	@Test(priority=6)
	public void Plus() throws InterruptedException
	{
		pharmhomepage.Plus().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/plus?src=header");
		driver.navigate().back();
	}
	@Test(priority=7)
	public void Health_blog() throws InterruptedException
	{
		pharmhomepage.HealthBlogs().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/blog/");
		driver.navigate().back();
		
	}
	
	@Test(priority=8)
	public void Search_medicine() throws InterruptedException
	{
		pharmhomepage.Search_medicine().click();
		pharmhomepage.Search_medicine().sendKeys("Benadryl");
		Thread.sleep(2000);
		pharmhomepage.Search_medicine().sendKeys(Keys.ENTER);
		
		String s=driver.getCurrentUrl();
		System.out.println(s);
		Assert.assertEquals(s,"https://pharmeasy.in/search/all?name=Benadryl");
	}
	
	@Test(priority=9)
	public void Benadryl_search() throws InterruptedException
	{
		pharmhomepage.Bendaryl().click();
		String title=driver.getTitle();
		Thread.sleep(2000);
		System.out.println(title);
		Assert.assertEquals(title,"Benadryl Cough Formula Bottle Of 150ml Syrup: Uses, Side Effects, Price & Dosage | PharmEasy");
	}
	
	@Test(priority=10)
	public void Add_cart() throws InterruptedException
	{
		pharmhomepage.Add_cart().click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Benadryl Cough Formula Bottle Of 150ml Syrup: Uses, Side Effects, Price & Dosage | PharmEasy");
		
	}
	
	@Test(priority=11)
	public void Quantity() throws InterruptedException
	{
		pharmhomepage.Quantity().click();
		Thread.sleep(2000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order/benadryl-cough-formula-bottle-of-150ml-syrup-37060");
	}
	
	@Test(priority=12)
	public void Cofsils() throws InterruptedException
	{
		pharmhomepage.Cofsils().click();
		Thread.sleep(2000);
		String url=driver.getTitle();
		System.out.println(url);
		Assert.assertEquals(url,"Buy COFSILS ORANGE LOZENGES STRIP OF 10 Online & Get Upto 60% OFF at PharmEasy");
	}
	
	@Test(priority=13)
	public void Flavour() throws InterruptedException
	{
		pharmhomepage.Flavour().click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		
		Assert.assertEquals(title,"Buy COFSILS GINGER LEMON LOZENGES STRIP OF 10 Online & Get Upto 60% OFF at PharmEasy");
	}
	
	@Test(priority=14)
	public void Add_cartCofsils() throws InterruptedException
	{
		pharmhomepage.Cart_Cofsils().click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		Assert.assertEquals(title,"Buy COFSILS GINGER LEMON LOZENGES STRIP OF 10 Online & Get Upto 60% OFF at PharmEasy");
		
	}
	
	@Test(priority=15)
	public void Quantity_Cofsils() throws InterruptedException
	{
		pharmhomepage.Quantity_Cofsils().click();
		Thread.sleep(2000);
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title,"Buy COFSILS GINGER LEMON LOZENGES STRIP OF 10 Online & Get Upto 60% OFF at PharmEasy");
	}
	
	@Test(priority=16)
	public void Home_page() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='ClickableElement_clickable__ItKj2 Logo_container__F7rHL']")).click();
		String title=driver.getTitle();
		Thread.sleep(2000);
		System.out.println(title);
		Assert.assertEquals(title,"PharmEasy: Online Pharmacy & Medical Store in India | 50 Lakhs+ Customers.");
	}
	
	@Test(priority=17)
	public void Main_banner1() throws InterruptedException
	{
		pharmhomepage.Main_banner1().click();
		Thread.sleep(3000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/online-medicine-order?src=header");
		driver.navigate().back();
	}
	
	@Test(priority=18,enabled=false)
	public void Main_banner2() throws InterruptedException
	{
		pharmhomepage.Main_banner2().click();
		Thread.sleep(3000);
		String url=driver.getTitle();
		System.out.println(url);
		Assert.assertEquals(url,"PharmEasy: Online Pharmacy & Medical Store in India | 50 Lakhs+ Customers.");
		
		driver.navigate().back();
	}
	
	@Test(priority=19)
	public void Full_Bodycheckups() throws InterruptedException
	{
		pharmhomepage.Full_body().click();
		Thread.sleep(1000);
		String url=driver.getTitle();
		//Assert.assertEquals(url,"Book Comprehensive Full Body Checkup with Vitamin D & B12, get free Sample Collection | PharmEasy");
		driver.navigate().back();
	}
	
	@Test(priority=20)
	public void Vitamins() throws InterruptedException
	{
		pharmhomepage.Vitamins().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/diagnostics/diag_collection/?id=34&title=Vitamins");
		driver.navigate().back();
	}
	
	@Test(priority=21)
	public void Diabetes() throws InterruptedException
	{
		pharmhomepage.Diabetes().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/diagnostics/diag_collection/?id=46&title=Diabetes");
		driver.navigate().back();
	}
	
	@Test(priority=22)
	public void Thyroid() throws InterruptedException
	{
		pharmhomepage.Thyroid().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		Assert.assertEquals(url,"https://pharmeasy.in/diagnostics/diag_collection?id=48&title=Thyroid");
		driver.navigate().back();
	}
	
	@Test(priority=23)
	public void Women_care() throws InterruptedException
	{
		pharmhomepage.Women_care().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/diagnostics/diag_collection/?id=49&title=Women%20Care");
		driver.navigate().back();
	}
	
	@Test(priority=24)
	public void Covid_care() throws InterruptedException
	{
		pharmhomepage.Covid_care().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/diagnostics/diag_collection/?id=45&title=Covid%20Care");
		driver.navigate().back();
	}
	@Test(priority=25)
	public void Fever_infection() throws InterruptedException
	{
		pharmhomepage.Fever().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/diagnostics/diag_collection?id=62");
		driver.navigate().back();
	}
	
	@Test(priority=26)
	public void Offer_justforyou() throws InterruptedException
	{
		pharmhomepage.Offer().click();
		Thread.sleep(1000);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		Assert.assertEquals(url,"https://pharmeasy.in/offers/flat-15-off-rs-300-off-on-medicine-order--11364");
		//driver.navigate().back();
		
	}
	
	@Test(priority=27)
	public void Copy_Code() throws InterruptedException
	{
		pharmhomepage.Copy_code().click();
		Thread.sleep(1000);
		String title=driver.getTitle();
		System.out.println(title);
		
	}
	
	
	@AfterSuite
	public void close()
	{
		terminate();
	}
	
	

}
