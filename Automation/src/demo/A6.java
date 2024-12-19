package demo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A6 {
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/VINAY/Desktop/city.html");
	WebElement city = driver.findElement(By.id("city"));
	Select s=new Select(city);
	List<String> a1=new ArrayList<>();
	List<WebElement> allopt = s.getOptions();
	for(int i=0;i<allopt.size();i++) {
		String text = allopt.get(i).getText();
		a1.add(text);
	}
	Collections.sort(a1);
	for(String text:a1)
	{
		System.out.println(text);
	}
	driver.quit();
}
}

