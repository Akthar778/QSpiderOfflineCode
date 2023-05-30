package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class scrollDown {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy (0,300)");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollTo (0,500)");
		
		Thread.sleep(3000);
		
		WebElement ele = driver.findElement(By.xpath("//a[@href='https://www.pillpack.com']"));
		
		
		js.executeScript("arguments[0].scrollIntoView(true);",ele);
		
		
		
		
	}

}
