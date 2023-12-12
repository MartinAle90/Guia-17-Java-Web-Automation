import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;


public class demoBlaze {

    WebDriver driver;

    @BeforeClass
    public void setUpAll() {
        String driverPath = "D:/Cursos/chromedriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://demoblaze.com/index.html");
    }

    @AfterClass
    public void closeDriver() {
        driver.close();
    }

    @Test
    public void testWait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#tbodyid > div:nth-child(9) > div")));
    }

    @Test
    public void testAssert() {
        WebElement productStore = driver.findElement(By.cssSelector("#fotcont > div:nth-child(3) > div > div"));
        Assert.assertEquals(productStore.getText(), "PRODUCT STORE");
    }

    @Test
    public void testSingUp() {
        WebElement singup = driver.findElement(By.cssSelector("#signin2"));
        singup.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));

        WebElement username = driver.findElement(By.cssSelector("#sign-username"));
        username.click();
        username.sendKeys("a");
        WebElement password = driver.findElement(By.cssSelector("#sign-password"));
        password.click();
        password.sendKeys("a");

        WebElement buttonSingup = driver.findElement(By.cssSelector("#signInModal > div > div > div.modal-footer > button.btn.btn-primary"));
        buttonSingup.click();
    }


}
