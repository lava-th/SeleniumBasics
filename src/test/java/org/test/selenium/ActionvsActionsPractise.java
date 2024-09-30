package org.test.selenium;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class ActionvsActionsPractise {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //Mouse Actions
        //Right click on the button by the mouse action
        driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().window().maximize();
       WebElement RightclickButton= driver.findElement(By.xpath("//div[@role='main']//p//span[@class='context-menu-one btn btn-neutral']"));
       //Action is the name of the class it contains different types of methods by using those methods can perform mouse operations
        //  build().perform()--which will perform the action and build() is create an action.
        //Here the build command excute 2 times actually build command will execute once and internally the perform method is also having one more build method

       Actions act=new Actions(driver);
       //act.contextClick(RightclickButton).build().perform();
//        Action myaction=act.contextClick(RightclickButton).build();  // creating action and storing it in variable
//        myaction.perform();  // completing action
        Action myaction=act.contextClick(RightclickButton).build();
        myaction.perform();

     act.contextClick(RightclickButton).build().perform();//Right Click

    }
}
