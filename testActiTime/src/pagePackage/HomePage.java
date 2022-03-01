package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

		
		// Declaration
		@FindBy(xpath="//a[.='Logout']") private WebElement logoutLink;
		@FindBy(name="usersSelector.selectedUser") private WebElement  enterTimeTrackDropdown;;
		@FindBy(id="SubmitTTButton") private WebElement saveLeaveTimeButton;
		
		
		
		// Initialization (Initialized using Constructor)
	
		public HomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		
		
		//Utilization
		public WebElement getLogoutLink() {
			return logoutLink;
		}

		public WebElement getEnterTimeTrackDropdown() {
			return enterTimeTrackDropdown;
		}

		public WebElement getSaveLeaveTimeButton() {
			return saveLeaveTimeButton;
		}
		
		//Generic reusable method
		
		public void logout()
		{
			logoutLink.click();
		}	
	}

