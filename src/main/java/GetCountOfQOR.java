public class GetCountOfQOR {

    //Написать метод, который принимает на вход строку
    // и печатает все буквы “q”, “o” и “r” из этой строки:

    public static String getCountOfQOR(String str) {

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.toLowerCase().charAt(i) == 'q' || str.toLowerCase().charAt(i) == 'o' || str.toLowerCase().charAt(i) == 'r') {
                System.out.print(str.charAt(i));
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
