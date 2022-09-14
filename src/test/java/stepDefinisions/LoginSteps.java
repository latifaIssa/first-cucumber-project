package stepDefinisions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

//    @Given(...)
//    public void verifyLoginPage(){
//        print....
//    }

    @Given("User Launch Chrome browser in login page")
    public void user_launch_chrome_browser_in_login_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User Launch Chrome browser in login page");
    }

    @When("User opens URL {string}")
    public void user_opens_url(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User opens URL 'https://admin-demo.nopcommerce.com/login'");

    }

    @And("User enters email as {string} and Password as {string}")
    public void user_enters_email_as_and_password_as(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User enters email as 'admin@yourstore.com' and Password as 'admin'");
    }

    @And("Click on login")
    public void click_on_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User click login page");
    }

    @Then("first page title should be {string}")
    public void first_page_title_should_be(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("first page title should be 'dashboard / nopCommerce administration'");
    }

    @When("User click on Log out link")
    public void user_click_on_log_out_link() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User click on Log out link");
    }

    @Then("Page Title should be {string}")
    public void page_title_should_be(String string) {
        System.out.println("Page Title should be 'your store. Login'");
    }

    @And("close browser")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("close browser");
    }
}
