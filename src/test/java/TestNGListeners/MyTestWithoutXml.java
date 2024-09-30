package TestNGListeners;

import org.testng.Assert;
import org.testng.ITestNGListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(TestNGListeners.TestNGwithoutXml.class)

public class MyTestWithoutXml {
    @Test(priority = 1)
    void test1(){
        Assert.assertEquals(1,1);

    }
    @Test(priority = 2)
    void test2(){
        Assert.assertEquals("A","B");

    }
    @Test(priority = 3,dependsOnMethods = {"test2"})
    void  test3()
    {
        Assert.assertEquals(1,1);
    }
}
/*output

Total tests run: 3, Passes: 1, Failures: 1, Skips: 1*/