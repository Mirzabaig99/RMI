package russel.pom.in451.option2;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SAR410_01_option_02_pom 
{
	public WebDriver driver;
	ResourceBundle SAR410 = ResourceBundle.getBundle("src/Properties file/option2.properties");

	public SAR410_01_option_02_pom(WebDriver driver) 
	{
		
		this.driver=driver;
	}

	public void CustomerNameCheckBox()
	{
		driver.findElement(By.xpath(SAR410.getString("CutomerName_CheckBox_Xpath"))).click();
	}
	
	public void ClickSelectButton()
	{
		driver.findElement(By.xpath("SelectButton_Xpath")).click();
	}
	
	public void VerifyIN451_02Screen()
	{
		String  ExpectedURL = SAR410.getString("IN451_02_ExpectedURL");
		String ActualURL = driver.getCurrentUrl();
		if(ActualURL.equalsIgnoreCase(ExpectedURL))
		{
			System.out.println("Page Navigated to IN451-02 screen");
		}
		
		else
		{
			System.out.println("Page Not Navigated to IN451-02 screen");
		}
	}
	
}
