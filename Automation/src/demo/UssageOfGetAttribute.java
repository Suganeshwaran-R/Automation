package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UssageOfGetAttribute {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com");
	WebElement button =driver.findElement(By.className("Login"));
	String tagname=button.getTagName();
	String tagtext=button.getText();
	String value =button.getAttribute("data-testid");
	String color=button.getCssValue("background-color");
	System.out.println("The tagname of the element:"+tagname);
	System.out.println("The tagtext of the element:"+tagtext);
	System.out.println("The attribute value of the element:"+value);
	System.out.println("The Css value of the element:"+color);
	driver.quit();
	}

}
