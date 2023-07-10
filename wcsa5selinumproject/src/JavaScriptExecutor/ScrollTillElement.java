package JavaScriptExecutor;

import org.openqa.selenium.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollTillElement {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		
		WebElement ele=driver.findElement(By.xpath("//h2[text()='News']"));
		Point loc=ele.getLocation();
		int x=loc.getX();
		int y=loc.getY();
		
		//jse.executeScript("window.scrollBy("+x+","+(y-200)+")");
		jse.executeScript("arguments[0].scrollIntoView(true);",ele);
	}

}
