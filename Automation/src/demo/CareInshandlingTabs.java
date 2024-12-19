package demo;


 import java.time.Duration;

 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.WebElement;
 import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.support.ui.Select;

 public class  CareInshandlingTabs  {

 	public static void main(String[] args) {
 WebDriver d=new ChromeDriver();
 d.manage().window().maximize();
 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
 d.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
 d.findElement(By.id("policynumber")).sendKeys("123");
 d.findElement(By.id("dob")).click();
 d.findElement(By.linkText("ui-datepicker-div")).click();
 WebElement month = d.findElement(By.className("ui-datepicker-month"));
 WebElement year = d.findElement(By.className("ui-datepicker-year"));
 WebElement date = d.findElement(By.className("ui-state-default"));
 Select s=new Select(month);
 Select s1=new Select(year);
 Select s2=new Select(date);
 s.selectByValue("May");
 s1.selectByValue("2001");
 s2.selectByValue("6");
 d.findElement(By.id("alternative_number")).sendKeys("9876543210");
 d.findElement(By.id("renew_policy_submit")).click();
 boolean res = d.findElement(By.xpath("//h3[contains(text(),'Use Your Existing')]")).isDisplayed();
 if(res)
 	System.out.println("Enter Valid details");
 }

 }
