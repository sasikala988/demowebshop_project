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
import pages.registrationPage;


public class tcregister
{
	WebDriver driver;
     registrationPage register;
     @Given("^new user open the browser and click on register link$")
     public void new_user_open_the_browser_and_click_on_register_link() throws Throwable {
    	 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
 		driver =new ChromeDriver();
 		driver.get("http://demowebshop.tricentis.com");
 		 registrationPage.Logger("opening browser");
 		register = new registrationPage(driver);
 		register.click_register();
 		registrationPage.Logger("registrationpage opened");
 		
 		
 		
     }

     @When("^the new user enter valid register details and click on register button$")
     public void the_new_user_enter_valid_register_details_and_click_on_register_button() throws Throwable {
    	 register.entergender();
 		register.enterFirstname("karthik");
 		registrationPage.Logger("enter first name");
 		register.enterlastname("setti");
 		registrationPage.Logger("enter last name");
 		register.enteremail("gayathridevi967@gmail.com");
 		registrationPage.Logger("enter email");
 		register. enterpassword("sasi@123");
 		registrationPage.Logger("enter first password");
 		register. enterconfirmpassword("sasi@123");
 		register.entersubmit();
 		takeSnap();
 		
     }

     @Then("^system store user details and autom/atically navigates to login page$")
     public void system_store_user_details_and_autom_atically_navigates_to_login_page() throws Throwable {
        
     }
     public void takeSnap() throws IOException {
 		File scrFile;

 			scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 			Files.copy(scrFile, new File("./screenshots/registration.png"));
   }
     
     
}

     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	