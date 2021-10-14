public class ArrayOfOddIndexes {

    public static int[] getArrayOfOddIndexes(int[] array) {

        int[] result = new int[array.length / 2];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                result[j] = array[i];
                j++;
            }
        }

        return result;
    }

}