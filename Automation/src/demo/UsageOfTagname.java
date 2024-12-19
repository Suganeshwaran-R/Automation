package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsageOfTagname{

	public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/suganesh/Desktop/Demo2.html");
        driver.findElement(By.tagName("a")).click();
	}
}

