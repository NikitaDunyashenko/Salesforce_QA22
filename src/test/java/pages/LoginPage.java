package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    private final static By USER_NAME_INPUT = By.id("username");
    private final static By PASSWORD_INPUT = By.id("password");
    private final static By LOGIN_BUTTON = By.id("Login");


    public LoginPage(WebDriver driver){
        super (driver);
    }

    public void setUserName(String USER_NAME) {
        driver.findElement(USER_NAME_INPUT).sendKeys(USER_NAME);
    }

    public void setPassword(String PASSWORD) {
        driver.findElement(PASSWORD_INPUT).sendKeys(PASSWORD);
    }

    public void clickLoginButton() {
        driver.findElement(LOGIN_BUTTON).click();
    }

}
