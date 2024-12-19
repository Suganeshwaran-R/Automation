package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTitleofWin {

	public static void main(String[] args) {
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://secure.indeed.com");
		d.findElement(By.id("login-google-button")).click();
		d.findElement(By.id("apple-signin-button")).click();
		String pwid = d.getWindowHandle();
		Set<String> allWid = d.getWindowHandles();
		for (String wid : allWid) {
			d.switchTo().window(wid);
			System.out.println(d.getTitle());
			d.close();

		}
	}

}
