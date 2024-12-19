package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfPartiallinktext {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/VINAY/Desktop/Demo2.html");
		driver.findElement(By.partialLinkText("Q")).click();
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Js")).click();
		driver.quit();
		
	}
}

