package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class TomTest {
Tom tom=new Tom();
    @Test
    public void tomFunction()
    {
        Tom t=new Tom();

        assertEquals("Jerry",t.tomFunction(22));
    }
}


