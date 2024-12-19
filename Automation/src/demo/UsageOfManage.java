package demo;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfManage {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com"); Thread.sleep(2000);
		String title = driver.getTitle();Thread.sleep(2000);
		System.out.println(title);Thread.sleep(2000);
		driver.manage().window().fullscreen();
		driver.manage().deleteAllCookies();Thread.sleep(2000);
		driver.manage().window().setSize(new Dimension(300, 183));
		driver.manage().window().setPosition(new Point(200,777 ));
		driver.manage().window().maximize();
		driver.close();
	}
}
