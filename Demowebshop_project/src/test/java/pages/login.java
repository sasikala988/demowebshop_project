package pages;
import org.apache.log4j.Level;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import stepdefinition.tclogin;
import org.apache.log4j.Logger;
public class login 
{
	WebDriver driver;
	WebElement username,loginlog,password,sub;
	

	 public void click_login()
		{
			loginlog =driver.findElement(By.linkText("Log in"));
			loginlog.click();
		}

	 public login(WebDriver driver)
		{
			this.driver = driver;
		}
		public void enteruser_Name(String s)
		{
			username = driver.findElement(By.name("Email"));
			username.sendKeys(s);
		}
		public void enterpass(String s)
		{
		password = 	driver.findElement(By.name("Password"));
		password.sendKeys(s);
		}
		public void entersub()
		{

			sub = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
			sub.submit();
		}
		public static void Logger(String msg)
		{
			Logger lo=Logger.getLogger(tclogin.class.getName());
			lo.setLevel(Level.ALL);
			lo.info(msg);
		}
		ExtentReports extent;
		ExtentTest logger;
		{
		extent=new ExtentReports("C:\\Users\\ShaktiRajaAmbedkar\\eclipse-workspace\\Demowebshop_project\\src\\test\\resources\\extentReport.html",true);
		logger=extent.startTest("test1");
		logger.log(LogStatus.PASS,"login details are added succesfully");
		System.out.println("login details are added succesfully");
		extent.flush();
		extent.endTest(logger);
		extent.close();
		//driver.wait(2000);
}
}





