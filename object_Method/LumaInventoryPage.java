package object_Method;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LumaInventoryPage {
 WebDriver driver;
 @FindBy(xpath = "//div[@class='panel header']//a[contains(text(),'Sign In')]")
 WebElement signinOption;
 @FindBy(xpath = "//input[@id='email']")
 WebElement emailField;
 @FindBy(xpath = "//fieldset[@class='fieldset login']//input[@id='pass']")
 WebElement passwordField;
 @FindBy(name= "send")
 WebElement loginBtn;
 @FindBy(xpath="//a[@id='ui-id-3']//span[1]")
 WebElement whatsnewOption;
 @FindBy(xpath="//span[normalize-space()='Women']")
 WebElement womenCategory;
 @FindBy(xpath = "//a[@id='ui-id-9']")
 WebElement topsOption;
 @FindBy(xpath = "//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
 WebElement jacketOption;
 @FindBy(xpath = "//a[contains(text(),\"Juno Jacket\")]/../../../../div[1]/div[1]/div[4]/div[1]/div[1]/form[1]/button[1]")
 WebElement junoJacket;
 @FindBy(xpath="//span[normalize-space()='Men']")
 WebElement menCategory;
 @FindBy(xpath = "//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
 WebElement bottomOption;
 @FindBy(xpath="//a[@id='ui-id-24']//span[contains(text(),'Shorts')]")
 WebElement shortOption;
 @FindBy(xpath = "//a[contains(text(),\"Pierce Gym Short\")]/../../../../div[1]/div[1]/div[3]/div[1]/div[1]")
 WebElement gymShort;
 @FindBy(xpath="//span[normalize-space()='Gear']")
 WebElement gearOption;
 @FindBy(xpath = "//span[normalize-space()='Watches']")
 WebElement watches;
 @FindBy(xpath = "//a[contains(text(),\"Clamber Watch\")]/../../../../div[1]/div[1]/div[3]/div[1]/div[1]")
 WebElement clamberWatch;
 @FindBy(xpath="//span[normalize-space()='Training']")
 WebElement trainingOption;
 @FindBy(xpath = "//span[normalize-space()='Video Download']")
 WebElement videoDownload;
 @FindBy(xpath="//span[normalize-space()='Sale']")
 WebElement saleOption;
 @FindBy(xpath="//span[@class='action more button']" )
 WebElement shopnewYoga;
 @FindBy(xpath="//span[normalize-space()='Shop Pants']")
 WebElement shoppants;
 @FindBy(xpath = "//span[normalize-space()='Shop Tees']")
 WebElement shopTees;
 @FindBy(xpath = "//span[normalize-space()='Shop Erin Recommends']")
 WebElement shoperinRecommanded;
 @FindBy(xpath = "//span[normalize-space()='Shop Performance']")
 WebElement shopPerformance;
 @FindBy(xpath = "//span[normalize-space()='Shop Eco-Friendly']")
 WebElement shopecoFriendly;
 public LumaInventoryPage(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver, this);
 } 
 public void Login(String emailInput,String passwordInput) {
	 signinOption.click();
	 emailField.sendKeys(emailInput);
	 passwordField.sendKeys(passwordInput);
	 loginBtn.click();
 }
 public void ValidateWhatsNewOption() {
	 String actualText = whatsnewOption.getText();
	 String expectedText="What's New";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 whatsnewOption.click();
 }
 public void ValidateWomenCategoryOption() {
	 String actualText = womenCategory.getText();
	 String expectedText="Women";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 Actions act = new Actions(driver); 
	 act.moveToElement(womenCategory).perform();
	 act.moveToElement(topsOption).perform();
	 act.moveToElement(jacketOption).perform();
	 act.click().perform();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
	 wait.until(ExpectedConditions.visibilityOf(junoJacket));
	 junoJacket.click();
 }
 public void ValidateMenCatoryOption() {
	 String actualText = menCategory.getText();
	 String expectedText="Men";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 Actions act = new Actions(driver);
	 act.moveToElement(menCategory).perform();
	 act.moveToElement(bottomOption).perform();
	 act.moveToElement(shortOption).perform();
	 act.click().perform();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.visibilityOf(gymShort)); 
	 gymShort.click();
 }
 public void ValidateGearOption() {
	 String actualText = gearOption.getText();
	 String expectedText="Gear";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 Actions act = new Actions(driver);
	 act.moveToElement(gearOption).perform();
	 act.moveToElement(watches).perform();
	 act.click().perform();
	 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 wait.until(ExpectedConditions.visibilityOf(clamberWatch));
	 clamberWatch.click();
 }
 public void ValidateTrainingOption() {
	 String actualText = trainingOption.getText();
	 String expectedText="Training";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 Actions act = new Actions(driver);
	 act.moveToElement(trainingOption).perform();
	 act.moveToElement(videoDownload).perform();
	 act.click().perform();
 }
 public void ValidateSaleOption() {
	 String actualText = saleOption.getText();
	 String expectedText="Sale";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 saleOption.click();
 }
 public void ClickOnShopNewYogaOption() {
	 String actualText = shopnewYoga.getText();
	 String expectedText="Shop New Yoga";
	 assertEquals(actualText, expectedText,"Text is mismatched");
	 shopnewYoga.click();
 }
 public void ClickOnShopPantsOption() {
	 shoppants.click();
 }
 public void ClickOnShopTeesOption() {
	 shopTees.click();
 }
 public void ClickOnShopErinRecommendsOption() {
	 shoperinRecommanded.click();
 }
 public void ClickOnShopPerformanceOption() {
	 shopPerformance.click();
 }
 public void ClickOnShopEcoFriendlyOption() {
	 shopecoFriendly.click();
 }	
}
