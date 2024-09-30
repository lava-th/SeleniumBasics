package org.test.selenium;
//1) Drop down having select tag in DOM.
//By using the select class

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class CheckBoxPractise {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
        driver.manage().window().maximize();
        WebElement dropCountryEle=driver.findElement(By.xpath("//select[@id='country-list']"));
        Select drpCountry=new Select(dropCountryEle);
        //1)Select an option from the dropdown
        //drpCountry.selectByVisibleText("USA");
        //drpCountry.selectByValue("4");//this is only if value attribute is present for option tag
        drpCountry.selectByIndex(5);
        //2)Find total options in dropdown
        List<WebElement> options=drpCountry.getOptions();
        System.out.println("total number of options :"+options.size());
        //3)Print options in console window
        for(int i=0;i<options.size();i++){
            System.out.println(options.get(i).getText());
        }
        //3)Using enhanced loop
        for(WebElement op:options)
        {
            System.out.println(op.getText());
        }


    }
}
