Feature: Test Russel Metal Inc. Application

  Background: 
    Given User Launch the browser
    When User goto Russel Metal Application

  @Test_+Ve
  Scenario Outline: To test the functionality of login page
    Given User is on Login page
    When User enters "<User_Name>" and "<Password>"
    And User clicks on Submit button of login page
    Then User navigates to main menu page

    Examples: 
      | User_Name | Password |
      | JAMESR    | PEMBROKE |

  @Test_-Ve
  Scenario Outline: To test the functionality of login page
    Given User is on Login page
    When User enters "<User_Name>" and "<Password>"
    And User clicks on Submit button of login page
    Then Error message should be shown

    Examples: 
      | User_Name | Password |
      | JAMESR    | PEMBROKE |
