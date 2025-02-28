package org.example.Slidium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slidium {
//    WebDriver driver;
//
//    @BeforeEach
//    public void setup() {
//        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
//    }
//
//    @Test
//    void testWeb() throws InterruptedException {
//        driver.get("https://github.com/");
//
//        driver.findElement(By.xpath("/html/body/div[1]/div[3]/header/div/div[2]/div/div/div/a")).click();
//
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("phuhoang551144@gmail.com");
//        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Phuhoang205@T");
//        driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[13]")).click();
//
//        WebElement webElement = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[1]/div/div[2]/nav/ul/li/a/span"));//link cais muon test
//
//        String actualFirstCategory = webElement.getText();//lay gia trij text tren link chuyen vao
//        String expectedFirstCategory = "Dashboard";
//        Assertions.assertEquals(expectedFirstCategory, actualFirstCategory);
//
//    }
}
