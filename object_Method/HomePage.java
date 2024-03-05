package object_Method;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
 WebDriver driver;
 @FindBy(xpath="//div[@class='panel header']//a[contains(text(),'Sign In')]")
 WebElement signIn;
 @FindBy(xpath="//div[@class='panel header']//a[normalize-space()='Create an Account']")
 WebElement createAccount;
 @FindBy(xpath="//input[@id='search']")
 WebElement searchBox;
 @FindBy(xpath="//button[@title='Search']")
 WebElement searchBtn;
 @FindBy(xpath="//a[@class='action showcart']")
 WebElement cartIcon;
 @FindBy(xpath = "//a[contains(text(),\"Notes\")]")
 WebElement notesLink;
 @FindBy(xpath = "//a[contains(text(),\"Search Terms\")]")
 WebElement searchtermsLink;
 @FindBy(xpath = "//a[contains(text(),\"Privacy and Cookie Policy\")]")
 WebElement privacyandpolicyLink;
 @FindBy(xpath = "(//a[contains(text(),\"Advanced Search\")])[2]")
 WebElement advancesearchLink;
 @FindBy (xpath = "//a[contains(text(),\"Orders and Returns\")]")
 WebElement ordersandreturnsLink;
 public HomePage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
 public void ValidateTitleOfHomePage() {
	 String actualText = driver.getTitle();
	 String expectedText="Home Page";
	 assertEquals(actualText, expectedText,"Text is mismatched");
 }
 public void ValidateUrlOfPage() {
	 String actualUrl = driver.getCurrentUrl();
	 String expectedUrl="https://magento.softwaretestingboard.com/";
	 assertEquals(actualUrl, expectedUrl,"Url is mismatched");
 }
 public void ClickOnSignInOption() {
	 signIn.click();
 }
 public void ClickOnCreateAnAccountOption() {
	 createAccount.click();
 }
 public void ValidateSearchBox()  {
	 String actualBorder = searchBox.getCssValue("border");
	 String expectedBorder="0.8px solid rgb(194, 194, 194)";
	 assertEquals(actualBorder, expectedBorder,"Searchbox border is mismatched");
	 String actualText = searchBox.getAttribute("placeholder");
	 String expectedText="Search entire store here...";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 searchBox.sendKeys("Jeans");
	 searchBtn.click();
 }
 public void ClickOnCartIcon() {
	 cartIcon.click();
 }
 public void ClickOnNotesLink()  {
	 notesLink.click();
 }
 public void ClickOnSearchTermsLink() {
	 searchtermsLink.click();
 }
 public void ClickOnPrivacyAndCookiePolicyLink() {
	 privacyandpolicyLink.click();
 }
 public void ClickAdvancedSearchLink() {
	 advancesearchLink.click();
 }
 public void ClickOnOrdersAndReturnsLink() {
	 ordersandreturnsLink.click();
 }
}
