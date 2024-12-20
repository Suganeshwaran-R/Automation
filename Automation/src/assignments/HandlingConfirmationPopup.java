package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationPopup {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.findElement(By.linkText("Alert with OK & Cancel")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	driver.switchTo().alert().dismiss();
	boolean res = driver.findElement(By.id("demo")).isDisplayed();
	if(res==true) {
		System.out.println("The text is displayed");
	}else {
		System.out.println("The text is not displayed");
	}
	
}
}
