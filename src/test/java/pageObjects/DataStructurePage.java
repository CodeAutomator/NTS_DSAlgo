package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class DataStructurePage {

		public static WebDriver driver =DriverFactory.getdriver();
		String signinurl = ConfigReader.getSigninPage();
		String dstryeditorurl= ConfigReader.getDataStructureTryEditorPage();
		
		@FindBy(xpath= "//a[@href='/login']")WebElement signin;
		@FindBy (xpath="//input[@id='id_username']")WebElement Username ;
		@FindBy (xpath="//input[@id='id_password']")WebElement password ;
		@FindBy (xpath="//input[@value='Login']") WebElement login;
		@FindBy (xpath="//a[text()='Get Started']")WebElement  dsgetstarted;
		@FindBy(xpath="//a[@href='time-complexity']")WebElement timecomplexitylink;
		@FindBy (xpath="//a[@href='/tryEditor']")WebElement tryherelink;
		@FindBy(xpath="//form/div/div/div/textarea")WebElement textEditor;
		@FindBy(xpath ="//button[text()='Run']")WebElement runBtn;
		@FindBy(xpath ="//pre[@id='output']")WebElement ds_output;
		
		
		public   DataStructurePage () {
			PageFactory.initElements(driver,this);
		}
		public void SigninPageUrl() {
			driver.get(signinurl);
		}

		public void signinclick() {
			signin.click();
		}
		public void enterUserName(String username) {
			Username.click();
			Username.clear();
			Username.sendKeys(username);

		}

		public void enterPassword(String pwd) {
			password.click();
			password.clear();
			password.sendKeys(pwd);


		}
		public void loginbtn(){
			login.click();
			LoggerLoad.info("user enter valid username and password ");

		}
		
		public void dsclick() {
			dsgetstarted.click();		
		}
		
		public void timecomplexity() {
			timecomplexitylink.click();
		}
		public void tryhere() {
			tryherelink.click();
		}
		
		public void loadTryEditorpage() {		
			driver.get(dstryeditorurl);
		}
		public void tryeditor(String code) {
			textEditor.sendKeys(code);
		}
		
		public void runPythoncode() {
			runBtn.click();
		}
		
		public String getOutput() {
			return ds_output.getText();
		}
		
		public void invalidtryeditor(String String) {
			textEditor.sendKeys(String);
	}
		public String alert() {
		    //String waring = driver.switchTo().alert().getText();
		    //driver.switchTo().alert().accept();
			// Wait for the alert to appear
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
			Alert alert = wait.until(ExpectedConditions.alertIsPresent());

			// Get the text of the alert
			String alertText = alert.getText();

			// Accept or dismiss the alert
			alert.accept(); // To accept the alert
			// alert.dismiss(); // To dismiss the alert
		    LoggerLoad.warn("checking alert message from tryeditor "+ alertText );
		    return alertText;
		}

	}

