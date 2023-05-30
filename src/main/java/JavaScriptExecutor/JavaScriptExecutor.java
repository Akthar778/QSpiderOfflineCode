package JavaScriptExecutor;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) throws FileNotFoundException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
        File sc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File SrcFile=((TakesScreenshot) sc).getScreenshotAs(OutputType.FILE);

		
		FileInputStream fis = new FileInputStream (file);
		
		
		
		
		
		
	}

}
