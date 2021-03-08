package com.ery.digits.util;

import java.util.*;

/**
 * @author Erythron
 *
 */
public class NumberLetterMap {

    public static List<Character> getLetterList(int n) {
        switch (n) {
            case 1:
                return Collections.singletonList('1');
            case 2:
                return Arrays.asList('a', 'b', 'c');
            case 3:
                return Arrays.asList('d', 'e', 'f');
            case 4:
                return Arrays.asList('g', 'h', 'i');
            case 5:
                return Arrays.asList('j', 'k', 'l');
            case 6:
                return Arrays.asList('m', 'n', 'o');
            case 7:
                return Arrays.asList('p', 'q', 'r', 's');
            case 8:
                return Arrays.asList('t', 'u', 'v');
            case 9:
                return Arrays.asList('w', 'x', 'y', 'z');
            case 0:
                return Collections.singletonList('0');
            default:
                throw new RuntimeException("input error");

        }
    }

}
