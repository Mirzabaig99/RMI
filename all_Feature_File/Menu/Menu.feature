Feature: Test Russel Metal Inc. Application

  Background: 
    Given User Launch the browser
    When User goto Russel Metal Application
    And User enters "JAMESR" and "PEMBROKE"
    And User clicks on Submit button of login page

  @First
  Scenario: To test the functionality of Menu page
    Given User is on Menu page
    And User clicks on first link for IN451 program
    Then User navigates to IN451 page

  @Second
  Scenario: To test the functionality of Menu page
    Given User is on Menu page
    And User clicks on second link for IN451 program
    Then User navigates to IN451_option_two page
