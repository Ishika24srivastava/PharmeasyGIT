package test_page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import test_base.PharmEasy_base;

public class PharmEasy_page extends PharmEasy_base
{
	@FindBy(xpath="//span[text()='Select Pincode']")
	WebElement deliver;
	
	@FindBy(xpath="//input[@placeholder='Enter PIN Code']")
	WebElement pin;
	
	@FindBy(xpath="//span[text()='Check']")
	WebElement check;
	
	@FindBy(xpath="//span[text()='Hello, Log in']")
	WebElement sign_in;
	
	@FindBy(xpath="//input[@placeholder='Enter your phone number']")
	WebElement mobile;
	
	@FindBy(xpath="//span[text()='Send OTP']")
	WebElement otp;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement  Continue;
	
	@FindBy(xpath="//a[@aria-label='login']")
	WebElement user;
	
	@FindBy(xpath="//span[text()='Logout']")
	WebElement Logout;
	
	@FindBy(xpath="//span[text()='Medicine']")
	WebElement Medicine;
	
	@FindBy(xpath="//a[text()='Healthcare']")
	WebElement Healthcare;
	
	@FindBy(xpath="//span[text()='Lab Tests']")
	WebElement LabTests;
	
	@FindBy(xpath="//a[@class='Navbar_offers__4jaMq']/span[text()='Offers']")
	WebElement Offers;
	
	@FindBy(xpath="//span[text()='PLUS']")
	WebElement Plus;
	
	@FindBy(xpath="//span[text()='Health Blogs']")
	WebElement Health_blogs;
	
	@FindBy(xpath="//input[@id='topBarInput']")
	WebElement searchbar;
	
	@FindBy(xpath="//input[@placeholder='Search medicines/Healthcare products ']")
	WebElement search_medicine;
	
	@FindBy(xpath="//h1[text()='Benadryl Cough Formula Bottle Of 150ml Syrup']")
	WebElement bendaryl150ml;
	
	@FindBy(xpath="//button[text()='Add To Cart']")
	WebElement add_cart;
	
	@FindBy(xpath="//li[@data-value='1']")
	WebElement quantity_1;
	
	@FindBy(xpath="//div[text()='Cofsils Orange Lozenges Strip Of 10']")
	WebElement Cofsils;
	
	@FindBy(xpath="//span[text()='Ginger Lemon']")
	WebElement Ginger_lemon;
	
	@FindBy(xpath="//button[text()='Add To Cart']")
	WebElement add_cart1;
	
	@FindBy(xpath="//li[@data-value='3']")
	WebElement Cofsils_3;
	
	@FindBy(xpath="//div[@id='MainBanner-1']")
	WebElement Banner1;
	
	@FindBy(xpath="//div[@id=\"MainBanner-2\"]")
	WebElement Banner2;
	
	@FindBy(xpath="//img[@alt='Health Checkups']")
	WebElement Full_bodycheckup;
	
	@FindBy(xpath="//img[@alt='Vitamins_PharmaHP']")
	WebElement Vitamins;
	
	@FindBy(xpath="//img[@alt='Diabetes Tests_PharmaHP']")
	WebElement Diabetes;
	
	@FindBy(xpath="//img[@alt='Thyroid_PharmaHP']")
	WebElement Thyroid;
	
	@FindBy(xpath="//img[@alt='Women Care_PharmaHP']")
	WebElement Women_care;
	
	@FindBy(xpath="//img[@alt='Covid Care Tests_PharmaHP']")
	WebElement covid ;
	
	@FindBy(xpath="//img[@alt='Fever Infection_PharmaHP']")
	WebElement Fever;
	
	@FindBy(xpath="//div[@class='c-PJLV c-bXbWpx c-bXbWpx-joLzpF-justify-center c-bXbWpx-joJbDg-align-center c-bXbWpx-ikZFsNO-css']")
	WebElement Scroll;
	
	@FindBy(xpath="//span[text()='Flat 15% OFF + Rs. 300 OFF on medicine order.']")
	WebElement Offers_flatoff;
	
