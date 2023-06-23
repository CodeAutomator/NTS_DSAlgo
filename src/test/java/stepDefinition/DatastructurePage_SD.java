package stepDefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructurePage;
import pageObjects.HomePage;
import pageObjects.SigninPage;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class DatastructurePage_SD {

	SigninPage Signinpage =new SigninPage();
	HomePage homePage= new HomePage();
	DataStructurePage datastructure = new DataStructurePage();
	String excelpath=ConfigReader.getexcelfilepath();
	static String phythoncode;
	
	
	@Given("The user is on Signin page of DS Algo portal")
	public void the_user_is_on_signin_page_of_ds_algo_portal() {

	}

	@Then("The user click on signinbtn")
	public void the_user_clicl_signinbtn() {
		datastructure.signinclick();
	}

	@When("The user enter valid {string} and {string}")
	public void the_user_enter_valid_and(String string, String string2) {
		datastructure.enterUserName(string);
		datastructure.enterPassword(string2);
	}

	@When("The user click on login button")
	public void the_user_click_on_login_button() {
		datastructure.loginbtn();
	}
	@When("The user clicks the {string} button in Data Structure Page introduction Panel")
	public void the_user_clicks_the_button_in_data_structure_page_introduction_panel(String string) {
		datastructure.dsclick();
	    
	}
	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String string) {
		LoggerLoad.info("User is on data structure page SDDS");
	    
	}

	@When("The user clicks Time Complexity link")
	public void the_user_clicks_time_complexity_link() {
		
		datastructure.timecomplexity();
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		LoggerLoad.info("The user should be redirected to Time Complexity page SDDS");
	    
	}

	@When("The user clicks {string} button on {string} page")
	public void the_user_clicks_button_on_page(String string, String string2) {
		datastructure.tryhere();
	}
	
	@Given("The user is in page having an tryEditor with a Run button to test")
	public void the_user_is_in_page_having_an_try_editor_with_a_run_button_to_test() {
	   datastructure.loadTryEditorpage();
	}
	
	@When("user enter the Python code | print\"DataStructure Introduction\" |")
	public void user_enter_the_python_code_print_data_structure_introduction() {
		datastructure.tryeditor("print\"DataStructure Introduction\"");
	}

	

	@When("The user clicks on Run button")
	public void the_user_clicks_on_run_button() {
	    datastructure.runPythoncode();
	}

	@Then("The user should be presented with Run output")
	public void the_user_should_be_presented_with_run_output() {
		assertEquals(datastructure.getOutput(), "DataStructure Introduction");
	}
	
	@Given("The user is in a page having an tryEditor")
	public void the_user_is_in_a_page_having_an_try_editor() {
		datastructure.loadTryEditorpage();
		LoggerLoad.info("user try to do negative test");
	   
	}

	@When("user enter the  code | print DataStructure Introduction\" |")
	public void user_enter_the_code_print_data_structure_introduction() {
		datastructure.tryeditor("print DataStructure Introduction\"");
	    
	}

	@When("The user clicks on button")
	public void the_user_clicks_on_button() {
		
		datastructure.runPythoncode();
	    
	}

	@Then("The user should be presented with error message")
	public void the_user_should_be_presented_with_error_message() {
	   String message=datastructure.alert();
	   LoggerLoad.info("Error Message is:" + message);
	}
}
