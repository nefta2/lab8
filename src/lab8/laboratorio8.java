package lab8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class laboratorio8 {
	public static void main (String[] args)throws
	InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\diego\\selenium-java-4.5.3\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.com/");
			
			WebElement searchbox = driver.findElement(By.name("field-keywords"));
			searchbox.clear();
			searchbox.sendKeys("root board game");
			searchbox.submit();
			Thread.sleep(5000);
		driver.quit();
	}
}
