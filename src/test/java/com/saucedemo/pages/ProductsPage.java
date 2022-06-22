package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.saucedemo.config.BaseEvents;

public class ProductsPage extends BaseEvents
{
	protected WebDriver driver;

	public ProductsPage(WebDriver driver) 
	{
		this.driver= driver;
	}

	/* Locating the menu & logout button
	 */
 
	@FindBy(xpath="//button[text()='Open Menu']")
	 WebElement menu;
	
	@FindBy(id="logout_sidebar_link")
	 WebElement logOut;

	public String readTitle()
	{
		return (driver.getTitle());
		
	}
	public void clickMenu() throws InterruptedException
	{
		menu.click();
		Thread.sleep(2000);
		System.out.println("to click logout");
		logOut.click();
		
		
	}

	
	
	
	

}
