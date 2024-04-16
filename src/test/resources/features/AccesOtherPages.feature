@TestPages
Feature:  A user should be able to login and
  see his username on the top-right corner and after that could see his index.

  Background: Steps for all scenarios
    Given the home page is access
    And the web windows is maximized
    When the sign in button is clicked
    And the fields are filled with values
      |username|Petru|
      |parola|Test3  |
    And the sign in button should be click
    And the user button is clicked

  Scenario: Show index page to the user
    And the index button is clicked
    Then the index page is accessed

  Scenario: Show invoice page to the user
    And the invoices button is clicked
    Then the invoices page is displayed

  Scenario: Show account setting
    And the account card is clicked
    Then the account page should be displayed

  Scenario: User can access messages page and open a message
    And the messages card is clicked
    And the messages is selected
    Then the messages should be displayed in a pop-up

  Scenario: User can access news page
    And the news page card is clicked
    Then the news page is displayed