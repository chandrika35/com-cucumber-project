Feature: Home Page Test

  @Sanity @Regression
  Scenario: User should be able to click on PockerTab
    Given I am on homepage
   When I click on Accept Cookies Button
   And I click on Join Now Button
   Then I should Navigate to Interruption Page
   And I should be able to click on Pocker Tab
    And I should be able to verify the text Play our exciting Online Pocker Games