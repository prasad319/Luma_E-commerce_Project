package object_Method;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class MyAccountPage {
 WebDriver driver;
 @FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
 WebElement signinOption;
 @FindBy(xpath = "//input[@id='email']")
 WebElement emailField;
 @FindBy(xpath = "//fieldset[@class='fieldset login']//input[@id='pass']")
 WebElement passwordField;
 @FindBy(name= "send")
 WebElement loginBtn;
 @FindBy(xpath = "(//button[@tabindex=\"-1\"])[1]")
 WebElement downArrowBtn;
 @FindBy(xpath = "//div[@aria-hidden='false']//a[normalize-space()='My Account']")
 WebElement myAC;
 @FindBy(xpath = "//span[text()=\"My Account\"]")
 WebElement myAccountText;
 @FindBy(xpath = "//a[normalize-space()='My Orders']")
 WebElement myOrders;
 @FindBy(xpath = "//span[text()=\"My Orders\"]")
 WebElement myOrdersText;
 @FindBy(xpath = "//span[normalize-space()='You have placed no orders.']")
 WebElement orderMsg;
 @FindBy(xpath = "//a[normalize-space()='My Downloadable Products']")
 WebElement myDownloadableProducts;
 @FindBy(xpath = "//span[text()=\"My Downloadable Products\"]")
 WebElement  myDownloadableProductsText;
 @FindBy(xpath = "//span[contains(text(),'You have not purchased any downloadable products y')]")
 WebElement downloadableProductMsg;
 @FindBy(xpath = "//li[@class='nav item current']//strong[contains(text(),'My Wish List')]")
 WebElement myWishList;
 @FindBy(xpath = "//span[text()=\"My Wish List\"]")
 WebElement myWishListText;
 @FindBy(xpath = "//span[normalize-space()='You have no items in your wish list.']")
 WebElement wishListMsg;
 @FindBy(xpath = "//strong[normalize-space()='Address Book']")
 WebElement addressBook;
 @FindBy(xpath = "//span[@data-ui-id=\"page-title-wrapper\"]")
 WebElement addNewAddressText;
 @FindBy(xpath = "//span[normalize-space()='Contact Information']")
 WebElement ContactInformationText;
 @FindBy(xpath = "//span[normalize-space()='Address']")
 WebElement AddressText;
 @FindBy(xpath = "//input[@id='firstname']")
 WebElement firstnameField;
 @FindBy(xpath = "//input[@id='lastname']")
 WebElement lastnameField;
 @FindBy(xpath = "//input[@id='company']")
 WebElement companyField;
 @FindBy(xpath = "//input[@id='telephone']")
 WebElement phonenumberField;
 @FindBy(xpath = "//input[@id='street_1']")
 WebElement streetadd1;
 @FindBy(xpath = "//input[@id='street_2']")
 WebElement streetadd2;
 @FindBy(xpath = "//input[@id='street_3']")
 WebElement streetadd3;
 @FindBy(xpath = "//input[@id='city']")
 WebElement cityField;
 @FindBy(xpath = "//select[@id='region_id']")
 WebElement regionField;
 @FindBy(xpath = "//input[@id='zip']")
 WebElement postalcodeField;
 @FindBy(xpath = "//select[@id='country']")
 WebElement countryField;
 @FindBy(xpath = "//button[@title='Save Address']")
 WebElement SaveAddressBtn;
 @FindBy(xpath = "//strong[normalize-space()='Account Information']")
 WebElement AccountInformation;
 @FindBy(xpath = "//span[text()=\"Edit Account Information\"]")
 WebElement EditAccountInformationText;
 @FindBy(xpath = "//strong[normalize-space()='Stored Payment Methods']")
 WebElement StoredPaymentMethods;
 @FindBy(xpath = "//span[text()=\"Stored Payment Methods\"]")
 WebElement StoredPaymentMethodsText;
 @FindBy(xpath = "//span[normalize-space()='You have no stored payment methods.']")
 WebElement StoredPaymentMethodsMsg;
 @FindBy(xpath = "//a[normalize-space()='My Product Reviews']")
 WebElement MyProductReviews;
 @FindBy(xpath = "//span[text()=\"My Product Reviews\"]")
 WebElement MyProductReviewsText;
 @FindBy(xpath = "//span[normalize-space()='You have submitted no reviews.']")
 WebElement MyProductReviewsMsg;
 public MyAccountPage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 public void Login(String emailInput,String passwordInput) {
	 signinOption.click();
	 emailField.sendKeys(emailInput);
	 passwordField.sendKeys(passwordInput);
	 loginBtn.click();
 }
 public void ClickOnMyAccount() {
	 downArrowBtn.click();
	 myAC.click();
 }
 public void ValidateMyOrderOption() {
	 myOrders.click();
	 String actualText = myOrdersText.getText();
	 String expectedText="My Orders";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 String actualText2 = orderMsg.getText();
	 String expectedText2="You have placed no orders.";
	 assertEquals(actualText2, expectedText2,"Text is mismatched");
 }
 public void ValidateMyDownloadableProductsOption() {
	 myDownloadableProducts.click();
	 String actualText = myDownloadableProductsText.getText();
	 String expectedText="My Downloadable Products";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 String actualText2 = downloadableProductMsg.getText();
	 String expectedText2="You have not purchased any downloadable products yet.";
	 assertEquals(actualText2, expectedText2,"Text is mismatched");
 }
 public void ValidateMyWishListOption() {
	 myWishList.click();
	 String actualText = myWishListText.getText();
	 String expectedText="My Wish List";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 String actualText2 = wishListMsg.getText();
	 String expectedText2="You have no items in your wish list.";
	 assertEquals(actualText2, expectedText2,"Text is mismatched");
 }
 public void ValidateAddressBookOption(String companyInput,String phnumberInput,String street1Input,String street2Input,String street3Input,String cityInput,String postalcodeInput) {
	 addressBook.click();
	 String actualText = addNewAddressText.getText();
	 String expectedText="Add New Address";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 String actualText2 = ContactInformationText.getText();
	 String expectedText2="Contact Information";
	 assertEquals(actualText2, expectedText2,"Text is mismatched");
	 String actualText3 = AddressText.getText();
	 String expectedText3="Address";
	 assertEquals(actualText3, expectedText3,"Text is mismatched");
	 String actualText4 = firstnameField.getAttribute("value");
	 String expectedText4="Prasad";
	 assertEquals(actualText4, expectedText4,"Text is mismatched");
	 String actualText5 = lastnameField.getAttribute("value");
	 String expectedText5="Shinde";
	 assertEquals(actualText5, expectedText5,"Text is mismatched");
	 companyField.sendKeys(companyInput);
	 phonenumberField.sendKeys(phnumberInput);
	 streetadd1.sendKeys(street1Input);
	 streetadd2.sendKeys(street2Input);
	 streetadd3.sendKeys(street3Input);
	 cityField.sendKeys(cityInput);
	 WebElement dropdown = countryField;
	 Select select = new Select(dropdown);
	 select.selectByValue("India");
	 WebElement dropdown2 = regionField;
	 Select select2 = new Select(dropdown2);
	 select2.selectByValue("Maharashtra");
	 postalcodeField.sendKeys(postalcodeInput);
	 SaveAddressBtn.click();
 }
 public void ValidateAccountInformationOption() {
	 AccountInformation.click();
	 String actualText = EditAccountInformationText.getText();
	 String expectedText="Edit Account Information";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 String actualText2 = firstnameField.getAttribute("value");
	 String expectedText2="Prasad";
	 assertEquals(actualText2, expectedText2,"Text is mismatched");
	 String actualText3 = lastnameField.getAttribute("value");
	 String expectedText3="Shinde";
	 assertEquals(actualText3, expectedText3,"Text is mismatched");
 }
 public void ValidateStoredPaymentMethodsOption() {
	 StoredPaymentMethods.click();
	 String actualText = StoredPaymentMethodsText.getText();
	 String expectedText="Stored Payment Methods";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 String actualText2 = StoredPaymentMethodsMsg.getText();
	 String expectedText2="You have no stored payment methods.";
	 assertEquals(actualText2, expectedText2,"Text is mismatched");
 }
 public void ValidateMyProductReviewsOption() {
	 MyProductReviews.click();
	 String actualText = MyProductReviewsText.getText();
	 String expectedText="My Product Reviews";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 String actualText2 = MyProductReviewsMsg.getText();
	 String expectedText2="You have submitted no reviews.";
	 assertEquals(actualText2, expectedText2,"Text is mismatched");
 }
}
