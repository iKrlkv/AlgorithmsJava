public class ArrayMaxMinAvg {

    // Написать алгоритм, который принимает массив чисел int[] и
    // возвращает массив, который содержит максимальное число,
    // минимальное число и среднее.

    public static int[] getArrayMaxMinAvg(int[] array) {

        int length = array.length;
        int max = array[0];
        int min = array[0];
        int sum = 0;

        for (int i = 1; i < length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        for (int i = 1; i < length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }

        for (int i = 0; i < length; i++) {
            sum += array[i];
        }

        return new int[]{max, min, sum / length};
    }
}
