import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class launchBingpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Automating chrome browser
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\aanup\\eclipse-workspace\\org.eclipse.ui.examples.javaeditor\\Drivers\\chromedriver.exe");
	ChromeDriver chromeBrowser = new ChromeDriver();
	chromeBrowser.get("http://www.Bing.com");
	chromeBrowser.navigate().to("http://google.com");
	chromeBrowser.get("http://www.youtube.com");
//Automating Fixerfox browser	
	System.out.println("Firefox browser");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\aanup\\eclipse-workspace\\org.eclipse.ui.examples.javaeditor\\Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
	FirefoxDriver firefoxBrowser = new FirefoxDriver();
	firefoxBrowser.get("http://www.google.com");
	 
	 String actual_BingTitle=chromeBrowser.getTitle();
  System.out.println(actual_BingTitle);
	  String expected_bingTitle ="Google";
	 System.out.println(expected_bingTitle);
	  if(actual_BingTitle.equals(expected_bingTitle))
	 {
		  System.out.println("The title of the bing home page matched - pass");
	  }
	else {
		  System.out.println("The title of the bing home page not matched - fail");
	  }
	  
	String Title= chromeBrowser.getTitle();
	if (Title.equals("YouTube"))
	{
		System.out.println("Title match");
		chromeBrowser.findElement(By.name("search_query")).sendKeys("testing");
		chromeBrowser.findElement(By.id("style-scope yt-icon-button")).click();
	}
	else
	{System.out.println("Title didnot match");}
	  	  //chromeBrowser.quit();
	  	  firefoxBrowser.quit();
	}
}


