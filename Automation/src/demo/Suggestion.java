package demo;



	

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Suggestion {
 
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("apple iphone");
		Thread.sleep(3000);
		List<WebElement> autosugg = driver.findElements(By.xpath("//span[contains(text(),'apple iphone')]"));
		int count = autosugg.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String text = autosugg.get(i).getText();
			System.out.println(text);
		}
	
	}

}
