Feature:  A user should be able to login and
  see his username on the top-right corner and after that could see his invoices.
Background: Steps for all scenarios
  Given the home page is access
  And the web windows is maximized
  When the sign in button is clicked

  Scenario: Access login page
    Then the sign in page should be displayed

  Scenario: the user should bea able to LogIn
    And the fields are filled with values
      |username|Petru|
      |parola|Test3  |
    And the sign in button should be click
    And the user button is clicked
    Then the user is logged



