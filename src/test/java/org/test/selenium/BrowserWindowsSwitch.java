package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowserWindowsSwitch {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();
        //Capture the id's for browser window
        Set<String> window=driver.getWindowHandles();//store 2 window id's
//        //Approach1-Using list collection
//        List<String> windowslist=new ArrayList(window);//Converted set---->List
//        String parentwindowId=windowslist.get(0);
//        String  childwindowId=windowslist.get(1);
//        System.out.println(parentwindowId);
//        System.out.println(childwindowId);
//
//
//        //switch to child window
//        driver.switchTo().window(childwindowId);
//        driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();

//Appraoch2
        for(String windid:window){
            String title=driver.switchTo().window(windid).getTitle();
            if(title.equals("OrangeHRM HR Software | OrangeHRM"))
            {
                driver.close();
            }
        }

    }
}
