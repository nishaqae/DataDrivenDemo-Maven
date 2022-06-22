/**
 * BaseConfig Class will 
 * 1) load the key-value pair from config.properties file
 * 2) load the driver based on browser type
 * 3) launch the browser with the given url
 * 
 */
package com.saucedemo.config;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author nisha
 *
 */
public abstract class BaseConfig {

    protected  WebDriver driver = null;
	private    String browser = null;
	private    String chromePath = null;
	private    String firefoxdriver = null;
	private    String baseUrl = null;
	
	
	/* loadProperties() will load the values from the
	 * config file to variables declared and load the driver as per
	 * the chosen browser type
	 */
	protected void loadProperties() throws IOException
		{
		FileInputStream file = new FileInputStream("C:\\SeleniumTraining\\Workspace\\Java\\JavaDummy\\HybridFrameworkDemo\\src\\test\\java\\com\\saucedemo\\config\\config.properties");
		Properties prop      = new Properties();
		prop.load(file);
		
		browser 	= prop.getProperty("browser");
		chromePath 	= prop.getProperty("chromePath");
		baseUrl 	= prop.getProperty("baseUrl");
		
	switch(browser)
		{
		
		case "Chrome" : 
		case "chrome" :
			
			  System.setProperty("webdriver.chrome.driver", chromePath);
			  driver = new ChromeDriver();
			  launchBrowser();
			  break;
			  
		case "Firefox" :
		case "FF":
		case "firefox":
			
			  System.setProperty("webdriver.chrome.driver", chromePath);
			  driver = new FirefoxDriver();
			  launchBrowser();
			  break;
			  
		case "Edge" :
		case "edge" :
		
			  System.setProperty("webdriver.chrome.driver", chromePath);
			  driver = new EdgeDriver();
			  launchBrowser();
			  break;
		
		}
		
	}
	
	
	/* launchBrowser() has the code to 
	 * 1) launch the browser with the given url
	 * 2) maximize the browser window
	 * 3) manage pageload & implicitly wait timeouts
	 */
  protected void launchBrowser()
	{
		 
		driver.get(baseUrl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(1));
		
	}
	
  
  /* closeBrowser() 
   * 1) quits the driver
   * 2) kills the tasks explicitly in the task manager to free the resources
   * 
   */
	protected void closeBrowser() throws IOException
	{
		driver.close();
		//driver.quit();
		//Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe");
		
		
	}
	
	
	
	
	
	
	
	
	
	
}

