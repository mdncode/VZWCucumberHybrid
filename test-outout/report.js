$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature.feature");
formatter.feature({
  "line": 1,
  "name": "VZWCucumberHybrid",
  "description": "",
  "id": "vzwcucumberhybrid",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2333644100,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 3,
      "value": "#@Step123"
    },
    {
      "line": 4,
      "value": "#Scenario: Negative Login"
    },
    {
      "line": 5,
      "value": "#Given \tloginPageExists"
    },
    {
      "line": 6,
      "value": "#When \tenterWrongLogin"
    },
    {
      "line": 7,
      "value": "#Then \tverifyLoginScreenshotIfFailed"
    },
    {
      "line": 8,
      "value": "#"
    },
    {
      "line": 9,
      "value": "#"
    },
    {
      "line": 10,
      "value": "#@Step4"
    },
    {
      "line": 11,
      "value": "#Scenario: Positive Login with Dynamic Xpath"
    },
    {
      "line": 12,
      "value": "#Given \tloginPageExists4"
    },
    {
      "line": 13,
      "value": "#Then \tenterCorrectLogin"
    },
    {
      "line": 14,
      "value": "#Then \tverifyLoginScreenshotIfFailed4"
    },
    {
      "line": 15,
      "value": "#"
    },
    {
      "line": 16,
      "value": "#"
    },
    {
      "line": 17,
      "value": "#@Step456"
    },
    {
      "line": 18,
      "value": "#Scenario: Login and Go to Smartphones"
    },
    {
      "line": 19,
      "value": "#Given \tloginPageExists456"
    },
    {
      "line": 20,
      "value": "#When \tenterCorrectLogin456"
    },
    {
      "line": 21,
      "value": "#When \tgotoWireless"
    },
    {
      "line": 22,
      "value": "#And \tselectSmartphones"
    },
    {
      "line": 23,
      "value": "#And \tverifyResult456"
    }
  ],
  "line": 26,
  "name": "Select SamsungS10+",
  "description": "",
  "id": "vzwcucumberhybrid;select-samsungs10+",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@Step789"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "smartphonesPageExists",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "selectGalaxy10SPlus",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "pickColor",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "addtoCart",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "verifyResult789",
  "keyword": "Then "
});
formatter.match({
  "location": "TEST789.smartphonesPageExists()"
});
formatter.result({
  "duration": 13646572600,
  "status": "passed"
});
formatter.match({
  "location": "TEST789.selectGalaxy10SPlus()"
});
formatter.result({
  "duration": 8954819500,
  "status": "passed"
});
formatter.match({
  "location": "TEST789.pickColor()"
});
formatter.result({
  "duration": 472476600,
  "status": "passed"
});
formatter.match({
  "location": "TEST789.addtoCart()"
});
formatter.result({
  "duration": 558020600,
  "status": "passed"
});
formatter.match({
  "location": "TEST789.verifyResult789()"
});
formatter.result({
  "duration": 51070100,
  "status": "passed"
});
formatter.after({
  "duration": 734176700,
  "status": "passed"
});
});