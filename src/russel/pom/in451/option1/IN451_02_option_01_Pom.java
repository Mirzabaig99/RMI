/**
* This is Page Object Model (POM) for option 1 in Application.
* It also Known as POM for IN451-02 Program (For Option 1)
*
* @author  Pranawa Mishra
* @version 1.0
* @since   02-March-2017
*/

package russel.pom.in451.option1;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class IN451_02_option_01_Pom {

	WebDriver driver;
	ResourceBundle bundle = ResourceBundle.getBundle("Properties file/option1");
	ResourceBundle alert = ResourceBundle.getBundle("Properties file/error_messages");

	public IN451_02_option_01_Pom(WebDriver driver) {

		this.driver = driver;

	}
	 public void screenName()
	 {
		String Screen_name= driver.findElement(By.cssSelector(bundle.getString("program_name_IN451_02_label_css"))).getText(); //Find Screen/Program Name that appears on screen
		String page_title= driver.findElement(By.cssSelector(bundle.getString("page_title_lbl_css"))).getText(); //Find Screen/Program Title that appears on top of screen
		System.out.println("Current Screen is :- " +Screen_name + "And Page Title is :- " + page_title);
	 }
	 
	 public void addButton()
	 {
		 driver.findElement(By.cssSelector(bundle.getString("Add_btn_IN451_02_css"))).click(); //click at Add button
		 System.out.println("IN451-02 : User click at Add Button.");
	 }
	 public void customerPartNumberTextBox(String part_number )
	 {
		 driver.findElement(By.cssSelector(bundle.getString("customer_part_number_text_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("customer_part_number_text_box_css"))).sendKeys(part_number); //Enter value in Part Number text box
		 System.out.println("IN451-02 : Enter value in Part Number text box");
	 }
	 
	 public void itemNumberTextBox(int item_number )
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("item_number_text_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("item_number_text_box_css"))).sendKeys(""+item_number); //Enter value in Item Number text box
		 System.out.println("IN451-02 : Enter value in Item Number text box");
	 }
	 
	 public void yearTextBox(int year )
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("model_year_text_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("model_year_text_box_css"))).sendKeys(""+year); //Enter value in Year text box
		 System.out.println("IN451-02 : Enter value in Year text box");
	 }
	 
	 public void submitButton()
	 {
		 driver.findElement(By.cssSelector(bundle.getString("submit_btn_in451_02_css"))).click(); //click at Submit button
		 System.out.println("IN451-02 : User Click at Submit Button");
		 System.out.println(driver.getCurrentUrl());
	 }
	 
	
	 public void alertMessage()
	 
	 {
		 String blank_expected_message = alert.getString("blank_expected_message");
		 try 
			{
		 
			 String blank_actual_message =  driver.findElement(By.cssSelector(alert.getString("error_message_css"))).getText(); //Get Alert Message text 
			 if (blank_expected_message.equalsIgnoreCase(blank_actual_message))
			 {
				 System.out.println("Error appear for Blank Customer Name & Customer Number");
				 driver.close();
			 }
		 
			}
		 catch (NoSuchElementException e)
			{
				System.out.println("No Error is appeared on IN451-01 Screen, Moving to Next Page [IN451-02-F]");
				
			}
	 }
}
