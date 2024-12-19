package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Useoflinktext {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("file:///C:/Users/Suganesh/Desktop/Demo2.html");
	driver.findElement(By.linkText("Qspiders")).click();
	driver.navigate().back();
	driver.findElement(By.linkText("Jspiders")).click();
	driver.quit();
}
}

