$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/new/eclipse-workspaceGeico/gitHubPractice/src/test/java/features/login.feature");
formatter.feature({
  "line": 1,
  "name": "Valid user login",
  "description": "",
  "id": "valid-user-login",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7261683000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "valid user login to account",
  "description": "",
  "id": "valid-user-login;valid-user-login-to-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "User Enter Id and Password",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User is able to login",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on Online Banking console",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_Enter_Id_and_Password()"
});
formatter.result({
  "duration": 3160760401,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_is_able_to_login()"
});
formatter.result({
  "duration": 7617726400,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_is_on_Online_Banking_console()"
});
formatter.result({
  "duration": 31288700,
  "status": "passed"
});
formatter.before({
  "duration": 6247856600,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Get quote on new car",
  "description": "",
  "id": "valid-user-login;get-quote-on-new-car",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "User is no geico.com",
  "keyword": "Given "
});
formatter.step({
  "line": 21,
  "name": "Enter zip and start quote",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Customer enter name and dob and address",
  "keyword": "Then "
});
formatter.step({
  "line": 25,
  "name": "user can add car info and ownwership",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "user enters driving habits",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "user slects days of driving and miles",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user verfies Annual Milleage and go next",
  "keyword": "Then "
});
formatter.step({
  "line": 33,
  "name": "verify personal info",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.user_is_no_geico_com()"
});
formatter.result({
  "duration": 12514700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.enter_zip_and_start_quote()"
});
formatter.result({
  "duration": 2589646000,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.customer_enter_name_and_dob_and_address()"
});
formatter.result({
  "duration": 7216948700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_can_add_car_info_and_ownwership()"
});
formatter.result({
  "duration": 6405685800,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_enters_driving_habits()"
});
formatter.result({
  "duration": 1309443501,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_slects_days_of_driving_and_miles()"
});
formatter.result({
  "duration": 35901,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.user_verfies_Annual_Milleage_and_go_next()"
});
formatter.result({
  "duration": 31300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.verify_personal_info()"
});
formatter.result({
  "duration": 30000,
  "status": "passed"
});
});