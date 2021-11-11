package HW_19_20;

public class IsPossibleToMakeString {

    //Даны две строки. Определите, можно ли из некоторых символов первой строки составить вторую строку.

    public static boolean isPossibleToMakeString(String enterString, String exitString) {

        for (int i = 0; i < exitString.length(); i++) {
            String symbol = String.valueOf(exitString.charAt(i)).toLowerCase();

            if (!enterString.toLowerCase().contains(symbol)) {
                return false;
            }
        }

        return true;
    }
}
