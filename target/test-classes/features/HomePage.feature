Feature: Home page Functionality test of FREE CRM Website

  Scenario: Verify whether User able to click on Contacts page link
    Given user login in to the CRM website
    When User enter the Username as "nagarajumadupu@gmail.com" as Password as "India@123"
    And user should be able to enter HomePage and user should click on ContactsPage Link
    Then User should land on ContactsPage

  Scenario: Verify whether User able to click on Tasks page link
    Given user login in to the CRM website
    When User enter the Username as "nagarajumadupu@gmail.com" as Password as "India@123"
    And user should be able to enter HomePage and user should click on Tasks Link
    Then User should land on TasksPage
