package practice;

import java.time.Duration;

import org.openqa.selenium.By;                             
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
public static void main(String[] args) {
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	d.get("https://www.instagram.com/");
	d.findElement(By.name("username")).sendKeys("smart_suganesh");
	d.findElement(By.name("password")).sendKeys("1Suganesh$");
	//d.findElement(By.xpath("(//div[contains(@class,'x9f619')])[10]");
}
}