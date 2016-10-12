package org.test;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.sarxos.webcam.Webcam;

public class WebcamTest {
    @Test
	public void test()
	
	{
	   WebDriver driver =  new FirefoxDriver();
	   driver.get("http://www.lenskart.com/");
	  
	   // driver.findElement(By.xpath(".//*[@id='login-pop-up']/div/a")).click();  
	   WebDriverWait wait=new WebDriverWait(driver, 15);
	   wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='level1-Try']/li[2]/a/span")));
	 
	   boolean Text_status = driver.findElement(By.xpath(".//*[@id='level1-Try']/li[2]/a/span")).isDisplayed();
		
	   
		
	   Webcam webcam = Webcam.getDefault();
	   Boolean Webcam_status;
	   
	   if (webcam != null) 
	   {
	   System.out.println("Webcam Detected: " + webcam.getName());
	   Webcam_status=true;
	   }
	 
	   else 
	   {
	   System.out.println("No webcam detected");
	   Webcam_status=false;
	   }
	   
	   Assert.assertEquals(Text_status,Webcam_status);
	   
	   driver.close();
	   
	 }
}




/*
 * Dependency Link:- https://github.com/sarxos/webcam-capture
 * use the following POM: 
   <dependency>
  <groupId>com.github.sarxos</groupId>
  <artifactId>webcam-capture</artifactId>
  <version>0.3.10</version>
  </dependency>

*/

