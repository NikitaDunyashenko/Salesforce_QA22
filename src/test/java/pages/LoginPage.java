package pages;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@Log4j2
public class LoginPage extends BasePage{

    private final static By USER_NAME_INPUT = By.id("username");
    private final static By PASSWORD_INPUT = By.id("password");
    private final static By LOGIN_BUTTON = By.id("Login");


    public LoginPage(WebDriver driver){
        super (driver);
    }

    public void setUserName(String USER_NAME) {
        log.info("sending text to User Name Input");
        driver.findElement(USER_NAME_INPUT).sendKeys(USER_NAME);
    }

    public void setPassword(String PASSWORD) {
        log.info("sending text to Password Input");
        driver.findElement(PASSWORD_INPUT).sendKeys(PASSWORD);
    }

    public void clickLoginButton() {
        log.info("clicking to Login Button");
        driver.findElement(LOGIN_BUTTON).click();
    }

}
