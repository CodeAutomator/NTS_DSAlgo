package stepDefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.TreePage;
import utilities.LoggerLoad;

public class TreePage_SD {
	TreePage treepage= new TreePage();
	HomePage home_page =new HomePage();
	
	
@When("User clicks on Tree Get started button")
public void user_clicks_on_tree_get_started_button() {
	treepage.ClickTreeGS();
}
@Then("User re-directed to Tree Page")
public void user_re_directed_to_tree_page() {
	LoggerLoad.info("User redirected to Tree Data Structure Page ");
	String Title = treepage.getTreepageTitle();
	LoggerLoad.info("Title of current page is : " + Title);
}

	
	@When("The user clicks on the Overview of Trees link")
	public void the_user_clicks_on_the_overview_of_trees_link() {
		treepage.ClickOverview();
	}

	@Then("The user should be directed to the {string} of tree Page")
	public void the_user_should_be_directed_to_the_of_tree_page(String pagename) {
		LoggerLoad.info("User redirected to " + pagename);
		String Title = treepage.getTreepageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title, pagename, "Title do not match");
	}

	@When("The user clicks {string} button in a {string} page")
	public void the_user_clicks_button_in_a_page(String string, String string2) {
		treepage.ClickTryhereLink();

	}

	@Then("The user should be redirected to a page having tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("User redirected to a page having an tryEditor with a Run button to test");
		String Title = treepage.getTreepageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Assessment", "Title do not match");
	}


	@Given("The user is in trees page having an tryEditor with a Run button to test")
	public void the_user_is_in_trees_page_having_an_try_editor_with_a_run_button_to_test() {
		LoggerLoad.info("The user is in a page having an tryEditor with a Run button to test");
		treepage.navigateTotryEditor();
		String Title = treepage.getTreepageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
	}

	@When("User enters Valid Python code  {string}")
	public void user_enters_valid_python_code(String string) {
		LoggerLoad.info("----------User Enters Code in Editor------------------------");
		treepage.enter_code_txtarea(string);
	}
	
	@When("The user clicks on Run button after Entering valid python code in trees tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_trees_try_editor() {
		treepage.run_button();
	}

	@Then("The user should be presented with Run output for trees")
	public void the_user_should_be_presented_with_run_output_for_trees() {

		
		String actualMsg =treepage.getOutput();
		LoggerLoad.info("Actual result  :" + actualMsg);
		
	}


	@When("The user clicks on Run button after Entering invalid python code in trees tryEditor")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_trees_try_editor() {
		treepage.run_button();
	}

	@Then("The user should get the error message for trees")
	public void the_user_should_get_the_error_message_for_trees() {
		String actualMsg = treepage.getAlertrmsg();
		LoggerLoad.info("Actual result  :" + actualMsg);
		
	}

	
	@When("The user clicks on the Terminologies button")
	public void the_user_clicks_on_the_terminologies_button() {
		treepage.clickTerminologiesLink();
	}


	@When("The user clicks on the Types of Trees button")
	public void the_user_clicks_on_the_types_of_trees_button() {
		treepage.ClickTypesOFTree();
	}


	@When("The user clicks on the Tree Traversals button")
	public void the_user_clicks_on_the_tree_traversals_button() {
		treepage.ClickTreeTraversal();
	}
	

	@When("The user clicks on the Traversal illustration button")
	public void the_user_clicks_on_the_traversal_illustration_button() {
		treepage.ClickTraveIllustrate();
	}

	
	@When("The user clicks on the Binary Trees button")
	public void the_user_clicks_on_the_binary_trees_button() {
		treepage.ClickBinaryTrees();
	}


	@When("The user clicks on the Types of Binary Trees button")
	public void the_user_clicks_on_the_types_of_binary_trees_button() {
		treepage.ClickTypesofBinaryTrees();
	}

	
	/*@When("The user clicks on the Implementation in Python button")
	public void the_user_clicks_on_the_implementation_in_python_button() {
		treepage.click_implementationinPython();
	}


	@When("The user clicks on the binary tree traversals button")
	public void the_user_clicks_on_the_binary_tree_traversals_button() {
		treepage.click_binaryTreeTraversals();
	}

	@When("The user clicks on the Implementation of Binary Trees button")
	public void the_user_clicks_on_the_implementation_of_binary_trees_button() {
		treepage.click_implementationOfBinaryTrees();
	}

	@When("The user clicks on the Applications of Binary Trees button")
	public void the_user_clicks_on_the_Applications_of_binary_trees_button() {
		treepage.click_applicationsOfBinaryTrees();
	}

	@When("The user clicks on the Binary Search Trees button")
	public void the_user_clicks_on_the_binary_search_trees_button() {
		treepage.click_binarySearchTrees();
	}

	@When("The user clicks on the Implementation of BST button")
	public void the_user_clicks_on_the_implementation_of_bst_button() {
		treepage.click_implementationOfBST();
	}*/

	
	@When("The user clicks on the Types of Practice Questions button")
	public void the_user_clicks_on_the_types_of_practice_questions_button() {
		treepage.ClickPractQuesLink();
		
	}
	
	@Then("The user should be directed to Practice Questions of tree page Page")
	public void the_user_should_be_directed_to_practice_questions_of_tree_page_page() {
		String Title = treepage.getTreepageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		assertEquals(Title, "Practice Questions", "Title do not match");
		LoggerLoad.info("NO questions found ");
	}

}
