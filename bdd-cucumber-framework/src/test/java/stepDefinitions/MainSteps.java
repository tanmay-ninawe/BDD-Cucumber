package stepDefinitions;

import java.util.List;

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



// Regular Expression in Cucumber.
// added the below method to achieve the same scenario as above but with regular expression.
// start with ^ and end with $ and use (.+) for the parameterization.
@When("^User login into application with (.+) and password (.+) Combination$")
public void user_login_into_application_with_and_password_combination(String string, String string2) {
    // Write code here that turns the phrase above into concrete actions
    //Achived the Parameterization in cucumber.
    System.out.println("User login into application with " + string + " and password is " + string2);
}


@When("User login into application with1")
public void user_login_into_application_with1(List<String> dataTable) {
    System.out.println(dataTable.get(0));
    System.out.println(dataTable.get(1));
    System.out.println(dataTable.get(2));
    System.out.println(dataTable.get(3));
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



@Given("Open the URL of the application")
    public void open_the_url_of_the_application() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("**************************");
    System.out.println("Open the URL of the application");
    }

@When("launch the Browser from configuration file")
    public void launch_the_browser_from_configuration_file() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Launch the Browser from configuration file");

}

@Then("Hit the URL of banking site")
    public void hit_the_url_of_banking_site() {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Hit the URL of banking site");


}
}
