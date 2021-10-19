import java.util.Arrays;

public class SmallestDifference {

    // Написать алгоритм SmallestDifference, который принимает на вход
    // массив целых чисел и возвращает ту пару чисел, абсолютная разница
    // между которыми наименьшая

    // Test Data:
    // Input = {8, 5, 2, 0, 9, 12, 8}
    // Expected Result =  {9, 8}

    // Input = {8, -55, 2, -54, -12}
    // Expected Result =  {-55, -54}

    // недостаточные условия задачи - все-таки абсолютные или нет? Почему в первых тестовых данных
    // рещзультат 9 и 8, а не наоборот, если говорим об абсолютной разнице. Почему вообще не 8 и 8?

    public static int[] smallestDifference(int[] input) {

        int firstNumber = Integer.MAX_VALUE;
        int secondNumber = 0;

        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (Math.abs(input[i] - input[j]) < Math.abs(firstNumber - secondNumber)) {
                    firstNumber = input[i];
                    secondNumber = input[j];
                }
            }
        }
        return new int[]{firstNumber, secondNumber};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallestDifference(new int[]{8, -55, 2, -54, -12})));
    }


}
