package JavaScriptExecutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) throws IOException {
		//Specify the path to your chrome driver
//		System.setProperty("webdriver.chrome.driver", "Path_to_your_chrome_driver");
		// Instantiate chrome driver object
		WebDriver driver = new ChromeDriver();
		// Navigate to the testim website
		driver.get("https://www.testim.io/");
		//Use TakesScreenshot method to capture screenshot
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		//Saving the screenshot in desired location
		File source = screenshot.getScreenshotAs(OutputType.FILE);
		//Path to the location to save screenshot
		FileUtils.copyFile(source, new File("./SeleniumScreenshots/Screen.png"));
		System.out.println("Screenshot is captured");
		driver.quit();
		
		
		
		
		
		
	}

}
