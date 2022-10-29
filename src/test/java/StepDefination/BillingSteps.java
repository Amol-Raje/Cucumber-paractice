package StepDefination;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BillingSteps {
	double billingAmount;
	double taxAmount;
	double finalAmount;	
	@Given("User is on billing page")
	public void user_is_on_billing_page() {  
	}
	@When("User enters billing amount {string}")
	public void user_enters_billing_amount(String billingamount) {
	  this.billingAmount= Double.parseDouble(billingamount);
	}
	@When("User enters tax amount {string}")
	public void user_enters_tax_amount(String taxamount) {
	    this.taxAmount=Double.parseDouble(taxamount);
	}
	@When("User clicks on calculate btn")
	public void user_clicks_on_calculate_btn() {  
	}
	@Then("it will give the final amount {string}")
	public void it_will_give_the_final_amount(String Expectedfinalamount) {
	   this.finalAmount=this.billingAmount+this.taxAmount;
	   System.out.println("Actual final amount= "+this.finalAmount);
	   System.out.println("Expected final amount= "+Double.parseDouble(Expectedfinalamount));  
	   Assert.assertTrue(this.finalAmount== Double.parseDouble(Expectedfinalamount));
	}
}
