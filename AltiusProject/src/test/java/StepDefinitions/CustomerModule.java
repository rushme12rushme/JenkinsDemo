package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import generic.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CustomerModule {
	WebDriver driver=BaseClass.driver;
	@Given("User should be present in homepage {string}")
	public void user_should_be_present_in_homepage(String HomePageTitle) {
		
	String actual=driver.getTitle();
	Assert.assertEquals(actual, HomePageTitle);
	}

	@When("He click on TasksTab")
	public void he_click_on_tasks_tab() {
		driver.findElement(By.xpath("//div[text()='TASKS']")).click();
	}

	@Then("User should be present in Tasks List page {string}")
	public void user_should_be_present_in_tasks_list_page(String TasksListTitle) {
		String actual=driver.getTitle();
		Assert.assertEquals(actual, TasksListTitle);
	}
	@When("he clicks on Add NewButton")
	public void he_clicks_on_add_new_button() {
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
	}

	@And("He clicks on New Customer button")
	public void he_clicks_on_new_customer_button() {
		driver.findElement(By.xpath("+ New Customer")).click();

	}

	@Then("Create New customer popup should be displayed")
	public void create_new_customer_popup_should_be_displayed() {
		boolean res=driver.findElement(By.id("customerLightBox_titlePlaceholder")).isDisplayed();
		Assert.assertTrue(res);
	}

	@When("He enters the customer name as {string}")
	public void he_enters_the_customer_name_as(String cusname) {
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys(cusname);
			}

	@And("he enters the description as {string}")
	public void he_enters_the_description_as(String cusdesc) {
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys(cusdesc);

	}

	@And("he selects our company in the drop down")
	public void he_selects_our_company_in_the_drop_down() {
		driver.findElement(By.xpath("//button[contains(text(),'active customer to import')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Our Company')]")).click();
	}

	@When("he clicks on create customer button")
	public void he_clicks_on_create_customer_button() {
		driver.findElement(By.xpath("//span[contains(text(),'Create Customer')]")).click();
	}

	@Then("customer should be created as {string}")
	public void customer_should_be_created_as(String cusname) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement cusnameElement=driver.findElement(By.xpath("//div[@class='navigationLinks']/../div[2]\r\n"
				+ ""));
		wait.until(ExpectedConditions.textToBePresentInElement(cusnameElement,cusname));
				
	   
	}



}
