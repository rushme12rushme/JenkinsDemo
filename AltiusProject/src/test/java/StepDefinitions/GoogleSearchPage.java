package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchPage {
	WebDriver driver;
	@Given("User should be present in google page")
	public void user_should_be_present_in_google_page() {
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}

	@When("he enters qspiders and click on search button")
	public void he_enters_and_click_on_search_button() {
	    driver.findElement(By.id("APjFqb")).sendKeys("qspiders"+Keys.ENTER);
	}

	@Then("search page should be displayed")
	public void search_page_should_be_displayed() {
	    System.out.println(driver.getTitle());
	    driver.quit();
	}

}
