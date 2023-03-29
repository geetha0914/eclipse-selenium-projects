package Facebook.com.selenium_facebook.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Kavit\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
 	   ChromeOptions options = new ChromeOptions();
 	   options.addArguments("--remote-allow-origins=*");
 	   WebDriver driver = new ChromeDriver(options);
 	   System.out.println("Selenium Test Scripts Execution Started..");
 	   //Open Browser and enter the Url
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.get("https:/www.facebook.com/login/");  
     // create email address or phone number.   
        driver.findElement(By.id("email")).sendKeys("kavita.param999@gmail.com");
    //create password
        driver.findElement(By.id("pass")).sendKeys("Eswaramma@8");
        Thread.sleep(2000);
        //click login button
        driver.findElement(By.id("loginbutton")).click();
        Thread.sleep(2000);
        
        System.out.println("Script executed successfully");
    }
    
    
}
