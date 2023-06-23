package stepDefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import utilities.LoggerLoad;

public class HomePage_SD {

HomePage homePage=new HomePage();
	
	@Given("user opens the dsalgo portal link")
	public void user_opens_the_dsalgo_portal_link() {
		homePage.geturl();
	}

	@When("user clicks on {string} button")
	public void user_clicks_on_button(String string) {
		homePage.getstarted();
	}

	@Then("user redirected to home page")
	public void user_redirected_to_home_page() {
		String title=homePage.getTitleofPage();
		assertEquals(title,"NumpyNinja");
	}


	@When("The user click any of the Get started button {string} in home page")
	public void the_user_click_any_of_the_get_started_button_in_home_page(String value) {
		homePage.getStarted_home(value);
	}
	
	@Then("It should Alert the user with the message {string}")
	public void it_should_alert_the_user_with_the_message(String string) {
		String alert =homePage.getAlert();
	    LoggerLoad.info("alert you are not allow to login");
	    assertEquals(alert, string);
	    
}
	@Given("The user is on Home page")
	public void the_user_is_on_home_page() {
		homePage.homepage();
	}
	@When("The user clicks on data structure dropdown")
	public void the_user_clicks_on_data_structure_dropdown() {
		homePage.dropDown();
		LoggerLoad.info("click on data structure dropdown sd");
	}
	@When("The user clicks on dropdown {string} without login")
	public void the_user_clicks_on_dropdown_without_login(String string) {
		homePage.clickDropdown(string);
		LoggerLoad.info("click on each dropdown sd");
	}

	@Then("The user get warning message {string}")
	public void the_user_get_warning_message(String string) {
		LoggerLoad.info("you are not logged in sd");
	    
	}
	
	@Given("The user opens Home Page")
	public void the_user_opens_home_page() {
	LoggerLoad.info("user is on homepage sd");
	    
	}

	@When("The user clicks Sign in")
	public void the_user_clicks_sign_in() {
		homePage.clickSignOrRegister("Sign in");
	}

	
	@Then("The user should be redirected to Sign in page")
	public void the_user_should_be_redirected_to_sign_in_page() {
		LoggerLoad.info("user is on signinpage sd");	    
	}
	
	@When("The user clicks Register")
	public void the_user_clicks_register() {
		homePage.clickSignOrRegister("Register");
	}		

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
	}   

}
