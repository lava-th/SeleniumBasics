package org.test.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Alertinputbox {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(15));
        Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alertwindow.getText());
        alertwindow.sendKeys("I am using alert automation");
        alertwindow.accept();
        //alertwindow.dismiss();




    }
}
