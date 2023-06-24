package runner;
//import org.junit.runner.RunWith;
//TestNG test runner class for executing Cucumber scenarios. 
import org.testng.annotations.DataProvider;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//The @CucumberOptions annotation is used to configure the Cucumber options for the test execution.
//The plugin attribute specifies the plugins to be used for reporting purposes. 
//The monochrome attribute determines whether the console output should be displayed in a readable format or not. 
//The features attribute specifies the location of the feature files. 
//The glue attribute specifies the location of the step definition and hooks files. 

//@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty","html:target/cucumber.html" ,"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" },// reporting purpose
		monochrome = false, // console output
		//tags = "", // tags from feature file
		features = { "src/test/resources/features" }, // location of feature files
		glue = { "stepDefinition", "hooks" }) // location of step definition files



public class TestRunner extends AbstractTestNGCucumberTests {
	@DataProvider(parallel = false)
	public Object[][] scenarios() {

		return super.scenarios();
	}
	}


/*
 * The TestRunner class extends AbstractTestNGCucumberTests class, which
 * provides TestNG integration for running Cucumber scenarios.
 * 
 * 	The @DataProvider annotation is used to provide test scenarios data.
 * 
 * 	The scenarios() method overrides the default behavior of providing scenarios 
 * by returning super.scenarios() to include all the defined scenarios.
 */
