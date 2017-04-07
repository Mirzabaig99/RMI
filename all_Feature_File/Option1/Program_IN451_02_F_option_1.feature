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
    Then User is on program IN451_two Page
    And User click at AddButton on IN451_two Page
    And User enter "32-05-0577" in part number text box on IN451_two Page
    And User enter "80261" in Item number text box on IN451_two Page
    And User enter "2017" in year text box on IN451_two Page
    And user click at submit button on IN451_two Page
    Then User should navigate to IN451_two_F_program

  @Test_+Ve
  Scenario Outline: To test the functionality of IN451-02-F Page
    Given User is on program IN451_two_F Page
    And User enter "<Description>" in Desc Text Box on IN451_two_F Page
    And User enter "<Width Display>" in Width Display text box on IN451_two_F Page
    And User enter "<Width Display calc>" in Width Display Calc text box on IN451_two_F Page
    And User enter "<length Display>" in Length Display text box on IN451_two_F Page
    And User enter "<length Display calc>" in Length Display Calc text box on IN451_two_F Page
    And User enter "<Standered part>" in Standered part text box on IN451_two_F Page
    And User enter "<Bill of Material Part>" in Bill of Material Part text box on IN451_two_F Page
    And user click at submit button on IN451_two_F Page
 #   And user will get alert message
    Then User should navigate to IN451_three_program

    Examples: 
      | Description              | Width Display | Width Display calc | length Display | length Display calc | Standered part | Bill of Material Part |
      | 24 X 55 A572 50/50W/A992 |           12    |                  2 | NON STD        |             12.0001 | Y              | N                     |
      
