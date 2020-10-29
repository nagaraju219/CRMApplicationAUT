$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/HomePage.feature");
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