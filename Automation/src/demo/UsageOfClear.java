package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class UsageOfClear {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https//demo.opensourcebilling.org/en/users/sign-in#");
	    driver.findElement(By.id("Email")).clear();
	    driver.findElement(By.id("password")).clear();
	}
	}
