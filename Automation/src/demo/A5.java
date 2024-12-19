package demo;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A5{
  public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	driver.findElement(By.linkText("Create new account")).click();
	WebElement month = driver.findElement(By.id("month"));
	Select s=new Select(month);
	List<WebElement> allopt = s.getOptions();
	for(int i=0;i<allopt.size();i++)
	{
		String text = allopt.get(i).getText();
		System.out.println(text);
	}
	driver.quit();
}
}
