package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[contains(@type,'text')]")).sendKeys("sagartnirmal@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Sagar0120");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

	}

}
