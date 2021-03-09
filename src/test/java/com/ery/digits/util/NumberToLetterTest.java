package com.ery.digits.util;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class NumberToLetterTest {

    @Before
    public void before(){
        System.out.println("before the test do sth ...");
    }

    @Test
    public void convertTest() {

        NumberToLetter.convert(new int[]{2, 3, 4});

    }

    @After
    public void after(){
        System.out.println("after the test do sth else ...");
    }

}