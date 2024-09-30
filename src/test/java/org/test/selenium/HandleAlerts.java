package org.test.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
//Alert/popups
//1) alert with ok
//

public class HandleAlerts {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        //Alert is not a webelement
        //need to switch to the alert window we use switch To() command and return type of alert() method is alert()
//       Alert alertwindow=driver.switchTo().alert();
//        System.out.println(alertwindow.getText());
        Alert alertwindow=mywait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alertwindow.getText());
        alertwindow.accept();//this will close alert window using ok button
//alertwindow.dismiss();//this will alert window using cancel button

    }
}
