package packageloops1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aanup\\eclipse-workspace\\org.eclipse.ui.examples.javaeditor\\Drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
	driver.manage().window().maximize();
	WebElement sell = driver.findElement(By.id("registerbtn"));
	sell.click();
	Thread.sleep(500);
	WebElement msg1 = driver.findElement(By.id("msg"));
	System.out.println(msg1);
	String a = "Registration is Successful";
	//String b = msg1;
	if (a.equals (msg1.getText())) {
	System.out.println("validated successfuly");
	}
	else {
		System.out.println(" validation unsuccessful");
	}
	WebElement Fname = driver.findElement(By.id("firstName"));
    Fname.sendKeys("Aparna");
    Thread.sleep(5000);
    driver.findElement(By.id("clearbtn")).click();
    System.out.println(Fname.getText().isEmpty());
    driver.close();
    
}
}
