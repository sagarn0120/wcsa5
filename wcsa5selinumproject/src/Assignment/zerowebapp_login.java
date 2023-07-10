package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zerowebapp_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://zero.webappsecurity.com/login.html");
		driver.findElement(By.id("user_login")).sendKeys("sagartnirmal@gmail.com");
		driver.findElement(By.id("user_password")).sendKeys("Sagar0120");
		driver.findElement(By.name("submit")).click();


	}

}
