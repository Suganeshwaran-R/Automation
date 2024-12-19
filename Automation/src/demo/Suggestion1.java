package demo;



import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Suggestion1
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Web Table']")).click();Thread.sleep(2000);
		List<WebElement> go = driver.findElements(By.tagName("tr"));Thread.sleep(2000);
		for(int i=0;i<go.size();i++)
		{
			List<WebElement> go1 = driver.findElements(By.tagName("td"));
			for(int j=0;j<go.size();j++)
			System.out.println(go.get(j).getText()+"\t");
			
		}
		System.out.println();
		driver.quit();
		
		
	}

}

