package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AddandDeleteuser {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http:/localhost.login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='login']")).sendKeys("click");
	driver.findElement(By.linkText("USERS")).click();
	driver.findElement(By.className("buttonText")).click();
	WebElement popup=driver.findElement(By.className("userDataLightBox"));
	boolean res =popup.isDisplayed();
	if(res==true)
	{
		System.out.println("The add user popup is displayed");
	
		{
		
			System.out.println("The add user popup is not displayed");
			}
	}
}
}	
	
	
	


