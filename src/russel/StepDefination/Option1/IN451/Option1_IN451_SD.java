/**
* This is Step definition for IN451-01 Program 
* This file get generate After running "Program_IN451_01_option_1.feature" File 
* Steps used for : Option1
* @author  Pranawa Mishra
* @version 1.0
* @since   02-March-2017
*/

package russel.StepDefination.Option1.IN451;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import russel.base.Browser_setup;
import russel.pom.in451.option1.IN451_01_option_01_pom;

public class Option1_IN451_SD extends Browser_setup {
	
	IN451_01_option_01_pom prog = new IN451_01_option_01_pom(driver);
	
	@Given("^User is on program IN(\\d+)-(\\d+) Page$")
	public void user_is_on_program_IN_Page(int arg1, int arg2) throws InterruptedException{
		Thread.sleep(8000);
		prog.screenName();
	}

	@Given("^User enter \"(.*?)\" in customer name text box$")
	public void user_enter_in_customer_name_text_box(String cust_name)  {
		
		prog.customerNameTextBox(cust_name);
	}

	@Given("^User enter \"(.*?)\" in customer number text box$")
	public void user_enter_in_customer_number_text_box(String cust_number){
		prog.customerNumberTextBox(cust_number);
	}

	@Given("^user click at submit button on IN(\\d+) page$")
	public void user_click_at_submit_button_on_IN_page(int arg1) {
		prog.submitButton();
	}
	
	@Given("^user click at search button on IN(\\d+) page$")
	public void user_click_at_search_button_on_IN_page(int arg1) {
		
		prog.searchButton();
	}

	@Then("^User navigate to SAR(\\d+)-one page$")
	public void user_navigate_to_SAR_one_page(int arg1) throws InterruptedException {
		Thread.sleep(25000);
		prog.pageVerificationSAR410_01();
	}

	
	@Then("^User get error message$")
	public void user_get_error_message() {
		prog.alertMessage();
		
	}

}
