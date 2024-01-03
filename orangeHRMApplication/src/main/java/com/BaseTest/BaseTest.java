package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class BaseTest {

	public static WebDriver driver;
	String applicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";

	@Before
	public void applicationLaunch()
	{
	// Automating Chrome Browser
	System.setProperty("webdriver.chrome.driver","./browserDriverFiles/chromedriver.exe");
	driver = new ChromeDriver();

	// System.out.println(" ********* Chrome Browser Launched Successfully *********");

	Log.info(" ********* Chrome Browser Launched Successfully *********");

	// Navigating to OrangeHRM Application Url Address
	driver.get(applicationUrlAddress);
	//System.out.println(" Navigated to OrangeHRM Application ");

	Log.info(" Navigated to OrangeHRM Application ");

	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	driver.manage().window().maximize();


}

@AfterMethod
public void applicationClose()
{
driver.quit();
// System.out.println(" **** Application Closed Successfully ***** ");

Log.info(" **** Application Closed Successfully ***** ");
}






}


