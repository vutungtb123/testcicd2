package selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class bai3 {
    @Test
    void testRegister() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://vitimex.com.vn/account/register");

            driver.findElement(By.name("customer[last_name]")).sendKeys("tung");
            driver.findElement(By.name("customer[first_name]")).sendKeys("vu");
            driver.findElement(By.id("radio1")).click();
            driver.findElement(By.name("customer[email]")).sendKeys("vutungtb2007@gmail.com");
            driver.findElement(By.name("customer[password]")).sendKeys("123456");

            driver.findElement(
                    By.xpath("//input[@type='submit' and @value='Đăng ký']")
            ).click();


            assertTrue(
                    wait.until(ExpectedConditions.urlContains("account"))
            );



        } finally {
            driver.quit();
        }
    }


    @Test
    void testLogin() {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://vitimex.com.vn/account/login");

            driver.findElement(By.name("customer[email]"))
                    .sendKeys("vutungtb2007@gmail.com");
            driver.findElement(By.name("customer[password]"))
                    .sendKeys("123456");

            driver.findElement(
                    By.xpath("//input[@type='submit' and @value='Đăng nhập']")
            ).click();

            assertTrue(
                    wait.until(ExpectedConditions.urlContains("account"))
            );

        } finally {
            driver.quit();
        }
    }
}
