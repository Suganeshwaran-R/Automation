package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AllLinksInAmazon {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.amazon.in/");Thread.sleep(2000);
		List<WebElement> allEle = driver.findElements(By.tagName("a"));Thread.sleep(2000);
		int Count = allEle.size();Thread.sleep(2000);
		System.out.println(Count);
		for (int i = 0; i < Count; i++) {
			WebElement ele = allEle.get(i);
			String text = ele.getText();
			System.out.println(text);
		}
		driver.quit();
	}
}
