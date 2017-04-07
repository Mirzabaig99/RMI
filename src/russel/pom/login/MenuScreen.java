/**
* This is Page Object Model (POM) for Menu or Options page in Application.
* It also Known as POM for Menu or Options Program (It comes Just after login page)
*
* @author  Pranawa Mishra
* @version 1.0
* @since   02-March-2017
*/

package russel.pom.login;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class MenuScreen {
	
	WebDriver driver;
	ResourceBundle option1 = ResourceBundle.getBundle("Properties file/option1");
	ResourceBundle option2 = ResourceBundle.getBundle("Properties file/option2");
	
	 public MenuScreen(WebDriver driver){
		 
	     this.driver = driver;
	 
	    }
	 public void screenName()
	 {
		 
 System.out.println(driver.getCurrentUrl());
		 
		 try 
			{
				String menu = driver.findElement(By.xpath(".//*[@id='index-page']/body/div[1]/div/section/div/ng-view/div/section/div/div[1]/h3")).getText();
				if (menu.startsWith("Menu For"))
				{
					System.out.println("Menu Page appeared");
				}
				
				}
			catch (NoSuchElementException e)
			{
				System.out.println("Menu page doesn't appear");
				driver.close();
			}
	
		 
	 }
	 
	 public void firstOption()
	 {
		 driver.findElement(By.xpath(option1.getString("in451_menu_option1_xpath"))).click();
	 }
	 
	 public void secondOption()
	 {
		 driver.findElement(By.xpath(option2.getString("in451_menu_option2_xpath"))).click();
	 }

}
