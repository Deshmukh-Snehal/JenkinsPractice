package Waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		 WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver(co);
		 driver.manage().window().maximize();
		 driver.get("https://www.google.com/");
		 driver.close();
	}

}
