public class IsSumOfFirstHalfEven {

    //  Напишите метод, который принимает массив целых положительных чисел
    //  (в массиве четное количество элементов), и возвращает true,
    //  если сумма чисел в первой половине массива больше суммы чисел
    //  во второй половине массива. Иначе возвращается false

    public static boolean isSumOfFirstHalfEven(int[] array) {

        int sumOfFirstHalf = 0;
        int sumOfSecondHalf = 0;

        for (int i = 0; i < array.length; i++) {
            if (i <= array.length / 2) {
                sumOfFirstHalf += array[i];
            } else {
                sumOfSecondHalf += array[i];
            }
        }

        return (sumOfFirstHalf > sumOfSecondHalf);
    }
}
