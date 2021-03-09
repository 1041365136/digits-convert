package com.ery.digits.util;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class NumberToLetterTest {

    @Before
    public void before() {
        System.out.println("before the test do sth ...");
    }

    @Test
    public void convertTest() {
        String excepted1 = "ad ae af bd be bf cd ce cf";
        String converted1 = NumberToLetter.convert(new int[]{2, 3});

        String excepted2 = "w x y z";
        String converted2 = NumberToLetter.convert(new int[]{9});

        Assert.assertEquals(excepted1, converted1);
        Assert.assertEquals(excepted2, converted2);

    }

    @After
    public void after() {
        System.out.println("after the test do sth else ...");
    }

}