package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class zomato_signup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/india");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Sign up")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 dFkpnp']")).sendKeys("sagarnirmal");
		driver.findElement(By.cssSelector("input[class='sc-1yzxt5f-9 bbrwhB']")).sendKeys("sagartnirmal@gmail.com");
		
		//driver.findElement(By.className("sc-1kx5g6g-2 eXneOi")).click();

	}

}
