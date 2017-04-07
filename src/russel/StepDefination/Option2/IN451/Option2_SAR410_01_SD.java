package russel.StepDefination.Option2.IN451;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import russel.base.Browser_setup;
import russel.pom.in451.option2.SAR410_01_option_02_pom;

public class Option2_SAR410_01_SD extends Browser_setup
{
	SAR410_01_option_02_pom Op2_SAR410_01 = new SAR410_01_option_02_pom(driver);
	@Given("^User check Customer Number CheckBox$")
	public void user_check_Customer_Number_CheckBox()
	{
		
	}

	@When("^User clicks on (\\d+)-Select button$")
	public void user_clicks_on_Select_button(int arg1) 
	{
		
	}

	@Then("^User should Navigate to IN(\\d+)-(\\d+) screen$")
	public void user_should_Navigate_to_IN_screen(int arg1, int arg2) 
	{
		
	}

	@When("^User click on cancel button$")
	public void user_click_on_cancel_button() 
	{
		
	}
	

}
