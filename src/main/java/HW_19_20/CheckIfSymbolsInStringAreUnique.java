package HW_19_20;

public class CheckIfSymbolsInStringAreUnique {

    //Написать метод, который проверяет строку на уникальность символов в ней.

    public static boolean checkIfSymbolsInStringAreUnique(String str) {

        StringBuilder sb = new StringBuilder(str.charAt(0) + "");

        for (int i = 1; i < str.length(); i++) {
            String symbol = String.valueOf(str.charAt(i));
            if (sb.toString().contains(symbol)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        System.out.println(checkIfSymbolsInStringAreUnique("abcdaef"));
    }
}
