package demo;


import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClssParentwind 
 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the expected title");
		String expTitle=s.next();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://secure.indeed.com");
		d.findElement(By.id("login-google-button")).click();
		d.findElement(By.id("apple-signin-button")).click();
		Set<String> allWin = d.getWindowHandles();
		for (String wid : allWin) {
			d.switchTo().window(wid);
			String title = d.getTitle();
			if(title.contains(expTitle))
				d.close();
		}
	}

}
