package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class GraphPage {

	public static WebDriver driver =DriverFactory.getdriver();
	String homepage_url = ConfigReader.gethomePage();
	String graphurl = ConfigReader.getGraphPage();
	String graphlinkurl = ConfigReader.getGraphlinkPage();
	String graph_replinkurl = ConfigReader.getGraphReplinkPage();
	String graph_prc_linkurl = ConfigReader.getGraphPQlinkPage();
	String sign_in = ConfigReader.getSigninPage();
	
	
	
	// Defining WebElement
	
	@FindBy(xpath="//a[text()='Get Started'][@href='graph']") WebElement graphGetStartBtn;
	@FindBy(xpath="//ul[2]/a[text()='Graph']") WebElement graphGraphLink;
	@FindBy(linkText="//a[contains(text(),'Graph Representations')]") WebElement graph_repLink;
	
	
	@FindBy(linkText="Try here>>>") WebElement try_here;
	
	@FindBy(xpath="//form/div/div/div/textarea") WebElement text_area;

	@FindBy(xpath="//button[text()='Run']") WebElement Graph_Run;
	@FindBy(xpath="//div/pre[@id='output']") WebElement Graph_out_put;
	 @FindBy(linkText="Sign in") WebElement Signin;
	 
	 public GraphPage()
		{
			PageFactory.initElements(driver,this);
		}
	 
	 
	public void navigate_home_page()
	{
		driver.get(homepage_url);
	}
	public void click_signin() {
		driver.get(sign_in);
		//Signin.click();
	}
	
	public void getstartedbutton_graph()
	{
		graphGetStartBtn.click();
		
	}
	public void navigate_graph_link()
	{
	    // graphGraphLink.click();
		driver.get(graphlinkurl);
	
	}
	public void click_try_button()
	{
		try_here.click();
	}
	public String enter_code_txtarea(String code)
	{
		text_area.sendKeys(code );
		return code;
	}
	
	public void run_button()
	{
		Graph_Run.click();
	}
	
	
	public void graph_rep_link()
	{
		//gra_rep.click();
		driver.get(graph_replinkurl);
	}
	public void grph_prac_quest()
	{
		driver.get(graph_prc_linkurl);   
	}
	
	public void getresult()
	{
		String result=Graph_out_put.getText();
		System.out.println("RESULT: "+result); 
		
	}
	
	public String capture_alert()
	{
		String errorMsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		LoggerLoad.info("The Error Message is:" +errorMsg);
		return errorMsg;
		
	}
	


}

