package stepDefinisions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.LoginPage;

import java.util.concurrent.TimeUnit;


public class LoginTestSteps {

    WebDriver driver = null;

   //Declare the login instance as global
    LoginPage login;

    @Given("Browser is open.")
    public void browser_is_open() {
        System.out.println("Inside-Step: Browser is open.");
        System.setProperty("webdriver.chrome.driver","C:/Users/lmasri/Documents/Cucumber-project/first_cucumber/src/test/resources/Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
    }

    @And("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("Inside-Step: user is on login page");
        driver.navigate().to("https://example.testproject.io/web/");
    }

    // we can use (.*) instead of {} to show that any string here and (\\d+) for any integer
    //    use ^ and $ for multiple variables

    @When("^user enters (.*) and (.*)$")
    public void user_enters_username_and_password(String username, String password) throws InterruptedException {
        System.out.println("Inside-Step: user enters username and password.");

//        Using POM - Page Object Model
        login = new LoginPage(driver);
        login.enter_username(username);
        login.enter_password(password);

    //  These two lines without POM
    //   driver.findElement(By.id("name")).sendKeys(username);
    //   driver.findElement(By.id("password")).sendKeys(password);

        Thread.sleep(2000);

    }
    @And("user click on login btn")
    public void user_click_on_login_btn() throws InterruptedException {
        System.out.println("Inside-Step: user click on login btn");

//        Using POM - Page Object Model
        login.Click_on_login();

//        without POM
//        driver.findElement(By.id("login")).click();

        Thread.sleep(2000);
    }

    @Then("user is navigate to home page")
    public void user_is_navigate_to_home_page() {
        System.out.println("Inside-Step: user is navigate to home page");

//        Using POM - Page Object Model
        login.checkIsLogoutDisplayed();

//        without POM
//        driver.findElement(By.id("logout")).isDisplayed();

        driver.close();
        driver.quit();
    }

}
