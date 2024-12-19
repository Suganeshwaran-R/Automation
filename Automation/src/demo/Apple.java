package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Apple {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement ele = driver.findElement(By.className("Pke_EE"));
		ele.sendKeys("apple iphone 14 pro max");
		ele.submit();

		List<WebElement> ele1 = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]"));
		List<WebElement> ele2 = driver
				.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]/../../div[2]/div[1]/div[1]/div"));
		for (int i = 0; i < ele1.size(); i++) {
			System.out.println(ele1.get(i).getText() + "   " + ele2.get(i).getText());
		}
		driver.quit();
	}
}
