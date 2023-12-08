Feature: Home Page Test

  Background:
    Given Browser is open
    Given I am on the main site


  Scenario Outline: Login in with login and password
    When Click cookie confirmation
    When Click Log In
    When Fill email input with "<email>"
    When Fill password input with  "<password>"
    When Click login button
    Then Welcome inscription is visible and return text

    Examples:
      | email                          | password  |
      | goryszewski.karol@gmail.com    | 1qazxsw2  |




