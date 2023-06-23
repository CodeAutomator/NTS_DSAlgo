package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;



public class HomePage {
	
	public static WebDriver driver =DriverFactory.getdriver();
	String url =ConfigReader.applicationUrl();
	String homePageurl=ConfigReader.gethomePage();
	
	//start button
	@FindBy (xpath="//button[@class='btn']")WebElement getStartedbtn;
	@FindBy (xpath="/html/body/div[2]")WebElement alertMessage;

	

	

	@FindBy(xpath = "//h5[text()='Data Structures-Introduction']/..//a[text()='Get Started']") WebElement getStartedDSintro;
		
	@FindBy(xpath = "//h5[text()='Array']/..//a[text()='Get Started']") WebElement getStartedarray;	
	
	@FindBy(xpath = "//h5[text()='Linked List']/..//a[text()='Get Started']") WebElement getStartedlinkedlist;
	
	@FindBy(xpath = "//h5[text()='Stack']/..//a[text()='Get Started']") WebElement getStartedstack;
	
	@FindBy(xpath = "//h5[text()='Queue']/..//a[text()='Get Started']") WebElement getStartedtree;
	
	@FindBy(xpath = "//h5[text()='Tree']/..//a[text()='Get Started']") 	WebElement getStartedgraph;	
	
	@FindBy (xpath="//h5[text()='Graph']/..//a[text()='Get Started']")  WebElement getStartedqueue;
	
	
	//dropdown
		@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']") WebElement dsDropdown;
	
		@FindBy(xpath = "//div[@class='dropdown-menu show']/a[1]") WebElement dropDownarray;
		@FindBy(xpath = "//div[@class='dropdown-menu show']/a[2]") WebElement dropDownlinkedlist;
		@FindBy(xpath = "//a[text()='Stack']") WebElement dropDownstack;
		@FindBy(xpath = "//div[@class='dropdown-menu show']/a[4]") WebElement dropDownqueue;
		@FindBy(xpath = "//div[@class='dropdown-menu show']/a[5]") WebElement dropDowntree;
		@FindBy(xpath = "//div[@class='dropdown-menu show']/a[6]") WebElement dropDowngraph;

		//SignIn
		@FindBy(xpath="//a[@href ='/login']")WebElement signin;
		
		//Register
		@FindBy(xpath="//a[@href ='/register']")WebElement register;


	public  HomePage() {

		PageFactory.initElements(driver,this);
	}
	public void geturl() {
		driver.get(url);
	}
	public void getstarted() {
		getStartedbtn.click();
	}
	public String getTitleofPage() {
		String title=driver.getTitle();
		return title;
	}
		public String getAlert() {
			LoggerLoad.info("checking alert message you are not logged in");
			return alertMessage.getText();
			
			}
	
	
	public void getStarted_home(String String) {
		
		switch (String) {
		case "Data Structures-Introduction":
			LoggerLoad.info("click on ds");


			getStartedDSintro.click();
			break;
		case "Array":
			LoggerLoad.info("Click on array");
			
			getStartedarray.click();
			break;
		case "Linked List":
			LoggerLoad.info("click LinkedList ");
			
			getStartedlinkedlist.click();
			break;
		case "Stack":
			LoggerLoad.info("click stack");
			
			getStartedstack.click();
			break;
		case "Queue":
			LoggerLoad.info("click  queue ");
			
			getStartedqueue.click();
			break;
		case "Tree":
			LoggerLoad.info("click  Tree ");
			
			getStartedtree.click();
			break;
		case "Graph":
			LoggerLoad.info("Click  Graph ");
			
			getStartedgraph.click();
			System.out.println("Clicked on Graph Get started button.");
			break;
		}
		
	}
		public void homepage() {
		driver.get(homePageurl);
		}
		public void dropDown() {
		dsDropdown.click();
	}
		
		public void clickDropdown(String String) {
			
			switch(String) {
			
			case "Arrays":
				dropDownarray.click();
				LoggerLoad.info("Checking array logger in pom "+ String);
				break;
				
			case "Linked list":
				dropDownlinkedlist.click();
				LoggerLoad.info("Checking linkedlist logger in pom " + String);
				break;
				
			case "Stack":
				LoggerLoad.info("Checking stack logger in pom " + String);
				dropDownstack.click();				
				break;
				
			case "Queue":
				dropDownqueue.click();
				LoggerLoad.info("Checking queuelogger in pom "  + String);
				break;
				
			case "Tree":
				dropDowntree.click();
				LoggerLoad.info("Checking tree logger in pom "  + String);
				break;
				
			case "Graph":
				dropDowngraph.click();
				LoggerLoad.info("Checking graph logger in pom " + String);
				break;
				
			}
			
		}
				public void clickSignOrRegister(String string) {
					switch(string) {
					
					case "Sign in":
						signin.click();
						break;
						
					case "Register":
						register.click();
						break;
					}
				}
				

}
