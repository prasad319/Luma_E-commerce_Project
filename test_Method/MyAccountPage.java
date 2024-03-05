package test_Method;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyAccountPage {
 WebDriver driver;
 @BeforeMethod
 	public void beforeMethod(){
	 	try {
	 		WebDriverManager.chromedriver().setup();
		 	driver=new ChromeDriver();
		 	driver.manage().window().maximize();
		 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 	driver.get("https://magento.softwaretestingboard.com/");
		 	object_Method.MyAccountPage page = new object_Method.MyAccountPage(driver);
		 	FileInputStream fis = new FileInputStream("D:\\Automation testing Class\\Eclipse_workspace\\Luma\\src\\test\\java\\utils\\data.properties");
		 	Properties p = new Properties();
		 	p.load(fis);
		 	String email = p.getProperty("emailid");
		 	String password = p.getProperty("password");
		 	page.Login(email, password);
		 	page.ClickOnMyAccount();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @AfterMethod
 	public void afterMethod() {
	 	driver.manage().window().minimize();
	 	driver.quit();
 }
 @Test
 	public void ValidateMyOrderOption() {
	 	try {
	 		object_Method.MyAccountPage page = new object_Method.MyAccountPage(driver);
	 		page.ValidateMyOrderOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test
	public void ValidateMyDownloadableProductsOption() {
	 	try {
	 		object_Method.MyAccountPage page = new object_Method.MyAccountPage(driver);
	 		page.ValidateMyDownloadableProductsOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test
	public void ValidateMyWishListOption() {
	 	try {
	 		object_Method.MyAccountPage page = new object_Method.MyAccountPage(driver);
	 		page.ValidateMyWishListOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test
	public void ValidateAddressBookOption() {
	 	try {
	 		object_Method.MyAccountPage page = new object_Method.MyAccountPage(driver);
	 		FileInputStream fis = new FileInputStream("D:\\Automation testing Class\\Eclipse_workspace\\Luma\\src\\test\\java\\utils\\data.properties");
		 	Properties p = new Properties();
		 	p.load(fis);
	 		String companyName = p.getProperty("companyname");
	 		String phNumber = p.getProperty("phonenumber");
	 		String street1 = p.getProperty("street1");
	 		String street2 = p.getProperty("street2");
	 		String street3 = p.getProperty("street3");
	 		String cityName= p.getProperty("city");
	 		String postalCode = p.getProperty("postalCode");
	 		page.ValidateAddressBookOption(companyName, phNumber, street1, street2, street3, cityName, postalCode);
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test
	public void ValidateAccountInformationOption() {
	 	try {
	 		object_Method.MyAccountPage page = new object_Method.MyAccountPage(driver);
	 		page.ValidateAccountInformationOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test
	public void ValidateStoredPaymentMethodsOption() {
	 	try {
	 		object_Method.MyAccountPage page = new object_Method.MyAccountPage(driver);
	 		page.ValidateStoredPaymentMethodsOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test
	public void ValidateMyProductReviewsOption() {
	 	try {
	 		object_Method.MyAccountPage page = new object_Method.MyAccountPage(driver);
	 		page.ValidateMyProductReviewsOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }	
}
