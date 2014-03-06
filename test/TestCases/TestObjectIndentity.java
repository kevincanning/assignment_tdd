/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TestCases;

import kevin.canning.files.ExampleObject;
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

public class TestObjectIndentity {
    private static ClassInterface ci;
    private static ApplicationContext ctx;
    
    
    public TestObjectIndentity() 
    {
    }
     
    @Test
    public void testObjectIdentity()
    {
        ExampleObject x = new ExampleObject("Name", 21);
        ExampleObject y = ci.getObject();
        
        String name = x.getName();
        String fn = y.getName(); 
        
        int age = x.getNum();
        int a = y.getNum();
        
        //Assert to compare name & age value of each object
        Assert.assertEquals(fn, name);
        Assert.assertEquals(a, age);
        
        System.out.println("fn = " + fn );
        System.out.println("name = " + name);
        System.out.println("a = " + a);
        System.out.println("age = " + age);

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
