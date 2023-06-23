package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import driverFactory.DriverFactory;
import utilities.ConfigReader;
import utilities.LoggerLoad;

public class TreePage {
	public static WebDriver driver =DriverFactory.getdriver();
	String homepage = ConfigReader.gethomePage();
	String signin = ConfigReader.getSigninPage();
	String treeUrl= ConfigReader.getTreeUrl();
	String treeOverviewUrl= ConfigReader.getTreeOverviewUrl();
	String treeTerminologiesUrl= ConfigReader.getTreeTerminologiesUrl();
	String typesOfTreesUrl= ConfigReader.getTypesofTreesUrl();
	String traversalUrl= ConfigReader.getTreeTraversUrl();
	String traversIllustrateUrl=ConfigReader.getTreeTraversillustratUrl();
	String treeEditor=ConfigReader.getTreeTryeditor();
	String binaryTreeUrl= ConfigReader.getBinaryTreesUrl();
	String typesOfBinaryTreesUrl= ConfigReader.getTypesofBinaryTreesurlUrl();
	String treePractQuestUrl= ConfigReader.getTreePracticequest();
	
    @FindBy(xpath="//div[@class=\"col\"][6]//a") WebElement TreeGetStart;
	@FindBy(xpath = "//*[@href='overview-of-trees']") WebElement OverOfTree;
	@FindBy(linkText="Terminologies") WebElement Terminologies;
	@FindBy(linkText="Types of Trees")WebElement TypesOfTree;
	@FindBy(xpath = "//*[@href='tree-traversals']") WebElement TreeTrave;
	@FindBy(xpath = "//*[@href='traversals-illustration']") WebElement TraveIllustrate;
	@FindBy(linkText="Binary Trees") WebElement BinaryTree;
	@FindBy(linkText="Types of Binary Trees") WebElement TypesOfBinary;
	//@FindBy(linkText="Implementation in Python") WebElement ImplementPython;
	//@FindBy(linkText="Binary Tree Traversals") WebElement BTTraverse;
	//@FindBy(linkText="Implementation of Binary Trees") WebElement ImplementBT;
	//@FindBy(linkText="Applications of Binary trees") WebElement AppsOfBT;
	//@FindBy(linkText="Binary Search Trees") WebElement BST;
	//@FindBy(linkText="Implementation Of BST") WebElement ImplementBST;
	@FindBy(linkText="Try here>>>") WebElement TryhereLink;
	@FindBy (xpath ="//form/div/div/div/textarea") WebElement textEditor; 
	@FindBy(xpath ="//button[text()='Run']") WebElement TreerunBtn;
	@FindBy(id="output") WebElement runOutput;
	@FindBy(linkText="Practice Questions") WebElement PQues;
	
	
	
	public TreePage() {
		PageFactory.initElements(driver, this);
	}
	
	public void navigate_homepage()
	{
		driver.get(homepage);
	}
	public void click_signin() {
		driver.get(signin);
		
	}
	
	public void ClickTreeGS() {
		LoggerLoad.info("User Click the tree Get Started Button");
		TreeGetStart.click();
	}
	public String getTreepageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public void ClickOverview() {
		LoggerLoad.info("click " + OverOfTree.getText() + " On Trees page");

		OverOfTree.click();
	LoggerLoad.info(" Title of the page " + driver.getTitle());

	}

	public void ClickTryhereLink() {
		
		TryhereLink.click();
	}
	
	
	public String enter_code_txtarea(String code)
	{
		textEditor.sendKeys(code );
		return code;
	}
	
	public void run_button()
	{
		TreerunBtn.click();
	}

	public String getOutput() {
		LoggerLoad.info("Output after Run Statement:" +runOutput.getText());
		String Result = runOutput.getText();
		return Result ;
		
	}
	public String getAlertrmsg() {
		String errormsg = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		return errormsg;
	}

	public void navigateTotryEditor() {
		driver.get(treeEditor);
	}

	public void navigateTo(String pagename) {
		String urlName = ConfigReader.geturl(pagename);
		driver.get(urlName);
	}


	public void clickTerminologiesLink() {
		//LoggerLoad.info("click " + Terminologies.getText() + " On tree page");
		//Terminologies.click();
		driver.get(treeTerminologiesUrl);
		LoggerLoad.info(" Title of the page " + driver.getTitle());
	}

	public void ClickTypesOFTree() {
		//LoggerLoad.info("click " + TypesOfTree.getText() + " On tree page");
		//TypesOfTree.click();
		driver.get(typesOfTreesUrl);
	LoggerLoad.info(" Title of the page " + driver.getTitle());
	}

	public void ClickTreeTraversal() {
		//LoggerLoad.info("click " + TreeTrave.getText() + " On tree page");
		//TreeTrave.click();
		driver.get(traversalUrl);
	LoggerLoad.info(" Title of the page " + driver.getTitle());
	}

	public void ClickTraveIllustrate() {
		//LoggerLoad.info("click " + TraveIllustrate.getText() + " On tree page");
		//TraveIllustrate.click();
		driver.get(traversIllustrateUrl);
	LoggerLoad.info(" Title of the page " + driver.getTitle());	
	}
	public void ClickBinaryTrees() {
		//LoggerLoad.info("click " + TraveIllustrate.getText() + " On tree page");
		//TraveIllustrate.click();
		driver.get(binaryTreeUrl);
	LoggerLoad.info(" Title of the page " + driver.getTitle());	
	}
	
	public void ClickTypesofBinaryTrees() {
		//LoggerLoad.info("click " + TraveIllustrate.getText() + " On tree page");
		//TraveIllustrate.click();
		driver.get(typesOfBinaryTreesUrl);
	LoggerLoad.info(" Title of the page " + driver.getTitle());	
	}
	
	public void ClickPractQuesLink() {
		//LoggerLoad.info("click " + PQues.getText() + " On tree page");
		//PQues.click();
		driver.get(treePractQuestUrl);
	LoggerLoad.info(" Title of the page " + driver.getTitle());
	}


}


