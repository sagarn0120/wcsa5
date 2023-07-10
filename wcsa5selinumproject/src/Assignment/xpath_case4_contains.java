package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_case4_contains {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[contains(@type,'sub')]")).click();


	}

}
