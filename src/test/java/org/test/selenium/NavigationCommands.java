package org.test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
navigation commands are navigate().to(url)---it accept in two format one is string format by default other one is URL format
URL myurl=new URL("https:____");
String url is converted into actual url format mostly use in the api testing
navigate().forward()
navigate().back()
navigate().refresh()
 */

public class NavigationCommands {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.navigate().to("https://www.amazon.in/");
        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("https://www.flipkart.com/");
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());




    }
}
