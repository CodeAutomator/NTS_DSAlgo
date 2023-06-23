package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.QueuePage;

import utilities.LoggerLoad;

public class QueuePage_SD {
	HomePage homePage= new HomePage();

	QueuePage Qpage = new QueuePage();
	
	@Given("User is on Home Page of Dsalgo Portal")
	public void user_is_on_home_page_of_dsalgo_portal() {
		homePage.homepage();
		LoggerLoad.info("----------User is on Home Page of Dsalgo Portal------------------------"); 
	}

	@When("User clicks on getstarted button")
	public void user_clicks_on_getstarted_button() {
		LoggerLoad.info("----------User clicks on getstarted button------------------------");
		Qpage.getstart_queue();
	}

	@Then("User is navigated to Queue data structure")
	public void user_is_navigated_to_queue_data_structure() {
		LoggerLoad.info("----------User is navigated to Queue data structure------------------------");   
	}

	@Given("User is on Queue Data Structure")
	public void user_is_on_queue_data_structure() {
		LoggerLoad.info("----------User is on Queue Data Structure------------------------");
	}

	@When("User clicks on Implementation of Queue in Python")
	public void user_clicks_on_implementation_of_queue_in_python() {
		LoggerLoad.info("----------User clicks on Implementation of Queue in Python------------------------");
		Qpage.implement_queue();
	}

	@Then("User is directed to Implementation of Queue in Python")
	public void user_is_directed_to_implementation_of_queue_in_python() {
          
	}

	@Given("User is on Implementation of Queue in Python")
	public void user_is_on_implementation_of_queue_in_python() {
		LoggerLoad.info("----------User is on Implementation of Queue in Python------------------------");
	}

	@When("User clicks on Try here button")
	public void user_clicks_on_try_here_button() {
		LoggerLoad.info("----------User clicks on TRYHERE button------------------------");
		Qpage.try_button();
		
	}
	
	@Then("User is navigated to tryEditor Page")//n
	public void user_is_navigated_to_try_editor_page() {
		LoggerLoad.info("----------User is navigated to tryEditor Page------------------------");
	}

	@Given("User is on Try Editor Page") //n
	public void user_is_on_try_editor_page() {
	   
	}

	
	@When("User Enters  {string} in the Editor")
	public void user_enters_in_the_editor(String string) {
		LoggerLoad.info("----------User Enters Code in Editor------------------------");
		Qpage.textarea(string);
	}

	@When("clicks on Run Button")
	public void clicks_on_run_button() {
		 
		LoggerLoad.info("----------clicks on Run Button------------------------");
		Qpage.run_btn();
	}
	@Then("The User is Presented with a Result")
	public void the_user_is_presented_with_a_result() {
		LoggerLoad.info("----------The User is Presented with a Result------------------------");
		Qpage.result();
	}
	
	
	
	@Given("User is navigated to Implementation of Queue in python")
	public void user_is_navigated_to_Implementation_of_queue_in_python() {
		Qpage.navigate_que_implement();
	    LoggerLoad.info("----------User is navigated to Implementation of Queue in python------------------------");
	}

	@When("User Enters  Invalid python code {string} in the Editor")
	public void user_enters_invalid_python_code_in_the_editor(String string) {
		
		Qpage.textarea(string);
	}

	@Then("The User is Presented with a Error Message for Invalid python code")
	public void the_user_is_presented_with_a_error_message_for_invalid_python_code() {
		Qpage.capture_alert();
	   
	}
	
	@Given("User  navigated to Implementation of Queue in python")
	public void user_navigated_to_implementation_of_queue_in_python() {
	   
		LoggerLoad.info("----------User is navigated to Implementation of Queue in python------------------------");
		Qpage.navigate_que_implement();
	}
	
	@When("User clicks on the Implementation using collections.deque link")
	public void user_clicks_on_the_implementation_using_collections_deque_link() {
		 
		   
		LoggerLoad.info("----------User clicks on the Implementation using collections.deque link------------------------");
		Qpage.navigate_que_colln();	  
	}

	@Then("User is navigated to Implementation using collections.deque page")
	public void user_is_navigated_to_implementation_using_collections_deque_link() {
		LoggerLoad.info("----------User is navigated to Implementation using collections.deque link-----------------------");
	}
	
    @Given("User is on Implementation using collections.deque page")
    public void user_is_on_implementation_using_collections_deque_page() {
    
    }	

	@When("User clicks on Implementation using array link")
	public void user_clicks_on_implementation_using_array_link() {
		Qpage.navigate_qu_imp_array();
	}

	@Then("User is navigated to Implementation using array page")
	public void user_is_navigated_to_implementation_using_array_page() {
		LoggerLoad.info("----------User is navigated to Implementation using array page-----------------------");
	}

	@Given("User is on Implementation using array page")
	public void user_is_on_implementation_using_array_page() {
		LoggerLoad.info("----------User is on Implementation using array page-----------------------");
	}

	@When("User clicks on  Queue Operations link")
	public void user_clicks_on_queue_operations_link() {
		LoggerLoad.info("----------User clicks on  Queue Operations link-----------------------");
		Qpage.navigate_queue_op();
	}

	@Then("User is navigated to Queue Operations Page")
	public void user_is_navigated_to_queue_operations_page() {
		LoggerLoad.info("----------User is navigated to Queue Operations Page-----------------------"); 
	}

	@Given("User is on QUeue Operations Page")
	public void user_is_on_q_ueue_operations_page() {
		LoggerLoad.info("----------User is on QUeue Operations Page-----------------------"); 
	}	
	
	@When("User clicks on Practice Questions link")
	public void user_clicks_on_practice_questions_link() {
		LoggerLoad.info("----------User clicks on Practice Questions link-----------------------");
		Qpage.navigate_prac_qst();
	    
	}

	@Then("User is navigated to Practice Questions")
	public void user_is_navigated_to_practice_questions() {
	    
	    
	}

}
