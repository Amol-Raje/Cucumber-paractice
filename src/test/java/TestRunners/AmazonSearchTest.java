package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features/search.feature"},
		glue= {"StepDefination","MyHooks"},
		tags = "@Smoke or @Regression",
		plugin= {"pretty"},
		monochrome= true		
		
		)

public class AmazonSearchTest {

}
