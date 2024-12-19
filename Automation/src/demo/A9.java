package demo;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A9 {
      public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/VINAY/Desktop/city.html");
		WebElement city = driver.findElement(By.id("city"));
		Select s=new Select(city);
		TreeSet<String> t1=new TreeSet();
		List<WebElement> allopt = s.getOptions();
		for(int i=0;i<allopt.size();i++) {
			String text = allopt.get(i).getText();
			boolean res = t1.add(text);
			if(res==false)
			{
				System.out.println(text);
			}
			
		}
		driver.quit();
	}
}

