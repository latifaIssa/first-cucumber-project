package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    private By txt_username = By.id("name");
    private By txt_password = By.id("password");
    private By btn_login = By.id("login");
    private By btn_logout = By.id("logout");

    public LoginPage(WebDriver driver){
        this.driver = driver;

        //  Check if this a right page by page title
        if (!(driver.getTitle().equals("TestProject Demo"))){
            throw new IllegalStateException("This is not Login Page. The current page is "+ driver.getCurrentUrl());
        }
    }

    public void enter_password(String password){
        driver.findElement(txt_password).sendKeys(password);
    }
    public void enter_username(String username){
        driver.findElement(txt_username).sendKeys(username);
    }
    public void Click_on_login() {
       driver.findElement(btn_login).click();
    }

    public void valid_login(String username, String password){
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_login).click();
    }

    public void checkIsLogoutDisplayed(){
        driver.findElement(btn_logout).isDisplayed();
    }
}
