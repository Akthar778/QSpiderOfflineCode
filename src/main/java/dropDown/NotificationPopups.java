package dropDown;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class NotificationPopups {
	public static void main(String[] args) {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		
		driver.get("https://www.ajio.com/?gclid=EAIaIQobChMI6b3lvJex_wIVyEN9Ch3qgA66EAAYASAAEgJw8PD_BwE");
		
	}

}
