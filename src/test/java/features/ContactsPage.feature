Feature: Verify the Functionality of Contacts Page

  Scenario: Verify whether user able to delete the selected Contacts
    Given user logged in to the CRM website
    When User enter the Username as "nagarajumadupu@gmail.com" as Password as "India@123" in Logginpage
    And user should be able to enter HomePage and user should click on ContactsPage
    And User clicks on selectall contacts radiobutton
    And User clicks on dropdown
    Then Contacts on firstpage should be deleted

  Scenario: Verify the Functionality of Adding new contact
    Given user logged in to the CRM website
    When User enter the Username as "nagarajumadupu@gmail.com" as Password as "India@123" in Logginpage
    And user should be able to enter HomePage and user should click on ContactsPage
    And User lands on ContactsPage
    And User clicks on the New Contact button
    And enters the FirstName LastName and EmailID and Clicks on Save
      | FirstName | LastName | EmailID                  |
      | Nagaraju  | Madupu   | nagarajumadupu@gmail.com |
    Then Contact should be created

  Scenario: Verify the Contacts filter by LastName
    Given user logged in to the CRM website
    When User enter the Username as "nagarajumadupu@gmail.com" as Password as "India@123" in Logginpage
    And user should be able to enter HomePage and user should click on ContactsPage
    And click on Search Filter with LastName
    And selects the filter with StartsWith
    And Enter the Search Keyword as "Madupu" and clicks on Search button
    Then Contacts with name starting with "Madupu" should display
