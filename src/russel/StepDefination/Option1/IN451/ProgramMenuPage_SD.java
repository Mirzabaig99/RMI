/**
* This is Page Step definition for Menu or Options page in Application.
* This file get generate After running "Menu.feature" File 
*Steps used for : All
* @author  Pranawa Mishra
* @version 1.0
* @since   02-March-2017
*/

package russel.StepDefination.Option1.IN451;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import russel.base.Browser_setup;
import russel.pom.in451.option2.IN451_01_option_02_pom;
import russel.pom.login.MenuScreen;

public class ProgramMenuPage_SD extends Browser_setup {
	MenuScreen menu = new MenuScreen(driver);

	@Given("^User is on Menu page$")
	public void user_is_on_Menu_page() {

		menu.screenName();

	}

	@Given("^User clicks on first link for IN(\\d+) program$")
	public void user_clicks_on_first_link_for_IN_program(int arg1) {
		menu.firstOption();
	}

	@Then("^User navigates to IN(\\d+) page$")
	public void user_navigates_to_IN_page(int arg1) {
		System.out.println("IN451-01 appeared");

	}

	@Given("^User clicks on second link for IN(\\d+) program$")
	public void user_clicks_on_second_link_for_IN_program(int arg1) throws InterruptedException {
		Thread.sleep(5000);
		menu.secondOption();

	}

	@Then("^User navigates to IN(\\d+)_option_two page$")
	public void user_navigates_to_IN__option_two_page(int arg1) throws InterruptedException {
		Thread.sleep(5000);
		IN451_01_option_02_pom option2 = new IN451_01_option_02_pom(driver);
		option2.screenName();

	}

}
