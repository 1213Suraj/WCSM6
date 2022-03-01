package pagePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	// Declaration  (@Find+control+space to get @FindBy)
	
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement psw;
	@FindBy(id="loginButton") private WebElement loginBtn;
	@FindBy(name="//img[contains(@src,'timer')]") private WebElement logo;
	@FindBy(name="keepLoggedInCheckBox") private WebElement keepMeLoggedInCheckBox;

	
	// Initialization  (from source select constructor using fields and deselect all)
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	
	
	
	
	// Utilization  (Go to Source option and Select Getters And Setters and the check only getters :to get the private webElements we had used this)
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPsw() {
		return psw;
	}
	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public WebElement getLogo() {
		return logo;
	}
	public WebElement getKeepMeLoggedInCheckBox() {
		return keepMeLoggedInCheckBox;
	}	
	
     // Operational Method
	
	public void sendUsername()
	{
		usn.sendKeys("admin");
	}
	public void sendPassword()
	{
		psw.sendKeys("manager");
	}
	public void ClickOnLoginButton()
	{
		loginBtn.click();
	}
	public void delayOfTwoSeconds() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	// OR By using Generic resable method (we can execute by both methods generic or operational but generic is better)
	
	public void validLogin (String validUsername,String validPassword)
	{
		usn.sendKeys(validUsername);
		psw.sendKeys(validPassword);
		loginBtn.click();
	}
	
	public void invalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
	{
		usn.sendKeys(invalidUsername);
		Thread.sleep(2000);
		psw.sendKeys(invalidPassword);
		Thread.sleep(2000);
		loginBtn.click();
		usn.clear();
	}
}