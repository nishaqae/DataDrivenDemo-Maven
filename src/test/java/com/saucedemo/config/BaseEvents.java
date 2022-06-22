/**
 * BaseEvents Class has all the required annotations to 
 * call the respective functions
 * 1) @Before & @After Class does the setUp & tearDown 
 *     tasks respectively.
 * 2) 
 */

package com.saucedemo.config;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.saucedemo.pages.LoginPage;
import com.saucedemo.pages.ProductsPage;
import com.saucedemo.tests.LoginTest;

/**
 * @author nisha
 *
 */
public class BaseEvents extends BaseConfig
{
	protected static LoginPage loginObj = null;
	protected static ProductsPage prodObj = null;

	@BeforeClass
	 public void setUp() throws IOException
	 {
		loadProperties();
		loginObj=PageFactory.initElements(driver,LoginPage.class);
		prodObj =PageFactory.initElements(driver,ProductsPage.class);
		System.out.println("Starting Browser");
		
	 }
	
	
	@Test
	public void LoginTest()
	{
		System.out.println("trial");
		
	
	}
	
	@AfterClass
	public void tearDown() throws IOException
	{
			closeBrowser();
			System.out.println("Closing Browser");
		
	}
	 
	
	
	
	
	

}
