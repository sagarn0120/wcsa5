package TestNg;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoTest {

  @Test
  public void fTest() {
    throw new RuntimeException("Test not implemented");

	
		System.setProperty("webdriver.chrome.driver","./drivers/chromebrowser.exe" );
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("selenium",Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		//Reporter.log("this is demo",true);
	
  }
}
