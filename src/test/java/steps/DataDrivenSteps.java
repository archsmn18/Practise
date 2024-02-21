package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenSteps {
	WebDriver driver;
	@Given("User opens the chrome browser and navigate to form website")
	public void user_opens_the_chrome_browser_and_navigate_to_form_website() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/simple-form");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}

	@When("User is entering {string}, {string},{string}")
	public void user_is_entering(String firstname, String lastname, String email) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("firstName")).sendKeys(firstname);
		Thread.sleep(1000);
		
		driver.findElement(By.id("lastName")).sendKeys(lastname);
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(1000);
	}

	@When("User is entering {string}, {string}")
	public void user_is_entering(String contactnumber, String message) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("number")).sendKeys(contactnumber);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='field']/textarea")).sendKeys(message);
		Thread.sleep(1000);
	}

	@When("users are clicking on submit button")
	public void users_are_clicking_on_submit_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
	}

	@Then("All the data entered successfully.")
	public void all_the_data_entered_successfully() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Clicked on submit");
		driver.close();
	}
}