import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nooftextboxes {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aanup\\eclipse-workspace\\org.eclipse.ui.examples.javaeditor\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		List<WebElement> totalTextboxes = driver.findElements(By.tagName("Input"));
		 
		System.out.println(totalTextboxes.size());
		
	}

}
