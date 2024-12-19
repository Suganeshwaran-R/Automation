package demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSelected {
           public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");			
			driver.findElement(By.linkText("Create new account")).click();Thread.sleep(2000);
			driver.findElement(By.name("reg_email__")).sendKeys("viany");		Thread.sleep(2000);
			 WebElement res = driver.findElement(By.xpath("//label[text()='Male']/../label/input"));
			 res.click();
			 boolean res1 = res.isSelected();
			if(res1==true)
			{
				System.out.println("the radio button is selected");
			}
			else
			{
				System.out.println("the radio button is not selected");
			}
			driver.quit();
		}
           
}

