package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStepDefinitions {

	WebDriver driver;

	
	@Given("^User is on demo login page$")
	public void user_is_on_demo_login_page() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/V4/");
		driver.manage().window().maximize();
	}

	
	@When("^title of login page is Guru(\\d+) Bank Home Page$")
	public void title_of_login_page_is_Guru_Bank_Home_Page(int arg1) {
		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, "Guru99 Bank Home Page"); 

	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password(){
	 driver.findElement(By.name("uid")).sendKeys("mngr416103");
	 driver.findElement(By.name("password")).sendKeys("upanUja");
	 
	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button(){
		driver.findElement(By.name("btnLogin")).click();
	}

	@Then("^user is on home page$")
	public void user_is_on_home_page(){

		String actualTitle = driver.getTitle();
		assertEquals(actualTitle, "Guru99 Bank Manager HomePage");
		driver.quit();
	}

	
	
	
}
