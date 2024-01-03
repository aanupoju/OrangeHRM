package com.OrangeHRMApplicationWebPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseTest.BaseTest;

public class OrangeHRMApplication_LogInPage extends BaseTest{

	public OrangeHRMApplication_LogInPage() // This is a Constructor - when the Java Class name is
    //   similar to the Method Name
{
PageFactory.initElements(driver, this);
}

//This Java Class is referred to as an Object Repository Class

//id="logInPanelHeading"
//Identifying the Element of the Webpage

//WebElement orangeHRMApplicationLogInPage_LogInPanel=driver.findElement(By.id("logInPanelHeading"));

@FindBy(id="logInPanelHeading")
WebElement orangeHRMApplicationLogInPage_LogInPanel;

public void orangeHRMApplicationLogInPage_LogInPanelValidation()
{

String expected_orangeHRMApplicationLogInPage_LogInPanelText="LOGIN Panel";
Log.info(" The Expected Text of the OrangeHRM Applicatin LogIN Page is :- "+expected_orangeHRMApplicationLogInPage_LogInPanelText);

String actual_orangeHRMApplicationLogInPage_LogInPanelText=orangeHRMApplicationLogInPage_LogInPanel.getText();
Log.info(" The Actual Text of the OrangeHRM Application LogIn Page is "+actual_orangeHRMApplicationLogInPage_LogInPanelText);

if(actual_orangeHRMApplicationLogInPage_LogInPanelText.equals(expected_orangeHRMApplicationLogInPage_LogInPanelText))
{
//System.out.println(" OrangeHRM Application LogIn Page Text existing - PASS ");
Log.info(" OrangeHRM Application LogIn Page Text existing - PASS ");
}
else
{
Log.info(" OrangeHRM Application LogIn Page Text NOT existing - FAIL");
}


}

@FindBy(xpath="//*[@id=\"divLogo\"]/img")
WebElement orangeHRMApplicationLogInPageImage;


public void orangeHRMApplicationLogInPage_LogoValidation()
{

boolean flag=orangeHRMApplicationLogInPageImage.isDisplayed();
if(flag)
{
Log.info("OrangeHRM Application LogIn Page Image Existing - PASS ");
}
else
{
Log.info("OrangeHRM Application LogIn Page Image NOT Existing - FAIL ");
}

}



}
