package com.example.localunittest;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import org.junit.runners.model.TestClass;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest  {
    private  static  String Name="Testing";

    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void compareString(){
        assertSame("Compare 2 string","testing",Name);
    }

    @Test
    public void sum(){
        assertEquals(2,1+1);
    }

    @Test
    public void empty(){

    }
    @Test
    public void test1(){
        assertEquals(5,4);
    }




}