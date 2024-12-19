package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderOrHiddenPopup {
public static void main(String[] args) {
	WebDriver d=new ChromeDriver();
	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	d.get("https://www.makemytrip.com/");
	d.findElement(By.className("commonModal__close")).click();
}
}
