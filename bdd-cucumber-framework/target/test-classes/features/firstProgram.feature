@tag
Feature: Application Login
    
Scenario: Admin Page Login 

    Given User is on the NetBanking Page
    When User login into application with "Admin" and password "admin123"
    Then Home Page is displayed
    And Cards are displayed

#Reusibility
Scenario: Customer Page Login

    Given User is on the NetBanking Page
    When User login into application with "Customer" and password "customer123"
    Then Home Page is displayed
    And Cards are displayed