	@FindBy(xpath="//div[2][@class='c-PJLV c-bXbWpx c-bXbWpx-joLzpF-justify-center c-bXbWpx-joJbDg-align-center c-bXbWpx-icuuuRQ-css']")
	WebElement Paymentoffer_scroll;
	
	
	@FindBy(xpath="//button[text()='COPY CODE']")
	WebElement copy_code;
	
	@FindBy(xpath="//input[@placeholder='Search for medicines/healthcare products']")
	WebElement Search_medicine;
	
	@FindBy(xpath="//h1[text()='Crocin Advance 500mg Strip Of 20 Tablets']")
	WebElement Crocine;
	
	@FindBy(xpath="//button[text()='Add To Cart']")
	WebElement Addcart;
	
	@FindBy(xpath="//li[@data-value='3']")
	WebElement Quantity;
	
	@FindBy(xpath="//input[@id='descriptionBy']")
	WebElement Description_crocine;
	
	@FindBy(xpath="//div[@class='DescriptionTable_descriptionTable__TRPw2']")
	WebElement Product_summary;
	
	
	@FindBy(xpath="//div[text()='Saridon Headache Relief Tablet- Strip Of 10 Tablets']")
	WebElement Saridon;
	
	@FindBy(xpath="//button[text()='Add To Cart']")
	WebElement Add_saridon;
	
	@FindBy(xpath="//li[@data-value='9']")
	WebElement Quantity_saridon;
	
	@FindBy(xpath="//span[text()='View Cart']")
	WebElement view_cart;
	
	@FindBy(xpath="//div[@class='style_totalText__FF8Tn']")
	WebElement Cart_total;
	
	@FindBy(xpath="//div[@class='OffersSection_offerPromoCode__V8ecp']")
	WebElement Apply_coupons;
	
	@FindBy(xpath="(//div[text()='APPLY'])[1]")
	WebElement  Apply_coupon1;
	
	@FindBy(xpath="//div[@class=\"AmountBifurcation_container__WTNVC\"]")
	WebElement Bill_summary;
	
	@FindBy(xpath="//span[@class='AmountBifurcation_finalValue__MkWUw AmountBifurcation_finalValueBold__r8tdR']")
	WebElement Amount;
	
	@FindBy(xpath="//div[@class='c-PJLV c-bXbWpx c-bXbWpx-iKkLkN-css'][1]")
	WebElement Medicine_module;
	
	@FindBy(xpath="//div[1]/h1[text()='Order Medicines Online']")
	WebElement Order_medicinetext;
	
	@FindBy(xpath="//input[@placeholder='Search medicines/Healthcare products ']")
	WebElement Search_medicinemodule;
	
	@FindBy(xpath="//div[text()='Order via Prescription']")
	WebElement Order_prescription;
	
	@FindBy(xpath="//input[@type='file']")
	WebElement Upload;
	
	@FindBy(xpath="//div[@class='_1bL9f']")
	WebElement First_boxtext;
	
	@FindBy(xpath="//span[text()='Login / Signup']")
	WebElement Login;
	
	@FindBy(xpath="//input[@id='mobileNoInput']")
	WebElement Mobile_no;
	
	@FindBy(xpath="//button[text()='Send OTP']")
	WebElement Send_otp;
	
	@FindBy(xpath="//button[@id='otpSubmitBtn']")
	WebElement Continue_login;
	
	@FindBy(xpath="//div[@id='content-container']//div[3]//div[2]/div/div")
	WebElement Prescription_Pharmeasy;
	
	@FindBy(xpath="//button[text()='Upload Image']")
	WebElement Upload_image;
	
	@FindBy(xpath="(//div[@class='_3BQZT'])[3]")
	WebElement Uploaded_prescription;
	
	@FindBy(xpath="//button[text()='Upload Image']")
	WebElement Upload_image1;
	
	@FindBy(xpath="//div[@class='_2PukA']")
	WebElement Second_box;
	
	@FindBy(xpath="//a[@activeclassname='_1__6M']")
	WebElement Order_medicine;
	
	@FindBy(xpath="//a[@class='OrderMedicine_oocCTA__Vzmyb']")
	WebElement Call_on;
	
	@FindBy(xpath="(//div[text()='Flat 15% OFF + Rs. 300 OFF on medicine order.'])[1]")
	WebElement Offer_off;
	
