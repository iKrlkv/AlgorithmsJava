public class ReturnStringInUpperCaseTrim {

    //Написать метод, который переведет строку в
    //upper case и уберет все ЛИШНИЕ пробелы

    public static String returnStringInUpperCaseTrim(String str) {

        return str.toUpperCase().trim().replaceAll("  ", " ");
    }
}
