package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchSteps {
	@Given("I have a search field om Amazon page")
	public void i_have_a_search_field_om_amazon_page() {
	    System.out.println("Step 1: I am on search page");
	}

	@When("^I search for a product with name \"([^\"]+)\" and price (\\d+)$")
	public void i_search_for_a_product_with_name_and_price(String productName, Integer price) {
	    System.out.println("Step 2: Search the product with name: "+productName +"price: "+price);
	}

	@Then("Product with name {string} should be displayed")
	public void product_with_name_should_be_displayed(String productName) {
	    System.out.println("Step 3: product "+productName+" is displayed");
	}

}
