package HW_19_20;

public class ReturnCommonPrefix {

    //Write a function to find the longest common prefix
    // string amongst an array of strings. If there is no common prefix,
    // return an empty string "".

    public static String returnCommonPrefix(String[] str) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str[0].length(); i++) {
            for (int j = 1; j < str.length; j ++) {
                if (str[0].charAt(i) != str[j].charAt(i)) {
                    return sb.toString();
                }
            }
            sb.append(str[0].charAt(i));
        }

        return sb.toString();
    }
}
