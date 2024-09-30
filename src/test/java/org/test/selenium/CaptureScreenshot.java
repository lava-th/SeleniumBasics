package org.test.selenium;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class CaptureScreenshot {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        //capture full page screenshot - selenium 3& 4
        TakesScreenshot ts=(TakesScreenshot) driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File trg=new File("C:\\Users\\DELL\\Lavanya\\Automation\\ProjectSelenium\\screenshots\\fullpage.png");
        FileUtils.copyFile(src,trg);
//capture screenshot of specific area from webpage -- selenium 4+
        WebElement featureproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
        File src1=featureproducts.getScreenshotAs(OutputType.FILE);
        File trg1=new File("C:\\Users\\DELL\\Lavanya\\Automation\\ProjectSelenium\\screenshots\\featureproducts.png");
FileUtils.copyFile(src1,trg1);
//capture screenshot of specific web element --selenium 4+
        WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File src2=logo.getScreenshotAs(OutputType.FILE);
        File trg2=new File("C:\\Users\\DELL\\Lavanya\\Automation\\ProjectSelenium\\screenshots\\logo.png");
        FileUtils.copyFile(src2,trg2);

    }
}
