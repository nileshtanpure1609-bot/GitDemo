package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	
	
	@Given("I have logged into the application")
	public void i_have_logged_into_the_application() {
	   System.out.println("Login done");
	}
	
	@When("I click on add profile button")
	public void i_click_on_add_profile_button() {
	   System.out.println("add button clicked!!");
	}
	@Then("profile should get added")
	public void profile_should_get_added() {
	  System.out.println("profile added validated");
	}
	
	@When("I click on edit profile button")
	public void i_click_on_edit_profile_button() {
	    System.out.println("clicked on edit button");
	}
	@When("I modify the data")
	public void i_modify_the_data() {
	   System.out.println("data updated!!");
	}
	@Then("profile should get updated")
	public void profile_should_get_updated() {
	 System.out.println("Updation validated");
	}

	@When("I click on delete profile button")
	public void i_click_on_delete_profile_button() {
	    System.out.println("clicked on delete button");
	}
	@Then("Profile should get deleted")
	public void profile_should_get_deleted() {
	    System.out.println("profile deletion validated!!");
	}
	
	
	

	}


