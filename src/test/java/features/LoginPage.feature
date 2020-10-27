#Author: your.nagarajumadupu@gmail.com
#Keywords Summary :

Feature: Login page Functionality test of FREE CRM Website

  Scenario: Verify whether User able to login with Valid UserName and Password
    Given user login in to the "https://ui.cogmento.com/" website
    When User enter the Username as "nagarajumadupu@gmail.com" as Password as "India@123"
    Then user should be able to enter HomePage
    
  Scenario: Verify whether User able to click Forget Password Link
  Given user login in to the "https://ui.cogmento.com/" website
  When User click on ForgetPasswork Link
  Then User should be able to Navigate to "https://register.cogmento.com/password/reset/request/"
  
  