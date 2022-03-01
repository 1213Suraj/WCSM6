package testPackage;

import java.io.IOException;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Flib;
import pagePackage.LoginPage;

public class TestActiTimeValidLogin extends BaseTest {
	
	@Test
	public void login() throws IOException {
		LoginPage lp = new LoginPage(driver);
		Flib flib = new Flib();
		String validUsername = flib.readPropertyFile(PROP_PATH, "un");
		String validPassword = flib.readPropertyFile(PROP_PATH, "pass");
		
		lp.validLogin(validUsername, validPassword);


}
}
