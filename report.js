$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Growth.feature");
formatter.feature({
  "line": 1,
  "name": "To check The Navigation and Contact in GrowthEngineering",
  "description": "",
  "id": "to-check-the-navigation-and-contact-in-growthengineering",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "",
  "description": "",
  "id": "to-check-the-navigation-and-contact-in-growthengineering;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Launch The Browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Navigate The OurProduct Menu",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Navigate The OurApproach Menu",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Navigate The Resources Menu",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Navigate The AboutUs Menu",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user Click GetInTouch Button and Navigate To contactPage",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition_Growth.user_Launch_The_Browser()"
});
});