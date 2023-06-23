package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LinkedListPage;
import utilities.LoggerLoad;

public class LinkedListPage_SD {

	LinkedListPage llpom = new LinkedListPage();

	@When("User clicks on LinkedList Getstarted button")
	public void user_clicks_on_linked_list_getstarted_button() {
		LoggerLoad.info(
				"-----------------------------------User clicks on LinkedList Getstarted button-------------------------------------");
		llpom.getstarted_button_linkedlist();
	}

	@Then("User redirected to LinkedList Page")
	public void user_redirected_to_linkedlist_page() {
		LoggerLoad.info("----------------------------------The User redirected to LinkedList Page-------------------------------------");

	}

	@Given("The user is on the Linked List page")
	public void the_user_is_on_the_linked_list__page() {
		LoggerLoad.info("-----------------------------------The user is on the Linked List page---------------------------------------------");
		llpom.ll_ds();
	}

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
		LoggerLoad.info(
				"------------------------------------User Clicks on Introduction link---------------------------------------------");
		llpom.Clickon_introductionLink();

	}

	@Then("The user move to Introduction of Linked List Page")
	public void the_user_move_to_introduction_of_linked_list_page() {
		LoggerLoad.info("----------------------------------The user move to Introduction of Linked List Page---------------------------------------------");

	}

	@Given("The user is on the Introduction Page")
	public void the_user_is_on_the_introduction_page() {
		llpom.Clickon_introductionLink();
	}

	@When("The user clicks Try Here button in the introduction page")
	public void the_user_clicks_try_here_button_in_the_introduction_page() {

		LoggerLoad.info(
				"-------------------------The user clicks Try Here button in the introduction page---------------------------------------");
		llpom.navigateTotryEditor();
	}

	@Then("The user redirected to the tryEditor page of introduction page")
	public void the_user_redirected_to_the_tryeditor_page_of_induction_page() {
		LoggerLoad.info(
				"-------------------------The user redirected to the tryEditor page of introduction page--------------------------------------");
	}

	@Given("User is on Try Editor Page of introduction page")
	public void user_is_on_try_editor_page_of_introduction_page() {
		LoggerLoad.info(
				"-------------------------\"User is on Try Editor Page of introduction page--------------------------------------");
	}

	@When("User Enters {string} in the Editor of introduction page")
	public void user_enters_in_the_editor_of_introduction_page(String string) {
		llpom.click_textarea(string);
	}

	@When("clicks on Run Button of introduction page")
	public void clicks_on_run_button_of_introduction_page() {
		LoggerLoad.info(
				"-------------------------clicks on Run Button of introduction pag--------------------------------------");
		llpom.Clickon_runButton();

	}

	@Then("The User is Presented with result of introduction page")
	public void the_user_is_presented_with_result__of_introduction_page() {
		LoggerLoad.info(
				"----------The User is Presented with error message of introduction page------------------------");
		llpom.display_result();
	}

	@When("The user clicks creating linked list link")
	public void the_user_clicks_creating_linked_list_link() {
		LoggerLoad.info(
				"--------------------------------------------------------The user clicks creating linked list link---------------------------------------");
		llpom.Clickon_creatinglinkedlistLink();
	}

	@Then("The user move to Creating Linked LIst of Linked List Page")
	public void the_user_move_to_creating_Linked_list_of_linked_list_page() {
		LoggerLoad.info(
				"-------------------------------------------------------The user move to Creating Linked LIst of Linked List Page---------------------------------------");
	}

	@Given("The user is on the Creating a Linked List of Linked List Page")
	public void the_user_is_on_the_creating_a_linked_list_of_linked_list_page() {
		LoggerLoad.info(
				"-------------------------------------------------------The user is on the Creating a Linked List of Linked List Page\"--------------------------------------");
	}

	@When("clicks Try Here button in the creation of linked listPage")
	public void clicks_try_here_button_in_the_creation_of_linked_listpage() {
		LoggerLoad.info(
				"-------------------------------------------------------clicks Try Here button in the creation of linked listPage------------------------------------");
		llpom.navigateTotryEditor();

	}

	@Then("The user redirected to the tryEditor page of creating linked list Page")
	public void the_user_redirected_to_the_tryeditor_page_of_creating_linked_list_page() {
		LoggerLoad.info(
				"-------------------------------------------------------The user redirected to the tryEditor page of creating linked list Page-----------------------------------");
//				LoggerLoad.info("User redirected to a page having an tryEditor with a Run button to test");
//				String Title = llpom.getpagetitle_linkedlist();
//				LoggerLoad.info("Title of current page is :" + Title);
//				//assertEquals(Title, "Assessment", "Title do not match");
	}

	@Given("User is on Try Editor Page of creating linked list page")
	public void user_is_on_try_editor_page_of_creating_linked_list_page() {
		LoggerLoad.info(
				"-------------------------------------------------------User is on Try Editor Page of creating linked list page-----------------------------------");

	}

	@When("The user Enter invalid python code {string} in creating linked list page") // 1
	public void the_user_enter_invalid_python_code_in_creating_linked_list_page(String string) {
		LoggerLoad.info(
				"------------------------------------------------------The user Enter invalid python code {string} in creating linked list page-----------------------------------");
		llpom.click_textarea(string);

	}

	@When("click on run button of Creating a Linked List page")
	public void click_on_run_button_of_creating_a_linked_list_page() {
		LoggerLoad.info(
				"------------------------------------------------------click on run button of Creating a Linked List pagee-----------------------------------");
		llpom.Clickon_runButton();
	}

	@Then("The user get the error message of Creating a Linked List page")
	public void the_user_get_the_error_message_of_creating_a__linked_list_page() throws InterruptedException {
		LoggerLoad.info(
				"---------------------------------------------------The user get the error message of Creating a Linked List page----------------------------------");
		llpom.capture_alert();
	}

	@When("The user clicks Types of Linked List link")
	public void the_user_clicks_types_of_linked_list_link() {
		LoggerLoad.info(
				"---------------------------------------------------The user clicks Types of Linked List link----------------------------------");
		llpom.Clickon_typesOfLinkedLink();
	}

	@Then("The user move to Types of Linked List of Linked List Page") // 7
	public void the_user_move_to_types_of_linked_list_of_linked_list_page() {

		LoggerLoad.info(
				"---------------------------------------------------The user move to Types of Linked List of Linked List Page----------------------------------");
	}

	@Given("The user is on the Types of Linked list Page") // 8
	public void the_user_is_on_the_types_of_linked_list_page() {
		LoggerLoad.info(
				"---------------------------------------------------The user is on the Types of Linked list Page----------------------------------");
	}

	@When("The user clicks TryHere button in the types of linkedlist page") // 9
	public void the_user_clicks_tryhere_button_in_the_types_of_linkedlist_page() {
		LoggerLoad.info(
				"---------------------------------------------------he user clicks TryHere button in the types of linkedlist page----------------------------------");
		llpom.navigateTotryEditor();
	}

	@Then("The user redirected to the tryEditor page of types of linked list page") // 10
	public void the_user_redirected_to_the_tryeditor_page_of_types_of_linked_list_page() {

	}

	@Given("User is on TryEditor Page of Types of Linked List") // 1
	public void user_is_on_tryeditor_page_of_types_of_linked_list() {
		LoggerLoad.info(
				"---------------------------------------------------User is on TryEditor Page of Types of Linked List---------------------------------");

	}

	@When("The user Enter valid python code {string} in types of linked list page") // e
	public void the_user_enter_valid_python_code_in_creating_linked_list_page(String string) {
		LoggerLoad.info(
				"--------------------------------------------------The user Enter valid python code in types of linked list page--------------------------------");
		llpom.click_textarea(string);
	}

	@When("click on run button of Types of Linked List page")
	public void click_on_run_button_of_types_of_linked_list_page() {
		LoggerLoad.info(
				"-------------------------------------------------click on run button of Types of Linked List page-------------------------------");
		llpom.Clickon_runButton();
	}

	@Then("The User is Presented with a Result of types of Linked List page") // 10
	public void the_user_is_presented_with_a_result_of_types_of_linked_list_page() {

		llpom.display_result();
//							LoggerLoad.info("User redirected to a page having an tryEditor with a Run button to test");
//							String Title = llpom.getpagetitle_linkedlist();
//							LoggerLoad.info("Title of current page is :" + Title);
//							assertEquals(Title, "Assessment", "Title do not match");
	}

	@When("The user clicks Implement Linked List in Python link")
	public void the_user_clicks_implement_linked_list_in_python_link() {
		LoggerLoad.info(
				"------------------------------------------------The user clicks Implement Linked List in Python link-------------------------------");
		llpom.Clickon_implementLLInPythonLink();
	}

	@Then("The user move to Implement Linked List in Python of Linked List Page") // 17
	public void the_user_move_to_implement_linked_list_in_python_of_linked_list_page() {
		LoggerLoad.info(
				"----------------------------------------------The user move to Implement Linked List in Python of Linked List Page----------------------------");
	}

	@Given("The user is on the Implement Linked List in Python") // 18
	public void the_user_is_on_the_implement_linked_list_in_python() {
		LoggerLoad.info(
				"----------------------------------------------The user is on the Implement Linked List in Python----------------------------");
	}

	@When("The user clicks Try Here button in the implemented linked list in python page") // 19
	public void the_user_clicks_try_here_button_in_the_implemented_linked_list_in_python_page() {
		LoggerLoad.info(
				"----------------------------------------------The user clicks Try Here button in the implemented linked list in python page---------------------------");
		llpom.navigateTotryEditor();
	}

	@Then("The user redirected to the tryEditor page of Implement Linked List in Python") // 10
	public void the_user_redirected_to_the_tryeditor_page_of_implement_linked_list_in_python() {
		LoggerLoad.info(
				"---------------------------------------------The user redirected to the tryEditor page of Implement Linked List in Python---------------------------");
//				LoggerLoad.info("User redirected to a page having an tryEditor with a Run button to test");
//				String Title = llpom.getpagetitle_linkedlist();
//				LoggerLoad.info("Title of current page is :" + Title);
//				assertEquals(Title, "Assessment", "Title do not match");
	}

	@When("User Enters  invalid python code {string} in implementation link list in python") // 22
	public void user_enters_invalid_python_code_in_implementation_link_list_in_python(String string) {
		LoggerLoad.info(
				"---------------------------------------------User Enters  invalid python code {string} in implementation link list in python---------------------------");

		llpom.click_textarea(string);
	}

	@Then("The user get the error message of implementation link list in python")
	public void the_user_get_the_error_message_of_implementation_link_list_in_python() throws InterruptedException {
		LoggerLoad.info(
				"--------------------------------------------The user get the error message of implementation link list in python---------------------------");
		//llpom.capture_alert();
	}

	@When("The user clicks Traversal link")
	public void the_user_clicks_traversal_link() {
		LoggerLoad.info(
				"-------------------------------------------The user clicks Traversal link---------------------------");
		llpom.Clickon_Traversal();
	}

	@Then("The user move to Traversal of Linked List Page") // 27
	public void the_user_move_to_traversal_of_linked_list_page() {
		LoggerLoad.info(
				"------------------------------------------The user move to Traversal of Linked List Page---------------------------");
	}

	@Given("The user is on the Traversal Page") // 28
	public void the_user_is_on_the_traversal__page() {
		LoggerLoad.info(
				"----------------------------------------The user is on the Traversal Page---------------------------");
	}

	@When("The user clicks Try Here button in the traversal page") // 29
	public void the_user_clicks_try_here_button_in_the_traversal_page() {
		LoggerLoad.info(
				"---------------------------------------The user clicks Try Here button in the traversal page---------------------------");
		llpom.navigateTotryEditor();
	}

	@Then("The user redirected to the tryEditor page of Traversal page") // 10
	public void the_user_redirected_to_the_tryeditor_page_of_traversal_page() {
//				LoggerLoad.info("User redirected to a page having an tryEditor with a Run button to test");
//				String Title = llpom.getpagetitle_linkedlist();
//				LoggerLoad.info("Title of current page is :" + Title);
//				assertEquals(Title, "Assessment", "Title do not match");
	}

