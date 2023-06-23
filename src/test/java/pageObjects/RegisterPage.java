package pageObjects;

import java.time.Duration;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class RegisterPage {

	public static WebDriver driver =DriverFactory.getdriver();
	String registerurl =ConfigReader.getRegisterPage();
	String signinurl = ConfigReader.getSigninPage();
	
	//click on resister button
	
	@FindBy (xpath="//input[@value='Register']")WebElement registerClick;
	@FindBy (name="username")WebElement username;
	@FindBy (name="password1")WebElement password;
	@FindBy (name="password2")WebElement confirmPassword;
	@FindBy (xpath="//div[@class='alert alert-primary']" ) WebElement errorMsg;
	@FindBy(xpath="//a[@href ='/login']")WebElement signin;
	
		public   RegisterPage () {
		PageFactory.initElements(driver,this);
		}
	
		public void RegisterPageUrl() {
			driver.get(registerurl);
		}
		
		public String warningUsername() {
	
			
			String validationMessage = username.getAttribute("validationMessage");
			LoggerLoad.info("Please fill out username field");
			return validationMessage;
		}
	
		public void SetUsernameField(String uname) {
			
			username.click();
			username.clear();
			username.sendKeys(uname);
			//resisterClick.click();
		}
		public String warningPassword(String String) {
			
		
			String validationMessage = username.getAttribute("validationMessage");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			LoggerLoad.info("Please fill out password  field");
			return validationMessage;
		}
		
		public void SetPasswordField(String PWD) {

			password.click();
			password.clear();
			password.sendKeys(PWD);
			//resisterClick.click();
	
		}
		
		public void SetConfirmPasswordField(String confPwd) {

			confirmPassword.click();
			confirmPassword.clear();
			confirmPassword.sendKeys(confPwd);
			//resisterClick.click();
	
		}
		
		public void ResisterPageClick() {
			registerClick.click();
		}
		
		public String warningConfirmPassword(String String) {


			String validationMessage = confirmPassword.getAttribute("validationMessage");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			LoggerLoad.info("Please fill out password confirmation field");
			return validationMessage;
			
		}
		
		public String GetErrorMsg() {
			//LoggerLoad.info("verify the warn message");
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			String msg = null;
			try {
				msg = errorMsg.getText();
			} catch (NoSuchElementException e) {
				LoggerLoad.info("No such element");
			}
			return msg;

		}

		
		public void signinclick() {
			signin.click();
		}
}
