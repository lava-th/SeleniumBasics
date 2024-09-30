package AnnotationsMethods;
//In the hard assertion one disadvantage is there when assertion is fail the rest of the statements will not execute so to overcome this problem go with soft assertion

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {
    @Test
    void test_hardassertion(){
        System.out.println("testing.....");
        System.out.println("testing.....");
        System.out.println("testing.....");
        System.out.println("testing.....");
        Assert.assertEquals(1,2);
        System.out.println("hardassertion is completed");
        Assert.assertEquals(1,1);

    }
    @Test
    void test_softassertion(){
        System.out.println("testing....");
        System.out.println("testing....");
        System.out.println("testing....");
        System.out.println("testing....");
        //softassertion is access through soft assert class object
        //soft assertion it is failed the rest of the statement will be executed

        SoftAssert sa=new SoftAssert();
        sa.assertEquals(1,2);
        System.out.println("soft assertion completed");
        //sa.assertEquals(1,1);
        sa.assertAll();//mandatory
    }

}
