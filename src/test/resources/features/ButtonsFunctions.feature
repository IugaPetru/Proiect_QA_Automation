@ButtonsHomeFunction
Feature: A user should be able to extend the vertical and horizontal menu
  Background: Steps for all scenarios
    Given the home page is access
    And the web windows is maximized

  Scenario: Extend vertical menu
    When the extend button is clicked
    Then the vertical menu is extended
  Scenario: Extend horizontal menu
    When the user button is clicked
    Then the submenu is showed
  Scenario: Open register page
    When the user button is clicked
    And the sign in button is clicked
    And the register button is clicked
    Then the register page is displayed