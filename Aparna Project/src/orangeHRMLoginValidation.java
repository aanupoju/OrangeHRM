import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class orangeHRMLoginValidation {

	/*public void navigatetoOrangeHRM()
	{
		//Navigate to Orange HRM login page
		WebDriver driver;
		String OrangeHRMUrlAddress = "https://";
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\aanup\\eclipse-workspace\\Aparna Project\\Driver\\DriverFiles\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(OrangeHRMUrlAddress);
	}*/
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
        //creating an object for the class navigatetoOrangeHRM
		//orangeHRMLoginValidation openchromedriver = new orangeHRMLoginValidation();
		//calling method navigatetoOrangeHRM of class orangeHRMLoginValidation
		//openchromedriver.navigatetoOrangeHRM();
		
		//Navigate to Orange HRM login page
				WebDriver driver;
				String OrangeHRMUrlAddress = "http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\aanup\\eclipse-workspace\\Aparna Project\\Driver\\DriverFiles\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get(OrangeHRMUrlAddress);
		
				
		//Input UserName ad password from Excel
				//Identify the File
				 FileInputStream loginfile= new FileInputStream("C:\\Users\\aanup\\eclipse-workspace\\Aparna Project\\InputdataExcel\\Login.xlsx");
			
				 //Identify the worksheet
			     XSSFWorkbook loginworkbook	= new XSSFWorkbook(loginfile);
				//Identify the Sheet
				XSSFSheet loginsheet   = loginworkbook.getSheet("OrangeHRM_Login");
				//Identify the row
				
				// In the Sheet identifying the Number of Active Rows with the data
				int RowsCount=loginsheet.getLastRowNum();

				// Should go automatically to every Active Row
				for(int rowIndex=0;rowIndex<=RowsCount;rowIndex++)
				{
				// should goto an active Row
				Row row=loginsheet.getRow(rowIndex);

			

				// going to an active Row of its active Cell
				Cell rowOfCell=row.getCell(1);

				// get the data from the Row of the Cell
				String username=rowOfCell.getStringCellValue();

				// find username in orangeHRM login screen
				By userName=By.name(username);
				WebElement UsernameWebElement=driver.findElement(userName);
				//enter username
				UsernameWebElement.sendKeys(username);
				
				
				// print the data of the Excel Sheet into Eclipse Console
				System.out.print(username+" | ");
				Cell password_1=row.getCell(2);

				// get the data from the Row of the Cell
				String password_2=password_1.getStringCellValue();
				//Identify password
				By password=By.name("password");
				WebElement passwordWebElelment=driver.findElement(password);
				//Enter password
			
				passwordWebElelment.sendKeys(password_2);
				//Identify Login button
				
				By Login = By.name("Login");
				WebElement loginWebElement=driver.findElement(Login);
				//click login button
				loginWebElement.click();
				
				Thread.sleep(3000);
				
				File Login_Screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE );
				FileUtils.copyFile(Login_Screenshot, new File ("C:\\Users\\aanup\\eclipse-workspace\\Aparna Project\\InputdataExcel\\Login.xlsx"));
				
				}

				System.out.println();
				}	
				
		
		
		
		
		
	}