package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("chandler bing",Keys.ENTER);
		driver.findElement(By.className("lNPNe")).click();
		driver.get("https://www.google.com/");
		driver.switchTo().activeElement().sendKeys("jack sparrow",Keys.ENTER);
		driver.findElement(By.className("tsuid_29")).click();

	}

}
