package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutenticatedPopopPractise {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
       String text= driver.findElement(By.xpath("//p[contains(text(),'Congratulations! You must have the proper credenti')]")).getText();
        System.out.println(text);
        if(text.contains("Congratulations")){
            System.out.println("successful login");
        }
        else{
            System.out.println("login failed");
        }

    }
}
