Feature: To test Login Functionality

  Scenario Outline: Successfull login with valid credentials
    Given User should be on login pg
    When User enters "<username>" and "<password>"
    And click on login button
    Then User should be navigated to the home page

    Examples:
      | username                | password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |


