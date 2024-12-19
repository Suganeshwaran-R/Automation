package demo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PracticeTestNG {
	@Test
	public void demo() {
	Reporter.log("Welcome to The Hello World");
   // It will Print only in the Report
   }

	@Test
	public void demoA() {
		Reporter.log("Welcome to the World of Smart", true);
		// It will Print Both report as well as Console.
	}
	@Test
	public void demoS() {
     System.out.println("Welcome to World of Mark Antony");
	}


}
