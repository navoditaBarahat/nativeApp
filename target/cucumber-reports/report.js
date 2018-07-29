$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/resources/CheckBox.feature");
formatter.feature({
  "name": "Selendriod_Check_Box",
  "description": "As Tester\nI want to Test Selendroid App",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CheckBox"
    }
  ]
});
formatter.scenario({
  "name": "Test Check Box",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CheckBox"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User uncheck the Check box",
  "keyword": "When "
});
formatter.match({
  "location": "CheckBoxStepDef.Uncheck_CheckBox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User check the check box",
  "keyword": "Then "
});
formatter.match({
  "location": "CheckBoxStepDef.Check_The_CheckBox()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});