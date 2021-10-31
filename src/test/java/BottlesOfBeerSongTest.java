import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class BottlesOfBeerSongTest {

    private static String URL ="https://99-bottles-of-beer.net/lyrics.html";

    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void setDown() {
        driver.quit();
    }

    @Test
    public void bottlesOfBeerSongTest() {
        driver.get(URL);
        StringBuilder sb = new StringBuilder();

        List<WebElement> songText = driver.findElements(By.xpath("//div[@id='main']//p"));
        for (WebElement item : songText) {
            sb.append(item.getText()).append("\n");
        }
        System.out.println(sb.toString());
    }
}
