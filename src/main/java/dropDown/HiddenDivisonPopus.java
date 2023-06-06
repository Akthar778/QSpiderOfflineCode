package dropDown;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisonPopus {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		//store frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@name=\"notification-frame-173061603\"]"));
		driver.switchTo().frame(frame);


		//overlap popup
		driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();		

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[@class=\"ic_circularclose_grey\"]")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//div[@class=\"DayPicker-Day\" and @ aria-label=\"Sat Jun 17 2023\"]/child::div/child::p/following-sibling::p/preceding-sibling::p")).click();
		Thread.sleep(3000);





	}

}
