package org.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePicker {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.switchTo().frame(0);//switch to frame
        //Approach 1
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("10/5/2023");//mm/dd/yyyy
//Approach 2
        String year="1998";
        String month="October";
        String date="12";
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();

        //Select month & year
        while(true)
        {
            String mon=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            System.out.println(mon);

            String yr=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
            System.out.println(yr);
            if(mon.equals(month)&& yr.equals(year)){
                break;
            }

            driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();//past year
            //Past date
            //driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();//future date


        }

//Select date
        List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
        for(WebElement dt:allDates){
            if(dt.getText().equals(date)){
                dt.click();
                break;
            }
        }
//        for(int i=0;i<allDates.size();i++){
//            if(allDates.get(i).getText().equals(date)){
//                allDates.get(i).click();
//                break;
//            }
//        }


    }
}
