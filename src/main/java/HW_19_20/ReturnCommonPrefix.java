package HW_19_20;

import java.util.Arrays;

public class ReturnCommonPrefix {

    //Write a function to find the longest common prefix
    // string amongst an array of strings. If there is no common prefix,
    // return an empty string "".

    public static String returnCommonPrefix(String[] str) {

        StringBuilder sb = new StringBuilder();

        int minLength = Arrays.stream(str).min((str1, str2) -> str1.length() > str2.length() ? 1: -1).get().length();

        for (int i = 0; i < minLength; i++) {
            for (int j = 1; j < str.length; j ++) {
                if (str[0].charAt(i) != str[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(str[0].charAt(i));
        }

        return sb.toString();
    }
}
