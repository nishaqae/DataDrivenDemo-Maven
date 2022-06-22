/**
 * 
 */
package com.saucedemo.pages;
import com.saucedemo.config.BaseEvents;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author nisha
 *
 */
public class LoginPage extends BaseEvents
{ 
	protected WebDriver driver;

	public LoginPage(WebDriver driver) 
	{
		this.driver= driver;
	}

	/* Locating form fields: user name, password & login button
	 */
 
	@FindBy(id="user-name")
	 WebElement userName;
	
	@FindBy(id="password")
	 WebElement password;

	@FindBy(id="login-button")
	 WebElement loginButton;
	
	
	/*
	 * login() will read from the data file 
	 * & pass the credentials to login form. On successful login,
	 * user will directed to the ProductsPage.
	 */
  public ProductsPage login(String name, String pwd) throws InterruptedException
	{
	  userName.clear();
	  userName.sendKeys(name);
	  password.clear();
	  password.sendKeys(pwd);  
	  loginButton.click();
	
	  return prodObj;
	  
	
	}
  
     
	  
   }
  
	
	
	
	
	

