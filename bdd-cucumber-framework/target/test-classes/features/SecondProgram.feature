



Feature: Second Feature file

# //Before--> Background --> Sceanrio --> After
Background:
    When launch the Browser from configuration file
    Then Hit the URL of banking site

@NetBanking @RegressionTest
Scenario: Admin Page Login 

    Given User is on the NetBanking Page
    When User login into application with "Admin" and password "admin123"
    Then Home Page is displayed
    And Cards are displayed



    @Mortgage @SmokeTest
Scenario: Admin Page Login 

    Given User is on the NetBanking Page
    When User login into application with "Admin" and password "admin123"
    Then Home Page is displayed
    And Cards are displayed