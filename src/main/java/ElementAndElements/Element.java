package ElementAndElements;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Element {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		
		// 1) FindElement Return Single the WebElement
		
	    WebElement web = driver.findElement(By.xpath("//input[@name = 'search']"));
		web.sendKeys("Laptop");
		System.out.println(web);
		
		// 2) FindElement Return Single the WebElement
		
		WebElement element = driver.findElement(By.xpath("//footer//div[@class='row']//a"));
		System.out.println(element.getText());
		
		// 3) FindElement Return no such Element Exception
		
		// driver.findElement(By.xpath("//button[@class='btn btn-default btn-lgsearch']"));
		
		// 4) FindElements Return Multiple the WebElement
		
		List<WebElement> list = driver.findElements(By.xpath("//footer//div[@class='row']//a"));
		  for(WebElement elements : list) {
              System.out.println(elements.getText());
        }
		  
		// 5) FindElements Return lists of WebElement
		  
		  List<WebElement> lists = driver.findElements(By.xpath("//footer//div[@class='row']//a"));
			System.out.println("Number of Element Capture:" +lists.size()); 
			
			// 6) FindElements Return Zero  WebElement
			
			List<WebElement> logo = driver.findElements(By.xpath("//footer//div[@class='row1']"));
			System.out.println("Zero Element:"+logo.size());

		//driver.close();
		
		driver.quit(); 
		
		
	}

}
