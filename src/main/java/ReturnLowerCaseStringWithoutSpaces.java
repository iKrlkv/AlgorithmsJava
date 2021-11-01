public class ReturnLowerCaseStringWithoutSpaces {

    //Написать метод, который удалит все пробелы из входящей строки,
    // и заменит все большие буквы на маленькие.

    public static String returnLowerCaseStringWithoutSpaces(String str) {

        return str.replaceAll(" ", "").toLowerCase();
    }
}
