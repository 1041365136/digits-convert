package com.ery.digits.util;

import java.util.List;

/**
 * @author Erythron
 */
public class NumberToLetter {

    public static String convert(int[] arr) {
        if (arr == null) {
            throw new RuntimeException("input error!");
        }
        int n = arr[0];
        StringBuilder letter = new StringBuilder();
        StringBuilder result = new StringBuilder();
        List<Character> letterList = NumberLetterMap.getLetterList(n);
        for (Character c : letterList) {
            result.append(c);
            // find whether has next
            if (arr.length > 1) {
                findNext(result, 1, arr, letter);
            } else {
                letter.append(result).append(" ");
            }
            result.deleteCharAt(result.length() - 1);
        }
        return letter.substring(0, letter.length() - 1);
    }

    private static void findNext(StringBuilder result, int index, int[] arr, StringBuilder letter) {
        List<Character> letterList = NumberLetterMap.getLetterList(arr[index]);
        for (Character character : letterList) {
            result.append(character);
            // with next
            if (arr.length - 1 != index) {
                findNext(result, index + 1, arr, letter);
            }
            // without next
            else {
                letter.append(result).append(" ");
            }
            result.deleteCharAt(result.length() - 1);
        }
    }

}
