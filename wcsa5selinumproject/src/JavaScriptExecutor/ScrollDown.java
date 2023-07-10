package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-300);");
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
