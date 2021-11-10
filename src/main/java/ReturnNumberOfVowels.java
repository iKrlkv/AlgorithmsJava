import java.util.Locale;

public class ReturnNumberOfVowels {

    //Написать метод, который посчитает количество гласных букв в строке.
    //Для нахождения гласных букв использовать метод contains()
    //(гласные буквы - “a”, “e”, “i”, “o”, “u”)

    public static boolean isSubstringVowel(int i, int j, String str) {
        String s = str.substring(i, j).toLowerCase();
        return s.contains("a") || s.contains("e") || s.contains("i") || s.contains("o") || s.contains("u");
    }

    public static int returnNumberOfVowels(String str) {

        int cnt = 0;
        for (int i = 0, j = 1; i < str.length(); i++, j++) {
            if (j == str.length()) {
                if (isSubstringVowel(i, j, str)) {
                    cnt++;
                }
                break;
            } else {
                if (isSubstringVowel(i, j, str)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }


    //Второй вариант
    public static int returnNumberOfVowels2(String str) {

        String reference = "aeiou";
        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (reference.contains(Character.toString(str.toLowerCase().charAt(i)))) {
                cnt++;
            }
        }

        return cnt;
    }

}
