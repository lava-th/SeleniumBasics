package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
Browser Methods are close and quit
it also available through driver instant
close()-----will close the current browser window which ever is open through automation. It will close single browser only
quit()----will close multiple browser window, all browser will close automatically using quit command
 */

public class BrowserMethods {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        //driver.close();
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        Thread.sleep(8000);
        driver.quit();
       // driver.close();


    }
}
