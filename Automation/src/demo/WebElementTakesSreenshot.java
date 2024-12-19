package demo;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class WebElementTakesSreenshot {
public void demo() throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.royalchallengers.com/");
	WebElement text = driver.findElement(By.className("hdr-logo"));
	File src = text.getScreenshotAs(OutputType.FILE);
	File dest=new File("./errorshot/logo.png");
	FileUtils.copyFile(src,dest);
	driver.quit();
	
	
   
   
}
}
