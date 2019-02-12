package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class consonentTest
{
    consonent c=new consonent();
    @Test
    public void consonent2()
    {
        int input=2;
        int output=c.consonent2("p");
        assertEquals(input,output);

    }
}