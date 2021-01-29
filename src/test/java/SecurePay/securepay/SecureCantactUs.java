package SecurePay.securepay;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class SecureCantactUs {
	
	
	
	public static WebDriver driver ;
	public static WebDriverManager webdriverm;
	
	//Creatin WebDriver 
	 public WebDriver getDriver() {
	        return createWebdriver();
	    }
	 
	 
	 public WebDriver createWebdriver() {
		 
		 webdriverm.chromedriver().setup();
		 
		 return driver;
		 
		 
	 }
	
	
	public void SecureContact () {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		
		driver = new ChromeDriver();
		
		
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//Navigating to google.com
		driver.get("https://www.google.com.au/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
		//Keying Securepay and clicking search
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")).sendKeys("SecurePay");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")).click();
		
		
		//Clicking the Search result and navigating to Secure pay
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[1]/a/h3/span")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		//Clicking to ContactUs page 
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);	
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/footer[1]/div[1]/div[1]/nav[1]/ul[1]/li[5]/nav[1]/ul[1]/li[2]/a[1]/span[2]")).click();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
	
		
		
		
		
		
		
		
		
	}
	
	

}
