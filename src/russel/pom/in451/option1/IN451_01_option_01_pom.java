/**
* This is Page Object Model (POM) for option 1 in Application.
* It also Known as POM for IN451-01 Program (Option 1)
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


public class IN451_01_option_01_pom {
	
	WebDriver driver;
	ResourceBundle bundle = ResourceBundle.getBundle("Properties file/option1");
	ResourceBundle alert = ResourceBundle.getBundle("Properties file/error_messages");
	
	 public IN451_01_option_01_pom(WebDriver driver){
		 
	     this.driver = driver;
	 
	    }
	 public void screenName()
	 {
		String Screen_name= driver.findElement(By.cssSelector(bundle.getString("program_name_label_css"))).getText(); //Find Screen/Program Name that appears on screen
		String page_title= driver.findElement(By.cssSelector(bundle.getString("page_title_lbl_css"))).getText(); //Find Screen/Program Title that appears on top of screen
		System.out.println("Current Screen is :- " +Screen_name + "And Page Title is :- " + page_title);
	 }
	 public void customerNameTextBox(String cust_name )
	 {
		 driver.findElement(By.cssSelector(bundle.getString("customer_name_text_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("customer_name_text_box_css"))).sendKeys(cust_name); //Enter value in Customer Name text box
	 }
	 
	 public void customerNumberTextBox(String cust_number )
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("customer_number_text_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("customer_number_text_box_css"))).sendKeys(""+cust_number); //Enter value in Customer Number text box
	 }
	 
	 public void cancelButton()
	 {
		 driver.findElement(By.xpath(bundle.getString("in451_01_cancel_btn_xpath"))).click(); //Click at Cancel Button 
	 }
	 public void searchButton()
	 {
		 driver.findElement(By.xpath(bundle.getString("in451_01_search_btn_xpath"))).click(); //Click at Search Button 
	 }
	 
	 public void submitButton()
	 {
		 driver.findElement(By.cssSelector(bundle.getString("submit_btn_css"))).click(); //Click at Submit Button 
	 }
	 
	 public void pageVerificationSAR410_01 ()
	 {

			try {
				
				System.out.println("Page Appeared Name is : "+driver.findElement(By.cssSelector(bundle.getString("program_name_SAR410_01_label_css"))).getText()); 
			}
			
			catch (NoSuchElementException exception) {
				
				System.out.println("Expected page SAR401-01 not appeard, Driver getting close");
				driver.close();
			}
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
				System.out.println("No Error is appeared on IN451-01 Screen, Moving to Next Page [IN451-02]");
				
			}
	 }
}
