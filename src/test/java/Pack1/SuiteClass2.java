package Pack1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SuiteClass2 {
    @Test
    void xyz()
    {

        System.out.println("this is xyz from class 2");
    }

    @AfterTest
    void n()
    {

        System.out.println("this is after test method..");
    }
    @AfterSuite
    void as(){
        System.out.println("this is after suite method");
    }
}
