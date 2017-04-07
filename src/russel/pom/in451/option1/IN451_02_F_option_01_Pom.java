/**
* This is Page Object Model (POM) for option 1 in Application.
* It also Known as POM for IN451-02F Program (For Option 1)
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


public class IN451_02_F_option_01_Pom {
	
	WebDriver driver;
	ResourceBundle bundle = ResourceBundle.getBundle("Properties file/option1");
	ResourceBundle alert = ResourceBundle.getBundle("Properties file/error_messages");
	
	 public IN451_02_F_option_01_Pom(WebDriver driver){
		 
	     this.driver = driver;
	 
	    }
	 public void screenName()
	 {
		 /*WebDriverWait wait = new WebDriverWait(driver, 15);
		 long start = System.currentTimeMillis();

		 driver.get("Some url");

		 WebElement ele = driver.findElement(By.cssSelector(".loading-img"));
		 wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loading-img")));
		 long finish = System.currentTimeMillis();
		 long totalTime = finish - start; 
		 System.out.println("Total Time for page load - "+totalTime); */
		 
		String Screen_name= driver.findElement(By.cssSelector(bundle.getString("program_name_IN451_02_F_label_css"))).getText(); //Find Screen/Program Name that appears on screen
		String page_title= driver.findElement(By.cssSelector(bundle.getString("page_title_lbl_css"))).getText(); //Find Screen/Program Title that appears on top of screen
		System.out.println("Current Screen is :- " +Screen_name + " & Page Title is :- " + page_title);
		
	 }
	 
	 public void partNumberTextBox()
	 {
		 
		String part_number= driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_Part_Number_txt_box_css"))).getText(); //Read Value From Part Number text box
		 System.out.println("IN451-02-F : value Appeared in Part Number text box is:- " +part_number);
	 }
	
	 public void descriptionTextBox(String desc )
	 {
		 driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_desc_txt_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_desc_txt_box_css"))).sendKeys(desc); //Enter value in description text box
		 System.out.println("IN451-02-F : Entered value in Description text box and value is:- " +desc);
	 }
	 
	 public void widthDisplayTextBox(String width_display )
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_width_disply_txt_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_width_disply_txt_box_css"))).sendKeys(width_display); //Enter value in Width Display text box
		 System.out.println("IN451-02-F : Entered : " +width_display +" as value in width Display text box");
	 }
	 
	 public void widthDisplayCalcTextBox(String width_display_calc )
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_width_disp_calc_txt_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_width_disp_calc_txt_box_css"))).sendKeys(width_display_calc); //Enter value in Width Display Calc text box
		 System.out.println("IN451-02-F : Entered : " +width_display_calc +" as value in width Display Calc text box");
	 }
	 
	 public void lengthDisplayTextBox(String length_display )
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_length_disp_txt_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_length_disp_txt_box_css"))).sendKeys(length_display); //Enter value in Length Display text box
		 System.out.println("IN451-02-F : Entered : " +length_display +" as value in Length Display text box");
	 }
	 
	 public void lenthDisplayCalcTextBox(String length_display_calc )
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_length_disp_calc_txt_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_length_disp_calc_txt_box_css"))).sendKeys(length_display_calc); //Enter value in Length Calc text box
		 System.out.println("IN451-02-F : Entered : " +length_display_calc +" as value in Length Display Calc text box");
	 }
	 
	 public void standerdPartTextBox(String std_part )
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_Standard_part_material_txt_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_Standard_part_material_txt_box_css"))).sendKeys(std_part); //Enter value in Standerd PartTextBox text box
		 System.out.println("IN451-02-F : Entered :- " +std_part +" as value in Standard Part text box");
	 }
	 
	 public void billOfMaterialPartTextBox(String bom )
	 {	
		 driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_Bill_of_Material_Part_txt_box_css"))).clear();
		 driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_Bill_of_Material_Part_txt_box_css"))).sendKeys(bom); //Enter value in Bill Of Material Part text box
		 System.out.println("IN451-02-F : Entered :- " +bom +" as value in Bill Of MaterialPart Text box");
	 }
	 
	 
	 
	 public void submitButton()
	 {
		 driver.findElement(By.cssSelector(bundle.getString("IN451_02_F_submit_btn_css"))).click(); //click at Submit button
		 System.out.println("IN451-02-F : User Clicked at Submit Button");
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
