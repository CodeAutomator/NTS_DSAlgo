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
import utilities.ElementUtility;
import utilities.LoggerLoad;

public class ArrayPage {
	
	public static WebDriver driver =DriverFactory.getdriver();
//	String appurl =ConfigReader.applicationUrl();
	String homePageurl=ConfigReader.gethomePage();
	String arrayPageurl =ConfigReader.getarrayPageURL();
	String arrayinphython =ConfigReader.getArraysinPythonurl();
	String arrayinphythontryEditor =ConfigReader.tryEditorURL();
	String arraylistpage =ConfigReader.getarraylisturl();
	String arraybasicoperationpage =ConfigReader.getarraybasicoperationutl();
	String arrayaplicationspage =ConfigReader.getarrayapplicationurl();
	String arraypracticepage =ConfigReader.getarraypracticepageurl();
	String arryauestionpage =ConfigReader.getarrayquestionurl();
	String QuestionFindNumberswithEvenNumberofDigits =ConfigReader.ArrayQNumberswithEvenNumberofDigitsurl();
	String QuestionSquaresofaSortedArrayurlpage =ConfigReader.QuestionSquaresofaSortedArrayurl();
	ElementUtility util= new ElementUtility();
	

	@FindBy (xpath="//a[@href='arrays-in-python']")WebElement arraysInPythonLink;
	@FindBy (xpath="//*[@id=\"content\"]/li[2]/a")WebElement arraysUsingListLink;
	@FindBy (xpath="//a[text()='Basic Operations in Lists']") WebElement basicOperationsInListsLink;
	@FindBy (xpath="//a[@href='applications-of-array']") WebElement applicationsOfArrayLink;
	@FindBy (xpath="//a[text()='Practice Questions']") WebElement practiceQuestionsLink;
	@FindBy (xpath="//a[text()='Search the array']") WebElement searchTheArrayLink;
	@FindBy (xpath="//a[text()='Max Consecutive Ones']")WebElement maxConsecutiveOnesLink;
	@FindBy (xpath="//a[text()='Find Numbers with Even Number of Digits']") WebElement findNumbersWithEvenNumberOfDigitsLink;
	@FindBy (xpath="//a[text()='Squares of  a Sorted Array']") WebElement squaresOfASortedArrayLink;
	@FindBy (xpath="//*[@id=\"output\"]") WebElement submitbtnmessage;
	
	@FindBy (xpath = "//a[@href ='array']")WebElement getStartedarray;
	@FindBy (xpath="//a[@href='/tryEditor']")WebElement tryHereLink;
	@FindBy (xpath="//textarea[@tabindex='0']")WebElement editorInput;
	@FindBy (xpath="//button[text()='Run']") WebElement runButton;
	@FindBy (xpath="//pre[@id='output']") WebElement output;
	@FindBy (id="answer_form") WebElement answerform;
	@FindBy (xpath="//input[@value='Submit']") WebElement submitButton;
	
	
	public   ArrayPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void homepage() {
		driver.get(homePageurl);
	}
	

	
	public void arraypage() {
		driver.get(arrayPageurl);		
	}
	
	public void arrayphythonpage() {
		driver.get(arrayinphython);		
	}
	
	public void arrayphythonpagetry() {
		driver.get(arrayinphythontryEditor);		
	}
	
	public void arrayinlist() {
		driver.get(arraylistpage);		
	}
	
	public void arrayinbasicoperation() {
		driver.get(arraybasicoperationpage);		
	}
	public void arrayinapplication() {
		driver.get(arrayaplicationspage);		
	}
	public void arrayinpracticepage() {
		driver.get(arraypracticepage);		
	}
	
	public void arrayinquestionpage() {
		driver.get(arryauestionpage);		
	}
	public void arrayinQuestionFindNumberswithEvenNumberofDigits() {
		driver.get(QuestionFindNumberswithEvenNumberofDigits);		
	}
	public void arrayinQuestionSquaresofaSortedArrayurlpage() {
		driver.get(QuestionFindNumberswithEvenNumberofDigits);		
	}
	public void waitForElement(WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForSubmit() {
		waitForElement(submitbtnmessage);
	}
		
	
	public void  navigateTo(String pagename)
	{
		String urlName= ConfigReader.geturl(pagename);
		driver.get(urlName);
	}

	
	public void clickArraysInPythonLink()
	{
		LoggerLoad.info("User clicks on " +arraysInPythonLink.getText() + " in Array Page");
		arraysInPythonLink.click();
	}
	
	public void clickTryHereLink() {
		tryHereLink.click();
	}
	
	public void fetchPythonCode(String PythonCode)
	{

		editorInput.sendKeys(PythonCode);
	}
	
	public void fetchPythonCode2(String PythonCode)
	{
		editorInput.clear();
		editorInput.sendKeys(PythonCode);
	}
	
	public void clickRunButton() {			
			runButton.click();
	}
	
	public String fetchOutput()
	{
		
		String Result = output.getText();
		return Result;
	}
	
public String alertarray() {
	    
		// Wait for the alert to appear
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		// Get the text of the alert
		String alertText = alert.getText();

		// Accept or dismiss the alert
		alert.accept(); // To accept the alert
		// alert.dismiss(); // To dismiss the alert
	    LoggerLoad.warn("checking alert message from tryeditor array "+ alertText );
	    return alertText;
}

public String alertarraylist() {
    
	// Wait for the alert to appear
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
	Alert alert = wait.until(ExpectedConditions.alertIsPresent());

	// Get the text of the alert
	String alertText = alert.getText();

	// Accept or dismiss the alert
	alert.accept(); // To accept the alert
	// alert.dismiss(); // To dismiss the alert
    LoggerLoad.warn("checking alert message from tryeditor array "+ alertText );
    return alertText;
}

	public void clickArraysUsingListLink()
	{
		arraysUsingListLink.click();
	}
	
	public void clickbasicOperationsInListsLink()
	{
		basicOperationsInListsLink.click();
		
	}
	
	public String getarraybasicpage() {
		String title1 = driver.getTitle();
		return title1;
	}
	
	public void clickapplicationsOfArrayLink()
	{
		applicationsOfArrayLink.click();
	}
	
	public void clickpracticeQuestionsLink()
	{
		practiceQuestionsLink.click();
		
	}
	
	public String title() {
		String titleofpage = driver.getTitle();
		return titleofpage;
	}
	public void clickSearchTheArrayLink()
	{
		searchTheArrayLink.click();
	}
	
	public String getEditorText() {
		return editorInput.getText();
	}
	public void clearEditorText() {
		editorInput.clear();
	}
	
	public void clickFindNumbersWithEvenNumberOfDigitsLink()
	{
		findNumbersWithEvenNumberOfDigitsLink.click();
	}
	public void clickSubmitButton()
	{
		submitButton.click();
	}
	public String submitOutput()	{		
		String Result = submitbtnmessage.getText();
		return Result;
	}
	public void clickSquaresOfASortedArrayLink()
	{
		squaresOfASortedArrayLink.click();
	}
}