	@FindBy(xpath="(//div[@class='CustomCarousel_navigation__jVgyO OrderMedicine_navigation__JFo17 OrderMedicine_prev__z0Swh'])[1]")
	WebElement Offer_leftscroll;
	
	@FindBy(xpath="(//div[@class=\"CustomCarousel_navigation__jVgyO CustomCarousel_next__alsJf OrderMedicine_navigation__JFo17 OrderMedicine_next__c0q16\"])[1]")
	WebElement Offer_rightscroll;
	
	@FindBy(xpath="//button[text()='Copy Code & Proceed']")
	WebElement Copy_code;
	
	@FindBy(xpath="(//div[@class='CustomCarousel_navigation__jVgyO OrderMedicine_navigation__JFo17 OrderMedicine_prev__z0Swh'])[2]")
	WebElement Second_scroll;
	
	@FindBy(xpath="//div[@class='Testimonials_container__VNwfL OrderMedicine_mainContainer__Xqd6H']")
	WebElement What_customersay;
	
	@FindBy(xpath="(//div[@class='TextWithHTML_text__icgVl'])[1]")
	WebElement Indias1_text;
	
	@FindBy(xpath="(//div[@class='TextWithHTML_text__icgVl'])[2]")
	WebElement Online_medicinetext;
	
	@FindBy(xpath="(//div[@class='TextWithHTML_text__icgVl'])[4]")
	WebElement Order_medicineonlinetext;
	
	@FindBy(xpath="//span[text()='✅ Is buying medicines online safe?']")
	WebElement Buying_medicneonline;
	
	@FindBy(xpath="(//div[@class='TextWithHTML_text__icgVl'])[6]")
	WebElement Medicine_homedelivery;
	
	@FindBy(xpath="//span[text()='✅ Do I get discounts/cashback while ordering medicines online with PharmEasy?']")
	WebElement Discounts_cashabcks;
	
	@FindBy(xpath="(//div[@class=\"TextWithHTML_text__icgVl\"])[13]")
	WebElement Cancelorder;
	
	@FindBy(xpath="//span[text()='✅ When will I receive my order?']")
	WebElement Reciverorder;
	
	@FindBy(xpath="//div[@class='_1NDUW _36b-x']")
	WebElement Deliver_to;
	
	@FindBy(xpath="//input[@placeholder='Enter PIN Code']")
	WebElement  Pin_enter;
	
	@FindBy(xpath="//button[text()='Check']")
	WebElement  Check;
	
	@FindBy(xpath="(//img[@class='_2dTMN'])[1]")
	WebElement  Scroll_left;
	
	@FindBy(xpath="(//img[@class='_36ZzE'])[1]")
	WebElement  Scroll_right;
	
	@FindBy(xpath="//input[@placeholder='Search for Tests/Packages/Labs']")
	WebElement Search_packages;
	
	
	@FindBy(xpath="//button[text()='Select']")
	WebElement Select;
	
	@FindBy(xpath="(//li[@id='patient-quantity'])[2]")
	WebElement Patients;
	
	@FindBy(xpath="//img[@alt='All Tests']")
	WebElement All_test;
	
	@FindBy(xpath="(//div[@class=\"_2tdEn _1pXi6 _2uX0L _1b_3-\"])[1]")
	WebElement Lipid_shoptest;
	
	@FindBy(xpath="//div[@class='_2tdEn _1pXi6 _1Hsar']")
	WebElement Cross;
	
	@FindBy(xpath="//div[text()='Renal/Kidney Function Test (RFT/KFT)']")
	WebElement Reanal_kidney;
	
	@FindBy(xpath="//div[@class='sc-f32db17d-0 sc-f93c7f36-1 jZbmSd iubnkX']")
	WebElement Reanal_kidneytext;
	
	@FindBy(xpath="//div[@class=\"sc-f32db17d-0 sc-f93c7f36-1 sc-bda545bc-5 jZbmSd fSFzjq jKiFqq\"]")
	WebElement Reanal_kidneydetails;
	
	@FindBy(xpath="//button[text()='Book Test']")
	WebElement Book_test;
	
	@FindBy(xpath="//div[@id='patient-1']")
	WebElement Reanal_kidneypatients;
	
