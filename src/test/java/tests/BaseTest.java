package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import modals.NewLeadModal;
import org.apache.commons.logging.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;

import java.util.concurrent.TimeUnit;


public abstract class BaseTest {

    protected final static String BASE_URL = "https://tms3.lightning.force.com/";
    protected final static String USER_NAME = "dunyashenkonikita-ukv7@force.com";
    protected final static String PASSWORD = "15_nik_062000";


    protected WebDriver driver;
    protected LoginPage loginPage;
    protected HomePage homePage;
    protected LeadsPage leadsPage;
    protected LeadsDetailsPage leadsDetailsPage;
    protected NewLeadModal newLeadModal;
    protected EntityBasePage entityBasePage;



    @BeforeClass(alwaysRun = true, description = "Setting up the driver")
    public void setUp(ITestContext testContext) {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        //options.addArguments("--headless");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        testContext.setAttribute("driver", driver);

        loginPage = new LoginPage(driver);
        homePage = new HomePage(driver);
        leadsPage = new LeadsPage(driver);
        leadsDetailsPage = new LeadsDetailsPage(driver);
        newLeadModal = new NewLeadModal(driver);
        entityBasePage = new EntityBasePage(driver);
    }

    @BeforeMethod(alwaysRun = true, description = "Website URL")
    public void navigate() {
        driver.get(BASE_URL);
    }

    @AfterClass(alwaysRun = true, description = "Quiting the website after each class")
    public void tearDown() {
        driver.quit();
    }

}
