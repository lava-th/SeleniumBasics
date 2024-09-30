package AnnotationsMethods;

import org.testng.annotations.*;

public class AllAnnotations {
        @BeforeSuite
        void bs()
        {
             System.out.println("This is the before suite");
        }
        @AfterSuite
        void as(){
            System.out.println("This is the after suite");
        }
        @BeforeTest
        void bt(){
            System.out.println("This is before test method.....");
        }
        @AfterTest
        void at(){
            System.out.println("This is after test method...");
        }
        @AfterClass
        void ac(){
            System.out.println("This is after class method...");
        }
        @BeforeClass
        void bc(){
            System.out.println("This is before class method....");
        }
        @BeforeMethod
        void bm(){
            System.out.println("This is before method..");
        }
        @AfterMethod
        void am(){
            System.out.println("This is after method....");
        }

        @Test(priority=1)
        void tm1(){
            System.out.println("This is Test Method1....");
        }
        @Test(priority=2)
        void tm2(){
            System.out.println("This is test method2...");
        }

    }

/*OUTPUT...
This is the before suite
This is before test method.....
This is before class method....
This is before method..
This is Test Method1....
This is after method....
This is before method..
This is test method2...
This is after method....
This is after class method...
This is after test method...
This is the after suite*/