	@FindBy(xpath="//a[text()='RTPCR']")
	WebElement RTPCR;
	
	
	@FindBy(xpath="//div[@id='_main-content']")
	WebElement  Covid_19;
	
	@FindBy(xpath="//div[@class='sc-c41f1331-6 caLNFq']")
	WebElement  Viewmore;
	
	@FindBy(xpath="//div[@id='overview']")
	WebElement  Overview;
	
	@FindBy(xpath="//div[@id='test_result_interpretation']")
	WebElement  Ranges;
	
	@FindBy(xpath="//img[@alt='Health Packages']")
	WebElement Health_packages;
	
	@FindBy(xpath="//div[text()='Hairfall Screening - Basic']")
	WebElement Hairfall_basic;
	
	@FindBy(xpath="//div[@class='sc-f32db17d-0 sc-f93c7f36-1 sc-bda545bc-5 jZbmSd fSFzjq jKiFqq']")
	WebElement Hairfall_basicdetails;
	
	@FindBy(xpath="//button[text()='Book Test']")
	WebElement Hairfall_basictestbook;
	
	@FindBy(xpath="//div[@id='patient-1']")
	WebElement Hairfall_basicpatient;
	
	@FindBy(xpath="(//div[@class='sc-3ad0a6d3-0 dvmeVR'])[1]")
	WebElement Cart_blood;
	
	@FindBy(xpath="(//div[@class='sc-3ad0a6d3-0 dvmeVR'])[2]")
	WebElement Cart_kidney;
	
	@FindBy(xpath="(//div[@class='sc-3ad0a6d3-0 dvmeVR'])[3]")
	WebElement Cart_Hairfall;
	
	@FindBy(xpath="//div[@id='cart-summary']")
	WebElement Cart_summary;
	
	@FindBy(xpath="//div[@id='discoverOfferings-3']")
	WebElement Health_care;
	
	@FindBy(xpath="//h2[text()='Top Products']")
	WebElement Top_products;
	
	@FindBy(xpath="//div[text()='Diabetic Care']")
	WebElement Diabetic_care;
	
	@FindBy(xpath="//div[text()='Pharmeasy']")
	WebElement Pharm_easy;
	
	@FindBy(xpath="//div[text()='Everherb']")
	WebElement Ever_herb;
	
	@FindBy(xpath="//div[@class='MuiFormControl-root Select_formControlContainer__QWbdr']")
	WebElement Popularity;
	
	@FindBy(xpath="//a[text()='All Categories']")
	WebElement All_categories;
	
	@FindBy(xpath="//img[@alt='Most Loved Brands']")
	WebElement Loved_brands;
	
	@FindBy(xpath="//div[text()='Popularity']")
	WebElement Loved_brandspopulairty;
	
	@FindBy(xpath="//img[@alt='Personal Care']")
	WebElement Personal_care;
	
	@FindBy(xpath="//div[@class='Sorter_sorterSelect__zfb9T']")
	WebElement Popularity_pc;
	
	@FindBy(xpath="(//span[@class='MuiIconButton-label'])[3]")
	WebElement Applicanes;
	
	@FindBy(xpath="(//span[@class='MuiIconButton-label'])[5]")
	WebElement Oral_care;
	
	@FindBy(xpath="(//span[@class='MuiIconButton-label'])[8]")
	WebElement Brand_pc;
	
	@FindBy(xpath="(//span[@class='MuiIconButton-label'])[10]")
	WebElement Brand_anchor;
	
	@FindBy(xpath="(//span[@class='MuiIconButton-label'])[14]")
	WebElement Price_pc;
	
	@FindBy(xpath="//h2[text()='Fitness Supplements']")
	WebElement Fitness;
	
	@FindBy(xpath="(//div[text()='View More'])[1]")
	WebElement view_more;
	
	@FindBy(xpath="(//div[text()='Speciality Supplements'])[2]")
	WebElement specialitysupplemnets;
	
	@FindBy(xpath="//button[text()='Apply']")
	WebElement Apply;
	
	@FindBy(xpath="//div[text()='Payment']")
	WebElement Payment;
	
	@FindBy(xpath="//div[text()='Medicine']")
	WebElement Medicine_off;
	
