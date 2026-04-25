package stepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GreenkartStepDefinition {

    public WebDriver driver;
    public String LandingPageproductName;
    public String OfferPageProductName;

    @Given("User is on the GreenCard Home page") 
        public void user_is_on_the_GreenCard_homePage() {
            driver = new ChromeDriver();
            driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
            driver.manage().window().maximize();
            System.out.println("User is on the GreenCard Home page");
        }

    @When("User searched with shortname {string} and extracted the actual name of the product")
       public void user_searched_with_shortname_and_extracted_the_actual_name_of_the_product(String shortName) throws InterruptedException {

        driver.findElement(By.xpath("//input[@type=\"search\"]")).sendKeys(shortName);
        Thread.sleep(2000);
        String LandingPageproductName = driver.findElement(By.xpath("//h4[@class=\"product-name\"]")).getText().split(" - ")[0].trim();
            System.out.println(LandingPageproductName + " is extracted from the Home page");
        }
    

    @Then("User searched for the same {string} for the offers page")

        public void User_searched_for_the_same_for_the_offers_page(String shortName) throws InterruptedException {
            driver.findElement(By.linkText("Top Deals")).click();
            Set<String> s1 = driver.getWindowHandles();
            Iterator<String> it = s1.iterator();
            String ParentWindow = it.next();
            String childWindow = it.next();
            driver.switchTo().window(childWindow);
            driver.findElement(By.xpath("//input[@id=\"search-field\"]")).sendKeys(shortName);
            Thread.sleep(2000);
            System.out.println("User searched for the same for the offers page to check if product exists");

            String OfferPageProductName = driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
        }




        @Then("Validate product name in offers page matches with the name extracted from Home page")
        public void validate_product_name_in_offers_page_matches_with_the_name_extracted_from_home_page() {

            Assert.assertEquals(LandingPageproductName, OfferPageProductName);
            
        }
}
