package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
/*
Explicit wait()--we have to declare the explicit wait and then we able to use the explicit wait
1.Conditional based,it will more efficiently
2.finding element is inclusive
3.it will wait for conditions to be true,the consider the time
4.we need to write multiple statements for multiple elements

 */

public class ExplicitWait {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        //declaring explicit wait

        WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))).sendKeys("admin");
        mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']"))).sendKeys("admin");



    }
}
