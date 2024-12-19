package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import graphql.com.google.common.collect.Sets.SetView;

public class A4 {
public static void main(String[] args) {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://pib.gov.in");
    driver.switchTo().alert().accept();
    driver.findElement(By.linkText("Ministry of Education")).click();
    driver.switchTo().alert().accept();
    Set<String> allwid=driver.getWindowHandles();
    for (String wid : allwid) {
    	driver.switchTo().window(wid);
    	System.out.println(driver.getTitle());
    	
		
	}
    driver.quit();
} 

}
