package demo;
package Popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3 {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.linkText("Alert with Textbox")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
     Alert a = driver.switchTo().alert();
     a.sendKeys("vinay");
     a.accept();
     String text = driver.findElement(By.id("demo1")).getText();
     System.out.println(text);
	
	
}
}
