package com.example.localunittest;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class test {
    Function function=new Function();
    @Test
    public void compare() {
        int a=10;
        int b=20;

        boolean bool=function.compare(a,b);

        assertFalse(bool);
    }

}
