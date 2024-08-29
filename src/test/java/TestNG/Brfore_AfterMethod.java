package TestNG;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Brfore_AfterMethod {
	
	@BeforeMethod
	
	public void UserRegistration() {
		System.out.println("User is registered");
		
	}
	
	@Test(priority = 1)
	 public void UserLogin() {
		System.out.println("User is able to login");
	}
	
	@Test(priority = 2, enabled = false)
	
	public void HomePage() {
		System.out.println("Home page is visible");
	}
	@Test(priority = 3)
	
	public void AddBeneficiary() {
		System.out.println("Adding a Beneficiary");
	}
	
	@Test(priority = 4, enabled = false)

	public void UserMoneyControl() {
	System.out.println("User is able to transfer funds to another Account");
	}
	
	@Test(priority = 5)
	public void ValidatingBeneficiary() {
	System.out.println("Beneficiary is validating");
	}
	
	@AfterMethod
	public void UserLogOut() {
		System.out.println("User is able to logout");
	}
}
