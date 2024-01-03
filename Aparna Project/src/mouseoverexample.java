import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoverexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aanup\\eclipse-workspace\\org.eclipse.ui.examples.javaeditor\\Drivers\\chromedriver.exe");
		ChromeDriver chromeBrowser = new ChromeDriver();
		chromeBrowser.get("https://artoftesting.com/");
		WebElement Ele = chromeBrowser.findElement(By.linkText("Automation"));
		
		Actions action=new Actions(chromeBrowser);
		action.moveToElement(Ele).perform();
		chromeBrowser.findElement(By.linkText("Selenium Tutorial")).click();
		chromeBrowser.quit();
	}

}
