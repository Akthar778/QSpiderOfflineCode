package enterNamesUsingAutoit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterUserPassUsingAutoit {
	
	public static void main(String[] args) throws IOException{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Runtime.getRuntime().exec("./FileUploadPopupFilePdf/fileUploadPopupsp2.exe");


	}

}
