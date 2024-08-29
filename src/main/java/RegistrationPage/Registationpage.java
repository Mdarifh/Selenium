package RegistrationPage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Registationpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://demoqa.com/automation-practice-form");
	
		WebElement firstname = driver.findElement(By.id("firstName"));
		firstname.sendKeys("Md Arif");
	//	Thread.sleep(1000);
		
		WebElement lastname = driver.findElement(By.id("lastName"));
		lastname.sendKeys("Hussain");
		Thread.sleep(1000);
		
		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("arifhussain668@gmail.com");
		//Thread.sleep(1000);
		
		WebElement male = driver.findElement(By.id("gender-radio-1"));
		male.sendKeys("Male");
	//	Thread.sleep(1000);
		
		WebElement phone = driver.findElement(By.id("userNumber"));
		phone.sendKeys("7061120801");
		Thread.sleep(1000);
		
		
		WebElement hobbies = driver.findElement(By.id("hobbies-checkbox-3"));
		hobbies.sendKeys("Music");
		//Thread.sleep(1000);
		
		WebElement Pic = driver.findElement(By.id("uploadPicture"));
		Pic.sendKeys("C:\\Users\\HP\\Desktop\\ARIF HUSSAIN.jpg");
		//Thread.sleep(1000);
		
		WebElement CurrentAddress = driver.findElement(By.id("currentAddress"));
		CurrentAddress.sendKeys("Arrah Chakiya Near Choti Musjid");
	//	Thread.sleep(1000);
		
		WebElement divElement = driver.findElement(By.xpath("//div[@id='state']//div[contains(@class,'css-1hwfws3')]"));
		String divText = divElement.getText();
		
		 if (divText.equals("Uttar Pradesh")) {
	            System.out.println("Test Passed: The div contains the text 'Uttar Pradesh'.");
	        } else {
	            System.out.println("Test Failed: The div text is '" + divText + "' instead of 'Uttar Pradesh'.");
	        }
		Thread.sleep(1000);
		
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		//Thread.sleep(1000);
		
		driver.quit();
	}

}
