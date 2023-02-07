Feature: Fill the form using cycles
  Me as a user
  I want to fill the form using cycles
  To verify  the functioning of the page

  Scenario: Fill the form using cycles
    Given "userA" logs with credentials
    When tries to complete step 1
    Then shoulds see the msg indicanting that form is done