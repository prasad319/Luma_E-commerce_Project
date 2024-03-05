package test_Method;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePage {
 WebDriver driver;
 @BeforeMethod
 	 public void beforeMethod() {
	 	WebDriverManager.chromedriver().setup();
	 	driver=new ChromeDriver();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	driver.manage().window().maximize();
	 	driver.get("https://magento.softwaretestingboard.com/");
 }
 @AfterMethod
 	 public void afterMethod() {
	 	driver.manage().window().minimize();
	 	driver.quit();
 }
 @Test(priority = 1)
 	public void ValidateTitleOfHomePage() {
	 	try {
			object_Method.HomePage page = new object_Method.HomePage(driver);
			page.ValidateTitleOfHomePage();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 2)
 	public void ValidateUrlOfPage() {
	 	try {
	 		object_Method.HomePage page = new object_Method.HomePage(driver);
			page.ValidateUrlOfPage();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 3)
 	public void ClickOnSignInOption() {
	 	try {
	 		object_Method.HomePage page = new object_Method.HomePage(driver);
			page.ClickOnSignInOption();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 4)
 	public void ClickOnCreateAnAccountOption() {
	 	try {
	 		object_Method.HomePage page = new object_Method.HomePage(driver);
			page.ClickOnCreateAnAccountOption();
		} catch (Exception e) {
			System.out.println();
		}
 }
 @Test(priority = 5)
 	public void ValidateSearchBox() {
	 	try {
	 		object_Method.HomePage page = new object_Method.HomePage(driver);
			page.ValidateSearchBox();
		} catch (Exception e) {
			System.out.println();
		}
 }
 @Test(priority = 6)
 	public void ClickOnCartIcon() {
	 	try {
	 		object_Method.HomePage page = new object_Method.HomePage(driver);
			page.ClickOnCartIcon();
		} catch (Exception e) {
			System.out.println();
		}
 }
 
 @Test(priority = 7)
	public void ClickOnNotesLink() {
	 	try {
	 		object_Method.HomePage page = new object_Method.HomePage(driver);
			page.ClickOnNotesLink();
		} catch (Exception e) {
			System.out.println();
		}
 }
 @Test(priority = 8)
	public void ClickOnSearchTermsLink() {
	 	try {
	 		object_Method.HomePage page = new object_Method.HomePage(driver);
			page.ClickOnSearchTermsLink();
		} catch (Exception e) {
			System.out.println();
		}
 }
 @Test(priority = 9)
	public void ClickOnPrivacyAndCookiePolicyLink() {
	 	try {
	 		object_Method.HomePage page = new object_Method.HomePage(driver);
			page.ClickOnPrivacyAndCookiePolicyLink();
		} catch (Exception e) {
			System.out.println();
		}
 }
 @Test(priority = 10)
	public void ClickAdvancedSearchLink() {
	 	try {
	 		object_Method.HomePage page = new object_Method.HomePage(driver);
			page.ClickAdvancedSearchLink();
		} catch (Exception e) {
			System.out.println();
		}
 }
 @Test(priority = 11)
	public void ClickOnOrdersAndReturnsLink() {
	 	try {
	 		object_Method.HomePage page = new object_Method.HomePage(driver);
			page.ClickOnOrdersAndReturnsLink();
		} catch (Exception e) {
			System.out.println();
		}
 }
}
