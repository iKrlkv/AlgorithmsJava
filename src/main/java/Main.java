import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static String fakeBin(String numberString) {

        if (numberString == "") {
            return "";
        }

        StringBuilder sb= new StringBuilder();
        String[] array = numberString.split("");


        for (int i = 0; i < array.length; i++) {
            if (Integer.valueOf(array[i]) < 5) {
                sb.append("0");
            } else {
                sb.append("1");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

    }
}
