package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Locators.LandingPage;
import Locators.Offerspage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utils.TestContextSetup;

public class OfferPageStepDefinition  {

    public WebDriver driver;
    public String LandingPageproductName;
    public String OfferPageProductName;
    public TestContextSetup testContextSetup;

     public OfferPageStepDefinition(TestContextSetup testContextSetup) {
        this.testContextSetup = testContextSetup;
    }

        

    @Then("User searched for the same {string} for the offers page")

        public void User_searched_for_the_same_for_the_offers_page(String shortName) throws InterruptedException {

            switchToChildWindow();
            Offerspage offerspage = new Offerspage(testContextSetup.driver);
            offerspage.searchItem(shortName);
            
           

            
            // testContextSetup.driver.findElement(By.xpath("//input[@id=\"search-field\"]")).sendKeys(shortName);
            Thread.sleep(2000);
            System.out.println("User searched for the same for the offers page to check if product exists");
            OfferPageProductName = offerspage.getOffersPageProductName();
            System.out.println(OfferPageProductName + " is extracted from the Offers page");}



//Createing a separate method to switch to child window as we have to switch to child window in both offer page and cart page
        public void switchToChildWindow() {
            LandingPage landingpage = new LandingPage(testContextSetup.driver); // created object to call the method of landing page to click on top deals link
            landingpage.clickOnTopDeals();

            Set<String> handles = testContextSetup.driver.getWindowHandles();
            Iterator<String> it = handles.iterator();
            String parentWindowId = it.next();
            String childWindowId = it.next();
            testContextSetup.driver.switchTo().window(childWindowId);
        }



        @Then("Validate product name in offers page matches with the name extracted from Home page")
        public void validate_product_name_in_offers_page_matches_with_the_name_extracted_from_home_page() {

            Assert.assertEquals(OfferPageProductName, testContextSetup.LandingPageproductName);
            
        }
}
