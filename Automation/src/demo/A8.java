package demo;



import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A8 {
     public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/VINAY/Desktop/city.html");
		driver.manage().window().maximize();
		WebElement city = driver.findElement(By.id("city"));
		Select s=new Select(city);
		HashSet<String> h1=new HashSet();
		List<WebElement> allopt = s.getOptions();
		for(int i=0;i<allopt.size();i++) {
			String text = allopt.get(i).getText();
			h1.add(text);
		}
		for(String text:h1)
		{
			System.out.println(text);
		}
		driver.quit();
	}
}