	@FindBy(xpath="//div[text()='Diagnostic']")
	WebElement Diagnostic;
	
	@FindBy(xpath="//div[text()='Healthcare']")
	WebElement Healtcare;
	
	@FindBy(xpath="//div[text()='Flat 15% OFF + Rs. 200 OFF']")
	WebElement Offer1;
	
	@FindBy(xpath="//button[text()='COPY CODE']")
	WebElement Code1;
	
	@FindBy(xpath="(//span[text()='Offers'])[2]")
	WebElement Offerback;
	
	@FindBy(xpath="//div[text()='Order medicines worth Rs.999 & get FLAT Rs.600 OFF on your first lab test']")
	WebElement Offer2;
	
	@FindBy(xpath="//div[text()='Get flat Rs.150 off on ICICI Debit & Credit cards']")
	WebElement Offer3;
	
	@FindBy(xpath="//table[@class='OfferTable_offerTable__8E_ux']")
	WebElement table;
	
	@FindBy(xpath="(//i[text()='Read More'])[2]")
	WebElement More;
	
	@FindBy(xpath="//span[text()='What are the latest offers & coupon codes applicable on PharmEasy?']")
	WebElement Offerq1;
	
	@FindBy(xpath="//span[text()='How to get updates about PharmEasy offers and discounts?']")
	WebElement Offerq2;
	
	@FindBy(xpath="//span[text()='How to cancel a coupon/promo code?']")
	WebElement Offerq3;
	
	
	
	
	
	
	public PharmEasy_page()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement Renal_kidney()
	{
		return Reanal_kidney;
	}
	public WebElement Offer1()
	{
		return Offer1;
	}
	public WebElement Code()
	{
		return Code1;
	}
	public WebElement Offerreback()
	{
		return Offerback;
	}
	public WebElement Offer2()
	{
		return Offer2;
	}
	public WebElement Offer3()
	{
		return Offer3;
	}
	public WebElement table()
	{
		return table;
	}
	public WebElement Offerq1()
	{
		return Offerq1;
	}
	public WebElement Offerq2()
	{
		return Offerq2;
	}
	public WebElement Offerq3()
	{
		return Offerq3;
	}
	public WebElement Readmore()
	{
		return More;
	}
	public WebElement Payment()
	{
		return Payment;
	}
	public WebElement Medicine_off()
	{
		return Medicine_off;
	}
	public WebElement Diagnostic()
	{
		return Diagnostic;
	}
	public WebElement Healthoffercare()
	{
		return Healtcare;
	}
	
	public WebElement Most_loved()
	{
		return Loved_brands;
	}
	
	public WebElement Brand_pc()
	{
		return Brand_pc;
	}
	public WebElement Anchor()
	{
		return Brand_anchor;
	}
	public WebElement Price_pc()
	{
		return Price_pc;
	}
	public WebElement Mostloved_popularity()
	{
		return Loved_brandspopulairty;
	}
	
	public WebElement Renal_kidneytext()
	{
		return Reanal_kidneytext;
	}
	
	public WebElement Oral_care()
	{
		return Oral_care;
	}
	
	public WebElement Applicanes()
	{
		return Applicanes;
	}
	
	public WebElement Personal_care()
	{
		return  Personal_care;
	}
	
	public WebElement Popularity_pc()
	{
		return Popularity_pc;
	}
	
	public WebElement Fitness_supplemnets()
	{
		return Fitness;
	}
	public WebElement View_more1()
	{
		return view_more;
	}
	public WebElement Speciality_supplemnets ()
	{
		return specialitysupplemnets;
	}
	public WebElement Apply()
	{
		return Apply;
	}
	public WebElement Reanal_kidneyDetails()
	{
		return Reanal_kidneydetails;
	}
	public WebElement All_categories()
	{
		return All_categories;
	}
	public WebElement Health_package()
	{
		return Health_packages;
	}
	
	public WebElement Uploadprescription_labtest()
	{
		return Cart_blood;
	}
	public WebElement  Gallery()
	{
		return Cart_kidney;
	}
	public WebElement  Cart_Hairfall()
	{
		return Cart_Hairfall;
	}
	
