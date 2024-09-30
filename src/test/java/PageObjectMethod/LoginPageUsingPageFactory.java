package PageObjectMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/*2) Using page factory here we don't use the find elements still we can identigy the element
 * @FindByAnnotation is find the element based on the locator and stored that element in a variable*/

public class LoginPageUsingPageFactory {
    public WebDriver driver;
    //Constructor
    LoginPageUsingPageFactory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //locator
    //By img_logo= By.xpath("//img[@alt='company-branding']");
    @FindBy(xpath = "//img[@alt='company-branding']")
    WebElement img_logo;
    //By txt_username_loc=By.name("username");
    @FindBy(name = "username")
            WebElement txt_username;
   // By txt_password_loc=By.cssSelector("input[placeholder='Password']");
    @FindBy(css= "input[placeholder='Password']")
    WebElement txt_password_loc;
    //By btn_submit_loc=By.xpath("//button[normalize-space()='Login']");
    @FindBy(xpath = "//button[normalize-space()='Login']")
    WebElement btn_submit_loc;

    //@FindBy(tagName="a")
    //List<WebElement> links;



    //Action Method
    public void setUserName(String username){
       // driver.findElement(txt_username_loc).sendKeys("username");
        txt_username.sendKeys(username);

    }
    public void setPassword(String password){
        //driver.findElement(txt_password_loc).sendKeys("Password");
txt_password_loc.sendKeys(password);

    }
    public void clickSubmit(){
       // driver.findElement(btn_submit_loc).click();
        btn_submit_loc.click();
    }
    public boolean checkLogoPresence(){
       // boolean status=driver.findElement(img_logo).isDisplayed();
        //boolean status=img_logo.isDisplayed();

       return img_logo.isDisplayed();
    }
}


