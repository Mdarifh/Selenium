package XpathPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new  ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://theautomationzone.blogspot.com/2020/07/xpath-practice.html");
		driver.findElement(By.xpath("//input[@id='full_name']")).sendKeys("MD ARIF HUSSAIN");
		driver.findElement(By.xpath("//input[@id='father_name']")).sendKeys("MD JASIM");
		//driver.findElement(By.xpath("//input[@name='user_email']")).sendKeys("mdarifhussain668@gmail.com");
		
		
		driver.quit();
	}

}
