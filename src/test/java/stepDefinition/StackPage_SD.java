package stepDefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.StackPage;
import utilities.LoggerLoad;

public class StackPage_SD {
StackPage stack =new StackPage();
	
	@Given("The user opens Home Page and try enter stack page")
	public void the_user_opens_home_page_and_try_enter_stack_page() {
		stack.homepage();
	}

	@When("The user clicks stack")
	public void the_user_clicks_stack() {
		stack.getstackclick();
	}

	@Then("The user should be redirected stackpage")
	public void the_user_should_be_redirected_stackpage() {
		
		LoggerLoad.info("user is on stack page SDST");
	    
	}@Given("The user is on the Stack page after logged in")
	public void the_user_is_on_the_stack_page_after_logged_in() {
	    
	}

	@When("The user clicks on the Operations in Stack link")
	public void the_user_clicks_on_the_operations_in_stack_link() {
		stack.operationstack();
	}

	@Then("The user should then be directed to {string} Page")
	public void the_user_should_then_be_directed_to_page(String string) {
		String Title = stack.getStackpageTitle();
	    LoggerLoad.info("Title of current page is:" + Title);
	    assertEquals(Title, "Operations in Stack");
	}
	
	@When("The user clicks {string} button in {string} page")
	public void the_user_clicks_button_in_page(String string, String string2) {
		stack.tryherestack();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		String Title1 = stack.getStackpageTitle();
	    LoggerLoad.info("Title of current page is:" + Title1);
	    assertEquals(Title1, "Assessment");
	    
	}
	
	@Given("The user is in the Stack page after having an tryEditor with a Run button to test")
	public void the_user_is_in_the_stack_page_after_having_an_try_editor_with_a_run_button_to_test() {
	    
	}

	@When("user enter the Python code | print\"stack\" |")
	public void user_enter_the_python_code_print_stack() {
		
		stack.tryeditorstack("print\"stack\"");
	    
	}

	@When("The user clicks on Run button after Entering valid python code in stack tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_stack_try_editor() {
		stack.runbtnstack();
	}
	
	@Then("The user should be presented with Run output of stack page")
	public void the_user_should_be_presented_with_run_output_of_stack_page() {
		assertEquals(stack.readOutput(), "stack");
	    
	}
	
	@Given("The user is in the Stack page")
	public void the_user_is_in_the_stack_page() {
		stack.tryeditorload();
	}
	
	@When("user enter the invalidpython code | print stack\" |")
	public void user_enter_the_invalidpython_code_print_stack() {
		stack.tryeditorstack("print stack\"");
	
	}

	@When("The user clicks on Run button after Entering invalid python code in stack tryEditor")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_stack_try_editor() {
		stack.runbtnstack();
	    
	}

	@Then("The user should get the error message")
	public void the_user_should_get_the_error_message() {
		
		String message=stack.alert();
		LoggerLoad.info("Error Message is:" + message);
	   
	}
	
	@Given("The user is on the Stack  after logged in")
	public void the_user_is_on_the_stack_after_logged_in() {
		stack.operationinstackload();
	}

	@When("The user clicks on the Practice Questions button")
	public void the_user_clicks_on_the_practice_questions_button() {
		stack.stackpractics();
	}

	@Then("The user should be redirected to Practice Questions page")
	public void the_user_should_be_redirected_to_practice_questions_page() {
		String Titlepractice = stack.getpracticspageTitle();
	    LoggerLoad.info("Title of current page is:" + Titlepractice);
	    assertEquals(Titlepractice, "Practice Questions");
	    
	}
}
