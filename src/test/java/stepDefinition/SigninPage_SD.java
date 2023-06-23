package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.SigninPage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class SigninPage_SD {

	SigninPage Signinpage =new SigninPage();


	String Excelpath=ConfigReader.getexcelfilepath();
	static String username;
	static String password;
	static String errorMessage;

	
	@Given("User is on SignIn page")
	public void user_is_on_sign_in_page() {

		LoggerLoad.info("------User is On Sign in page------");
		Signinpage.SigninPageUrl();   
	}

	@When("User Clicks on Register link")
	public void user_clicks_on_register_link() {
		LoggerLoad.info("----User Clicks on Register Link-----");
		Signinpage.registerclick();
	}

	@Then("User should be redirected to Register page")
	public void user_should_be_redirected_to_register_page() {
		String title =Signinpage.getTitleofPage();
		LoggerLoad.info("----User redirected to Page----"+title);
		assertEquals(title, "Registration");
	}

	@When("User clicks on login button with all empty field")
	public void user_clicks_on_login_button_with_all_empty_field() {
		 LoggerLoad.info("User is Clicking login button with empty fields");
		 Signinpage.signinclick();
	}

	@Then("User verify the message at username as {string}")
	public void user_verify_the_message_at_username_as(String string) {
		String text= Signinpage.validateUsernamefield(string);
		assertEquals(text,"Please fill out this field.");	    
	}

	@When("User clicks on login button with username as {string} only")
	public void user_clicks_on_login_button_with_username_as_only(String sdet108Ninja) {
		LoggerLoad.info("--User Enters Only the User name--");

		Signinpage.enterUserName(sdet108Ninja);

	}

	@Then("User verify the message at password as {string}")
	public void user_verify_the_message_at_password_as(String adgnsdet) {
		String text= Signinpage.validatePasswordfield(adgnsdet);
		LoggerLoad.info("----User can see" +text +"-----");
		assertEquals(text,"Please fill out this field.");
	}

	@When("User clicks on login button with password as {string} only")
	public void user_clicks_on_login_button_with_password_as_only(String string) {
		LoggerLoad.info("User Enters Only Password");
		Signinpage.enterPassword(string);
	}

	@Then("User verify the message at user as {string}")
	public void user_verify_the_message_at_user_as(String string) {
		String text= Signinpage.validateUsernamefield(string);
		LoggerLoad.info("User can see the popup" +text);
		assertEquals(text,"Please fill out this field.");
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String username) {
		Signinpage.enterUserName(username);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
		Signinpage.enterPassword(password);
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
LoggerLoad.info("-----User Clicks on Login button-----");
		
Signinpage.signinclick();
	}

	@Then("User verify the message as {string}")
	public void user_verify_the_message_as(String string) {
		String alertmsg =Signinpage.invalidAlert();
		LoggerLoad.info("The actual Alert is:" +alertmsg);
		assertEquals(alertmsg, string);
	}
	@Given("The user is on login page")
	public void the_user_is_on_login_page() {
	LoggerLoad.info("user is on loginpage SD");
	Signinpage.SigninPageUrl();  

	}

	@When("The user enter sheet {string} and {int}")
	public void the_user_enter_sheet_and(String string, Integer int1) throws EncryptedDocumentException, IOException {
	    
	    ExcelReader reader = new ExcelReader();
	    List<Map<String, String>> testdata = reader.getData(Excelpath,string);
		
		username = testdata.get(int1).get("username");
		password = testdata.get(int1).get("password");
	    errorMessage = testdata.get(int1).get("expectedresult");
		
		LoggerLoad.info("user enter username and password");
		if (username != null || password != null )
		{
			Signinpage.enterUserName(username);
			Signinpage.enterPassword(password);
			
		}			
	}

	@Then("click login button")
	public void click_login_button()
	{
		LoggerLoad.info("Invalid username and password");
		Signinpage.signinclick();
		
		String signinPageTitle = Signinpage.getTitleofPage();
		LoggerLoad.info("message from signin title page " + signinPageTitle);
		String message;
		if (Signinpage.getTitleofPage().equals("Login")) {
			
			 message=Signinpage.invalidAlert();
				
		}		
		else
		{
			 message=Signinpage.successAlert();;
			
		}
		assertEquals(message, errorMessage);		
	}
	
	@Given("The user is in the Home page with valid  log in")
	public void the_user_is_in_the_home_page_with_valid_log_in() {
	    LoggerLoad.info("user is on home page ");
	}

	@When("The user clicks {string}")
	public void the_user_clicks(String string) {
		Signinpage.logoutbtn();
	    
	}

	@Then("The user redirected to homepage")
	public void the_user_redirected_to_homepage() {
		LoggerLoad.info("user successfully logout SD");
	    
	}


}
