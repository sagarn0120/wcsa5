package RobotActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.bluestone.com/");
		
		//handle popoup
		driver.findElement(By.id("denyBtn")).click();
		
		//move to watch & jewellery
		Actions act=new Actions(driver);
		WebElement target=driver.findElement(By.xpath("//a[text()='Watch Jewwllery']"));
		act.moveToElement(target).perform();
		driver.findElement(By.xpath("//a[text()='Band']")).click();
		Thread.sleep(3000);
	}

}
