package com.ery.digits.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class NumberLetterMapTest {

    @Test
    public void getLetterListTest(){
        List<Character> excepted = Arrays.asList('j', 'k', 'l');
        List<Character> letterList = NumberLetterMap.getLetterList(5);
        Assert.assertEquals(excepted,letterList);
    }

}