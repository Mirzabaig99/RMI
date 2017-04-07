/**
* This is Page Object Model (POM) for option 1 in Application.
* It also Known as POM for IN451-03 Program (For Option 1)
*
* @author  Pranawa Mishra
* @version 1.0
* @since   02-March-2017
*/

package russel.pom.in451.option1;

import java.util.List;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IN451_03_option_01_Pom {

	WebDriver driver;
	ResourceBundle bundle = ResourceBundle.getBundle("Properties file/option1");
	ResourceBundle alert = ResourceBundle.getBundle("Properties file/error_messages");

	public IN451_03_option_01_Pom(WebDriver driver) {

		this.driver = driver;

	}
	 public void screenName()
	 {
		 		 
		String Screen_name= driver.findElement(By.cssSelector(bundle.getString("program_name_IN451_03_label_css"))).getText(); //Find Screen/Program Name that appears on screen
		String page_title= driver.findElement(By.cssSelector(bundle.getString("page_title_lbl_css"))).getText(); //Find Screen/Program Title that appears on top of screen
		System.out.println("Current Screen is :- " +Screen_name + " & Page Title is :- " + page_title);
		
	 }
	 
	 public void boxingChargeTextBox(String Boxing_charge)
	 {
		 
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_boxing_charge_txt_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_boxing_charge_txt_box_css"))).sendKeys(Boxing_charge); //Enter value in Boxing Charge text box
		 System.out.println("IN451-03 : Entered value in Boxing Charge text box and value is:- " +Boxing_charge);
	 }
	
	 public void boxUnitWeightTextBox(String box_weight )
	 {
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_box_unit_weight_txt_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_box_unit_weight_txt_box_css"))).sendKeys(box_weight); //Enter value in Box Unit Weight text box
		 System.out.println("IN451-03 : Entered value in Box Unit Weight text box and value is:- " +box_weight);
	 }
	 
	 public void sellingPriceTextBox(String Selling_price )
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_selling_price_txt_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_selling_price_txt_box_css"))).sendKeys(Selling_price); //Enter value in  selling Price text box
		 System.out.println("IN451-03 : Entered value in Selling Price text box and value is:- " +Selling_price);
	 }
	 
	 public void sellingPriceUomTextBox(String Selling_price_uom )
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_selling_price_uom_txt_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_selling_price_uom_txt_box_css"))).sendKeys(Selling_price_uom); //Enter value in Selling Price UOM text box
		 System.out.println("IN451-03 : Entered value in Selling Price UOM text box and value is:- " +Selling_price_uom);
	 }
	 
	/* public void expirationDateTextBox(String exp_date )
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_expiration_date_txt_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_expiration_date_txt_box_css"))).sendKeys(exp_date); //Enter value in Expiration Date text box
		 System.out.println("IN451-03 : Entered value in Expiration Date text box Manually and value is:- " +exp_date);
	 }*/
	 
	 public void expirationDateByCalender()
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_expiration_date_calender_btn_css"))).click(); //Clicked at Calendar Button  for Expiration Date
		 List<WebElement> date = driver.findElements(By.xpath(".//*[@id='index-page']/body/div[2]/div/div[1]/table/tbody/tr[1]/td"));
		 
		 for(WebElement ele:date)
			{
				
				String CurDate=ele.getText();
				
				if(CurDate.equalsIgnoreCase("28"))
				{
					ele.click();
					break;
				}
				
			}
		 
		 System.out.println("IN451-03 : Entered value in Expiration Date text box Manually and value is:- ");
	 }
	 
	 public void nextSellPriceTextBox(String next_sell )
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_next_sell_price_txt_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_next_sell_price_txt_box_css"))).sendKeys(next_sell); //Enter value in Next Sell Price text box
		 System.out.println("IN451-03 : Entered value in Next Sell Price text box and value is:- " +next_sell);
	 }
	 
	 public void nextSellPriceUomTextBox(String next_sell_uom )
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_next_sell_price_uom_txt_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_next_sell_price_uom_txt_box_css"))).sendKeys(next_sell_uom); //Enter value in Next Sell UOM Price text box
		 System.out.println("IN451-03 : Entered value in Next Sell UOM Price text box and value is:- " +next_sell_uom);
	 }
	 
	 public void userExitProgramTextBox(String uep )
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_user_exit_program_txt_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_user_exit_program_txt_box_css"))).sendKeys(uep); //Enter value in User Exit Program text box
		 System.out.println("IN451-03 : Entered value in User Exit Program text box and value is:- " +uep);
	 }
	 
	 
	 
	 public void submitButton()
	 {
		 driver.findElement(By.cssSelector(bundle.getString("IN451_03_submit_btn_css"))).click(); //click at Submit button
		 System.out.println("IN451-03 : User Clicked at Submit Button");
	 }
	 
	
	
	 public void alertMessage()
	 
	 {
		
		 try 
			{
		 
			 String blank_actual_message =  driver.findElement(By.cssSelector(alert.getString("error_message_css"))).getText(); //Get Alert Message text 
			 System.out.println("An Alert Message appear stating that:- "+blank_actual_message);
			 System.out.println("Browser will be close due to occurance of Error, Unable to Move to next Page");
			 driver.close(); //Browser closed due to error.
			 
			 
			}
		 catch (NoSuchElementException e)
			{
				System.out.println("No Error appeared on IN451-01 Screen, Moving to Next Page [IN451-03]");
				
			}
	 }
}
