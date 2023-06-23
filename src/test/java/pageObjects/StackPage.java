package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class StackPage {
	public static WebDriver driver =DriverFactory.getdriver();
	String url =ConfigReader.applicationUrl();
	String homePageurl=ConfigReader.gethomePage();
	String stackhomePageurl=ConfigReader.StackIntroPage();
	String stackoperationPageurl=ConfigReader.StackOperationPage();

	String stacktryeditorPageurl=ConfigReader.StacktryeditorPage();
	String stackpracticsurl=ConfigReader.Stackpracticspage();
	
	
	@FindBy(xpath = "//a[@href='stack']") WebElement getStartedBtn_stack;
	@FindBy(xpath = "//a[@href='operations-in-stack']") WebElement operationsinstacklink;
	@FindBy(xpath = "//a[@href='/tryEditor']") WebElement tryherestacklink;
	@FindBy(xpath = "//textarea[@tabindex='0']")WebElement texteditorstack;
	@FindBy(xpath ="//button[text()='Run']")WebElement stackrunBtn;
	@FindBy(xpath ="//*[@id=\"output\"]")WebElement stackoutput;
	@FindBy(xpath = "//a[@href='/stack/practice']") WebElement practicebtn;
	
	
	
	public  StackPage() {

		PageFactory.initElements(driver,this);

	}
	public void homepage() {
		driver.get(homePageurl);
	}
	public void getstackclick() {
		getStartedBtn_stack.click();
	}
	public String getStackpageTitle() {
		String title = driver.getTitle();
		return title;
	}
	public void operationstack() {
		operationsinstacklink.click();

	}
	public void tryherestack() {
		tryherestacklink.click();

	
}
	public String gettryherekpageTitle() {
		String title1 = driver.getTitle();
		return title1;
}
	
	public void tryeditorstack(String code) {
		texteditorstack.sendKeys(code);
	}
	public void runbtnstack() {
		stackrunBtn.click();
}
	public String readOutput() {
		return stackoutput.getText();
	}
	
	public String alert() {
	    
		// Wait for the alert to appear
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		// Get the text of the alert
		String alertText = alert.getText();

		// Accept or dismiss the alert
		alert.accept(); // To accept the alert
		// alert.dismiss(); // To dismiss the alert
	    LoggerLoad.warn("checking alert message from tryeditor "+ alertText );
	    return alertText;
}
	public void tryeditorload() {
		driver.get(stacktryeditorPageurl);
	}
	
	public void operationinstackload() {
		driver.get(stackoperationPageurl);
}
	public void stackpractics() {
		practicebtn.click();
}
	public String getpracticspageTitle() {
		String title3 = driver.getTitle();
		return title3;
}
}
