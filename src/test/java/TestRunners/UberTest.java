package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features/UberJourney.feature"},  //path of feature file
		glue= {"StepDefination","MyHooks"},  //path of step defination files
		tags= "@All",     //used to group the test cases according to stage at scenario leval
		plugin= {"pretty", "json:target/Myreports/report1.json","junit:target/MyReports/report1.xml",
				"html:target/Myreports/report1.html"},  //to get an pretty result 
		monochrome= true,    //to avoid unreadable result in console
		dryRun= true
//		strict= true
		
		)

public class UberTest {

	
 }
