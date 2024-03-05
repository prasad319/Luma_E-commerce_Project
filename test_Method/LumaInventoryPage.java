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

public class LumaInventoryPage {
 WebDriver driver;
 @BeforeMethod
 	public void beforeMethod() {
	 	try {
	 		WebDriverManager.chromedriver().setup();
		 	driver=new ChromeDriver();
		 	driver.manage().window().maximize();
		 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 	driver.get("https://magento.softwaretestingboard.com/");
		 	object_Method.LumaInventoryPage page = new object_Method.LumaInventoryPage(driver);
		 	FileInputStream fis = new FileInputStream("D:\\Automation testing Class\\Eclipse_workspace\\Luma\\src\\test\\java\\utils\\data.properties");
		 	Properties p = new Properties();
		 	p.load(fis);
		 	String email = p.getProperty("emailid");
		 	String password = p.getProperty("password");
		 	page.Login(email, password);
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}	 	
 }
 @AfterMethod 
 	public void afterMethod() {
	 	driver.manage().window().minimize();
	 	driver.quit();
 }
 @Test(priority = 1)
 	public void ValidateWhatsNewOption() {
	 	try {
	 		object_Method.LumaInventoryPage page = new object_Method.LumaInventoryPage(driver);
	 		page.ValidateWhatsNewOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 2)
	public void ValidateWomenCategoryOption() {
	 	try {
	 		object_Method.LumaInventoryPage page = new object_Method.LumaInventoryPage(driver);
	 		page.ValidateWomenCategoryOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 3)
	public void ValidateMenCatoryOption() {
	 	try {
	 		object_Method.LumaInventoryPage page = new object_Method.LumaInventoryPage(driver);
	 		page.ValidateMenCatoryOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 4)
	public void ValidateGearOption() {
	 	try {
	 		object_Method.LumaInventoryPage page = new object_Method.LumaInventoryPage(driver);
	 		page.ValidateGearOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 5)
	public void ValidateTrainingOption() {
	 	try {
	 		object_Method.LumaInventoryPage page = new object_Method.LumaInventoryPage(driver);
	 		page.ValidateTrainingOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 6)
	public void ValidateSaleOption() {
	 	try {
	 		object_Method.LumaInventoryPage page = new object_Method.LumaInventoryPage(driver);
	 		page.ValidateSaleOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 7)
	public void ClickOnShopNewYogaOption() {
	 	try {
	 		object_Method.LumaInventoryPage page = new object_Method.LumaInventoryPage(driver);
	 		page.ClickOnShopNewYogaOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 8)
	public void ClickOnShopPantsOption() {
	 	try {
	 		object_Method.LumaInventoryPage page = new object_Method.LumaInventoryPage(driver);
	 		page.ClickOnShopNewYogaOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 9)
	public void ClickOnShopTeesOption() {
	 	try {
	 		object_Method.LumaInventoryPage page = new object_Method.LumaInventoryPage(driver);
	 		page.ClickOnShopTeesOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 10)
	public void ClickOnShopErinRecommendsOption() {
	 	try {
	 		object_Method.LumaInventoryPage page = new object_Method.LumaInventoryPage(driver);
	 		page.ClickOnShopErinRecommendsOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 11)
	public void ClickOnShopPerformanceOption() {
	 	try {
	 		object_Method.LumaInventoryPage page = new object_Method.LumaInventoryPage(driver);
	 		page.ClickOnShopPerformanceOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 12)
	public void ClickOnShopEcoFriendlyOption() {
	 	try {
	 		object_Method.LumaInventoryPage page = new object_Method.LumaInventoryPage(driver);
	 		page.ClickOnShopEcoFriendlyOption();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
}
