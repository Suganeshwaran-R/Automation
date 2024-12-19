package demo;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingChildBrowser {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://secure.indeed.com/auth");
		driver.findElement(By.id("login-goole-button")).click();
		driver.findElement(By.id("apple-signin-button")).click();
		String pwid = driver.getWindowHandle();
		Set<String> allwid = driver.getWindowHandles();
		for (String wid : allwid) {
			driver.switchTo().window(wid);
			if(wid.equals(pwid)) {
				driver.close();
			}
		}
	}

}
