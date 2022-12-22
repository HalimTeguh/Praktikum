/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittest;

import unittest.HelloWorld;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arie
 */
public class HelloWorldTest {

    HelloWorld helloWorldInstance;

    public HelloWorldTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        System.out.println("* HelloWorldTest: Before method setUp()");
        helloWorldInstance = new HelloWorld();
    }

    @After
    public void tearDown() {
        System.out.println("* HelloWorldTest: After method tearDown()");
        helloWorldInstance = null;
    }

    @Test
    public void testFormMessage() {
        String expResult = "Hello World!";
        String result = helloWorldInstance.formMessage();
        System.out.println("* HelloWorldTest: test method 1 testFormMessage()");
        assertEquals(expResult, result);
    }
}
