Feature: To test Standard chartered debitcard pin functionality

  Scenario:
    Given user should have valid stanc debit card
    When user should insert debit card into ATM
    And insert correct pin
    And click on proceed
    Then user is navigated to the home page

  @Smoke
  Scenario:
    Given The sufficient balance Rs1000 should be there
    When  user should withdraw Rs100 from account
    And   click on the proceed button
    Then  The ATM should dispense the money to user
    And   balance should be Rs900