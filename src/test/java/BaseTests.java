import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class BaseTests {
    WebDriver driver;
    @Before
    public void startUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        /*Второй вариант реализации:
          ChromeOptions options = new ChromeOptions();
          options.addArguments("--no-sandbox", "--disable-dev-shm-usage");
          WebDriverManager.chromedriver().setup();
          driver = new ChromeDriver(options);*/
        //----firefox----
        //WebDriverManager.firefoxdriver().setup();
        //driver = new FirefoxDriver();
       //Переход на страницу
        driver.get("https://qa-scooter.praktikum-services.ru/");
        driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    }
    @After
    public void tearDown() {
        if(driver != null){
            driver.quit();
        }
    }
}
