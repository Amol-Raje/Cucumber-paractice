package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class UberJourney {
	@Before(order=1)
	public void SetBrowser(Scenario sc) {
		System.out.println("Run the browser");
//		System.out.println(sc.getName());
	}
	
	@Before(order=2)
	public void Makemytrip() {
		System.out.println("Open Make My trip app");	
	}
	
	@After(order=1)
	public void logOut() {
		System.out.println("Log out from MakeMyTrip");
	}
	@After(order=2)
	public void TearDown() {
		System.out.println("Close the browser");
	}
	
	@BeforeStep
	public void takeScreenshot() {
		System.out.println("Take Screen shot");
	}
	@AfterStep
	public void successfullyExecuted() {
		System.out.println("Successfully executed");
	}
	

}
