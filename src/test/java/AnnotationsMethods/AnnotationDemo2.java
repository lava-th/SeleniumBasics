package AnnotationsMethods;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
    @BeforeClass
    void login(){
        System.out.println("login....");
    }
    @Test(priority=1)
    void search(){
        System.out.println("search");
    }
    @Test(priority=2)
    void advancedsearch(){
        System.out.println("advanced search");
    }
    @AfterClass
    void  logout()
    {
        System.out.println("logout");
    }
}
