$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature.feature");
formatter.feature({
  "line": 1,
  "name": "VZWCucumberHybrid",
  "description": "",
  "id": "vzwcucumberhybrid",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2543118300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Negative Login",
  "description": "",
  "id": "vzwcucumberhybrid;negative-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Step123"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "loginPageExists",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enterWrongLogin",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "verifyLoginScreenshotIfFailed",
  "keyword": "Then "
});
formatter.match({
  "location": "TEST123.loginPageExists()"
});
formatter.result({
  "duration": 3907169800,
  "status": "passed"
});
formatter.match({
  "location": "TEST123.enterWrongLogin()"
});
formatter.result({
  "duration": 3621067600,
  "status": "passed"
});
formatter.match({
  "location": "TEST123.verifyLoginScreenshotIfFailed()"
});
formatter.result({
  "duration": 53298500,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat com.VZW.TestDefTestcases.TEST123.verifyLoginScreenshotIfFailed(TEST123.java:31)\r\n\tat ✽.Then verifyLoginScreenshotIfFailed(feature.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1221527600,
  "status": "passed"
});
formatter.before({
  "duration": 1496618800,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Positive Login with Dynamic Xpath",
  "description": "",
  "id": "vzwcucumberhybrid;positive-login-with-dynamic-xpath",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@Step4"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "loginPageExists4",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "enterCorrectLogin",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "verifyLoginScreenshotIfFailed4",
  "keyword": "Then "
});
formatter.match({
  "location": "TEST4.loginPageExists4()"
});
formatter.result({
  "duration": 6150251100,
  "status": "passed"
});
formatter.match({
  "location": "TEST4.enterCorrectLogin()"
});
formatter.result({
  "duration": 1698049500,
  "status": "passed"
});
formatter.match({
  "location": "TEST4.verifyLoginScreenshotIfFailed4()"
});
formatter.result({
  "duration": 4394054600,
  "status": "passed"
});
formatter.after({
  "duration": 759058600,
  "status": "passed"
});
formatter.before({
  "duration": 1701897600,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Login and Go to Smartphones",
  "description": "",
  "id": "vzwcucumberhybrid;login-and-go-to-smartphones",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@Step456"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "loginPageExists456",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "enterCorrectLogin456",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "gotoWireless",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "selectSmartphones",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "verifyResult456",
  "keyword": "And "
});
formatter.match({
  "location": "TEST456.loginPageExists456()"
});
formatter.result({
  "duration": 3494895000,
  "status": "passed"
});
formatter.match({
  "location": "TEST456.enterCorrectLogin456()"
});
