
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTestTest {
    private WebDriver driver;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver_32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60000, TimeUnit.MILLISECONDS);

    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void loginTest() {
        driver.get("https://conexaoqa.herokuapp.com/login");

        driver.findElement(By.name("email")).click();
        driver.findElement(By.name("email")).sendKeys("deyvison_2022@hotmail.com");
        driver.findElement(By.name("password")).click();
        driver.findElement(By.name("password")).sendKeys("ramos123");
        driver.findElement(By.cssSelector("*[data-test=\"login-submit\"]")).click();
    }


}
