package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GraphPage;
import pageObjects.HomePage;

import utilities.LoggerLoad;

public class GraphPage_SD {

	HomePage home_page =new HomePage();

	GraphPage graphPage=new GraphPage();
	
	

	@Given("User is on Home Page of DsAlgo Portal")
	public void user_is_on_home_page_of_ds_algo_portal() {
	   graphPage.navigate_home_page();
	}

	@When("User clicks on Graph Get started button")
	public void user_clicks_on_graph_get_started_button() {
		LoggerLoad.info("----------------User clicks on Graph Get started button------------------");
	    graphPage.getstartedbutton_graph();
	}

	@Then("User re-directed to Graph Page")
	public void user_re_directed_to_graph_page() {
		LoggerLoad.info("----------------User is on Graph Page------------------");
	}

	@Given("User is on Graph Data Structure Page")
	public void user_is_on_graph_data_structure_page() {
		LoggerLoad.info("----------------User is on Graph Data Structure Page----------------");
	}

	@When("User clicks on Graph link in Graph Page")
	public void user_clicks_on_graph_link_in_graph_page() {
		LoggerLoad.info("----------------User clicks on Graph link in Graph Page-------------------");
		graphPage.navigate_graph_link();
	}

	@Then("User is re-directed to Graphlink of Graph Page")
	public void user_is_re_directed_to_graphlink_of_graph_page() {
		LoggerLoad.info("----------------User is re-directed to Graphlink of Graph Page--------------");
	}

	@Given("User is on Graph link of Graph Page")
	public void user_is_on_graph_link_of_graph_page() {
		LoggerLoad.info("----------------User is on Graph link of Graph Page-----------------");
	}

	
	
	@When("User clicks on Try here button of Graph page")
	public void user_clicks_on_try_here_button_of_Graph_page() {
		LoggerLoad.info("----------User clicks on Try here button-------------");
		graphPage.click_try_button();  
	}

	@Then("User is re-directed to tryEditor Page")
	public void user_is_re_directed_to_try_editor_page() {
		LoggerLoad.info("------------User is re-directed to tryEditor Page--------------");   
	}

	@Given("User is on tryEditor Page")
	public void user_is_on_try_editor_page() {
		LoggerLoad.info("-------------User is on tryEditor Page-------------");   
	}

	@When("User enters Valid Python code {string}")
	public void user_enters_valid_python_code(String string) {
		LoggerLoad.info("----------------User enters Valid Python code--------------");
	    graphPage.enter_code_txtarea(string);
	}
	
	

	@When("clicks on Run button")
	public void clicks_on_run_button() {
		LoggerLoad.info("----------------clicks on Run button-----------------");
		graphPage.run_button();
	}

	@Then("User is presented with the Result")
	public void user_is_presented_with_the_result() {
		LoggerLoad.info("--------User is presented with the Result-------------");
		graphPage.getresult();
		
	 }
	@Given("User is on Graph Page")
	public void user_is_on_graph_page() {
		LoggerLoad.info("---------------User is on graph Page-------------");
		graphPage.navigate_graph_link();
		LoggerLoad.info("---------User is NAVIGATED TO graph Page-------------");
	}

	@When("User clicks on  Graph Representations link")
	public void user_clicks_on_graph_representations_link() {
		LoggerLoad.info("--------User clicks on  Graph Representations link--------");
		graphPage.graph_rep_link();
	}
	
	@When("User enters  code {string}")
	public void user_enters_code(String string) {
		LoggerLoad.info("-------User clicks on  Graph Representations link------");
		graphPage.enter_code_txtarea(string);
		//graphPage.grph_rep_link();
	}
	

	@Then("User is presented with Error Message")
	public void user_is_presented_with_error_message() {
		LoggerLoad.info("----------------User is presented with Error Message-----------------");
	    graphPage.capture_alert();
	}


	

	@Then("User is navigated to Graph Representations Page")
	public void user_is_navigated_to_graph_representations_page() {
	    
		LoggerLoad.info("--------------User is navigated to Graph Representations Page---------------");
	}

	
	@Given("User is on Graph Representations Page")
	public void user_is_on_graph_representations_page() {
	   
		LoggerLoad.info("--------------User is on Graph Representations Page---------------");
	}
	
	
	@When("User clicks on Try here button of Graph Representations page")//n
	public void user_clicks_on_try_here_button_of_graph_representations_page() {
		LoggerLoad.info("--------------User clicks on Practice Questions link----------------");
		graphPage.click_try_button();  
	   
	}
	

	@When("User clicks on  Practice Questions of Graph page")
	public void user_clicks_on_practice_questions_of_graph_page() {
		LoggerLoad.info("--------------User clicks on Practice Questions link--------------");
		graphPage.grph_prac_quest();
	   
	}

	@Then("The user should be redirected to Practice Questions of Graph page")
	public void the_user_should_be_redirected_to_practice_questions_of_graph_page() {
		LoggerLoad.info("--------------User is navigated to Practice Questions Page--------------");
	}
	
	
	
}