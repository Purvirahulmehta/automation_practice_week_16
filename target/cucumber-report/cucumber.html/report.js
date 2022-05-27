$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("onlineshoping.feature");
formatter.feature({
  "line": 1,
  "name": "SignUp, Sign In and Purchase Product",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product",
  "keyword": "Feature"
});
formatter.before({
  "duration": 13674544900,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "TC-002 Sign In with newly created user credentials",
  "description": "",
  "id": "signup,-sign-in-and-purchase-product;tc-002-sign-in-with-newly-created-user-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "I am on the Sign In Page",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "Login using newly create credentials",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I shall verify the address information in my address section",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInTest.iAmOnTheSignInPage()"
});
formatter.result({
  "duration": 4216902600,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.loginUsingNewlyCreateCredentials()"
});
formatter.result({
  "duration": 3169218500,
  "status": "passed"
});
formatter.match({
  "location": "SignInTest.iShallVerifyTheAddressInformationInMyAddressSection()"
});
formatter.result({
  "duration": 3106710301,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Laxmi Nivas]\u003e but was:\u003c[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat com.automation.steps.SignInTest.iShallVerifyTheAddressInformationInMyAddressSection(SignInTest.java:31)\r\n\tat ✽.Then I shall verify the address information in my address section(onlineshoping.feature:11)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 492438399,
  "status": "passed"
});
});