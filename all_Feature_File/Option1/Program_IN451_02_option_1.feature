Feature: Test Russel Metal Inc. Application

  Background: 
    Given User Launch the browser
    When User goto Russel Metal Application
    And User enters "JAMESR" and "PEMBROKE"
    And User clicks on Submit button of login page
    And User is on Menu page
    And User clicks on first link for IN451 program
    Then User is on program IN451-01 Page
    And User enter "" in customer name text box
    And User enter "9510114" in customer number text box
    And user click at submit button on IN451 page

  @Test_+Ve
  Scenario Outline: To test the functionality of IN451-02 Page
    Given User is on program IN451_two Page
    And User click at AddButton on IN451_two Page
    And User enter "<Part_number>" in part number text box on IN451_two Page
    And User enter "<Item_number>" in Item number text box on IN451_two Page
    And User enter "<Year>" in year text box on IN451_two Page
    And user click at submit button on IN451_two Page
    Then User should navigate to IN451_two_F_program

    Examples: 
      | Part_number | Item_number | Year |
      | 32-05-0577  |       80261 | 2017 |
