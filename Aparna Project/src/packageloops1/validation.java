package packageloops1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class validation {


public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\aanup\\eclipse-workspace\\org.eclipse.ui.examples.javaeditor\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://robinjescott.com/");
	String Expected_URL = "https://robinjescott.com/";
	String Actual_URL = driver.getCurrentUrl();
	System.out.println(Actual_URL);
	if (Expected_URL.equals(Actual_URL)) {
		System.out.println("URL Validated");
	}
	else {
		System.out.println("URL Not Validated");
	}
}
}