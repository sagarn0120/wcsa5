package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class shoppersstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		WebDriverWait explicitwait=new WebDriverWait(driver,Duration.ofSeconds(15));
		driver.get("https://www.shoppersstack.com/");
		//driver.findElement(By.xpath("//img[@alt='Men kurta']")).click();
		explicitwait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Men kurta']"))).click();
		//driver.findElement(By.id("electronics")).click();
		//driver.findElement(By.linkText("mobiles")).click();
		//driver.findElement(By.xpath("//span[text()='MOBILE PHONE']")).click();
		
	}

}
