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

public class CheckoutsPage {
 WebDriver driver;
 @BeforeMethod
 	public void beforeMethod() {
	 	try {
			WebDriverManager.chromedriver().setup();
		 	driver=new ChromeDriver();
		 	driver.manage().window().maximize();
		 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 	driver.get("https://magento.softwaretestingboard.com/");
		 	object_Method.CheckoutsPage page = new object_Method.CheckoutsPage(driver);
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
 @Test 
 	public void CompleteCheckoutsProcess() {
	 	try {
	 		object_Method.CheckoutsPage page = new object_Method.CheckoutsPage(driver);
	 		page.CompleteCheckoutProcess();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}	 
 }
}
