package Practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumWebDriverManagerTests {

//    @Test
//    public void openDemoQATest() {
//        WebDriver driver = null;
//
//        String browser = System.getProperty("browser");
//
//        driver.get("https://demoqa.com/");
//
//        driver.quit();

//    }

    @Test
    public void simpleTest() {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://ya.ru");

        driver.quit();

    }
}
