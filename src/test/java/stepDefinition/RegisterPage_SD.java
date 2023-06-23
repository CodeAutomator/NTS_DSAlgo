package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.RegisterPage;
import utilities.ConfigReader;
import utilities.ExcelReader;
import utilities.LoggerLoad;

public class RegisterPage_SD {

	RegisterPage registerPage=new RegisterPage();
	
	String excelpath=ConfigReader.getexcelfilepath();
	static String username;
	static String password;
	static String confirmpwd;
	static String errorMessage;
	
	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
		registerPage.RegisterPageUrl();
	}

	@When("The user clicks {string} button with all fields empty")
	public void the_user_clicks_button_with_all_fields_empty(String string) {
		registerPage.ResisterPageClick();
	}

	@Then("It should display an error {string} below Username textbox")
	public void it_should_display_an_error_below_username_textbox(String string) {
		registerPage.warningUsername();
	    
	}
	@When("User click Register with username as {string} only")
	public void user_click_register_with_username_as_only(String string) {
		registerPage.SetUsernameField(string);
		registerPage.ResisterPageClick();
	}

	@Then("User verify the message at password on Register Page as {string}")
	public void user_verify_the_message_at_password_on_register_page_as(String string) {
		
		registerPage.warningPassword(string);
	    
	}
	@When("User click Register with password as {string} only")
	public void user_click_register_with_password_as_only(String string) {
		registerPage.SetPasswordField(string);
		registerPage.ResisterPageClick();
	    
	}

	@Then("User verify the message at confirmation password on Register Page as {string}")
	public void user_verify_the_message_at_confirmation_password_on_register_page_as(String string) {
		registerPage.warningConfirmPassword(string);
	    
	}
	

	@When("user enter the sheetname {string} and row number {int}")
	public void user_enter_the_sheetname_and_row_number(String string, Integer int1) throws EncryptedDocumentException, IOException {
		ExcelReader reader = new ExcelReader();
	    List<Map<String, String>> testdata = reader.getData(excelpath,string);
		
		username = testdata.get(int1).get("username");
		password = testdata.get(int1).get("password");
		confirmpwd = testdata.get(int1).get("confirmpassword");	
	    errorMessage = testdata.get(int1).get("expectedresult");
		
		LoggerLoad.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" Confirm password as\" "+ confirmpwd);
		if (username != null || password != null || confirmpwd != null)
		{
			registerPage.SetUsernameField(username);
			registerPage.SetPasswordField(password);
			registerPage.SetConfirmPasswordField(confirmpwd);
		}
	}

	@Then("user click on Register button")
	public void user_click_on_register_button() {
		registerPage.ResisterPageClick();
		String mes2 =registerPage.GetErrorMsg();
		LoggerLoad.info(mes2 + " --- " + errorMessage);
	    assertEquals(mes2, errorMessage);	    
	    //assertEquals(mes2, message);
	    LoggerLoad.info("Message from Register click SD: " + mes2 + " -- " + errorMessage);
	}
	
	@Given("The user clicks on signin  link on register page")
	public void the_user_clicks_on_signin_link_on_register_page() {
		
		registerPage.signinclick();
	    
	}

	@Then("The user redirected to signinpage from registerpage")
	public void the_user_redirected_to_signinpage_from_registerpage() {
		
		 LoggerLoad.info("user is on login page");
	    
	}


}
