/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestCases;

import kevin.canning.files.Setup;
import kevin.canning.impl.ClassInterface;
import org.springframework.context.ApplicationContext;
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

public class TestInt {
    private static ClassInterface ci;
    private static ApplicationContext ctx;
    
    public TestInt() 
    {
    }
    
    @Test
    public void testInt()
    {
        int x = ci.getInt();
        Assert.assertEquals(x, 100);
        
        System.out.println(x + " is a integer value.");
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(Setup.class);
        ci = (ClassInterface)ctx.getBean("tests");       
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}