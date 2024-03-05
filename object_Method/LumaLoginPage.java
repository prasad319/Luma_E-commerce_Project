package object_Method;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LumaLoginPage {
 WebDriver driver;
 @FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
 WebElement signBtn;
 @FindBy(xpath = "//span[@class='base']")
 WebElement customerLoginText;
 @FindBy(xpath = "//div[@class='login-container']//strong[@id='block-customer-login-heading']")
 WebElement registeredcustomerText;
 @FindBy(xpath = "//span[text()=\"Forgot Your Password?\"]")
 WebElement forgotpasswordLink;
 @FindBy(xpath = "(//strong[@role=\"heading\"])[2]")
 WebElement newcustomerText;
 @FindBy(xpath = "//input[@id='email']")
 WebElement emailField;
 @FindBy(xpath = "//fieldset[@class='fieldset login']//input[@id='pass']")
 WebElement passwordField;
 @FindBy(name= "send")
 WebElement loginBtn;
 @FindBy(xpath = "//div[text()=\"The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.\"]")
 WebElement errorMsg;
 @FindBy(xpath = "//input[@id='email_address']")
 WebElement emailfield2;
 public LumaLoginPage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 public void ValidateLoginPage() {
	 signBtn.click();
	 String actualText = customerLoginText.getText();
	 String expectedText="Customer Login";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 String actualText2 = registeredcustomerText.getText();
	 String expectedText2="Registered Customers";
	 assertEquals(actualText2, expectedText2,"Text is mismatched");
	 String actualText3 = newcustomerText.getText();
	 String expectedText3="New Customers";
	 assertEquals(actualText3, expectedText3,"Text is mismatched");
	 forgotpasswordLink.click();
	 emailfield2.sendKeys("admin123@gmail.com");
 }
 public void LoginWithInvalidEmailAndPassword(String emailInput,String passwordInput) {
	 signBtn.click();
	 emailField.sendKeys(emailInput);
	 passwordField.sendKeys(passwordInput);
	 loginBtn.click();
	 String actualText = errorMsg.getText();
	 String expectedText="The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.";
	 assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void LoginWithValidEmailAndPassword(String emailInput,String passwordInput)  {
	 signBtn.click();
	 emailField.sendKeys(emailInput);
	 passwordField.sendKeys(passwordInput);
	 loginBtn.click();
 }
}
