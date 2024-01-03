package autodropdownapstrc;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoselectdropdown {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aanup\\eclipse-workspace\\org.eclipse.ui.examples.javaeditor\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
		
		WebElement s= driver.findElement(By.id("fromPlaceName"));
		s.sendKeys("vij");
		for(int i = 0; i<=3;i++) {
		s.sendKeys(Keys.ARROW_DOWN);
		}
		s.sendKeys(Keys.ENTER);
	}
	https://demoqa.com/select-menu
}
