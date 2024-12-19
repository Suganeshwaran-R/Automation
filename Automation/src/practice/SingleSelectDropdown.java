package practice;

import java.time.Duration;
import java.time.Year;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropdown {

	public static void main(String[] args) throws InterruptedException {
     WebDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
     driver.get("https://www.facebook.com");
     driver.findElement(By.linkText("Create new account")).click();
    WebElement day=driver.findElement(By.id("day"));
    Select s=new Select(day);
    s.selectByIndex(30);
    s.selectByValue("31");
    s.selectByVisibleText("3");
    WebElement month=driver.findElement(By.id("month"));
    Select ss=new Select(month);
    ss.selectByIndex(5);
    ss.selectByValue("10");
    WebElement Year=driver.findElement(By.id("year"));
    Select sss=new Select(Year);
    sss.selectByVisibleText("2001");
    Thread.sleep(2000);
    driver.quit();
     	}
}
