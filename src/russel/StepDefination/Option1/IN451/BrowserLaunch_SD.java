/**
* This is Step definition for Browser Launch and Open URL into that
* This file generate After running "login.feature" File 
*
* @author  Pranawa Mishra
* @version 1.0
* @since   02-March-2017
*/


package russel.StepDefination.Option1.IN451;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import russel.base.Browser_setup;

public class BrowserLaunch_SD extends Browser_setup{
	
	@Given("^User Launch the browser$")
	public void user_Launch_the_browser() {
		browser();
		
		
	}

	@When("^User goto Russel Metal Application$")
	public void user_goto_Russel_Metal_Application() {
		hitURL();
		
	}


}
