package SecurePay.securepay;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactUs {

	TestData d = new TestData();
	String Fname = d.FirstName();
	String Lname = d.LastName();
	String Wemail = d.WorkEmail();
	
	
	String phnum = d.PhoneNum();
	
	String comp = d.CompanyName();
	String Weburl = d.WebUrl();
	
	@Test
	public void ContactForm() {
		
		//Getting first part of google search and navigate to contat us page
		SecureCantactUs secure = new SecureCantactUs () ;
		secure.SecureContact();
		secure.createWebdriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		//First Name
		secure.createWebdriver().findElement(By.xpath("//*[@id=\"support-form\"]/div/div[1]/div/label/input")).sendKeys(Fname);
		secure.createWebdriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Last Name
		
		secure.createWebdriver().findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div/div[2]/form/div/div[2]/div/label/input")).sendKeys(Lname);
		secure.createWebdriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Work Email
		
		secure.createWebdriver().findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div/div[2]/form/div/div[3]/div/label/input")).sendKeys(Wemail);
		secure.createWebdriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Phone Num
		
		secure.createWebdriver().findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div/div[2]/form/div/div[4]/div/label/input")).sendKeys(phnum);
		secure.createWebdriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Company Name
		
		secure.createWebdriver().findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div/div[2]/form/div/div[5]/div/label/input")).sendKeys(comp);;
		secure.createWebdriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Website URL
		
		secure.createWebdriver().findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div/div[2]/form/div/div[6]/div/label/input")).sendKeys(Weburl);;
		secure.createWebdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Turen over of company
		
		Select comTurn = new Select (secure.createWebdriver().findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div/div[2]/form/div/div[7]/div/label/div/select")));
		
		comTurn.selectByIndex(2);
		secure.createWebdriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Message
		
		secure.createWebdriver().findElement(By.xpath("/html/body/div[1]/div[1]/main/section/div/div/div[2]/form/div/div[8]/div/label/textarea")).sendKeys("These is Testing");;
		secure.createWebdriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		
		//Closing Webdriver
		
	//	secure.createWebdriver().close();
		
		
		
		
	}
	
	
}
