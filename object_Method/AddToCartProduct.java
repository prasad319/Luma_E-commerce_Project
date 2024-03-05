package object_Method;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartProduct {
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
 public AddToCartProduct(WebDriver driver){
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 }
 public void Login(String emailInput,String passwordInput) {
	 signinOption.click();
	 emailField.sendKeys(emailInput);
	 passwordField.sendKeys(passwordInput);
	 loginBtn.click();
 }
 public void AddProduct1ToCart() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	 wait.until(ExpectedConditions.elementToBeClickable(product1));
	 product1.click();
	 String actualText = product1Text.getText();
	 String expectedText="Radiant Tee";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 product1Size.click();
	 product1Colour.click();
	 productQuantity.clear();
	 productQuantity.sendKeys("2");
	 addproducttoCart.click();
	 driver.navigate().back();
 }
 public void AddProduct2ToCart() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	 wait.until(ExpectedConditions.visibilityOf(product2));
	 product2.click();
	 String actualText = product2Text.getText();
	 String expectedText="Breathe-Easy Tank";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 product2Size.click();
	 product2Colour.click();
	 productQuantity.clear();
	 productQuantity.sendKeys("3");
	 addproducttoCart.click();
	 driver.navigate().back();
 }
 public void AddProduct3ToCart() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	 wait.until(ExpectedConditions.elementToBeClickable(product3));
	 product3.click();
	 String actualText = product3Text.getText();
	 String expectedText="Argus All-Weather Tank";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 product3Size.click();
	 product3Colour.click();
	 productQuantity.clear();
	 productQuantity.sendKeys("2");
	 addproducttoCart.click();
	 driver.navigate().back();
 }
 public void AddProduct4ToCart() {
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	 wait.until(ExpectedConditions.elementToBeClickable(product4));
	 product4.click();
	 String actualText = product4Text.getText();
	 String expectedText="Hero Hoodie";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 product4Size.click();
	 product4Colour.click();
	 productQuantity.clear();
	 productQuantity.sendKeys("2");
	 addproducttoCart.click();
	 driver.navigate().back();
 }
}
