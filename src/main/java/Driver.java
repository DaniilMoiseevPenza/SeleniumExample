import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private static WebDriver driver;
    private Driver() {}
    public static WebDriver getWebDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }
}
