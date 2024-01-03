import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot_Bing {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver;
		String applicationUrlAddress="http://bing.com";

		// Automating Chrome Browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aanup\\eclipse-workspace\\Aparna Project\\Driver\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();

		// Maximizing the Browser
		driver.manage().window().maximize();


		System.out.println(" ********* Chrome Browser Launched Successfully *********");

		// Navigating to OrangeHRM Application Url Address
		driver.get(applicationUrlAddress);
		System.out.println(" Navigated to Bing HomePage ");


		// TakesScreenshot - is an interface in Selenium
		// driver - is an object
		// Type Casting
		// OutputType - is an interface in Selenium
		File bingScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(bingScreenShot, new File("./ScreenShots/bingHomePage.png"));

		driver.quit();

		}

		

	}


