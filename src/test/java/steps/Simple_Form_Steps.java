package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Simple_Form_Steps {
	WebDriver driver;
	@Given("User opens the browser and navigate to v traning form website")
	public void user_opens_the_browser_and_navigate_to_v_traning_form_website() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://v1.training-support.net/selenium/simple-form");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}

	@When("Enters firstname, lastname,email")
	public void enters_firstname_lastname_email() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("firstName")).sendKeys("Archisman");
		Thread.sleep(1000);
		
		driver.findElement(By.id("lastName")).sendKeys("Mukhopadhyay");
		Thread.sleep(1000);
		
		driver.findElement(By.id("email")).sendKeys("abxy@yahoo.com");
		Thread.sleep(1000);
	}

	@When("contact number, message")
	public void contact_number_message() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("number")).sendKeys("8956321475");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class='field']/textarea")).sendKeys("hello kolkata");
		Thread.sleep(1000);
	}

	@When("users click on submit")
	public void users_click_on_submit() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
	}

	@Then("A confirmation popup is displayed")
	public void a_confirmation_popup_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Clicked on submit");
		driver.quit();
	}

}
