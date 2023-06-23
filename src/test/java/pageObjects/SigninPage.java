package pageObjects;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import utilities.ConfigReader;

public class SigninPage {

	public static WebDriver driver = DriverFactory.getdriver();
	String loginurl = ConfigReader.getSigninPage();
	String registerurl = ConfigReader.getRegisterPage();

	@FindBy(xpath = "//input[@id='id_username']") WebElement username;
	@FindBy(xpath = "//input[@id='id_password']") WebElement password;
	@FindBy(xpath = "//input[@value='Login']") WebElement loginbtn;
	@FindBy(xpath = "//div[contains(text(),'Invalid Username and Password')]") WebElement alertMsg;
	@FindBy(xpath="//a[text()='Register!']") WebElement registerlink;
	@FindBy(xpath = "//div[@class='alert alert-primary']") WebElement successLogin;
	@FindBy(xpath="//a[@href='/logout']")WebElement signoutbtn;
	

	public SigninPage() {

		PageFactory.initElements(driver, this);

	}
//To get LOg in URL
	public void SigninPageUrl() {
		driver.get(loginurl);
	}
	public void registerclick() {
		registerlink.click();
	}

	public String getTitleofPage() {
		String title = driver.getTitle();
		return title;
	}

	public void enterUserName(String userName) {

		username.sendKeys(userName);

	}

	public void enterPassword(String passWord) {
		password.sendKeys(passWord);
	}

	public void signinclick() {
		loginbtn.click();
	}

	/*
	 * // checked "required" field is on an attribute, to check empty fields
		if (username.isBlank()) {
			JavascriptExecutor js_user = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_user.executeScript("return arguments[0].required;", user);
			return isRequired;
		} else if (password.isBlank()) {
			JavascriptExecutor js_password = (JavascriptExecutor) driver;
			isRequired = (Boolean) js_password.executeScript("return arguments[0].required;", pwd);
			return isRequired;

		}
		return isRequired;
	}
	 */
	public String successAlert() {
		String successMsg = successLogin.getText();
		return successMsg;
	}

	public String invalidAlert() {
		String alertMessage = alertMsg.getText();
		return alertMessage;
	}

	public String validateUsernamefield(String validationMessge) {
		String message = username.getAttribute("validationMessage");
		System.out.println("message");
		return message;

	}

	public String validatePasswordfield(String validationMessge) {
		String message = password.getAttribute("validationMessage");
		System.out.println("message");
		return message;

	}

		public void logoutbtn(){
		signoutbtn.click();
	}
	
}
