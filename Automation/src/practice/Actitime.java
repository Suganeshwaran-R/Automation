package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {
public static void main(String[] args) 
{
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://localhost/reports/reports.do");
	driver.findElement(By.id("username")).sendKeys("admin");
   driver.findElement(By.name("pwd")).sendKeys("manager");
   driver.findElement(By.xpath("//div[text()='Login ']")).click();
   driver.quit();
   
   
    
	}
}