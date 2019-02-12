package com.stackroute.unittest;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void reverse() {
        ReverseString r1 = new ReverseString();
        assertEquals("hsotnas",r1.reverse("santosh"));
    }
}