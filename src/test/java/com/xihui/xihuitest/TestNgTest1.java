package com.xihui.xihuitest;


import org.testng.annotations.*;

/**
 * Created by mjli on 2017/11/4.
 */
public class TestNgTest1 {

    @BeforeSuite
    public void beforeSuite() {
        CommonLib.prt("Class1 before Suite");
    }

    @BeforeClass
    public void beforeClass() {
        CommonLib.prt("\nClass1 before Class");
    }

    @BeforeTest
    public void beforeTest() {
        CommonLib.prt("Class1 before Test");
    }

    @BeforeGroups
    public void beforeGroups() {
        CommonLib.prt("Class1 before Group");
    }

    @BeforeMethod
    public void beforeMethod() {
        CommonLib.prt("Class1 before Method");
    }

    @Test
    public void test_Func1() {
        CommonLib.prt("Class1 test_func 1");
    }

    @Test
    public void test_Func2() {
        CommonLib.prt("Class1 test_func 2");
    }

    @Test (groups="group1")
    public void test_Func3_group(){
        CommonLib.prt("Class1 test_func 3 group1");
    }

    @AfterGroups
    public void afterGroups() {
        CommonLib.prt("Class1 after Groups");
    }

    @AfterMethod
    public void afterMethod() {
        CommonLib.prt("Class1 after Method");
    }


    @AfterTest
    public void afterTest() {
        CommonLib.prt("Class1 after Test");
    }

    @AfterClass
    public void afterClass() {
        CommonLib.prt("Class1 after Class\n");
    }

    @AfterSuite
    public void afterSuite() {
        CommonLib.prt("Class1 after Suite");
    }
}












