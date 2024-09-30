package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
/*
wait statement will get no such element exception in that case will keep some wait statement in that case you can pass your script for sometimes and you can see the operation and proceed.
1.Application is slower than your script execution
2.The element is not available in the page and still completely not loaded then you will get an exception No such element found
3.To handle this synchronization problem need to add additionally some statement need to add wait statements additionally in the automation script
4.The script will pass for some times and it wait for some elements and we will proceed further activity or further actions.
 wait commands
implicitWait()--
advantage:
single time or one statement ,it will not wait till maximum time if the element is available,applicable for all the elements,easy to use
disadvantage:if the time is not sufficient then you will get exception.
explicitWait()---
fluentWait()---

 */

public class ImplicitCommand {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//implicit command
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
    }
}
