package com.ery.digits;

import com.ery.digits.util.NumberToLetter;

/**
 * @author Erythron
 */
public class DigitsConvert {

    public static void main(String[] args) {

        // more than 99
        int[] arr = {3,5};
        String convert = NumberToLetter.convert(arr);
        System.out.println(convert);

    }

}
