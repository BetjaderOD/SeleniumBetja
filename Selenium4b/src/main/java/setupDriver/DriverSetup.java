package setupDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DriverSetup {
    public static WebDriver setupDriver(){
        String exePath="src/Driver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        return driver;
    }

}