//		    31.Given The user is on the Linked List page
//		    32.When The user clicks Insertion link
//		    33.Then The user move to Insertion of Linked List Page

	@Given("The user is on Tryeditor page of traversal") // 1
	public void the_user_is_on_tryeditor_page_of_traversal() {
		LoggerLoad.info(
				"---------------------------------------The user is on Tryeditor page of traversal--------------------------");
	}

	@When("The user Enter valid python code {string} in traversal page")
	public void the_user_enter_valid_python_code_in_traversal_page(String string) {

		LoggerLoad.info(
				"--------------------------------------The user Enter valid python code {string} in traversal page-------------------------");
		llpom.click_textarea(string);
	}

	@When("click on run button of traversal page")
	public void click_on_run_button_of_traversal_page() {
		LoggerLoad.info(
				"--------------------------------------click on run button of traversal page-------------------------");
		llpom.Clickon_runButton();
	}

	@Then("The user should get the Run output of traversal page") // 10
	public void the_user_should_get_the_Run_output_of_traversal__page() {
		LoggerLoad.info(
				"--------------------------------------The user should get the Run output of traversal page-------------------------");
		llpom.display_result();
//				LoggerLoad.info("User redirected to a page having an tryEditor with a Run button to test");
//				String Title = llpom.getpagetitle_linkedlist();
//				LoggerLoad.info("Title of current page is :" + Title);
//				assertEquals(Title, "Assessment", "Title do not match");
	}

	@When("The user clicks Insertion link")
	public void the_user_clicks_insertion_link() {
		LoggerLoad.info("-------------------------------------The user clicks Insertion link-------------------------");
		llpom.Clickon_Insertion();
	}

	@Then("The user move to Insertion of Linked List Page") // 33
	public void the_user_move_to_insertion_of_linked_list_page() {
		LoggerLoad.info(
				"------------------------------------The user move to Insertion of Linked List Page-------------------------");
	}

	@Given("The user is on the Insertion Page") // 34
	public void the_user_is_on_the_insertion_page() {
		LoggerLoad
				.info("------------------------------------The user is on the Insertion Page------------------------");
	}

	@When("The user clicks Try Here button in the Insertion page") // 35
	public void the_user_clicks_try_here_button_in_the_insertion_page() {
		LoggerLoad.info(
				"------------------------------------ The user clicks Try Here button in the Insertion page------------------------");
		llpom.navigateTotryEditor();
	}

	@Then("The user redirected to the tryEditor page of Insertion") // 10
	public void the_user_redirected_to_the_tryeditor_page_of_insertion() {
		LoggerLoad.info(
				"------------------------------------ The user redirected to the tryEditor page of Insertion----------------------");
//				LoggerLoad.info("User redirected to a page having an tryEditor with a Run button to test");
//				String Title = llpom.getpagetitle_linkedlist();
//				LoggerLoad.info("Title of current page is :" + Title);
//				assertEquals(Title, "Assessment", "Title do not match");
	}

	@Given("The user is on Tryeditor page of Insertion") // 1
	public void the_user_is_on_tryeditor_page_of_insertion() {
		LoggerLoad.info(
				"-----------------------------------The user is on Tryeditor page of Insertion----------------------");
	}

	@When("The user Enter invalid python code {string} in insertion page")
	public void the_user_enter_invalid_python_code_in_insertion_page(String string) {

		LoggerLoad.info(
				"----------------------------------The user Enter invalid python code {string} in insertion page----------------------");
		llpom.click_textarea(string);
	}

	@When("click on run button of insertion page")
	public void click_on_run_button_of_insertion_page() {
		LoggerLoad
				.info("----------------------------------click on run button of insertion page----------------------");
		llpom.Clickon_runButton();
	}

	@Then("The user get the error message of insertion page")
	public void the_user_get_the_error_message_of_insertion_page() throws InterruptedException {
		LoggerLoad.info(
				"---------------------------------The user get the error message of insertion page---------------------");
		//llpom.capture_alert();

	}

	@When("The user clicks Deletion link")
	public void the_user_clicks_deletion_link() {
		LoggerLoad.info("--------------------------------The user clicks Deletion link--------------------");
		llpom.Clickon_Deletion();

	}

	@Then("The user move to Deletion of Linked List Page") // 33
	public void the_user_move_to_deletion_of_linked_list_page() {
		LoggerLoad.info(
				"-------------------------------The user move to Deletion of Linked List Page-------------------");

	}

	@Given("The user is on the Deletion page")
	public void the_user_is_on_the_deletion_page() {
		LoggerLoad.info("------------------------------The user is on the Deletion page-------------------");
	}

	@When("The user clicks Try Here button in the Deletion page") // 35
	public void the_user_clicks_try_here_button_in_the_deletion_page() {
		LoggerLoad.info(
				"-----------------------------The user clicks Try Here button in the Deletion page-------------------");
		llpom.navigateTotryEditor();
	}

	@Then("The user redirected to the tryEditor page of Deletion") // 10
	public void the_user_redirected_to_the_tryeditor_page_of_deletion() {
		LoggerLoad.info(
				"-----------------------------The user redirected to the tryEditor page of Deletion-------------------");
//					LoggerLoad.info("User redirected to a page having an tryEditor with a Run button to test");
//					String Title = llpom.getpagetitle_linkedlist();
//					LoggerLoad.info("Title of current page is :" + Title);
//					assertEquals(Title, "Assessment", "Title do not match");
	}

	@Given("The user is on Tryeditor page of deletion") // 1
	public void the_user_is_on_tryeditor_page_of_deletion() {
		LoggerLoad.info("----------------------------The user is on Tryeditor page of deletion------------------");
	}

	@When("The user Enter valid python code {string} in deletion page")
	public void the_user_enter_valid_python_code_in_deletion_page(String string) {
		LoggerLoad.info(
				"----------------------------The user Enter valid python code {string} in deletion page------------------");
		llpom.click_textarea(string);
	}

	@When("click on run button of deletion page")
	public void click_on_run_button_of_deletion_page() {
		LoggerLoad.info("---------------------------click on run button of deletion page------------------");
		llpom.Clickon_runButton();
	}

	@Then("The user should get the Run output deletion page")
	public void the_user_should_get_the_run_output_deletion_page() {
		LoggerLoad.info("--------------------------The user should get the Run output deletion page------------------");
		llpom.display_result();
	}

	@When("User clicks on the Practice Questions")
	public void user_clicks_on_the_practice_questions() {
		LoggerLoad.info("--------------------------User clicks on the Practice Questions------------------");
		llpom.Clickon_PracticeQuestion();
	}

	@Then("User redirected to Practice Questions of Linked List Page")
	public void user_redirected_to_practice_questions_of_linked_list_page() {

		LoggerLoad.info(
				"------------------------User redirected to Practice Questions of Linked List Page------------------");
	}


}
