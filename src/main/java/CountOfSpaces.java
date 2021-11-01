public class CountOfSpaces {

    //Написать метод, который принимает строку,
    //и возвращает количество пробелов в этой строке

    public static int countOfSpaces(String str) {

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                result++;
            }
        }

        return result;
    }
}
