/**
* This is Page Step definition for Menu or Options page in Application.
* This file get generate After running "login.feature" File 
*Steps used for : All
* @author  Pranawa Mishra
* @version 1.0
* @since   02-March-2017
*/

package russel.StepDefination.Option1.IN451;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import russel.base.Browser_setup;
import russel.pom.login.Login_page;

public class Login_Page_SD1 extends Browser_setup {
	Login_page login = new Login_page(driver);

	@Given("^User is on Login page$")
	public void user_is_on_Login_page() {

	}

	@When("^User enters \"(.*?)\" and \"(.*?)\"$")
	public void user_enters_and(String user_name, String password)

	{
		login.userName(user_name);
		login.password(password);

	}

	@When("^User clicks on Submit button of login page$")
	public void user_clicks_on_Submit_button_of_login_page() {
		login.submitButton();
	}

	@Then("^User navigates to main menu page$")
	public void user_navigates_to_main_menu_page() {

		System.out.println(driver.getCurrentUrl());

		try {
			String menu = driver
					.findElement(By
							.xpath(""))
					.getText();
			if (menu.startsWith("Menu For")) {
				System.out.println("Menu Page appeared");
				driver.close();
			}

		} catch (NoSuchElementException e) {
			System.out.println("Menu page doesn't appear");
			driver.close();
		}
	}

	@Then("^Error message should be shown$")
	public void error_message_should_be_shown() {
		driver.close();

	}
	
	@After("@selenium")
    public void killBrowser(Scenario scenario){
        final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);     //Take screenshot
        scenario.embed(screenshot, "image/png");
    }   

}
