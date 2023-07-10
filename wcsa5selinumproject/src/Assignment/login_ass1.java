package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/in/login");
		driver.findElement(By.id("id_userLoginId")).sendKeys("sagartnirmal@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("Sagar@0120");
		driver.findElement(By.cssSelector("button[class='btn login-button btn-submit btn-small']")).click();
	
		

	}

}
