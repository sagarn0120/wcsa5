package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("input[id*='mai']")).sendKeys("sagartnirmal@gmail.com");
		driver.findElement(By.cssSelector("input[class$='_9npi']")).sendKeys("Sagar0120");
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
	}

}
