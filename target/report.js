$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Signup.feature");
formatter.feature({
  "line": 2,
  "name": "signup Test On Web Application",
  "description": "",
  "id": "signup-test-on-web-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@signupTest"
    }
  ]
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "signup-test-on-web-application;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "Navigates to website url.",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Click on Most Downloaded link.",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Select a product items.",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on Download this presentation link.",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on Create an Account CTA.",
  "keyword": "Then "
});
formatter.match({
  "location": "SignUp_Step.navigates_to_website_url()"
});
formatter.result({
  "duration": 12966071586,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.click_most_download()"
});
formatter.result({
  "duration": 13486352457,
  "status": "passed"
});
formatter.match({
  "location": "SignUp_Step.select_product()"
});
