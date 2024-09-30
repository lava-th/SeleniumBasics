package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TabsAndWindowsPractise {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.opencart.com/");
        driver.manage().window().maximize();
        //driver.switchTo().newWindow(WindowType.TAB);//opens new TAB
        driver.switchTo().newWindow(WindowType.WINDOW);//opens in another window
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }
}
