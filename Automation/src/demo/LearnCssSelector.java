package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCssSelector {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("//DemoA.html");
	driver.findElement(By.cssSelector("a[id=d]")).click();
	driver.navigate().back();
	driver.findElement(By.cssSelector("a[name='n2']")).click();
	driver.navigate().back();
	driver.findElement(By.cssSelector("a[class='c1']")).click();
	driver.navigate().back();
	WebElement ele =driver.findElement(By.cssSelector("a[href=https//www.jspiders.com"));
	ele.click();
	}

}
