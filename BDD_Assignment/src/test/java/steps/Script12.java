package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Script12 {
	
	WebDriver driver;
	@Given("Open chrome browser and url of the application")
	public void open_chrome_browser_and_url_of_the_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\koyatejanaga.sri\\OneDrive - HCL Technologies Ltd\\Documents\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		driver.manage().window().maximize();
		System.out.println("Given stmt");
	}

	@When("Enter the Email Address , password and click on Sign in button")
	public void enter_the_Email_Address_password_and_click_on_Sign_in_button() {
		driver.findElement(By.id("email")).sendKeys("terror1@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Hcl@1234");
		driver.findElement(By.id("SubmitLogin")).click();
		System.out.println("When stmt");
	}

	@Then("Success in login")
	public void success_in_login() {
		System.out.println("Then stmt");
	}
	
	
	@Given("the item into search box for searching")
	public void the_item_into_search_box_for_searching() {
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		driver.findElement(By.name("submit_search")).click();
		System.out.println("Given stmt");
	}

	@When("select the item and move it to cart by clicking on the button Add to cart")
	public void select_the_item_and_move_it_to_cart_by_clicking_on_the_button_Add_to_cart() {
	    JavascriptExecutor js=(JavascriptExecutor) driver;
	    js.executeScript("scroll(0,200)");
	    WebElement ele1=driver.findElement(By.xpath("//img[@src='http://automationpractice.com/img/p/7/7-home_default.jpg']"));
	    Actions ac=new Actions(driver);
	    ac.moveToElement(ele1).perform();
	    ele1.click();
	    js.executeScript("scroll(0,200)");
	    driver.findElement(By.id("add_to_cart")).click();
	    System.out.println("When stmt");
	}

	@Then("Successfully item will be moved to cart")
	public void successfully_item_will_be_moved_to_cart() {
		System.out.println("Then stmt");
	}

}
