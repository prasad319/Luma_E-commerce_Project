package object_Method;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutsPage {
 WebDriver driver;
 @FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
 WebElement signinOption;
 @FindBy(xpath = "//input[@id='email']")
 WebElement emailField;
 @FindBy(xpath = "//fieldset[@class='fieldset login']//input[@id='pass']")
 WebElement passwordField;
 @FindBy(name= "send")
 WebElement loginBtn;
 @FindBy(xpath = "//img[@alt='Radiant Tee']")
 WebElement product1;
 @FindBy(xpath = "//img[@alt='Breathe-Easy Tank']")
 WebElement product2;
 @FindBy(xpath = "//img[@alt='Argus All-Weather Tank']")
 WebElement product3;
 @FindBy(xpath = "//img[@alt='Hero Hoodie']")
 WebElement product4;
 @FindBy(xpath = "//span[text()=\"Radiant Tee\"]")
 WebElement product1Text;
 @FindBy(xpath = "//span[text()=\"Breathe-Easy Tank\"]")
 WebElement product2Text;
 @FindBy(xpath = "//span[text()=\"Argus All-Weather Tank\"]")
 WebElement product3Text;
 @FindBy(xpath = "//span[text()=\"Hero Hoodie\"]")
 WebElement product4Text;
 @FindBy(xpath = "//div[@id='option-label-size-143-item-166']")
 WebElement product1Size;
 @FindBy(xpath = "//div[@id='option-label-size-143-item-167']")
 WebElement product2Size;
 @FindBy(xpath = "//div[@id='option-label-size-143-item-168']")
 WebElement product3Size;
 @FindBy(xpath = "//div[@id='option-label-size-143-item-169']")
 WebElement product4Size;
 @FindBy(xpath = "//div[@id='option-label-color-93-item-50']")
 WebElement product1Colour;
 @FindBy(xpath = "//div[@id='option-label-color-93-item-60']")
 WebElement product2Colour;
 @FindBy(xpath = "//div[@id='option-label-color-93-item-52']")
 WebElement product3Colour;
 @FindBy(xpath = "//div[@id='option-label-color-93-item-49']")
 WebElement product4Colour;
 @FindBy(xpath = "//input[@id='qty']")
 WebElement productQuantity;
 @FindBy(xpath = "//button[@title=\"Add to Cart\"]")
 WebElement addproducttoCart;
 @FindBy(xpath = "//a[@class='action showcart']")
 WebElement cartIcon;
 @FindBy(xpath = "//span[normalize-space()='View and Edit Cart']")
 WebElement viewandeditCart;
 @FindBy(xpath = "(//a[@title=\"Remove item\"])[5]")
 WebElement removeproduct1;
 @FindBy(xpath = "(//a[@title=\"Remove item\"])[6]")
 WebElement removeproduct2;
 @FindBy(xpath = "//button[@data-role='proceed-to-checkout']")
 WebElement proceedtoCheckouts;
 @FindBy(xpath = "//span[text()=\"New Address\"]/..")
 WebElement newAddress;
 @FindBy(xpath = "//input[@name='ko_unique_2']")
 WebElement shippingMethod;
 @FindBy(xpath = "//button[@class='button action continue primary']")
 WebElement nextBtn;
 @FindBy(xpath = "//button[@title='Place Order']")
 WebElement placeOrder;
 @FindBy(xpath = "//span[@class='base']")
 WebElement ordersuccessMsg;
 @FindBy(xpath = "//a[@class='action primary continue']")
 WebElement continueShopping;
 public CheckoutsPage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 public void Login(String emailInput,String passwordInput) {
	 signinOption.click();
	 emailField.sendKeys(emailInput);
	 passwordField.sendKeys(passwordInput);
	 loginBtn.click();
 }
 public void CompleteCheckoutProcess() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 wait.until(ExpectedConditions.elementToBeClickable(product1));
	 product1.click();
	 String actualText1 = product1Text.getText();
	 String expectedText1="Radiant Tee";
	 assertEquals(actualText1, expectedText1,"Text is mismatched");
	 product1Size.click();
	 product1Colour.click();
	 productQuantity.clear();
	 productQuantity.sendKeys("2");
	 addproducttoCart.click();
	 driver.navigate().back();
	 WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(3));
	 wait1.until(ExpectedConditions.visibilityOf(product2));
	 product2.click();
	 String actualText2 = product2Text.getText();
	 String expectedText2="Breathe-Easy Tank";
	 assertEquals(actualText2, expectedText2,"Text is mismatched");
	 product2Size.click();
	 product2Colour.click();
	 productQuantity.clear();
	 productQuantity.sendKeys("3");
	 addproducttoCart.click();
	 driver.navigate().back();
	 WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(3));
	 wait2.until(ExpectedConditions.elementToBeClickable(product3));
	 product3.click();
	 String actualText3 = product3Text.getText();
	 String expectedText3="Argus All-Weather Tank";
	 assertEquals(actualText3, expectedText3,"Text is mismatched");
	 product3Size.click();
	 product3Colour.click();
	 productQuantity.clear();
	 productQuantity.sendKeys("2");
	 addproducttoCart.click();
	 driver.navigate().back();
	 WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(3));
	 wait3.until(ExpectedConditions.elementToBeClickable(product4));
	 product4.click();
	 String actualText4 = product4Text.getText();
	 String expectedText4="Hero Hoodie";
	 assertEquals(actualText4, expectedText4,"Text is mismatched");
	 product4Size.click();
	 product4Colour.click();
	 productQuantity.clear();
	 productQuantity.sendKeys("2");
	 addproducttoCart.click();
	 driver.navigate().back();
	 WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait4.until(ExpectedConditions.visibilityOf(cartIcon));
	 cartIcon.click();
	 viewandeditCart.click();
	 removeproduct1.click();
	 removeproduct2.click();
	 proceedtoCheckouts.click();
	 nextBtn.click();
	 placeOrder.click();
	 continueShopping.click();
 }			
}