	public WebElement  Top_product()
	{
		return Top_products;
	}
	public WebElement  Dibatetic_care()
	{
		return Diabetic_care;
	}
	public WebElement  Cart_Summary()
	{
		return Cart_summary;
	}
	public WebElement Hairfall_basic()
	{
		return Hairfall_basic;
	}
	public WebElement Hairfall_basicdetails()
	{
		return Hairfall_basicdetails;
	}
	public WebElement Hairfall_basicbook()
	{
		return Hairfall_basictestbook;
	}
	public WebElement Hairfall_basicpatient()
	{
		return Hairfall_basicpatient;
	}
	
	public WebElement Health_Care()
	{
		return Health_care;
	}
	
	public WebElement RTPCR()
	{
		return RTPCR;
	}
	public WebElement Covid()
	{
		return Covid_19;
	}
	public WebElement  View_more()
	{
		return Viewmore;
	}
	
	public WebElement Book_test()
	{
		return Book_test;
	}
	
	public WebElement Patients_quan()
	{
		return Reanal_kidneypatients;
	}
	
	public WebElement Overview_covid()
	{
		return Overview;
	}
	public WebElement Pharmeasy()
	{
		return Pharm_easy;
	}
	public WebElement Ever_herb()
	{
		return Ever_herb;
	}
	public WebElement Price()
	{
		return Popularity;
	}
	
	public WebElement Ranges_covid()
	{
		return Ranges;
	}
	
	
	
	
	
	
	public WebElement All_test()
	{
		return All_test;
	}
	
	public WebElement Lipid_profile()
	{
		return  Lipid_shoptest ;
	}
	
	public WebElement Cross()
	{
		return Cross;
	}
	

	
	
	public WebElement Reciver_order()
	{
		return Reciverorder;
	}
	
	public WebElement Left_scroll()
	{
		return Scroll_left;
	}
	
	public WebElement Right_scroll()
	{
		return Scroll_right;
	}
	
	public WebElement Search_packages()
	{
		return Search_packages;
	}
	
	public WebElement Select()
	{
		return Select;
	}
	
	public WebElement Patients()
	{
		return Patients;
	}
	
	public WebElement Deliver_to()
	{
		return Deliver_to;
	}
	
	public WebElement Pin_Enter()
	{
		return Pin_enter;
	}
	public WebElement Check_pin()
	{
		return Check;
	}
	
	public WebElement Second_Scroll()
	{
		return Second_scroll;
	}
	public WebElement What_customers()
	{
		return What_customersay;
	}
	public WebElement Indias1_medicine()
	{
		return Indias1_text;
	}
	public WebElement Online_medicinetext()
	{
		return Online_medicinetext;
	}
	public WebElement Order_medicinetext()
	{
		return Order_medicinetext;
	}
	
	public WebElement Order_medicine()
	{
		return Order_medicine;
	}
	public WebElement Is_buying()
	{
		return Buying_medicneonline;
	}
	public WebElement Chose_homedelivery()
	{
		return Medicine_homedelivery;
	}
	public WebElement Discount_cashbacks()
	{
		return Discounts_cashabcks;
	}
	public WebElement Cancel_order()
	{
		return  Cancelorder;
	}
	public WebElement Call_on()
	{
		return Call_on;
	}
	public WebElement Offer_medicine()
	{
		return Offer_off;
	}
	public WebElement Offer_leftscroll()
	{
		return Offer_leftscroll;
	}
	public WebElement Copy_Code()
	{
		return Copy_code;
	}
	public WebElement Offer_rightscroll()
	{
		return Offer_rightscroll;
	}
	
	public WebElement Pin()
	{
		return deliver;
	}
	public WebElement Pin_enter()
	{
		return pin;
	}
	public WebElement Check()
	{
		return check;
	}
	public WebElement Sign_in()
	{
		return sign_in;
	}
	public WebElement Mobile()
	{
		return mobile;
	}
	public WebElement Otp()
	{
		return otp;
	}
	
	public WebElement Continue()
	{
		return Continue;
	}
	public WebElement User()
	{
		return user;
	}
	public WebElement Log_out()
	{
		return Logout;
	}
	
	public WebElement Medicine()
	{
		return Medicine;
	}
	
