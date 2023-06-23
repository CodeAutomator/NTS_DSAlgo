package utilities;

import driverFactory.DriverFactory;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//These methods can be used to perform common actions and retrieve data from external sources during test automation.

public class ElementUtility {

	//Utility for methods
public static WebDriver driver =DriverFactory.getdriver();
	
	public static String ExcelPath = ConfigReader.getexcelfilepath();
	

	//Two static variables are defined: 
//driver representing the WebDriver instance and ExcelPath representing the path to the Excel file.
	
	public void waitForElement(WebElement element) {
		new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(element));
		//The waitForElement method is used to wait until a specified web element is visible on the page.
	}
	
	public void enterPythonCodeForPractice(String code, WebElement element)
	{
		new Actions(driver).keyDown(Keys.CONTROL)
		.sendKeys("a").sendKeys(Keys.DELETE)
		.keyUp(Keys.CONTROL).perform();
		
	
	
		String[] str1 = code.split("\n");
		
		for (int i = 0; i < str1.length; i++)
		{
			if (str1[i].equalsIgnoreCase("\\b")) 
			{
				element.sendKeys(Keys.BACK_SPACE);
			} 
			else
			{
				element.sendKeys(str1[i]);
				element.sendKeys(Keys.RETURN);
			}
		}
		
	}
	public void enterCode(String code, WebElement element)
	{
		new Actions(driver).sendKeys(element,code).perform();
		
	}
	
	/*
	 * The getResultfromExcel method retrieves the expected result from an Excel file. 
	 * It uses the ExcelReader class to read the data from the specified sheet
	 * and row, and returns the "Output" value.
	 */
	
	public static String getResultfromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(ExcelPath, sheetname);
		String result = testdata.get(rownumber).get("Output");
		LoggerLoad.info("Expected result from Excel sheetname " + sheetname + " and " + rownumber + " : " + result);
		return result;
	}
	
	/*•	The getCodefromExcel method retrieves the Python code from an Excel file. 
	 * It uses the ExcelReader class to read the data from the specified sheet and row, 
	 * and returns the "PythonCode" value.
	 */
	
	public static String getCodefromExcel(String sheetname, int rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String, String>> testdata = reader.getData(ExcelPath, sheetname);
		String code = testdata.get(rownumber).get("PythonCode");
		return code;
	}
	

}
