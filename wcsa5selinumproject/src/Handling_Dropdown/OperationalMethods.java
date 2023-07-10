package Handling_Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OperationalMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/ASUS/OneDrive/Desktop/wcsa5/wcsa5selinumproject/src/html/a.html");
		
		
		//select dropdown
		WebElement dropdown=driver.findElement(By.id("menu"));
		Select sel=new Select(dropdown);
		
		//isMultiple method
		boolean res=sel.isMultiple();
		System.out.println(res);
		
		List<WebElement> l=sel.getOptions();
		/*for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
			Thread.sleep(1000);
		}*/
		for(WebElement WE:l)
		{
			System.out.println(WE.getText());
			Thread.sleep(1000);
		}
		
		
		
		
		Thread.sleep(5000);
		driver.close();

	}

}
