package demo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A11 {
      public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create new account")).click();
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByIndex(19);
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.selectByValue("3");
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2002");
		driver.quit();
		
		
	}
}
