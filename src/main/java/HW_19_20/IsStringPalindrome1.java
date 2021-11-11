package HW_19_20;

public class IsStringPalindrome1 {

    public static boolean isStringPalindrome(String str) {

        StringBuilder sb = new StringBuilder(str.toLowerCase().replaceAll(" ", ""));
        StringBuilder sb2 = new StringBuilder(sb.reverse());

        return sb.toString().equals(sb2.toString());
    }
}
