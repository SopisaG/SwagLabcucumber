Feature: Swag Lab Home Page Tests

  Background:
    Given I am logged into Swag Labs

  Scenario: Verify there are 6 items on the page
    Then there are 6 items on the page

  Scenario: Verify Add to Cart button toggles to Remove when clicked
    When I click the "first item ADD TO CART" button
    Then ADD TO CARD button text changes to REMOVE

  Scenario: Verify social media buttons are working
    When I click the "LinkedIn" button
    Then Title should be "Sauce Labs | LinkedIn"