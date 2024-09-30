package PageObjectMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/*
* First we identify how many pages are there in your application
* For every page need to create a separate class
* Page object class contain only elements and action methods
* Two Approaches to create page object methods
* 1) Normal approach that is without using page factory
* 2) Using page factory here we don't use the find elements still we can identigy the element
* @FindByAnnotation is find the element based on the locator and stored that element in a variable*/
public class LoginPageObjectClass {
    public WebDriver driver;
    //Constructor
    LoginPageObjectClass(WebDriver driver) {
        this.driver = driver;
    }

    //locator
   By img_logo= By.xpath("//img[@alt='company-branding']");
   By txt_username_loc=By.name("username");
   By txt_password_loc=By.cssSelector("input[placeholder='Password']");
   By btn_submit_loc=By.xpath("//button[normalize-space()='Login']");
    //Action Method
    public void setUserName(String username){
        driver.findElement(txt_username_loc).sendKeys("username");

    }
    public void setPassword(String password){
        driver.findElement(txt_password_loc).sendKeys("Password");


    }
    public void clickSubmit(){
        driver.findElement(btn_submit_loc).click();
    }
    public boolean checkLogoPresence(){
        boolean status=driver.findElement(img_logo).isDisplayed();
        return status;
    }
}
