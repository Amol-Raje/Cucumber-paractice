package MyHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class SearchAmazon {
	
	@Before ("@Smoke")
	public void SetupB() {
		System.out.println("Launch Browser");
	}
	
	
	@Before 
	public void SetupA(Scenario sc) {
		System.out.println("Launch URL in Browser");
		System.out.println(sc.getName());
	}
	
	@After 
	public void m1() {
		System.out.println("Close the browser");
		
	}
	
	@After (order=1)
	public void m2(Scenario sc) {
		System.out.println("Log Out From Amazon");
		System.out.println(sc.getName());
	}
	
	@BeforeStep 
	public void TakesScreenshot() {
		System.out.println("Take the screen shot");
	}
	@AfterStep
	public void refreshthepage() {
		System.out.println("Refresh the page");
	}
	
	
	
	
	

}
