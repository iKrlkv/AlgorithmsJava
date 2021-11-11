package HW_19_20;

public class ReturnReversedString {

    public static String returnReversedString(String str) {

        StringBuilder sb= new StringBuilder(str);

        return sb.reverse().toString();
    }
}
