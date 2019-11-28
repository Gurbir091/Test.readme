package stepDef;



import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



@RunWith(Cucumber.class)
public class stepDefinition {
	public WebDriver driver;

	@Given("^I want food in \"([^\"]*)\"$")
    public void i_want_food_in_something(String strArg1) throws IOException  
	{
		
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\12269\\Desktop\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.just-eat.co.uk/");
		driver.findElement(By.xpath("//span[@class='Form_c-search-placeholder_1hvU9']")).click();
		driver.findElement(By.xpath("//span[@class='Form_c-search-placeholder_1hvU9']")).sendKeys(strArg1);
		driver.findElement(By.xpath("//button[@class='Form_c-search-btn_1EEhL']")).click();
		
	 }


    @When("^I search for restaurants$")
    public void i_search_for_restaurants() throws Throwable
    {
    driver.findElement(By.xpath("//button[@class='Form_c-search-btn_1EEhL']")).click();
     throw new PendingException();
    }

    @Then("^I should see some restaurants in \"([^\"]*)\"$")
    public void i_should_see_some_restaurants_in_something(String strArg1) throws Throwable 
    {
    	driver.findElement(By.linkText("restaurants"));
    	
        throw new PendingException();
    }
    
    
}