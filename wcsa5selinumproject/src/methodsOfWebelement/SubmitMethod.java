package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.instagram.com/accounts/login/");
		driver.findElement(By.name("username")).sendKeys("sagartnirmal@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sagar0120");
		WebElement loginbutton=driver.findElement(By.xpath("//button[contains(@class,'_acap')]"));
		loginbutton.submit();
		
		driver.get("http://laptop-k938cu7e/login.do");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		Thread.sleep(3000);
		WebElement lg=driver.findElement(By.id("loginButton"));
		lg.click();
	}

}
