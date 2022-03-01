package generic;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib extends BaseTest {
	public void getTittle() 
	{
		driver.getTitle();
	}

	public void verifyThePageTittle(String ExpectedTittle)
	{
		String actualtittle = driver.getTitle();
		if(ExpectedTittle.equals(actualtittle)) 
		{
			System.out.println(actualtittle+"is verified");
		}
		else {
			System.out.println(actualtittle+"is not verified");

		}
	}



	//DropDown 

	public void DropDown(WebElement element,String visibleText) 
	{
		Select scl = new Select(element);
		scl.selectByVisibleText(visibleText);	
	}

	public void DropDown(String value,WebElement element) 
	{
		Select scl = new Select(element);
		scl.selectByValue(value);	
	}

	public void DropDown(int index,WebElement element) 
	{
		Select scl = new Select(element);
		scl.selectByIndex(index);	
	}
	public void  getAllSelectedOptionFromDropDown(WebElement element) 
	{
		Select scl = new Select(element);
		scl.getAllSelectedOptions();	 
	}

	//implicitlyWait


	public void implicitlyWait() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}


	//Switch to Frames

	public void switchToFrame(WebElement element,int index) 
	{
		Select sl = new Select(element);
		sl.selectByIndex(index);
	}
	public void switchToFrame(String value) 
	{
		Select sl = new Select((WebElement) driver);
		sl.selectByValue(value);
	}

	public void switchToFrame(String visibletext,WebElement element) 
	{
		Select sl = new Select(element);
		sl.selectByVisibleText(visibletext);
	}




	//  mouse Hover Methods
	public void moveToElement(WebElement target)
	{
		Actions act = new Actions(driver);
		act.moveToElement(target).perform();
	}


	public void contextClick(WebElement target)
	{
		Actions act = new Actions(driver);                    
		act.contextClick(target).perform();                
	}

	public void doubleClick(WebElement target)
	{
		Actions act = new Actions(driver);
		act.doubleClick(target).perform();                   
	}

	public void dragAndDrop(WebElement source,WebElement target)
	{
		Actions act = new Actions(driver);
		act.dragAndDrop(source, target).perform();
	}


	// Alert Popup handling methods


	public void acceptAlertPopup()
	{
		Alert alt = driver.switchTo().alert();
		alt.accept();
	}

	public void dismissAlertPopup()
	{
		Alert alt = driver.switchTo().alert();
		alt.dismiss();
	}

	public void acceptConfirmationPopup()
	{
		Alert alt = driver.switchTo().alert();
		String Text = alt.getText();
		System.out.println(Text);
		alt.accept();                                                 
	}

	public void dismissConfirmationPopup()
	{
		Alert alt = driver.switchTo().alert();
		String Text = alt.getText();
		System.out.println(Text);
		alt.dismiss();                                                
	}
}
