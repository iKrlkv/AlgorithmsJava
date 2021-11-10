package HW_19_20;

public class RemoveDuplicates {

    public static String removeDuplicates(String str) {

        StringBuilder sb = new StringBuilder();

        System.out.println(sb);

        for (int i = 0; i < str.length(); i++) {
            if (sb.toString().contains(String.valueOf(str.charAt(i)))) {
                continue;
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
