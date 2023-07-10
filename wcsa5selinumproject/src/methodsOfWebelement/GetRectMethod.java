package methodsOfWebelement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.selenium.dev/");
		Rectangle x=driver.findElement(By.xpath("//h2[.='News']")).getRect();
		int h=x.getHeight();
		int w=x.getWidth();
		int xaxis=x.getX();
		int yaxis=x.getY();
		System.out.println(h);
		System.out.println(w);
		System.out.println(xaxis);
		System.out.print(yaxis);

	}

}
