
/**
* This is Step definition for IN451-02F Program
* This file get generate After running "Program_IN451_02_F_option_1.feature" File 
*Steps used for : Option1
* @author  Pranawa Mishra
* @version 1.0
* @since   02-March-2017
**/

package russel.StepDefination.Option1.IN451;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import russel.base.Browser_setup;
import russel.pom.in451.option1.IN451_02_F_option_01_Pom;

public class Option1_IN451_02_F_SD extends Browser_setup {

	IN451_02_F_option_01_Pom prog2f = new IN451_02_F_option_01_Pom(driver);

	@Given("^User is on program IN(\\d+)_two_F Page$")
	public void user_is_on_program_IN__two_F_Page(int arg1) throws InterruptedException {
		Thread.sleep(35000);
		prog2f.screenName();
	}

	@Given("^User enter \"(.*?)\" in Desc Text Box on IN(\\d+)_two_F Page$")
	public void user_enter_in_Desc_Text_Box_on_IN__two_F_Page(String desc, int arg2) {
		prog2f.descriptionTextBox(desc);
	}

	@Given("^User enter \"(.*?)\" in Width Display text box on IN(\\d+)_two_F Page$")
	public void user_enter_in_Width_Display_text_box_on_IN__two_F_Page(String width_display, int arg2) {

		prog2f.widthDisplayTextBox(width_display);
	}

	@Given("^User enter \"(.*?)\" in Width Display Calc text box on IN(\\d+)_two_F Page$")
	public void user_enter_in_Width_Display_Calc_text_box_on_IN__two_F_Page(String width_display_calc, int arg2) {

		prog2f.widthDisplayCalcTextBox(width_display_calc);

	}

	@Given("^User enter \"(.*?)\" in Length Display text box on IN(\\d+)_two_F Page$")
	public void user_enter_in_Length_Display_text_box_on_IN__two_F_Page(String length_display, int arg2) {
		prog2f.lengthDisplayTextBox(length_display);
	}

	@Given("^User enter \"(.*?)\" in Length Display Calc text box on IN(\\d+)_two_F Page$")
	public void user_enter_in_Length_Display_Calc_text_box_on_IN__two_F_Page(String length_display_calc, int arg2) {

		prog2f.lenthDisplayCalcTextBox(length_display_calc);
	}

	@Given("^User enter \"(.*?)\" in Standered part text box on IN(\\d+)_two_F Page$")
	public void user_enter_in_Standered_part_text_box_on_IN__two_F_Page(String std_part, int arg2) {
		prog2f.standerdPartTextBox(std_part);
	}

	@Given("^User enter \"(.*?)\" in Bill of Material Part text box on IN(\\d+)_two_F Page$")
	public void user_enter_in_Bill_of_Material_Part_text_box_on_IN__two_F_Page(String bom, int arg2) {
		prog2f.billOfMaterialPartTextBox(bom);
	}

	@Given("^user click at submit button on IN(\\d+)_two_F Page$")
	public void user_click_at_submit_button_on_IN__two_F_Page(int arg1) throws InterruptedException {
		Thread.sleep(15000);
		prog2f.submitButton();

	}

	@Given("^user will get alert message$")
	public void user_will_get_alert_message() {
		prog2f.alertMessage();
	}

	@Then("^User should navigate to IN(\\d+)_three_program$")
	public void user_should_navigate_to_IN__three_program(int arg1) {
		System.out.println("User moving to next page/program [IN451-03]");
	}

}
