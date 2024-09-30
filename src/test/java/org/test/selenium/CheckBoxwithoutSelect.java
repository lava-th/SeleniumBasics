package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CheckBoxwithoutSelect {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().window().maximize();
       List<WebElement> dropCountryEle = driver.findElements(By.xpath("(//select[@id='country-list'])/option"));
        System.out.println(dropCountryEle.size());
        //Print all the options from the dropdown
//        for(int i=0;i<dropCountryEle.size();i++){
//            System.out.println(dropCountryEle.get(i).getText());
//        }
        //Select options from dropdown
        for(int i=0;i<dropCountryEle.size();i++){
            String dropCountryoption=dropCountryEle.get(i).getText();
            if(dropCountryoption.equals("Brazil")){
               dropCountryEle.get(i).click();
            }
        }

    }
}