
/**
* This is Step definition for IN451-03 Program 
* This file get generate After running "Program_IN451_03_option_1.feature" File 
*Steps used for : Option1
* @author  Pranawa Mishra
* @version 1.0
* @since   02-March-2017
*/


package russel.StepDefination.Option1.IN451;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import russel.base.Browser_setup;
import russel.pom.in451.option1.IN451_03_option_01_Pom;



public class Option1_IN451_03_SD extends Browser_setup {
	
	IN451_03_option_01_Pom prog3 = new IN451_03_option_01_Pom (driver);
	
	@Given("^User is on program IN(\\d+)_three Page$")
	public void user_is_on_program_IN__three_Page(int arg1) throws InterruptedException 
	{
		Thread.sleep(35000);
		prog3.screenName();
	}

	@Given("^User enter \"(.*?)\" in Boxing Charge Text Box on IN(\\d+)_three Page$")
	public void user_enter_in_Boxing_Charge_Text_Box_on_IN__three_Page(String Boxing_charge, int arg2) {
		
		prog3.boxingChargeTextBox(Boxing_charge);
	}

	@Given("^User enter \"(.*?)\" in Box Unit Weight Text Box on IN(\\d+)_three Page$")
	public void user_enter_in_Box_Unit_Weight_Text_Box_on_IN__three_Page(String box_weight, int arg2){
		prog3.boxUnitWeightTextBox(box_weight);
	}

	@Given("^User enter \"(.*?)\" in Selling Price Text Box on IN(\\d+)_three Page$")
	public void user_enter_in_Selling_Price_Text_Box_on_IN__three_Page(String Selling_price, int arg2) {
		prog3.sellingPriceTextBox(Selling_price);
	}

	@Given("^User enter \"(.*?)\" in Selling Price UOM Text Box on IN(\\d+)_three Page$")
	public void user_enter_in_Selling_Price_UOM_Text_Box_on_IN__three_Page(String Selling_price_uom, int arg2) {
		
		prog3.sellingPriceUomTextBox(Selling_price_uom);
	}

	@Given("^User enter \"(.*?)\" in Expiration Date Text Box on IN(\\d+)_three Page$")
	public void user_enter_in_Expiration_Date_Text_Box_on_IN__three_Page(String exp_date, int arg2){
		
		prog3.expirationDateByCalender();
		
		//prog3.expirationDateTextBox(exp_date);
	}

	@Given("^User enter \"(.*?)\" in Next Sell Price Text Box on IN(\\d+)_three Page$")
	public void user_enter_in_Next_Sell_Price_Text_Box_on_IN__three_Page(String next_sell, int arg2){
		prog3.nextSellPriceTextBox(next_sell);
	}

	@Given("^User enter \"(.*?)\" in Next Sell Price UOM Text Box on IN(\\d+)_three Page$")
	public void user_enter_in_Next_Sell_Price_UOM_Text_Box_on_IN__three_Page(String next_sell_uom, int arg2){
		prog3.nextSellPriceUomTextBox(next_sell_uom);
	}

	@Given("^User enter \"(.*?)\" in User Exit Program Text Box on IN(\\d+)_three Page$")
	public void user_enter_in_User_Exit_Program_Text_Box_on_IN__three_Page(String uep, int arg2){
		prog3.userExitProgramTextBox(uep);
	}

	@Given("^user click at submit button on IN(\\d+)_three Page$")
	public void user_click_at_submit_button_on_IN__three_Page(int arg1){
		prog3.submitButton();
	}
	@Then("^added value will appear on program IN(\\d+)_two Page$")
	public void added_value_will_appear_on_program_IN__two_Page(int arg1) {
		
		
	}

}
