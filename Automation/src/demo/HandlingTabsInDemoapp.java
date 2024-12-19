package demo;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTabsInDemoapp  {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		d.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		d.findElement(By.xpath("//section[text()='Popups']")).click();
		d.findElement(By.xpath("//section[text()='Browser Windows']")).click();
		d.findElement(By.linkText("Multiple Tabs")).click();
		d.findElement(By.id("browserButton2")).click();
		Set<String> allWin = d.getWindowHandles();
		for (String wid : allWin) {
			d.switchTo().window(wid);
			String title = d.getTitle();
			System.out.println(title);
			d.close();
		}
	}
}
