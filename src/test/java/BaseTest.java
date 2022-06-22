import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseTest {

    public static final String SEARCH_INPUT_ID = "lst-ib";
    public static WebDriver driver;

    @BeforeAll
    static void setUp()
    {
        driver = Driver.getWebDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("");
    }

    public void searchText(String text) {

        WebElement searchInput = driver.findElement(By.id(SEARCH_INPUT_ID));
        searchInput.sendKeys(text);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        WebElement myDynamicElement = wait.until(ExpectedConditions.elementToBeClickable(searchInput));
    }

}
