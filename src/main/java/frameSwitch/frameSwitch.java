package frameSwitch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class frameSwitch {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.tripodeal.com/hotels");
		Thread.sleep(3000);

//		we can swich frame in 3 way 
//		store in an element and pass in frame
//		by index
//		by string
		
		//WebElement iframe = driver.findElement(By.xpath("//iframe[@id=\"tpcwl_iframe\"]"));
		//driver.switchTo().frame(iframe);
		
		driver.switchTo().frame(0);
		
		//string is not working 
		//driver.switchTo().frame("tpcwl_iframe");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder=\"City or hotel name\"]")).sendKeys("Delhi");
		Thread.sleep(3000);
		
		driver.findElement(By.id("hotels-dates-checkin-prepop-whitelabel_en")).click();
		
		
	}

}
