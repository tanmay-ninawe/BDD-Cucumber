
Feature: Search and place the order for the products.

Scenario: Search Experience for the product search in both Home and offers page.

    Given  User is on the GreenCard Home page
    When User searched with shortname "Tom" and extracted the actual name of the product
    Then  User searched for the same "Tom" for the offers page 
    And Validate product name in offers page matches with the name extracted from Home page
