import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirtsTest {

    WebDriver driver = null;


    @Test
    public void testWiki() {
        String driverPath = "D:/Cursos/Egg - Globant - QA/10-09-2023 - Guia 17 - Web Automation/Ejercicios/WebDriverChrome/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.navigate().to("https://www.wikipedia.org");

        WebElement searchInput = driver.findElement(By.id("searchInput"));

//        searchInput.sendKeys("Microsoft");
//
//        searchInput.submit();
//
//        driver.navigate().to("https://es.wikipedia.org/wiki/Microsoft");
//
//        WebElement titulo = driver.findElement(By.id("firstHeading"));
//        Assert.assertEquals(titulo.getText(), "Microsoft");
//        if (titulo.getText().equalsIgnoreCase("Microsoft")){
//            System.out.println("Hay coincidencia");
//        }else{
//            System.out.println("No hay coincidencia");
//        }
//
//        driver.close();

        WebElement textoDonacion = driver.findElement(By.cssSelector(".footer-sidebar-text + div.footer-sidebar-text"));
        System.out.println("comino"+textoDonacion.toString());
        driver.close();
    }


}
