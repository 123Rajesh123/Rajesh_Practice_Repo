package practice;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Createroject {
	@Test
	public void practice() {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com/");
	}
}
