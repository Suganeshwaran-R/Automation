package demo;



import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClsParentWin  {

	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://secure.indeed.com");
		d.findElement(By.id("login-google-button")).click();
		d.findElement(By.id("apple-signin-button")).click();
		Set<String> allWin = d.getWindowHandles();
		String pwid = d.getWindowHandle();
		for (String wid : allWin) {
			d.switchTo().window(wid);
			String title = d.getTitle();
			if(pwid.equals(wid))
				d.close();
		}
	}
	}
