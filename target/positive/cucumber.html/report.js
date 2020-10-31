$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/ContactsPage.feature");
formatter.feature({
  "name": "Verify the Functionality of Contacts Page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify whether user able to delete the selected Contacts",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logged in to the CRM website",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactsPageTest.user_logged_in_to_the_crm_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the Username as \"nagarajumadupu@gmail.com\" as Password as \"India@123\" in Logginpage",
  "keyword": "When "
});
formatter.match({
  "location": "ContactsPageTest.user_enter_the_username_as_something_as_password_as_something_in_logginpage(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to enter HomePage and user should click on ContactsPage",
  "keyword": "And "
});
formatter.match({
  "location": "ContactsPageTest.user_should_be_able_to_enter_homepage_and_user_should_click_on_contactspage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on selectall contacts radiobutton",
  "keyword": "And "
});
formatter.match({
  "location": "ContactsPageTest.user_clicks_on_selectall_contacts_radiobutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "ContactsPageTest.user_clicks_on_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Contacts on firstpage should be deleted",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsPageTest.contacts_on_firstpage_should_be_deleted()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the Functionality of Adding new contact",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logged in to the CRM website",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactsPageTest.user_logged_in_to_the_crm_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the Username as \"nagarajumadupu@gmail.com\" as Password as \"India@123\" in Logginpage",
  "keyword": "When "
});
formatter.match({
  "location": "ContactsPageTest.user_enter_the_username_as_something_as_password_as_something_in_logginpage(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to enter HomePage and user should click on ContactsPage",
  "keyword": "And "
});
formatter.match({
  "location": "ContactsPageTest.user_should_be_able_to_enter_homepage_and_user_should_click_on_contactspage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User lands on ContactsPage",
  "keyword": "And "
});
formatter.match({
  "location": "ContactsPageTest.user_lands_on_contactspage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the New Contact button",
  "keyword": "And "
});
formatter.match({
  "location": "ContactsPageTest.user_clicks_on_the_new_contact_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enters the FirstName LastName and EmailID and Clicks on Save",
  "rows": [
    {
      "cells": [
        "FirstName",
        "LastName",
        "EmailID"
      ]
    },
    {
      "cells": [
        "Nagaraju",
        "Madupu",
        "nagarajumadupu@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "ContactsPageTest.enters_the_firstname_lastname_and_emailid_and_clicks_on_save(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Contact should be created",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsPageTest.contact_should_be_created()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify the Contacts filter by LastName",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user logged in to the CRM website",
  "keyword": "Given "
});
formatter.match({
  "location": "ContactsPageTest.user_logged_in_to_the_crm_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the Username as \"nagarajumadupu@gmail.com\" as Password as \"India@123\" in Logginpage",
  "keyword": "When "
});
formatter.match({
  "location": "ContactsPageTest.user_enter_the_username_as_something_as_password_as_something_in_logginpage(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to enter HomePage and user should click on ContactsPage",
  "keyword": "And "
});
formatter.match({
  "location": "ContactsPageTest.user_should_be_able_to_enter_homepage_and_user_should_click_on_contactspage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Search Filter with LastName",
  "keyword": "And "
});
formatter.match({
  "location": "ContactsPageTest.click_on_search_filter_with_lastname()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "selects the filter with StartsWith",
  "keyword": "And "
});
formatter.match({
  "location": "ContactsPageTest.selects_the_filter_with_startswith()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the Search Keyword as \"Madupu\" and clicks on Search button",
  "keyword": "And "
});
formatter.match({
  "location": "ContactsPageTest.enter_the_search_keyword_as_something_and_clicks_on_search_button(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Contacts with name starting with \"Madupu\" should display",
  "keyword": "Then "
});
formatter.match({
  "location": "ContactsPageTest.contacts_with_name_starting_with_something_should_display(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/HomePage.feature");
formatter.feature({
  "name": "Home page Functionality test of FREE CRM Website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify whether User able to click on Contacts page link",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user login in to the CRM website",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageTest.user_login_in_to_the_crm_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the Username as \"nagarajumadupu@gmail.com\" as Password as \"India@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageTest.user_enter_the_username_as_something_as_password_as_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to enter HomePage and user should click on ContactsPage Link",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageTest.user_should_be_able_to_enter_homepage_and_user_should_click_on_contactspage_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on ContactsPage",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageTest.user_should_land_on_contactspage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify whether User able to click on Tasks page link",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user login in to the CRM website",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageTest.user_login_in_to_the_crm_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the Username as \"nagarajumadupu@gmail.com\" as Password as \"India@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "HomePageTest.user_enter_the_username_as_something_as_password_as_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to enter HomePage and user should click on Tasks Link",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageTest.user_should_be_able_to_enter_homepage_and_user_should_click_on_tasks_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should land on TasksPage",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageTest.user_should_land_on_taskspage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/java/features/LoginPage.feature");
formatter.feature({
  "name": "Login page Functionality test of FREE CRM Website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify whether User able to login with Valid UserName and Password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user login in to the CRM  website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageTest.user_login_in_to_the_crm_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the Username as \"nagarajumadupu@gmail.com\" and Password as \"India@123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageTest.user_enter_the_username_as_something_and_password_as_something(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be able to enter HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTest.user_should_be_able_to_enter_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify whether User able to click Forget Password Link",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user login in to the CRM  website",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageTest.user_login_in_to_the_crm_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on ForgetPasswork Link",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageTest.user_click_on_forgetpasswork_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should be able to Navigate to passwordreset",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageTest.user_should_be_able_to_navigate_to_passwordreset()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});