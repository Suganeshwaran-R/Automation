package demo;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeAttributte {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fb.com");
		driver.findElement(By.name("login")).click();
		WebElement h1 = driver.findElement(By.xpath("//div[@class='_9ay7']"));
		String h11 = h1.getText();
		System.out.println(h11);
		String h12 = h1.getCssValue("color");
		System.out.println(h12);
		WebElement T1 = driver.findElement(By.linkText("Forgotten password?"));
		String t1 = T1.getAttribute("href");
		System.out.println(t1);
		Dimension t2 = T1.getSize();
		System.out.println(t2);
	}

}
