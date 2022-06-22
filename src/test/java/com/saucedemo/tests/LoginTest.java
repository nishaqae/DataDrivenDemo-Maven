/*
* Test Class to check the login with given set of username & password 
*/
package com.saucedemo.tests;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.saucedemo.config.BaseEvents;
import com.saucedemo.dataProviders.LoginDataProvider;
import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;

/**
 * @author nisha
 * Step 1: Launch the url - saucedemo.com
 * Step 2: Login to the system using the user names & passwords fetched from data provider 
 * Step 3: On successful login, verify the page title
 * Step 4: Click on menu & then logOut. Repeat the above with other credentials.
 */
public class LoginTest extends BaseEvents
{
	
	@Test(dataProvider = "LoginData", dataProviderClass =LoginDataProvider.class)
	public void verifyLogin(String userName, String password) throws IOException, InterruptedException
	{
		System.out.println("usrename=" + userName + "pwd=" + password);
		
 /*
  *  login() will read from the data file 
  * & pass the credentials to login form. On successful login,
  * user will directed to the ProductsPage.
  */
		prodObj= loginObj.login(userName, password);
		System.out.println("Page Title =" + prodObj.readTitle());
			  prodObj.clickMenu();
	
	}
		
}
	
	
	
	
