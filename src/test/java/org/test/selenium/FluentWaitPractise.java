package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

/*
FluentWait---It is another flavour of explicit wait
having some additional options.
it will handle the exception.

 */

public class FluentWaitPractise {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        //Fluent wait declaration

        FluentWait mywait=new FluentWait(driver);
        mywait.withTimeout(Duration.ofSeconds(30));//
        mywait.pollingEvery(Duration.ofSeconds(5));//it makes our fluent way faster ,or it will work more efficiently than explicit wait

        mywait.ignoring(NoSuchElementException.class);//The exception is automatic taking care of this fluent wait Now to write additional try and catch block if there is an exception comes


        //usage
        WebElement username=(WebElement)  mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
        username.sendKeys("Admin");
    }
}
