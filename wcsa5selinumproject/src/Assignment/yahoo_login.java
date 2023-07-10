package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class yahoo_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/?.intl=in");
		driver.findElement(By.id("login-username")).sendKeys("sagartnirmal@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("Sagar0120");
		driver.findElement(By.name("signin")).click();


	}

}
