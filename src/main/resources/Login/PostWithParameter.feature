Feature: To post activity on instagram

  Background: Common Step for all Scenarios.
    Given Should be logged on your home page in instagram

@PerformTest
  Scenario:
    When Attach picture of "Daugther pic" on your instagram account
    And Click on post
    Then Pic should be uploaded.

  Scenario:
    When Writing a poem on "Being Underwater" on your wall
    And Click on post button
    Then Poem should be seen by alxl your friends