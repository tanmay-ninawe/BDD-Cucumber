package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {


    public WebDriver driver;

    public LandingPage(WebDriver driver) {
        this.driver = driver; // calling the driver from step definition class to here using constructor
    }



    private By search = By.xpath("//input[@type=\"search\"]");
    private By LandingPageproductName = By.xpath("//h4[@class=\"product-name\"]");
    private By topDealsLink = By.linkText("Top Deals");

    public void searchItem(String name) {
        driver.findElement(search).sendKeys(name);
    }

    public String getLandingPageProductName() {
        return driver.findElement(LandingPageproductName).getText();
    }


    public void clickOnTopDeals() {
        driver.findElement(topDealsLink).click();
}

}
