package Handling_Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/ASUS/OneDrive/Desktop/wcsa5/wcsa5selinumproject/src/html/a.html");
		
		
		//select dropdown
		WebElement dropdown=driver.findElement(By.id("menu"));
		Select sel=new Select(dropdown);
		//to select the dropdown options
		for(int i=2;i<5;i++)
		{
			Thread.sleep(2000);
			sel.selectByIndex(i);
		}
		//To read All selected options
		List<WebElement> allopt=sel.getAllSelectedOptions();
//		for(WebElement op:allopt)
//		{
//			System.out.println(op.getText());
//		}
		for(int i=0;i<allopt.size();i++)
		{
			System.out.println(allopt.get(i).getText());
			
		}
		
		Thread.sleep(3000);
		driver.close();
		
//		Thread.sleep(5000);
//		driver.close();
	}

}
