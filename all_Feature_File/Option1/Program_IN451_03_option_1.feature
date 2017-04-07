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
    And User enter "24 X 55 A572 50/50W/A992" in Desc Text Box on IN451_two_F Page
    And User enter "12" in Width Display text box on IN451_two_F Page
    And User enter "2" in Width Display Calc text box on IN451_two_F Page
    And User enter "NON STD " in Length Display text box on IN451_two_F Page
    And User enter "12.0001" in Length Display Calc text box on IN451_two_F Page
    And User enter "Y" in Standered part text box on IN451_two_F Page
    And User enter "N" in Bill of Material Part text box on IN451_two_F Page
    And user click at submit button on IN451_two_F Page
    Then User should navigate to IN451_three_program

  @Test_+Ve
  Scenario Outline: To test the functionality of IN451_three Pages
    Given User is on program IN451_three Page
    And User enter "<Boxing Charge>" in Boxing Charge Text Box on IN451_three Page
    And User enter "<Box Unit Weight>" in Box Unit Weight Text Box on IN451_three Page
    And User enter "<Selling Price>" in Selling Price Text Box on IN451_three Page
    And User enter "<Selling Price UOM>" in Selling Price UOM Text Box on IN451_three Page
    And User enter "<Expiration Date>" in Expiration Date Text Box on IN451_three Page
    And User enter "<Next Sell Price>" in Next Sell Price Text Box on IN451_three Page
    And User enter "<Next Sell Price UOM>" in Next Sell Price UOM Text Box on IN451_three Page
    And User enter "<User Exit Program>" in User Exit Program Text Box on IN451_three Page
    And user click at submit button on IN451_three Page
    Then added value will appear on program IN451_two Page

    Examples: 
      | Boxing Charge | Box Unit Weight | Selling Price | Selling Price UOM | Expiration Date | Next Sell Price | Next Sell Price UOM | User Exit Program |
      | Y             |              12 |           122 | LOT               | 08/03/17        |             131 | LOT                 | N                 |
