package demo;


import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFiestOption  {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/VINAY/Desktop/city.html");
			WebElement city = driver.findElement(By.id("city"));
		Select s = new Select(city);
		WebElement ele = s.getFirstSelectedOption();
		System.out.println(ele.getText());
		driver.quit();
	}
}
