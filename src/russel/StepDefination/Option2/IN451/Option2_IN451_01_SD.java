package russel.StepDefination.Option2.IN451;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import russel.base.Browser_setup;
import russel.pom.in451.option2.IN451_01_option_02_pom;

public class Option2_IN451_01_SD extends Browser_setup {
	
	IN451_01_option_02_pom prog2 = new IN451_01_option_02_pom (driver);
	
	
	@Given("^User enter \"(.*?)\" in part number text box$")
	public void user_enter_in_part_number_text_box(String  part_number) {
		
		prog2.partrNumberTextBox(part_number);
		
		
	}

	@Then("^User get an error message page$")
	public void user_get_an_error_message_page() {
		
		prog2.alertMessageForInvalid();
		
		
	}
	
	
//	__SEARCH_BUTTON__
	
	@When("^User click on Search Button for option(\\d+)$")
	public void user_click_on_Search_Button_for_option(int arg1) 
	{
		prog2.searchButton();
	}

	@Then("^User should be on SAR(\\d+) screen$")
	public void user_should_be_on_SAR_screen(int arg1) throws InterruptedException 
	{
		Thread.sleep(5000);
		prog2.VerifySAR410Screen();
	}

	@Then("^Data Should appear as per \"(.*?)\"$")
	public void data_Should_appear_as_per(String arg1) 
	{
	prog2.VerifyDataTableSAR410();	
	}
	
	@Then("^User Logouts and exit Browser$")
	public void user_Logouts_and_exit_Browser()
	{
		Logout();
		QuitBrowser();
	}
}
