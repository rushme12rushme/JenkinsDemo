package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ActiTimeLogin {
	WebDriver driver;
	@Given("User should enter the URL as {string} in browser")
	public void user_should_enter_the_url_as_in_browser(String url) {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get(url);
	}

	@When("He enters {string} and {string} in the textbox")
	public void he_enters_and_in_the_textbox(String username, String password) {
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
	}

	@And("He clicks on login button")
	public void he_clicks_on_login_button() {
		driver.findElement(By.id("loginButton")).click();
	}

	@Then("Homepage must be displayed")
	public void homepage_must_be_displayed() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		Boolean res=wait.until(ExpectedConditions.titleContains("Enter"));
		JavascriptExecutor j= (JavascriptExecutor) driver;
		String title=(String) j.executeScript("return document.title");
		System.out.println(title);
		System.out.println(res);
		Assert.assertTrue(res);
		
		
	    
	}




}
