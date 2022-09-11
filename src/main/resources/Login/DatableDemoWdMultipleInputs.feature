Feature: login functionality with different username and password

  Scenario: Demo for Datatable :

    Given User should be on login page
    When User should enter username and password
    | user234 | pass1 |
    | user890 | pass2 |
    | user156 | pass3 |
    And Click on login button
    Then User should navigated to the home page