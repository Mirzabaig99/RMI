/**
* This is Step definition for IN451-02 Program
* This file get generate After running "Program_IN451_02_option_1.feature" File 
*Steps used for : Option1
* @author  Pranawa Mishra
* @version 1.0
* @since   03-March-2017
*/

package russel.StepDefination.Option1.IN451;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import russel.base.Browser_setup;
import russel.pom.in451.option1.IN451_02_option_01_Pom;

public class Option1_IN451_02_SD extends Browser_setup {

	IN451_02_option_01_Pom prog2 = new IN451_02_option_01_Pom(driver);

	@Given("^User is on program IN(\\d+)_two Page$")
	public void user_is_on_program_IN_two_Page(int arg1) {
		prog2.screenName();

	}

	@Given("^User click at AddButton on IN(\\d+)_two Page$")
	public void user_click_at_AddButton_on_IN_two_Page(int arg1) throws InterruptedException {
		Thread.sleep(9000);
		prog2.addButton();
	}

	@Given("^User enter \"(.*?)\" in part number text box on IN(\\d+)_two Page$")
	public void user_enter_in_part_number_text_box_on_IN__two_Page(String part_number, int arg2) {
		prog2.customerPartNumberTextBox(part_number);
	}

	@Given("^User enter \"(.*?)\" in Item number text box on IN(\\d+)_two Page$")
	public void user_enter_in_Item_number_text_box_on_IN_two_Page(int item_number, int arg2) {
		prog2.itemNumberTextBox(item_number);
	}

	@Given("^User enter \"(.*?)\" in year text box on IN(\\d+)_two Page$")
	public void user_enter_in_year_text_box_on_IN_two_Page(int year, int arg2) {
		prog2.yearTextBox(year);

	}

	@Given("^user click at submit button on IN(\\d+)_two Page$")
	public void user_click_at_submit_button_on_IN_two_Page(int arg1) throws InterruptedException {
		Thread.sleep(5000);
		prog2.submitButton();

	}

	@Then("^User should navigate to IN(\\d+)_two_F_program$")
	public void user_should_navigate_to_IN_two_F_program(int arg1) {

		System.out.println("Output : User Moved to IN451-02F Screen.");
	}

}
