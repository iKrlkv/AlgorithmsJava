public class TwoSum {

    // Написать алгоритм TwoSum, который принимает на вход массив целых чисел,
    // и возвращает массив из двух ИНДЕКСОВ значений, сумма которых равна таргетному числу.

    public static int[] twoSum(int[] input, int targetNumber) {

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] + input[j] == targetNumber) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}
