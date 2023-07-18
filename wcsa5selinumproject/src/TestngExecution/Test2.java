package TestngExecution;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test2 {
  @Test
  public void test2_method() throws InterruptedException {
	  System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe" );
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
		Thread.sleep(2000);
		driver.close();
		Reporter.log("this is test 2",true);
  }
}
