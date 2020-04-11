package stepdefinition;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.io.Files;



public class addcard {
	   public static WebDriver driver;
	     public    WebElement link,link1,img,add,sh,ch,checkout,gu,deta,email,pass,logg,dropdown;
	         static int i=1;
	         
	            
	         public void launch() throws IOException {
	    	 driver=new ChromeDriver();
	    	 driver.get("http://demowebshop.tricentis.com/");
	    	 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	    	 driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("gayathridevi967@gmail.com");
	    	 driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("sasi@123"); 
	    	 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	    link =driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[3]/a"));
	     link.click();
	     takesnap();
		  	}
   
 
public void click_img() throws IOException
{
	        img=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[1]/div[2]/div/div/a/img"));
	          img.click();
	         takesnap();
	          
}	            
	          public void click_img1() throws IOException
	       {
	    	        img=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[1]/a/img"));
	    	          img.click();
	    	            takesnap();
	    	       
           }
  
  public void addcardd() throws IOException
  {
	     add = driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-43\"]"));
	       add.click();
	       takesnap();
	  
}
  
public void shoppinglink() throws IOException
{
	        sh=driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]"));
	          sh.click();
	            takesnap();
	       
}
  
public void checkbox() throws IOException
{
	       ch=driver.findElement(By.xpath("//*[@id=\"termsofservice\"]"));
	         ch.click();
	         takesnap();
	    
	       
}
  
public void checkout() throws IOException
{
	       checkout=driver.findElement(By.xpath("//*[@id=\"checkout\"]"));
	         checkout.click();
	     	           takesnap();
}

  public void billing()
   {
      deta=driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input"));
      deta.click();
      deta=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
       deta.click();
       System.out.println("log in ");
       System.out.println("selected product & add to cart ");
       System.out.println("log out");
       
   }
  
   public static  void takesnap() throws IOException 
   {
File scrFile;
		scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(scrFile,new File("E:\\"+ i +".pngs"));
		i++;
	     }

}

 