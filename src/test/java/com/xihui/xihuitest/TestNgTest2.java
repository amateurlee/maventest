package com.xihui.xihuitest;


import org.testng.annotations.*;

/**
 * Created by mjli on 2017/11/4.
 */
public class TestNgTest2 {

    @BeforeClass(groups="group1")
    public void beforeClass() {
        CommonLib.prt("\nClass2 beforeClass");
    }

    @BeforeTest (groups="group1")
    public void beforeTest() {
        CommonLib.prt("Class2 beforeTest");
    }

    @BeforeGroups(groups="group1")
    public void beforeGroups() {
        CommonLib.prt("Class2 before Group");
    }

    @BeforeMethod(groups="group1")
    public void beforeMethod() {
        CommonLib.prt("Class2 before Method");
    }

    @BeforeSuite (groups="group1")
    public void beforeSuite(){
        CommonLib.prt("Class2 before Suite");
    }
    
    @Test(groups="group1")
    public void test_Func1() {
        CommonLib.prt("Class2 test_func1");
    }

    @Test
    public void test_Func2() {
        CommonLib.prt("Class2 test_func2");
    }

    @Test (groups="group1")
    public void test_Func3_group(){
        CommonLib.prt("Class2 test_func 3 group1");
    }
    @AfterClass(groups="group1")
    public void afterClass(){
        CommonLib.prt("Class2 after Class\n");
    }

    @AfterGroups(groups="group1")
    public void afterGroups(){
        CommonLib.prt("Class2 after Groups");
    }

    @AfterMethod(groups="group1")
    public void afterMethod(){
        CommonLib.prt("Class2 after Method");
    }

    @AfterSuite(groups="group1")
    public void afterSuite(){
        CommonLib.prt("Class2 after Suite");
    }

    @AfterTest(groups="group1")
    public void afterTest(){
        CommonLib.prt("Class2 after Test");
    }
}












