package HW_19_20;

public class CountNonRepeatingLength {

    //Find the non-repeating length of the longest substring in a string

    public static int countNonRepeatingLength(String str) {

        int count = 1;

        if (str.length() == 1) {
            return count;
        } else {
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) != str.charAt(i - 1)) {
                    count++;
                }
            }
        }

        return count;
    }
}
