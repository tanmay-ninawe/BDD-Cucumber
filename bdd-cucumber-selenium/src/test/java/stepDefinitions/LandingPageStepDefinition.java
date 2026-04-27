package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import Locators.LandingPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.TestContextSetup;

public class LandingPageStepDefinition {

    public WebDriver driver;
    public String LandingPageproductName;
    public String OfferPageProductName;
    public TestContextSetup testContextSetup;

    public LandingPageStepDefinition(TestContextSetup testContextSetup) 
    {
        this.testContextSetup = testContextSetup;

    }

    
    @Given("User is on the GreenCard Home page") 
        public void user_is_on_the_GreenCard_homePage() {
            testContextSetup.driver = new ChromeDriver();
            testContextSetup.driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            testContextSetup.driver.manage().window().maximize();
            System.out.println("User is on the GreenCard Home page");
            return;
        }

    @When("User searched with shortname {string} and extracted the actual name of the product")
       public void user_searched_with_shortname_and_extracted_the_actual_name_of_the_product(String name) throws InterruptedException {

        LandingPage landingpage = new LandingPage(testContextSetup.driver);
        landingpage.searchItem(name);

        landingpage.getLandingPageProductName();

        Thread.sleep(2000);
        testContextSetup.LandingPageproductName = landingpage.getLandingPageProductName().split(" - ")[0].trim();
        System.out.println(testContextSetup.LandingPageproductName + " is extracted from the Home page");
        }
    

}
