package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Dependencies {
	
	public static WebDriver driver;
	
	@BeforeTest
	
	public void Start() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycarhelpline.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@Test(priority = 1)
	
	public void LandingPage() {
		System.out.println(driver.getCurrentUrl());
		String CurrentURL = "https://www.mycarhelpline.com/";
		
		if(CurrentURL.equals("https://www.mycarhelpline.com/")) {
			System.out.println("Test Case Landing Page is PASS");
		}
		else {
			System.out.println("Test Case Landing Page is FAIL");
		}
			//Assert.fail("Deliberately Failing");
	}
	
	@Test(priority = 2,enabled = true, dependsOnMethods ="LandingPage")
	public void Calculator() {
		driver.findElement(By.linkText("Calculator")).click();
	
	}
	
	@Test(priority = 3,dependsOnMethods = {"LandingPage","Calculator"})
	public void Home() {
		driver.findElement(By.linkText("Home")).click();
	
	}
	
	@AfterClass
	
	public void tearDown() {
		driver.quit();
	}
	
	

}
