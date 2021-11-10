import java.util.ArrayList;
import java.util.List;

public class ArrayToList {

    //Написать метод, который все цифры из входящей
    //строки вернет в виде List<Integer>.

    public static List<Integer> arrayToList(String str) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                result.add(str.charAt(i) - 48);
                //result.add(Character.getNumericValue(str.charAt(i)));
            }
        }
        return result;
    }
}
