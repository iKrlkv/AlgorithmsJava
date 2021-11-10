package HW_19_20;

public class ReturnEndOrMiddleLetters {

    //Напишите метод, который принимает строковый параметр и возвращает слово,
    // которое состоит из последних трех и первых трех букв слова-параметра,
    // если длина строки больше 5. Иначе метод возвращает слово, состоящее из
    // средней/средних буквы/букв слова-параметра, повторенных столько раз,
    // какова длина строки.

    public static String returnEndOrMiddleLetters(String str) {

        StringBuilder sb = new StringBuilder();

        if (str.length() == 1) {
            return str;
        } else if (str.length() <= 5) {
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.substring(1, str.length() - 1));
            }
        } else {
            sb.append(str.substring(str.length() - 3)).append(str.substring(0, 3));
        }

        return sb.toString();
    }
}
