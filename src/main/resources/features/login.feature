Feature: Swag Labs Login Page Tests

  Background:
    Given I navigate to the login page

  Scenario: Verify Valid User Can Login
    When I input "standard_user" as the username
    And I input "secret_sauce" as the password
    And I click the "submit" button
    Then Url should be "https://www.saucedemo.com/inventory.html"

  @ScenarioOutline
  Scenario Outline: Verify Login Error Messages
    When I input "<Username>" as the username
    And I input "<Password>" as the password
    And I click the "submit" button
    Then "<Error Message>" error message is displayed
    Examples:
      | Username        | Password     | Error Message                                       |
      | locked_out_user | secret_sauce | Epic sadface: Sorry, this user has been locked out. |
      |                 | secret_sauce | Epic sadface: Username is required                  |
      | standard_user   |              | Epic sadface: Password is required                  |


#  Scenario: Verify "Locked Out User" Error Message
#    When I input "locked_out_user" as the username
#    And I input "secret_sauce" as the password
#    And I click the "submit" button
#    Then "Epic sadface: Sorry, this user has been locked out." error message is displayed
#
#  Scenario: Verify "Username is required" Error Message
#    When I input "" as the username
#    And I input "secret_sauce" as the password
#    And I click the "submit" button
#    Then "Epic sadface: Username is required" error message is displayed
#
#  Scenario: Verify "Password is required" Error Message
#    When I input "standard_user" as the username
#    And I input "" as the password
#    And I click the "submit" button
#    Then "Epic sadface: Password is required" error message is displayed