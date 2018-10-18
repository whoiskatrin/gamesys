Feature: Validate YouTube videos page

Scenario: Validate response for 200 status code
Given I have navigated to the page
When I extract the response
And I validate the response status code
Then Show the readable content

  Scenario: Validate response for 404 status code
    Given I have navigated to non-existing page
    When I extract the response
    And I validate the 404 response status code

  Scenario: Validate response for 400 status code
    Given I have navigated to illegal page
    When I extract the response
    And I validate the 400 response status code

  Scenario: Validate Batman name
    Given I have navigated to the page
    When I extract the response
    And I validate that there is no such author name as "The Batman"


