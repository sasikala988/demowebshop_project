package pages;


import org.apache.log4j.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import org.apache.log4j.Logger;
import stepdefinition.tcregister;

public class registrationPage
{


	static WebDriver driver;
	WebElement Register,firstname, lastname, Gender, email, password,confirmpassword, submit;
	 public void click_register() 
	{
		Register =driver.findElement(By.linkText("Register"));
		Register.click();
	
	}
	 public registrationPage(WebDriver driver)
	{
		registrationPage.driver = driver;
	}
	 public void entergender()
		{
			Gender = driver.findElement(By.name("Gender"));
			Gender.click();
			
		}
	public void enterFirstname(String s)
	{
		firstname = driver.findElement(By.name("FirstName"));
		firstname.sendKeys(s);
		
	}
	public void enterlastname(String s)
	{
		lastname = driver.findElement(By.name("LastName"));
		lastname.sendKeys(s);
	}
	public void enteremail(String s)
	{
		email = driver.findElement(By.name("Email"));
		email.sendKeys(s);
	}
	
	public void enterpassword(String s)
	{
		password = driver.findElement(By.name("Password"));
		password.sendKeys(s);
	}
	
	public void enterconfirmpassword(String s)
	{
		confirmpassword= driver.findElement(By.name("ConfirmPassword"));
		confirmpassword.sendKeys(s);
	}
	public void entersubmit()
	{
		submit = driver.findElement(By.name("register-button"));
		submit.submit();
	}

	public static void Logger(String msg) {
		Logger lo=Logger.getLogger(tcregister.class.getName());
		lo.setLevel(Level.ALL);
		lo.info(msg);
	}
	ExtentReports extent;
	ExtentTest logger;
	{
	extent=new ExtentReports("C:\\Users\\ShaktiRajaAmbedkar\\eclipse-workspace\\Demowebshop_project\\src\\test\\resources\\extentReport.html",true);
	logger=extent.startTest("test2");
	logger.log(LogStatus.PASS,"registration details are added succesfully");
	System.out.println("registration details are added succesfully");
	extent.flush();
	extent.endTest(logger);
	extent.close();
	//driver.wait(2000);
}
}

	
	

	
	
	
