package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingRightClick {
	public static void main(String[] args) throws AWTException {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://www.facebook.com");
		WebElement ele = d.findElement(By.linkText("Sign Up"));
		Actions s = new Actions(d);
		s.contextClick(ele).perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_W);
		d.quit();

	}

}
