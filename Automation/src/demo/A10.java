package demo;



import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A10 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter city name:");
		String cityname = sc.nextLine(); 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/VINAY/Desktop/city.html");
		WebElement allopt = driver.findElement(By.id("city"));
		Select s=new Select(allopt);
		List<WebElement> allopts = s.getOptions();
		int count=0;
		for( WebElement ele:allopts)
		{
			String text = ele.getText();
			if(cityname.equalsIgnoreCase(text))
			{
				count++;
				break;
				
			}
		}
        if(count==1)
        {
        	System.out.println(cityname+" is present in dropdown");
        }
        else
        {
        	System.out.println(cityname+" is not present in dropdown");
        }
        driver.quit();
	}
}
