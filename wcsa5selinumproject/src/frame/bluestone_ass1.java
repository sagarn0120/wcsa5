package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class bluestone_ass1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.bluestone.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
		Thread.sleep(3000);
		
		//switch controls to frame
		
		WebElement fe=driver.findElement(By.xpath("//iframe[@id='fc_widget']"));
		
		driver.switchTo().frame(fe);
		driver.findElement(By.id("chat-icon")).click();
		
		//again use switch to method
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//input[@type='name']")).sendKeys("sagar");
		driver.findElement(By.xpath("//input[@id='chat-fc-email']")).sendKeys("sagar@gmail.com");
		driver.findElement(By.xpath("//input[@id='chat-fc-phone']")).sendKeys("8055307171");
		Thread.sleep(2000);
		driver.close();

	}

}
