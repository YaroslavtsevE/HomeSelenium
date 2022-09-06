package Practice;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLocalDriverTests {
    @Test
    public void openHerokuChromeTest() {
        System.setProperty("webdriver.chrome.driver", "E:\\qa\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();

        driver.quit();
    }

}
