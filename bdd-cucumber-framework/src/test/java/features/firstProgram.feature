@tag @RegressionTest
Feature: Application Login

# background will be executed before each scenario. It is used to avoid code duplication.
# This will lies within this Feature file only. It will not be executed for other feature files.
Background:
    Given Open the URL of the application
    When launch the Browser from configuration file
    Then Hit the URL of banking site
    


Scenario: Admin Page Login 

    Given User is on the NetBanking Page
    When User login into application with "Admin" and password "admin123"
    Then Home Page is displayed
    And Cards are displayed

#Reusibility
@RegressionTest
Scenario: Customer Page Login

    Given User is on the NetBanking Page
    When User login into application with "Customer" and password "customer123"
    Then Home Page is displayed
    And Cards are displayed


#Parameterization
@SmokeTest @RegressionTest
Scenario Outline: Customer Page Login

    Given User is on the NetBanking Page
    When User login into application with <Username> and password "<Password>" Combination
    Then Home Page is displayed
    And Cards are displayed

    Examples:
    | Username | Password |
    | Admin    | admin123 |
    | Customer | customer123 |
    | User1    | user123   |



# // data driven testing
# Tags --> @SmokeTest in Test Renner we need to specify the tag name to run the test cases with that tag. We can have multiple tags as well.
@SmokeTest
Scenario: Customer Page Login with DataTable

    Given User is on the NetBanking Page
    When User login into application with1
    |Tanmay |
    |Ninawe |
    |tanmay@gmail.com |
    | +91 9876543210 |
    Then Home Page is displayed
    And Cards are displayed
