package HW_19_20;

import java.util.Arrays;

public class IsStringAnagram {

    // Write a method, which checks if two given strings are Anagram of each other.
    // Two String is said to be an anagram of each other, if they contain exactly
    // the same characters but in a different order.

    public static boolean isStringAnagram(String firstString, String secondString) {

        char[] firstStringArray = firstString.toLowerCase().toCharArray();
        char[] secondStringArray = secondString.toLowerCase().toCharArray();

        Arrays.sort(firstStringArray);
        Arrays.sort(secondStringArray);

        return Arrays.toString(firstStringArray).equals(Arrays.toString(secondStringArray));
    }
}
