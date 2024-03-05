package object_Method;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccountPage {
 WebDriver driver;
 @FindBy(xpath = "//div[@class='panel header']//a[normalize-space()='Create an Account']")
 WebElement createanAC;
 @FindBy(xpath = "//span[@class='base']")
 WebElement createnewcustomerAC;
 @FindBy(xpath = "//span[normalize-space()='Personal Information']")
 WebElement personalInformationl;
 @FindBy(xpath = "//span[normalize-space()='Sign-in Information']")
 WebElement signinInfomation;
 @FindBy(xpath = "//input[@id='firstname']")
 WebElement firstnameField;
 @FindBy(xpath = "//input[@id='lastname']")
 WebElement lastnameField;
 @FindBy(xpath = "//input[@id='email_address']")
 WebElement emailField;
 @FindBy(xpath = "//input[@id='password']")
 WebElement passwordField;
 @FindBy(xpath = "//input[@id='password-confirmation']")
 WebElement passwordConfirmation;
 @FindBy(xpath = "//button[@title='Create an Account']")
 WebElement createanAccountBtn;
 public CreateAnAccountPage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 public void ClickOnCreateAnAccountOption() {
	 createanAC.click();
 }
 public void ValidateCreateNewCustomerAccountText() {
	 String actualText = createnewcustomerAC.getText();
	 String expectedText="Create New Customer Account";
	 assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ValidatePersonalInformationText() {
	 String actualText = personalInformationl.getText();
	 String expectedText="Personal Information";
	 assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void EnterFirstName(String firstnameInput) {
	 firstnameField.sendKeys(firstnameInput);
 }
 public void EnterLastName(String lastnameInput) {
	 lastnameField.sendKeys(lastnameInput);
 }
 public void ValidateSigninInformationText() {
	 String actualText = signinInfomation.getText();
	 String expectedText="Sign-in Information";
	 assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void EnterEmailId(String emailInput) {
	 emailField.sendKeys(emailInput);
 }
 public void EnterPassword(String passwordInput) {
	 passwordField.sendKeys(passwordInput);
 }
 public void ConfirmPassword(String passwordInput) {
	 passwordConfirmation.sendKeys(passwordInput);
 }
 public void ClickOnCreateAnAccountBtn() {
	 createanAccountBtn.click();
 }
}
