package com.ery.digits.util;

import java.util.List;

/**
 * @author Erythron
 *
 */
public class NumberToLetter {

    public static void convert(int[] arr) {
        if (arr == null) {
            throw new RuntimeException("input error!");
        }
        int n = arr[0];
        StringBuilder result = new StringBuilder();
        List<Character> letterList = NumberLetterMap.getLetterList(n);
        for (Character c : letterList) {
            result.append(c);
            // find whether has next
            if (arr.length > 1) {
                findNext(result, 1, arr);
                result.deleteCharAt(result.length() - 1);
            } else {
                System.out.println(result);
                result.deleteCharAt(result.length() - 1);
            }
        }
    }

    private static void findNext(StringBuilder result, int index, int[] arr) {
        List<Character> letterList = NumberLetterMap.getLetterList(arr[index]);
        for (Character character : letterList) {
            result.append(character);
            // with next
            if (arr.length - 1 != index) {
                findNext(result, index + 1, arr);
            }
            // without next
            else {
                System.out.println(result);
            }
            result.deleteCharAt(result.length() - 1);
        }
    }

}
