import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumfirstprogram {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\aanup\\eclipse-workspace\\org.eclipse.ui.examples.javaeditor\\Drivers\\chromedriver-win64\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.facebook.com/");
  
  // driver.findElement(By.id("email")).sendKeys("aanupoju@gmail.com");
  // driver.findElement(By.id("pass")).sendKeys("AmmA@0781");
  // driver.wait(5000);
   //driver.findElement(By.id("loginbutton")).click();
  driver.findElement(By.linkText("Create new account")).click();
  //  span class="_5k_3"/
  driver.findElement(By.xpath("//span class=_5k_3/span(3)")).click();
	}

}
