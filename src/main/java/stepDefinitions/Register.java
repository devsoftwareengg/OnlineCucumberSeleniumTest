package stepDefinitions;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register {

	WebDriver driver;

	@Given("^user on the homepage$")
	public void user_on_the_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/K D Pandey/Downloads/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	@Given("^user clicks on Sign in button$")
	public void user_clicks_on_Sign_in_button() throws Throwable {
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		Thread.sleep(2000);
	}

	@When("^user fills registration email textbox with \"([^\"]*)\"$")
	public void user_fills_with(String email_address) throws Throwable {
		WebElement registration_email_textbox = driver.findElement(By.xpath("//input[@id='email_create']"));
		registration_email_textbox.click();
		registration_email_textbox.clear();
		// registration_email_textbox.sendKeys(email_address);
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		registration_email_textbox.sendKeys("firstname" + randomInt + "@gmail.com");
		System.out.println("firstname" + randomInt + "@gmail.com");
		Thread.sleep(4000);
	}

	@When("^user clicks create an account button$")
	public void user_clicks() throws InterruptedException {

		driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]")).click();
	}

	@When("^user enters the following details$")
	public void user_enters_the_following_details(DataTable registerData) {

		List<List<String>> registerValue = registerData.raw();

		driver.findElement(By.name("customer_firstname")).sendKeys(registerValue.get(1).get(0));
		driver.findElement(By.name("customer_lastname")).sendKeys(registerValue.get(1).get(1));
		driver.findElement(By.id("passwd")).sendKeys(registerValue.get(1).get(2));

		driver.findElement(By.id("firstname")).sendKeys(registerValue.get(1).get(0));
		driver.findElement(By.id("lastname")).sendKeys(registerValue.get(1).get(1));
		driver.findElement(By.id("address1")).sendKeys(registerValue.get(1).get(3));
		driver.findElement(By.id("city")).sendKeys(registerValue.get(1).get(4));

		WebElement statedropdown = driver.findElement(By.name("id_state"));
		Select oSelect = new Select(statedropdown);
		oSelect.selectByValue("4");
		driver.findElement(By.name("postcode")).sendKeys(registerValue.get(1).get(5));

		WebElement countrydropDown = driver.findElement(By.name("id_country"));
		Select oSelectC = new Select(countrydropDown);
		oSelectC.selectByVisibleText("United States");

		// Enter Mobile Number
		driver.findElement(By.id("phone_mobile")).sendKeys(registerValue.get(1).get(6));
		driver.findElement(By.xpath("//input[@name=\"alias\"]")).clear();
		driver.findElement(By.xpath("//input[@name=\"alias\"]")).sendKeys(registerValue.get(1).get(7));

	}

	@And("^user clicks register button$")
	public void user_click_register_button() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("submitAccount")).click();
	}

	@Then("^validate user firstname and lastname is displayed in dashboard$")
	public void validate_user_firstname_lastname() {
		String userText = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).getText();
		System.out.println(userText);
		// Validate that user has created
		if (userText.contains("Chitrali Sharma")) {
			System.out.println("User Verified,Test case Passed");
		} else {
			System.out.println("User Verification Failed,Test case Failed");
		}

		assertEquals(userText, "Chitrali Sharma");
	}

	@And("^user click on signout$")
	public void click_signout() {
		driver.findElement(By.xpath("//a[contains(text(),'Sign out')]")).click();
	}

	@When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_email_password(String email_address, String password) {
		WebElement Email = driver.findElement(By.id("email"));
		Email.click();
		Email.clear();
		Email.sendKeys(email_address);
		WebElement Password = driver.findElement(By.id("passwd"));
		Password.click();
		Password.clear();
		Password.sendKeys(password);
	}

	@And("^user click on Signin button.$")
	public void click_signin_button() {
		driver.findElement(By.cssSelector("#SubmitLogin")).click();
	}

	@And("^user move cursor over Womens link and click on sub menu T-shirts$")
	public void move_cursor_womens_link_click_Tshirts() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement womenTab = driver.findElement(By.linkText("WOMEN"));
		WebElement TshirtTab = driver
				.findElement(By.xpath("//div[@id='block_top_menu']/ul/li[1]/ul/li[1]/ul//a[@title='T-shirts']"));
		actions.moveToElement(womenTab).moveToElement(TshirtTab).click().perform();
		Thread.sleep(2000);
	}

	@And("^Get Name/Text of the first product displayed on the page$")
	public void get_product_details() throws InterruptedException {
		String ProductName = driver
				.findElement(By.xpath(
						"/html[1]/body[1]/div[1]/div[2]/div[1]/div[3]/div[2]/ul[1]/li[1]/div[1]/div[2]/h5[1]/a[1]"))
				.getText();
		System.out.println(ProductName);
		driver.findElement(By.id("search_query_top")).sendKeys(ProductName);
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(2000);
	}
	
	@And("^click on Add product to the cart$")
	public void add_product_to_cart() {
		driver.findElement(By.xpath("//p[@id='add_to_cart']//span[.='Add to cart']")).click();
	}
	@And("^Proceed to the checkout page and continue till payments$")
	public void proceed_checkout_continue_payment() {
		//Click on proceed
		  driver.findElement(By.xpath("/html//div[@id='layer_cart']//a[@title='Proceed to checkout']/span")).click();
		  //Checkout page Proceed
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();
		  //Agree terms&Conditions
		  driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button/span")).click();

	}
	@And("^Validate on the payments page if the product details are correct.$")
	public void validate_payments_page_product_details_correct() {
		
		//Click on Payby Check
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[2]/div/p/a")).click();
		  //Confirm the order
		  driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button/span")).click();

		  //Get Text
		  String ConfirmationText=driver.findElement(By.xpath("//div[@id='center_column']/p[@class='alert alert-success']")).getText();
		  
		  // Verify that Product is ordered
		  if(ConfirmationText.contains("complete")) {
		   System.out.println("Order Completed: Test Case Passed");
		  }
		  else {
		   System.out.println("Order Not Successfull: Test Case Failed");
		  }
	}
	
}
