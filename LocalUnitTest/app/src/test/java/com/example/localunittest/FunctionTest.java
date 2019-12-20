package com.example.localunittest;

import junit.framework.TestCase;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunctionTest {

    Function function=new Function();
    @Test
    public void compare() {
        int a=10;
        int b=20;

        boolean bool=function.compare(a,b);

        assertTrue(bool);
    }

   @Test
    public void sum(){
        assertEquals(3,function.sum(5,4));
   }

}