import java.util.Arrays;

public class ZeroSum {

    //Написать алгоритм ZeroSum, который принимает на вход массив целых чисел
    // и возвращает массив из двух чисел, сумма которых равна 0.
    //
    //Test Data:
    //{35, 23, 12, 89, -23, -48, 100}
    //Expected result = {23, -23}

    public static int[] zeroSum(int[] array) {

        int result = 0;

        for (int i = 0; i < array.length; i++) {
            result = array[i];
            for (int j = i + 1; j < array.length; j++) {
                if (result == -array[j]) {
                    return new int[]{result, -result};
                }
            }
        }

        return new int[0];
    }
}
