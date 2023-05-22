package Sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Googlesearch {

	public static void main(String[] args) {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(co);
		WebDriverWait wait=new WebDriverWait(driver, 20);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
//		WebDriverWait w	= new WebDriverWait(driver,	30);
//		w.until(ExpectedConditions.alertIsPresent());
//		WebElement Search = 
		
		driver.close();
	}

}
