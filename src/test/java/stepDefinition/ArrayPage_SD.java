package stepDefinition;


import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import utilities.LoggerLoad;

public class ArrayPage_SD {

ArrayPage array=new ArrayPage();
	
	
	@Given("The user opens Home Page and enter array page")
	public void the_user_opens_home_page_and_enter_array_page() {
		array.homepage();
	}

	@When("The user clicks array")
	public void the_user_clicks_array() {
	    array.arraypage();
	}

	@Then("The user should be redirected arraypage")
	public void the_user_should_be_redirected_arraypage() {
	    LoggerLoad.info("user in Array page");
	}
	
	@Given("User is on {string} after logged in")
	public void user_is_on_after_logged_in(String string) {
		array.arraypage();
	}

	@When("User clicks on Arrays in Python link")
	public void user_clicks_on_arrays_in_python_link() {
	   array.clickArraysInPythonLink();
	}

	@Then("User should be redirected to {string} page")
	public void user_should_be_redirected_to_page(String string) {
		LoggerLoad.info("user in Arrays in Python page");
	}
	
	@Given("User is on Arrays in Python page after logged in")
	public void user_is_on_arrays_in_python_page_after_logged_in() {
	   array.arrayphythonpage();
	}
	
	@When("User clicks on Try Here button in Arrays in Python page")
	public void user_clicks_on_button_in() {
	    array.clickTryHereLink();
	}

