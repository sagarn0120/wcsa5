package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class auto_uwnpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ASUS/Desktop/wcsa5/wcsa5selinumproject/src/html/b.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("u")).sendKeys("sagar");
		driver.findElement(By.id("p")).sendKeys("123456");
		driver.findElement(By.id("login")).click();
	}

}
