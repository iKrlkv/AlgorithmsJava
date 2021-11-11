package HW_19_20;

import java.util.Arrays;

public class IsStringAnagram {

    public static boolean isStringAnagram(String firstString, String secondString) {

        char[] firstStringArray = firstString.toLowerCase().toCharArray();
        char[] secondStringArray = secondString.toLowerCase().toCharArray();

        Arrays.sort(firstStringArray);
        Arrays.sort(secondStringArray);

        return Arrays.toString(firstStringArray).equals(Arrays.toString(secondStringArray));
    }
}
