package demo;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelect {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("file:///C:/Users/VINAY/Desktop/city.html");
		WebElement ipl = driver.findElement(By.id("Teams"));
		Select s = new Select(ipl);
		boolean res = s.isMultiple();
		if (res == true) {
			System.out.println("rcb");
		} else {
			System.out.println("mi");
		}
		driver.quit();

	}
}
