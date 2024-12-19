package demo;



import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PrintPopup {
	public static void main(String[] args) throws IOException, AWTException {
		FirefoxOptions options = new FirefoxOptions();
		WebDriver driver1 = new FirefoxDriver(options);
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver1.get("https://www.selenium.dev/");

		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_P);

		r.keyRelease(KeyEvent.VK_CONTROL);	
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		for (int i1 = 0; i1 < 4; i1++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

		}

		r.keyPress(KeyEvent.VK_1);

		r.keyPress(KeyEvent.VK_MINUS);
		r.keyRelease(KeyEvent.VK_MINUS);
		r.keyPress(KeyEvent.VK_2);

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		driver1.quit();

	}
}
