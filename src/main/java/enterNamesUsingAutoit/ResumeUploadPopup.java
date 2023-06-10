package enterNamesUsingAutoit;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResumeUploadPopup {
	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/registration/createAccount\r\n");
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Runtime.getRuntime().exec("./enterNamesUsingAutoit/fileUploadPopupsp2.exe");
		Runtime.getRuntime().exec("./fileUploadPopupFilePdf/resumeUploadP1.exe");
		
	}
}
