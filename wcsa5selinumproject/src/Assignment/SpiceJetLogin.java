package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SpiceJetLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("12345678");
		driver.findElement(By.xpath("//div[@tabindex='0' and (@data-testid='login-submit-btn')]")).click();
		
	}

}
