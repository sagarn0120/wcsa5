package Synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class insta_auto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.instagram.com/accounts/login/");
		//Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("sagar_nirmal_0120");
		driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Sagar0120");
		driver.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
	}

}
