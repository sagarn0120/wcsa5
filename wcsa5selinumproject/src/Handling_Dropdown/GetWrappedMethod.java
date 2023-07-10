package Handling_Dropdown;

import java.time.Duration;
import java.util.List;
import java.util.HashSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("file:///C:/Users/ASUS/OneDrive/Desktop/wcsa5/wcsa5selinumproject/src/html/a.html");
		
		
		//select dropdown
		WebElement dropdown=driver.findElement(By.id("menu"));
		Select sel=new Select(dropdown);
		List<WebElement> allopt=sel.getOptions();
		HashSet<String> hs=new HashSet<String>();
		
		for(int i=0;i<allopt.size();i++)
		{
			WebElement op=allopt.get(i);
			
			String value=op.getText();
			hs.add(value);
		}

	}
	}
