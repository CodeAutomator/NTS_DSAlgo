package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class QueuePage {

public static WebDriver driver = DriverFactory.getdriver();
	
	String queueurl  = ConfigReader.getlinktoqueue();
	String impofqpythonurl  = ConfigReader.getImpOfQPythonUrl();
	//String py_editorurl  = ConfigReader.py_editor();
	String impcolldqurl = ConfigReader.getImpCollDQUrl();
	String queimparray = ConfigReader.getqueue_array();
	String queue_op = ConfigReader.getqueue_opns();
	String qpracquesurl =ConfigReader.getQPracQuesUrl();

	

	@FindBy(xpath="//a[@href ='queue']") WebElement getstart_queue_btn;
	@FindBy(xpath = "//a[@href='implementation-lists']")WebElement im_que_pyt;
	@FindBy(xpath = "//a[@href='/tryEditor']") WebElement try_here_button;

	@FindBy (xpath ="//form/div/div/div/textarea")WebElement textarea_box;
	@FindBy(xpath="//button[text()='Run']") WebElement Run_button;
	@FindBy(xpath="//div/pre[@id='output']") WebElement queue_out_put;
	
	public QueuePage()
	{
		PageFactory.initElements(driver,this);
	}
	
    public void getstart_queue()
{
    	getstart_queue_btn.click();
	
}

    public String getPageTitle() {
		String title = driver.getTitle();
		return title;
	}

public void implement_queue()
{
	driver.get(impofqpythonurl);
LoggerLoad.info("User is in Implementation of Queue in Python Page ");


}
public void navigate_que_implement()
{
	driver.get(impofqpythonurl);
}

public void navigate_que_colln()
{
    
	driver.get(impcolldqurl);
	LoggerLoad.info("User is in Implementation using collection.deque ");
	
}

public void navigate_qu_imp_array()
{
	driver.get(queimparray);
}

public void navigate_queue_op()
{
	driver.get(queue_op);
}

public void  navigate_prac_qst()
{
	driver.get(qpracquesurl );
}

public void try_button()
{
	try_here_button.click();
}

public String textarea(String code)
{
	textarea_box.sendKeys(code);
	return code;
}
public void run_btn()
{
	Run_button.click();
	
}
	
	
public void result()
{
	String res=queue_out_put.getText();
	System.out.println("***********RESULT:"+res); 
	
}

public String capture_alert()
{
	String gt_text = driver.switchTo().alert().getText();
	driver.switchTo().alert().accept();
	LoggerLoad.warn("***Error Message from Alert*******"+gt_text);
	return gt_text;
	
}
}
