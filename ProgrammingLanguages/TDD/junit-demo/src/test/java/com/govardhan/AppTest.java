package com.govardhan;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest 
{
    //exrcise 1
    @Test
    public void sampleTest(){
        assertEquals(5, 2+3);
    } 

    @Test
    public void sampleTest2(){

        assertTrue(5>3);
    }

    //exercise 3
    @Test
    public void AssertionTest(){

        assertEquals(5, 2+3);

        assertFalse(5<3);

        assertTrue(5>3);

        assertNull(null);

        assertNotNull(new Object());
    }


    
    //exercise 4

    //setup 
    Calculator cal;
    @Before
    public void setUpCalculator(){
        cal = new Calculator();
    }

    //a-a-a
    @Test
    public void testAdd(){
        int result = cal.Add(3, 2);
        assertEquals(5, result);
    }

    @Test
    public void testSub(){
        int result = cal.Subtract(5, 3);
        assertEquals(2, result);
    }


    //teardown
    @After
    public void tearDown(){
        cal =null;
    }
   
}
