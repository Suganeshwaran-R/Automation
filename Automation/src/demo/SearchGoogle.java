package demo;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchGoogle {
     public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement t1 = driver.findElement(By.name("q"));
		t1.sendKeys("dboss");
		t1.submit();
		List<WebElement> alllinks = driver.findElements(By.xpath("//a[@href]"));
		int count=alllinks.size();
		System.out.println(count);
		for(int i=0;i<=count;i++)
		{
			String text=alllinks.get(i).getAttribute("href");
			System.out.println(text);
		}
		driver.quit();
	}
     
}
