public class GetStringFromOddIndexes {

    //Написать метод, который принимает строку и возвращает строку,
    // которая состоит только из букв на нечетных индексах
    // (для построения новой строки использовать метод concat() или просто +):

    public static String getStringFromOddIndexes(String str) {

        String result = "";

        for (int i = 1; i < str.length(); i+= 2) {
            result += String.valueOf(str.charAt(i));
        }

        return result;
    }
}
