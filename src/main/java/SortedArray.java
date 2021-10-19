import java.util.Arrays;

public class SortedArray {

    // Написать алгоритм SortedArray, который принимает массив чисел int[],
    // и возвращает отсортированный массив

    // Test Data:
    // {12, 2, 3, 4, 5} -> {2, 3, 4, 5, 12}
    // {-3, 0, 155, -39, 1003} -> {-39, -3, 0, 155, 1003}

    public static int[] sortedArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }

        return array;
    }



}
