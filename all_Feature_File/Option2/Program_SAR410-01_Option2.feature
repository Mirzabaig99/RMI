Feature: Test Russel Metal Inc. Application

  Background: 
    Given User Launch the browser
    When User goto Russel Metal Application
    And User enters "JAMESR" and "PEMBROKE"
    And User clicks on Submit button of login page
    And User is on Menu page
    And User clicks on second link for IN451 program
    When User enter "GOOD" in customer name text box
    And User click on Search Button for option2

  @Test_+Ve
  Scenario: To test the functionality of Select Button
    Given User check Customer Number CheckBox
    When User clicks on 1-Select button
    Then User should Navigate to IN451-02 screen

  @Test_+Ve
  Scenario: To test the functionality of cancel button
    When User click on cancel button
    Then User navigates to IN451_option_two page
    Then User Logouts and exit Browser
