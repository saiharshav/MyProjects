#Author:
#Date:
#Description:

@frameworkFeature
Feature: Feature to test login functionality
	@frameworkScenario
  Scenario: Validate the login functionality
    Given User navigated to the url
    When User enters the login credentials
    And Clicks on login button
    Then User is navigated to home page
