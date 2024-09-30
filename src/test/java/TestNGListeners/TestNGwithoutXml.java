package TestNGListeners;
/*1.create test case
2.create a listemer class
3.By using xml file we can write another entry where we can specify teh listener class

* */

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGwithoutXml implements ITestListener {
    public void onTestStart(ITestResult result){
        System.out.println("on test start.........");
    }
    public void onTestSuccess(ITestResult result)
    {
        System.out.println("on test success..........");
    }
    public void onTestFailure(ITestResult result)
    {
        System.out.println("on test failure.....");
    }
    public void onTestSkipped(ITestResult result)
    {
        System.out.println("on test skipped.....");
    }
    public void onTestFinish(ITestResult result)
    {
        System.out.println("on test finish.........");
    }
}
