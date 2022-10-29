package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features/Registration.feature"},
		glue= {"StepDefination"},
		plugin= {"pretty", "html:target/Myreports/report2.html"},
		monochrome=true,
		dryRun= false
			
		)



public class UserRegstrationTest {
	

}
