/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestCases;

import kevin.canning.files.Setup;
import org.springframework.context.ApplicationContext;
import kevin.canning.impl.ClassInterface;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author Kevin Canning - 211149381
 */

public class TestFalse {
 private static ApplicationContext ctx;
    private static ClassInterface fail;
    
    public TestFalse() 
    {
    }
    
    @Test
    public void TestFalse()
    {
        boolean notTrue = fail.getFalse();
        Assert.assertFalse(notTrue);
        System.out.println("Testing False: This test should return a " + notTrue);
    }

    @BeforeClass
    public static void setUpClass() throws Exception 
    {
        ctx = new AnnotationConfigApplicationContext(Setup.class);
        fail = (ClassInterface)ctx.getBean("tests");
    }
    
    @AfterClass
    public static void tearDownClass() throws Exception 
            {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
