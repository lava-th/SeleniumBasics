package org.test.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
//Alert with Ok and Cancel

public class AlertWithOkandCancel {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();

        Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alertwindow.getText());
        //alertwindow.accept();
        alertwindow.dismiss();

    }
}
