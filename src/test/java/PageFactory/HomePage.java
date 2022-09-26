package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(id = "logout")
    @CacheLookup
    WebElement btn_logout;

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;

        //  To Initialize web elements
        PageFactory.initElements(driver, this);

    }

    public void checkLogoutBtn() {
        btn_logout.isDisplayed();
    }
}
