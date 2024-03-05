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

public class LumaLoginPage {
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
	public void ValidateLoginPage() {
	 	try {
			 object_Method.LumaLoginPage page = new object_Method.LumaLoginPage(driver);          
			 page.ValidateLoginPage();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 2)
	public void LoginWithInvalidEmailAndPassword() {
	 	try {
			object_Method.LumaLoginPage page = new object_Method.LumaLoginPage(driver);
			FileInputStream fis = new FileInputStream("D:\\Automation testing Class\\Eclipse_workspace\\Luma\\src\\test\\java\\utils\\data.properties");
			Properties p = new Properties();
			p.load(fis);
			String email = p.getProperty("invalidemail");
			String password = p.getProperty("invalidpassword");
			page.LoginWithInvalidEmailAndPassword(email, password);
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
 @Test(priority = 3)
	public void LoginWithValidEmailAndPassword() {
	 	try {
	 		object_Method.LumaLoginPage page = new object_Method.LumaLoginPage(driver);
			FileInputStream fis = new FileInputStream("D:\\Automation testing Class\\Eclipse_workspace\\Luma\\src\\test\\java\\utils\\data.properties");
			Properties p = new Properties();
			p.load(fis);
			String email = p.getProperty("emailid");
			String password = p.getProperty("password");
			page.LoginWithValidEmailAndPassword(email,password);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
}
}
