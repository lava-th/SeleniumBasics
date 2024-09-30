package AnnotationsMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {
    @Test
    void test(){
      /*  int x=10;
        int y=15;
        if(x==y)//test failed it is printing output, but here the test is not failed
        {
            System.out.println("test passed");
        }
        else {
            System.out.println("test failed");
        }*/
        int a=10;
        int b=34;
        //Assert.assertEquals(actual,expected,description);//the significance of assert equal
       // Assert.assertEquals(a>b,true,"a is not greater than b");//false
        String s1="abc";
        String s2="abc2";
        //Assert.assertEquals(s1,s2,"strings are not equal");
       // Assert.assertNotEquals(s1, s2);

        if(false)
        {
            Assert.assertTrue(true);
        }
        else {
            //Assert.assertTrue(false);//it can simplify by fail
            Assert.fail();
        }

    }
}
