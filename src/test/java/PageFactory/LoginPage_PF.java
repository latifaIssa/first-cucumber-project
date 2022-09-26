package PageFactory;

import io.cucumber.java.bs.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {

    @FindBy(id="name")
    @CacheLookup  //Used to instruct the InitElements() method to cache the elements once its located and so that it will not be searched over and over again whenever calling it from any method
    WebElement txt_username;

    @FindBy(id="password")
    WebElement txt_password;

    @FindBy(id="login")
    WebElement btn_login;

    /*Using How
    * @FindBy(how=How.ID, using="name")
    * WebElements abc;
    * */

    /*Using WebElement List
    * @FindBy(class="")
    * List<WebElement> elementsList;
    * */

    WebDriver driver;

    public LoginPage_PF(WebDriver driver){
        this.driver = driver;

        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);

        // to initialize all above elements
        PageFactory.initElements(factory, LoginPage_PF.class); //instead of this LoginPage_PF.class ==> this .class

        //or in one statement
//        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), LoginPage_PF.class);

    }
    public void enterUsername(String username){
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password){
        txt_password.sendKeys(password);
    }

    public void clickLogin(){
        btn_login.click();
    }

}
