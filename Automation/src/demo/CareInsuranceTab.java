package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CareInsuranceTab {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.careinsurance.com/");
	Thread.sleep(2000);
	Set<String> allwid =driver.getWindowHandles();
	for (String wid : allwid) {
		driver.switchTo().window(wid);
	}
	Thread.sleep(2000);
	driver.findElement(By.id("policynumber")).sendKeys("123"+)Keys.ENTER);
	driver.findElement(By.id("dob")).click();
	Thread.sleep(2000);
	WebElement month =driver.findElement(By.xpath("//select"))
	
	
	
}
}
