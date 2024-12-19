package demo;

import java.util.Scanner;



import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  ClsParentWindow 
 {

	public static void main(String[] args) {
WebDriver d=new ChromeDriver();
d.manage().window().maximize();
d.get("https://secure.indeed.com");
d.findElement(By.id("login-google-button")).click();
d.findElement(By.id("apple-signin-button")).click();
Set<String> allWin = d.getWindowHandles();
String pwid = d.getWindowHandle();
Iterator<String> i = allWin.iterator();
while(i.hasNext()) {
	String wid = i.next();
	d.switchTo().window(wid);
	if(!wid.equals(pwid))
		d.close();
}

	}

}
