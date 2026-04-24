@tag
Feature: Application Login
    
Scenario: Admin Page Login 

    Given User is on the NetBanking Page
    When User login into application
    Then Home Page is displayed
    And Cards are displayed