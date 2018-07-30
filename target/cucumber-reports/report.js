$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/resources/ENButton.feature");
formatter.feature({
  "name": "Selendriod_EN_Button",
  "description": "As Tester\nI want to Test Selendroid App",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Test EN button",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "ENBtnStepDef.User_On_HomePage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Clicks on EN button",
  "keyword": "When "
});
formatter.match({
  "location": "ENBtnStepDef.User_Clicks_On_En_Button()"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat com.automation.McKinsey.app.pages.SelendriodPage.clickENButton(SelendriodPage.java:56)\r\n\tat com.automation.McKinsey.app.StepDefinitions.ENBtnStepDef.User_Clicks_On_En_Button(ENBtnStepDef.java:49)\r\n\tat ✽.User Clicks on EN button(src/resources/ENButton.feature:8)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "PopUp is Displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "ENBtnStepDef.PopUp_Displayed()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on No button",
  "keyword": "And "
});
formatter.match({
  "location": "ENBtnStepDef.PopUp_Display()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});