	public WebElement Healthecare()
	{
		return Healthcare;
	}
	
	public WebElement LabTests()
	{
		return LabTests;
	}
	
	public WebElement Offers()
	{
		return Offers;
	}
	
	public WebElement Plus()
	{
		return Plus;
	}
	
	public WebElement HealthBlogs()
	{
		return Health_blogs;
	}
	
	public WebElement Search_bar()
	{
		return searchbar;
	}
	public WebElement Search_medicine()
	{
		return search_medicine;
	}
	public WebElement Bendaryl()
	{
		return bendaryl150ml;
	}
	public WebElement Add_cart()
	{
		return add_cart;
	}
	public WebElement Quantity()
	{
		return quantity_1;
	}
	public WebElement Cofsils()
	{
		return Cofsils;
	}
	public WebElement Flavour()
	{
		return Ginger_lemon;
	}
	public WebElement Cart_Cofsils()
	{
		return add_cart1;
	}
	public WebElement Amount()
	{
		return Amount;
	}
	public WebElement Quantity_Cofsils()
	{
		return  Cofsils_3;
	}
	public WebElement Main_banner1()
	{
		return  Banner1;
	}
	public WebElement Main_banner2()
	{
		return  Banner2;
	}
	public WebElement Full_body()
	{
		return  Full_bodycheckup;
	}
	public WebElement Vitamins()
	{
		return  Vitamins;
	}
	public WebElement Diabetes()
	{
		return  Diabetes;
	}
	public WebElement Thyroid()
	{
		return  Thyroid;
	}
	public WebElement Women_care()
	{
		return  Women_care;
	}
	public WebElement Covid_care()
	{
		return  covid;
	}
	public WebElement Fever()
	{
		return  Fever;
	}
	public WebElement Scroll_more()
	{
		return  Scroll;
	}
	public WebElement Offer()
	{
		return  Offers_flatoff;
	}
	public WebElement Payment_offer()
	{
		return  Paymentoffer_scroll;
	}
	
	public WebElement Copy_code()
	{
		return  copy_code;
	}
	
	public WebElement Search_Medicine()
	{
		return  Search_medicine;
	}
	public WebElement Crocin()
	{
		return  Crocine;
	}
	public WebElement Bill_summary()
	{
		return  Bill_summary;
	}
	public WebElement Add_Crocine()
	{
		return  Addcart;
	}
	public WebElement Quantity_crocine()
	{
		return  Quantity;
	}
	public WebElement Crocine_decription()
	{
		return  Description_crocine;
	}
	public WebElement Product_summary()
	{
		return  Product_summary;
	}
	public WebElement Saridon()
	{
		return Saridon;
	}
	public WebElement Add_saridon()
	{
		return Add_saridon;
	}
	public WebElement Quantity_saridon()
	{
		return Quantity_saridon;
	}
	public WebElement View_cart()
	{
		return view_cart;
	}
	public WebElement Cart_total()
	{
		return Cart_total;
	}
	public WebElement Apply_coupons()
	{
		return Apply_coupons;
	}
	
	public WebElement Apply_coupon1()
	{
		return Apply_coupon1;
	}
	public WebElement Medicine_module()
	{
		return Medicine_module;
	}
	public WebElement Search_Medicinemodule()
	{
		return Search_medicinemodule;
	}
	public WebElement Order_Prescription()
	{
		return Order_prescription;
	}
	public WebElement First_boxtext()
	{
		return First_boxtext;
	}
	public WebElement Upload()
	{
		return Upload;
	}
	public WebElement Login()
	{
		return Login;
	}
	public WebElement Mobile_no()
	{
		return Mobile_no;
	}
	public WebElement Send_otp()
	{
		return Send_otp;
	}
	public WebElement Continue_login()
	{
		return Continue_login;
	}
	public WebElement 	Prescription_pharmeasy()
	{
		return Prescription_Pharmeasy ;
	}
	public WebElement Upload_image()
	{
		return Upload_image;
	}
	
	public WebElement Uploaded_prescription()
	{
		return Uploaded_prescription;
	}
	
	public WebElement Upload_image2()
	{
		return Upload_image1;
	}
	
	public WebElement Second_text()
	{
		return Second_box;
	}
	


}
