package autodropdownapstrc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public static {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\aanup\\eclipse-workspace\\org.eclipse.ui.examples.javaeditor\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	WebElement s= driver.findElement(By.id("u_3_o_I4"));
	s.sendKeys("vij");
	for(int i = 0; i<=3;i++) {
	s.sendKeys(Keys.ARROW_DOWN);
	}
	s.sendKeys(Keys.ENTER);
}
}