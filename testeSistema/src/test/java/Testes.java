
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.*;

import org.openqa.selenium.By;


public class Testes {

    @Test
    public void abrirPageTest() {
        System.setProperty("web-driver.chrome.driver", "driver/chromedriver_32/chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();

        webDriver.get("https://conexaoqa.herokuapp.com/");
        assertEquals("https://conexaoqa.herokuapp.com/", webDriver.getCurrentUrl());
    }

    @Test
    public void LoginTest() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver_32/chromedriver.exe");
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://conexaoqa.herokuapp.com/");
        navegador.manage().window().maximize();
        navegador.findElement(
                By.xpath("/html/body/div/section/div/div/div/a[2]")).click();
    }

    @Test
    public void buscaTest() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver_32/chromedriver.exe");
        WebDriver navegator = new ChromeDriver();
        navegator.manage().window().maximize();
        navegator.get("https://conexaoqa.herokuapp.com/login");
        navegator.findElement(By.xpath("/html/body/div/section/form/div[1]/div/div/input")).click();
        WebElement search = navegator.findElement(
                By.name("email"));

        search.sendKeys("deyvison_2022@hotmail.com");
        search.submit();
    }


}
