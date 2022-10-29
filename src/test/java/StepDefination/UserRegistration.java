package StepDefination;

import java.util.List;
import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration {
	@Given("User is on registration page")
	public void user_is_on_registration_page() {
	   System.out.println("User navigates registration page"); 
	}

	@When("User enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
	    List<List<String>> UserList = dataTable.asLists(String.class);
	    for (List<String> e:UserList) {
	    	System.out.println(e.get(2));
	    }  
	}
	
	@When("User enters following user details with column")
	public void user_enters_following_user_details_with_column(DataTable dataTable) {
	  List<Map<String, String>> userlist = dataTable.asMaps(String.class , String.class);
//	  System.out.println(userlist);
//	  System.out.println(userlist.get(0).get("Name"));
	  for(Map<String, String> e:userlist) {
		  System.out.println(e.get("Name"));
		  System.out.println(e.get("last name"));
		  System.out.println(e.get("Dept"));
		  System.out.println(e.get("Email"));
		  
	  }
	  
	}
	
	@Then("User registration should be successful")
	public void user_registration_should_be_successful() {
	   System.out.println("User registration is successful");
	}
}
