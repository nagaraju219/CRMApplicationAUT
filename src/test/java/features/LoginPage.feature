#Author: your.nagarajumadupu@gmail.com
#Keywords Summary :

Feature: Login page Functionality test of FREE CRM Website

  Scenario: Verify whether User able to login with Valid UserName and Password
    Given When user login in to the "https://ui.cogmento.com/" website
    When User enter the Username as "nagarajumadupu@gmail.com" as Password as "India@123"
    Then user should be able to enter HomePage
    
  Scenario: Verify whether User able to login with InValid UserName and Valid Password
    Given When user login in to the "https://ui.cogmento.com/" website
    When User enter the Username as "nagarajumadupu@gmail.co" as Password as "India@123"
    Then user should be able to enter HomePage
    
     Scenario: Verify whether User able to login with Valid UserName and InValid Password
    Given When user login in to the "https://ui.cogmento.com/" website
    When User enter the Username as "nagarajumadupu@gmail.com" as Password as "India@12"
    Then user should be able to enter HomePage
    
     Scenario: Verify whether User able to login with InValid UserName and InValid Password
    Given When user login in to the "https://ui.cogmento.com/" website
    When User enter the Username as "nagarajumadupu@gmail.co" as Password as "India@123"
    Then user should be able to enter HomePage