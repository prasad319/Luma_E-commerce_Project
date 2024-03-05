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

public class CreateAnAccountPage {
 WebDriver driver;
 @BeforeMethod
 	public void beforeMethod() {
	 	WebDriverManager.chromedriver().setup();
	 	driver=new ChromeDriver();
	 	driver.manage().window().maximize();
	 	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 	driver.get("https://magento.softwaretestingboard.com/");
 }
 @AfterMethod
 	public void afterMethod() {
	 	driver.manage().window().minimize();
	 	driver.quit();
 }
 @Test
 	public void CreateanAccountPage() {
	 	try {
			object_Method.CreateAnAccountPage page = new object_Method.CreateAnAccountPage(driver);
			FileInputStream fis = new FileInputStream("D:\\Automation testing Class\\Eclipse_workspace\\Luma\\src\\test\\java\\utils\\data.properties");
			Properties p = new Properties();
			p.load(fis);
			String firstName = p.getProperty("firstname");
			String lastName = p.getProperty("lastname");
			String emailId = p.getProperty("emailid");
			String password = p.getProperty("password");
			page.ClickOnCreateAnAccountOption();
			page.ValidateCreateNewCustomerAccountText();
			page.ValidatePersonalInformationText();
			page.EnterFirstName(firstName);
			page.EnterLastName(lastName);
			page.ValidateSigninInformationText();
			page.EnterEmailId(emailId);
			page.EnterPassword(password);
			page.ConfirmPassword(password);
			page.ClickOnCreateAnAccountBtn();
	 	} catch (Exception e) {
			System.out.println(e.getMessage());
		}
 }
}
