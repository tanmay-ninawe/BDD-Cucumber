package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MainSteps {
     
@Given("User is on the NetBanking Page")
    public void user_is_on_the_net_banking_page() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("User landed on the NetBanking Page");
}

@When("User login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String username, String password) {
    // Write code here that turns the phrase above into concrete actions
   System.out.println("User login into application with " + username + "and password is" + password);
}

@Then("Home Page is displayed")
    public void home_page_is_displayed() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Homepage is displayed");
}
@Then("Cards are displayed")
    public void cards_are_displayed() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Cards are displayed");
}



}
