Feature: Test Russel Metal Inc. Application

  Background: 
    Given User Launch the browser
    When User goto Russel Metal Application
    And User enters "JAMESR" and "PEMBROKE"
    And User clicks on Submit button of login page
    And User is on Menu page
    And User clicks on first link for IN451 program

  @Test_+Ve
  Scenario Outline: To test the functionality of Submit button on IN451-one Page
    Given User is on program IN451-01 Page
    And User enter "<Customer_Name>" in customer name text box
    And User enter "<Customer_Number>" in customer number text box
    And user click at submit button on IN451 page
    Then User get error message

    Examples: 
      | Customer_Name | Customer_Number |
      |               |         9510114 |

  @search
  Scenario Outline: To test the functionality of Search button on IN451-one Page
    Given User is on program IN451-01 Page
    And User enter "<Customer_Name>" in customer name text box
    And User enter "<Customer_Number>" in customer number text box
    And user click at search button on IN451 page
    Then User navigate to SAR410-one page

    Examples: 
      | Customer_Name | Customer_Number |
      |               |         9510114 |
      | GOOD          |                 |
