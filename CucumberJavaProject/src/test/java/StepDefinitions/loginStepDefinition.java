package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDefinition {

	WebDriver driver = null;
	@Given("^User navigated to the url$")
	public void url_page() {
		String ProjPath = System.getProperty("user.dir");
	    System.setProperty("webdriver.chrome.driver",ProjPath+"/src/test/resources/Drivers");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    driver.navigate().to("https://google.com");
	    driver.findElement(By.className("gLFyf")).sendKeys("Automation Step by Step");
	    driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
	    driver.getPageSource().contains("Online Courses");
	    driver.close();
	    driver.quit();
	}

	@When("^User enters the login credentials$")
	public void credentials() {
	    System.out.println("Inside credentials");
	}

	@And("^Clicks on login button$")
	public void login_button() {
	    System.out.println("Inside login_button");
	}

	@Then("^User is navigated to home page$")
	public void home_page() {
	    System.out.println("Inside home_page");
	}

}
