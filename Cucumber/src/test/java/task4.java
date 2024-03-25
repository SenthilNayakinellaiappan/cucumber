import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import Worldline.BDD.ReadExcelFile;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class task4 
{
	WebDriver driver;
	@BeforeClass
	@Given("User launch Chrome browser")
	public void user_launch_chrome_browser() 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\web_driver_2\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
	}

	@When("User Opens Url {string}")
	public void user_opens_url(String string) 
	{
	  driver.get("http://admin-demo.nopcommerce.com/login"); 
	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_email_as_and_password_as(int index) throws IOException
	{
	
		
	    
	}

	@When("Click on Login")
	public void click_on_login() 
	{
		WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']")); // Assuming ID for login button is "login-button"
        loginButton.click();
	    
	}

	@Then("Page Title should be {string}")
	public void page_title_should_be(String expectedTitle) 
	{
		 String actualTitle = driver.getTitle();
	     assert actualTitle.equals(expectedTitle); 
	}
	
	@When("User click on Log out link")
    public void user_click_on_log_out_link() 
	{
        WebElement logoutLink = driver.findElement(By.cssSelector("body > div:nth-child(3) > nav:nth-child(1) > div:nth-child(4) > ul:nth-child(1) > li:nth-child(3) > a:nth-child(1)"));
        logoutLink.click();
    }
	@Then("close browser")
	public void close_browser() 
	{
		driver.quit();  
	}

}
