package Handling_Dropdown;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class HandlingMultiselctDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/ASUS/OneDrive/Desktop/wcsa5/wcsa5selinumproject/src/html/a.html");
		
		
		//select dropdown
		WebElement dropdown=driver.findElement(By.id("menu"));
		Select sel=new Select(dropdown);
		
		sel.selectByIndex(0);
		Thread.sleep(2000);
		
		sel.selectByVisibleText("samosa");
		Thread.sleep(2000);
		sel.selectByValue("v1");
		//deselect dropdown
		Thread.sleep(2000);
		sel.deselectByIndex(0);
		
		Thread.sleep(2000);
		sel.deselectByVisibleText("samosa");
		
		Thread.sleep(2000);
		sel.deselectByValue("v1");
		
		//select multiple
		for(int i=0;i<5;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(2000);
		}
		//deselect multiple
		/*for(int i=0;i<5;i++)
		{
			sel.deselectByIndex(i);
			Thread.sleep(2000);
		}*/
			sel.deselectAll();
		
		
		
		
		Thread.sleep(10000);
		driver.close();		
		
		
		

	}

}
