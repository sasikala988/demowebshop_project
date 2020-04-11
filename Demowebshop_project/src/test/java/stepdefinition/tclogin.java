package stepdefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.login;

public class tclogin
{WebDriver driver;
login log;

@Given("^open application and click on login link$")
public void open_application_and_click_on_login_link() throws Throwable {
    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    driver =new ChromeDriver();
    driver.get("http://demowebshop.tricentis.com");
    log = new login(driver); 
     log.click_login();
     login.Logger("launching broswer");
}

@When("^the user enters the valid username and valid password and click submit$")
public void the_user_enters_the_valid_username_and_valid_password_and_click_submit() throws Throwable {
	 log.enteruser_Name("gayathridevi967@gmail.com");
	    log.enterpass("sasi@123");
	    log.entersub();
	    takeSnap();
		
// String title=driver.getTitle();
 login.Logger("entered login details");
}

@Then("^the system navigates to HOMEpage$")
public void the_system_navigates_to_HOMEpage() throws Throwable {
	 addcard d=new addcard();
	 d.launch();
   //   d.click_cellphones();
    d.click_img();
  //  Thread.sleep(2000);
    d.click_img1();
  ///  Thread.sleep(5000);
     d.addcardd();
 //    Thread.sleep(5000);
     d.shoppinglink();
  //   Thread.sleep(5000);
     d.checkbox();
  //   Thread.sleep(5000);
     d.checkout();
  //   Thread.sleep(5000);
   //  d.building_address();
     d.billing();
 //  d.gustregister();
  
    }

public void takeSnap() throws IOException {
	File scrFile;

		scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile, new File("./screenshots/login.png"));
}



}





























