package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BookFlightMapsStepDefinition {
	
	WebDriver driver;

	@Given("^User is already on Login Page$")
	public void user_already_on_login_page() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://blazedemo.com/login");

	}

	@When("^title of login page is Blaze Demo$")
	public void title_login_page_free_crm() {

		String actualTitle = driver.getTitle();
		String expectedTitle = "BlazeDemo";
		Assert.assertEquals(expectedTitle, actualTitle);

	}

	@Then("^user enters username and password$")
	public void user_enters_username_password(DataTable credentials) {

		for(Map<String, String> data : credentials.asMaps(String.class, String.class)) {
		driver.findElement(By.name("email")).sendKeys(data.get("username"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
		}

	}

	@Then("^User Clicks on Login Button$")
	public void user_clicks_login_button() {

		driver.findElement(By.cssSelector(
				"#app > div > div > div > div > div.panel-body > form > div:nth-child(4) > div > div > label")).click();
		driver.findElement(By
				.cssSelector("#app > div > div > div > div > div.panel-body > form > div:nth-child(5) > div > button"))
				.click();
	}

	@Then("^User in on Home Page$")
	public void user_is_on_home_page() {

		String isLogginIntext = driver.findElement(By.cssSelector("#app > div > div > div > div > div.panel-body"))
				.getText();
		String expectedText = "You are logged in!";
		Assert.assertEquals(isLogginIntext, expectedText);

	}

	@Then("^User click on the BlazeDemo Icon$")
	public void user_clicks_on_BlazeDemo_Icon() {

		driver.findElement(By.linkText("BlazeDemo")).click();
	}

	@Then("^User Selects Departure and Destination City$")
	public void user_selects_Departure_Destination_city(DataTable cities) {

		
		
		for(Map<String, String> data : cities.asMaps(String.class, String.class)) {
		
			WebElement Sourecity = driver.findElement(By.name("fromPort"));
			WebElement ToCity = driver.findElement(By.name("toPort"));
			Select select = new Select(Sourecity);
			Select select2 = new Select(ToCity);
		    select.selectByValue(data.get("Departure"));
		   select2.selectByValue(data.get("Destination"));
		}
	}

	@Then("^User Clicks on Find Flights Button$")
	public void user_clicks_on_Find_Flights_Btn() {

		driver.findElement(By.cssSelector("body > div.container > form > div > input")).click();
	}

	@Then("^User Selects the Flight$")
	public void user_selects_flights() {

		driver.findElement(
				By.cssSelector("body > div.container > table > tbody > tr:nth-child(2) > td:nth-child(2) > input"))
				.click();
	}

	@Then("^User Enters Mandatory Information$")
	public void user_enters_mandatory_information(DataTable info) {
		for(Map<String, String> mandatoryInfo : info.asMaps(String.class, String.class)) {

		driver.findElement(By.id("inputName")).sendKeys(mandatoryInfo.get("Name"));
		driver.findElement(By.id("address")).sendKeys(mandatoryInfo.get("Address"));
		driver.findElement(By.id("city")).sendKeys(mandatoryInfo.get("City"));
		driver.findElement(By.id("state")).sendKeys(mandatoryInfo.get("State"));
		driver.findElement(By.id("zipCode")).sendKeys(mandatoryInfo.get("ZipCode"));
		driver.findElement(By.id("nameOnCard")).sendKeys(mandatoryInfo.get("NameonCard"));
		}
	}

	@Then("^User Clicks on Purchase Flight$")
	public void user_clicks_on_purchase() {

		driver.findElement(By.cssSelector("body > div.container > form > div:nth-child(12) > div > input")).click();
	}

	@Then("^User is on flight successful booked page$")
	public void user_is_on_successful_booked_page() {

		String confirmationMessage = driver.findElement(By.cssSelector("body > div.container > div > h1")).getText();
		String expectedText = "Thank you for your purchase today!";
		Assert.assertEquals(confirmationMessage, expectedText);
	}

	@Then("^Close the Browser$")
	public void Close_the_browser() {

		driver.close();
	}

	
	
}
