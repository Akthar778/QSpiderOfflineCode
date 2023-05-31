package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Opection {

	public static void main(String[] args) throws InterruptedException {
		//scrolling practice website https://www.album.alexflueras.ro/#a1
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.album.alexflueras.ro/#a1");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
 //       js.executeScript("window.scrollBy(0,350)", ""); //it will scroll up to down
 //       js.executeScript("window.scrollBy(0,-350)", ""); //it will scroll down to up
		Thread.sleep(3000);
 //       js.executeScript("window.scrollBy(300,0)", ""); //it will scroll right side to left
       js.executeScript("window.scrollBy(0,-350)", "");

        



	}

}
