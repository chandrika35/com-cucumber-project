$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homepage.feature");
formatter.feature({
  "line": 1,
  "name": "Home Page Test",
  "description": "",
  "id": "home-page-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 7664512500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should Navigate to Interruption Page Successfully",
  "description": "",
  "id": "home-page-test;user-should-navigate-to-interruption-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Sanity"
    },
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Accept Cookies Button",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on Join Now Button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should Navigate to Interruption Page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should be able to click on Pocker Tab",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I should be able to verify the text Play our exciting Online Pocker Games",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 123641000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iClickOnAcceptCookiesButton()"
});
formatter.result({
  "duration": 122910800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iClockOnJoinNowButton()"
});
formatter.result({
  "duration": 164501300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldNavigateToInterruptionPage()"
});
formatter.result({
  "duration": 38900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldBeAbleToClickOnPockerTab()"
});
formatter.result({
  "duration": 16000,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldBeAbleToVerifyTheTextPlayOurExcitingOnlinePockerGames()"
});
formatter.result({
  "duration": 49300,
  "status": "passed"
});
formatter.after({
  "duration": 686758100,
  "status": "passed"
});
});