	@Then("User should be redirected to a page having an tryEditor with a Run button to test")
	public void user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("user in on Assessment page");
	}
	
	@Given("The user is in the array page after having an tryEditor with a Run button to test")
	public void the_user_is_in_the_array_page_after_having_an_try_editor_with_a_run_button_to_test() {
		array.arrayphythonpagetry();
	    
	}

	@When("user enter the Python code | print\"array\" |")
	public void user_enter_the_python_code_print_array() {
		
		array.fetchPythonCode("print\"array\"");
	    
	}

	@When("The user clicks on Run button after Entering valid python code in array tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_array_try_editor() {
		array.clickRunButton();
	    
	}

	@Then("The user should be presented with Run output of array page")
	public void the_user_should_be_presented_with_run_output_of_array_page() {
		
		assertEquals(array.fetchOutput(), "array");
	    
	}
	
	@Given("The user is in the array page")
	public void the_user_is_in_the_array_page() {
		
		array.arrayphythonpagetry();
	    
	}

	@When("user enter the invalidpython code | print array\" |")
	public void user_enter_the_invalidpython_code_print_array() {
		
		array.fetchPythonCode("print array\"");
	    
	}

	@When("The user clicks on Run button after Entering invalid python code in array tryEditor")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_array_try_editor() {
		
		array.clickRunButton();
	    
	}

	@Then("The user should get the error message in array")
	public void the_user_should_get_the_error_message_in_array() {

		String message=array.alertarray();
		LoggerLoad.info("Error message is: "+message);
		   
	    
	}
	
	@Given("User is on Array page after logged in")
	public void user_is_on_array_page_after_logged_in() {
		array.arrayphythonpage();	    
	}

	@When("Clicks on Arrays Using List link")
	public void clicks_on_arrays_using_list_link() {
		array.clickArraysUsingListLink();
	    
	}

	@Then("User should be redirected to Arrays Using List page")
	public void user_should_be_redirected_to_arrays_using_list_page() {
		LoggerLoad.info("User should be redirected to Arrays Using List page");
	    
	}
	
	@Given("User is on Arrays Using List after logged in")
	public void user_is_on_arrays_using_list_after_logged_in() {
	    array.arrayinlist();
	}

	@When("User clicks on Try Here button in Arrays Using List")
	public void user_clicks_on_try_here_button_in_arrays_using_list() {
		 array.clickTryHereLink();
	    
	}

	@Then("User should be redirected to a page having an tryEditor")
	public void user_should_be_redirected_to_a_page_having_an_try_editor() {
	   
	}
	
	@Given("User is on Try Editor Page  of phythonlist")
	public void user_is_on_try_editor_page_of_phythonlist() {
		array.arrayphythonpagetry();
	    
	}

	@When("User enters valid Python code from sheet | print\"phython list\" |")
	public void user_enters_valid_python_code_from_sheet_print_phython_list() {
		array.fetchPythonCode("print\"phython list\"");
	   
	}

	@When("User clicks on Run button for phythonlist")
	public void user_clicks_on_run_button_for_phythonlist() {
		
		array.clickRunButton();
	    
	}

	@Then("User should be able to see the output of phython list")
	public void user_should_be_able_to_see_the_output_of_phython_list() {
		assertEquals(array.fetchOutput(), "phython list");
	    
	}
	
	@Given("The user is in the array page array list")
	public void the_user_is_in_the_array_page_array_list() {
		
		array.arrayphythonpagetry();
	    
	}

	@When("user enter the invalidpython code | print negative array list\" |")
	public void user_enter_the_invalidpython_code_print_negative_array_list() {
		array.fetchPythonCode("print negative array list\"");
	    
	}

	@When("The user clicks on Run button after Entering invalid python code for phythonlist")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_for_phythonlist() {
		array.clickRunButton();
	    
	}

	@Then("The user should get the error message in array list")
	public void the_user_should_get_the_error_message_in_array_list() {
		
		String message=array.alertarraylist();
		LoggerLoad.info("Error message is: "+message);
	   
	}
	

	@Given("User is on Array page after logged in  Basic Operations")
	public void user_is_on_array_page_after_logged_in_basic_operations() {
		array.arraypage();
		
	}

	@When("User clicks on Basic Operations")
	public void user_clicks_on_basic_operations() {
		array.clickbasicOperationsInListsLink();
	}

	@Then("User should be redirected to Basic Operations in Lists page")
	public void user_should_be_redirected_to_basic_operations_in_lists_page() {
		
		LoggerLoad.info("user is on basic operation page");
		
		String Titlbasicoperation = array.getarraybasicpage();
	    LoggerLoad.info("Title of current page is:" + Titlbasicoperation);
	    assertEquals(Titlbasicoperation, "Basic Operations in Lists");
		
	}
	
	@Given("User is on Try Editor Page of basic operation in list after logged in")
	public void user_is_on_try_editor_page_of_basic_operation_in_list_after_logged_in() {
		array.arrayphythonpagetry();
	    
	}

	@When("User enters valid Python code from sheet | print\"user work on basic operation of list\" |")
	public void user_enters_valid_python_code_from_sheet_print_user_work_on_basic_operation_of_list() {
		array.fetchPythonCode("print\"user work on basic operation of list\"");
	}


	@When("User clicks on Run button  of basic operation in list")
	public void user_clicks_on_run_button_of_basic_operation_in_list() {
		array.clickRunButton();
	   
	}

	@Then("User should be able to see the output of basic operation in list")
	public void user_should_be_able_to_see_the_output_of_basic_operation_in_list() {
		assertEquals(array.fetchOutput(), "user work on basic operation of list");
	    
	}
	
	@Given("User is on Try Editor Page of basic operation in list")
	public void user_is_on_try_editor_page_of_basic_operation_in_list() {
		array.arrayphythonpagetry();
	    
	}

	@When("User enters valid Python code from sheet | print user work on basic operation of list negative test\" |")
	public void user_enters_valid_python_code_from_sheet_print_user_work_on_basic_operation_of_list_negative_test() {
		
		array.fetchPythonCode(" print user work on basic operation of list negative test\"");
	    
	}

	@When("User clicks on Run button  of basic operation")
	public void user_clicks_on_run_button_of_basic_operation() {
		array.clickRunButton();
	    
	}

	@Then("User should be able to see the output of basic operation")
	public void user_should_be_able_to_see_the_output_of_basic_operation() {
		String message=array.alertarraylist();
	    
	}
	
	@Given("User is on Array  after logged in")
	public void user_is_on_array_after_logged_in() {
		array.arraypage();
	    
	}

	@When("User clicks on Applications of Array")
	public void user_clicks_on_applications_of_array() {
	    array.clickapplicationsOfArrayLink();
	}

	@Then("User should be redirected to Applications of Array page")
	public void user_should_be_redirected_to_applications_of_array_page() {
		

		String Titlbasicoperation = array.getarraybasicpage();
	    LoggerLoad.info("Title of current page is:" + Titlbasicoperation);
	    assertEquals(Titlbasicoperation, "Applications of Array");
	    
	}
	@Given("User is on Application of array page after logged in")
	public void user_is_on_application_of_array_page_after_logged_in() {
	    array.arrayinapplication();
	}

	@When("User clicks on Practice Questions")
	public void user_clicks_on_practice_questions() {
		array.clickpracticeQuestionsLink();
	    
	}

	@Then("User should be redirected to Practice Questions page")
	public void user_should_be_redirected_to_practice_questions_page() {
		String Pagetitle = array.title();
	    LoggerLoad.info("Title of current page is:" + Pagetitle);
	    assertEquals(Pagetitle, "Practice Questions");
		
	    
	}
	
	@Given("User is on Practice page after logged in")
	public void user_is_on_practice_page_after_logged_in() {
		array.arrayinpracticepage();
	    
	}

	@When("User clicks on Search the Array")
	public void user_clicks_on_search_the_array() {
		array.clickSearchTheArrayLink();
	   
	}

	@Then("User should be redirected to Questions page contains a tryEditor with Run and Submit buttons")
	public void user_should_be_redirected_to_questions_page_contains_a_try_editor_with_run_and_submit_buttons() {
		String Pagetitle = array.title();
	    LoggerLoad.info("Title of current page is:" + Pagetitle);
	    assertEquals(Pagetitle, "Assessment");
	    
	}
	
	@Given("User is on Question page of Search the array after logged in")
	public void user_is_on_question_page_of_search_the_array_after_logged_in() {
		array.arrayinquestionpage();	    
	}

		
	@When("User enters valid Python code from sheet \"print\\(\"question page\")\"")
	public void user_enters_valid_python_code_from_sheet_print_question_page() {
		//array.clearEditorText();
		array.fetchPythonCode("print(\"question page\")");
		LoggerLoad.info("user_enters_valid_python_code_from_sheet_print_question_page " + array.getEditorText());
	}

	@When("User clicks on Run button of Practice Questions")
	public void user_clicks_on_run_button_of_practice_questions() {
		array.clickRunButton();
		LoggerLoad.info(" checking clickevent in array sd page");
	    
	}

	@Then("User should be able to see the Result Practice Questions")
	public void user_should_be_able_to_see_the_result_practice_questions() {
		
		String message=array.alertarraylist();
		LoggerLoad.info(" checking output in array sd page" + message );
		
	    
	}
	
	@Given("User is on Practice page  after logged in  Find Numbers with Even Number")
	public void user_is_on_practice_page_after_logged_in_find_numbers_with_even_number() {
		array.arrayinpracticepage();
	    
	}

	@When("User clicks on Find Numbers with Even Number of Digits link")
	public void user_clicks_on_find_numbers_with_even_number_of_digits_link() {
		array.clickFindNumbersWithEvenNumberOfDigitsLink();
	    
	}

	@Then("User should be redirected to Questions page contains a tryEditor with Run and Submit buttons on Find Numbers with Even Number")
	public void user_should_be_redirected_to_questions_page_contains_a_try_editor_with_run_and_submit_buttons_on_find_numbers_with_even_number() {
		
		String Pagetitle = array.title();
	    LoggerLoad.info("Title of current page is:" + Pagetitle);
	    assertEquals(Pagetitle, "Assessment");
	    
	    
	}

	
			@Given("User is on Question page of FindNumberswithEvenNumberofDigits after logged in")
			public void user_is_on_question_page_of_find_numberswith_even_numberof_digits_after_logged_in() {
				array.arrayinQuestionFindNumberswithEvenNumberofDigits();
				
		
			}
		
			@When("User enters valid Python code from sheet {string}")
			public void user_enters_valid_python_code_from_sheet(String string) {
				array.fetchPythonCode(string);
			    
			
				
		
			}
		
			@When("User clicks on Submit button for FindNumberswithEvenNumberofDigits")
			public void user_clicks_on_submit_button_for_find_numberswith_even_numberof_digits() {
				array.clickSubmitButton();
		
			}
		
			@Then("User should get success submission message FindNumberswithEvenNumberofDigits")
			public void user_should_get_success_submission_message_find_numberswith_even_numberof_digits() throws InterruptedException {
				//Thread.sleep(500);
				array.waitForSubmit();
				String s= array.submitOutput();
				LoggerLoad.info("user_should_get_success_submission_message_find_numberswith_even_numberof_digits "+ s);
		        assertEquals(s,"Error occurred during submission");
			}
			
			@Given("User is on Practice page after logged in Squares of a Sorted Array")
			public void user_is_on_practice_page_after_logged_in_squares_of_a_sorted_array() {
				array.arrayinpracticepage();
			    
			}

			@When("User clicks on Squares of a Sorted Array link")
			public void user_clicks_on_squares_of_a_sorted_array_link() {
				array.clickSquaresOfASortedArrayLink();
			    
			}

			@Then("User should be redirected to Questions page contains a tryEditor with Run and Submit buttons of Squares of a Sorted Array")
			public void user_should_be_redirected_to_questions_page_contains_a_try_editor_with_run_and_submit_buttons_of_squares_of_a_sorted_array() {
				String Pagetitle = array.title();
			    LoggerLoad.info("Title of current page is:" + Pagetitle);
			    assertEquals(Pagetitle, "Assessment");
			}
			
			@Given("User is on {string} page of {string} after logged in")
			public void user_is_on_page_of_after_logged_in(String string, String string2) {
				array.arrayinQuestionSquaresofaSortedArrayurlpage();
			    
			}

			@When("User enters valid Python code from sheet {string} for the PracticeQuestions")
			public void user_enters_valid_python_code_from_sheet_for_the_practice_questions(String string) {
				array.fetchPythonCode(string);
			   
			}

			@When("User clicks on Submit button")
			public void user_clicks_on_submit_button() {
				array.clickSubmitButton();
			    
			}

			@Then("User should get success submission message")
			public void user_should_get_success_submission_message() {
				array.waitForSubmit();
				String s= array.submitOutput();
				LoggerLoad.info("user_should_get_success_submission_message_find_numberswith_even_numberof_digits "+ s);
		        assertEquals(s,"Error occurred during submission");
				
			}



}
