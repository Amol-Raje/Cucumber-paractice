package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"Features/Billing.feature"},
		glue= {"StepDefination"},
		plugin= {"pretty"},
		monochrome=true
		
		
		)

public class BillingTest {
	
}
