//package stepDefinitions;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition {
//	
//WebDriver driver;
//	
//	@Given("^User is already on Login Page$")
//	public void user_already_on_login_page() {
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("http://blazedemo.com/login");				
//		
//		
//	}
//
//	@When("^title of login page is Blaze Demo$")
//	public void  title_login_page_free_crm() {
//		
//		String actualTitle = driver.getTitle();
//		String expectedTitle = "BlazeDemo";
//		Assert.assertEquals(expectedTitle, actualTitle);		
//		
//	}
//	
//		
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_password(String username, String password) {
//		driver.findElement(By.name("email")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
//		
//		
//		
//	}
//	
//	@Then("^User Clicks on Login Button$")
//	public void user_clicks_login_button()
//	{
//		
//		driver.findElement(By.cssSelector("#app > div > div > div > div > div.panel-body > form > div:nth-child(4) > div > div > label")).click();
//		driver.findElement(By.cssSelector("#app > div > div > div > div > div.panel-body > form > div:nth-child(5) > div > button")).click();
//	}	
//	
//	
//	 @Then("^User in on Home Page$") 
//	 public void user_is_on_home_page()  {
//	  
//		 String isLogginIntext = driver.findElement(By.cssSelector("#app > div > div > div > div > div.panel-body")).getText();
//		 String expectedText = "You are logged in!"; 
//		 Assert.assertEquals(isLogginIntext, expectedText);
//		        
//		 }
//	 
//	
//	@Then("^Close the Browser$")
//	public void Close_the_browser() {
//		
//		driver.close();
//	}
//
//}
