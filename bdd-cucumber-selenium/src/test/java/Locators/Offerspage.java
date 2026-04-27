package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Offerspage {

    public WebDriver driver;

    public Offerspage(WebDriver driver) {
        this.driver = driver; // calling the driver from step definition class to here using constructor
    }



    By search = By.xpath("//input[@type=\"search\"]");
    By OffersPageproductName = By.cssSelector("tr td:nth-child(1)");


    public void searchItem(String name) {
        driver.findElement(search).sendKeys(name);
    }

    public String getOffersPageProductName() {
        return driver.findElement(OffersPageproductName).getText();
    }

}
