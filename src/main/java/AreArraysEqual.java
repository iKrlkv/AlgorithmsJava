public class AreArraysEqual {

    // Напишите метод, который принимает на вход 2 массива
    // целых положительных чисел, и возвращает true, если
    // каждый элемент первого массива равен элементу второго
    // массива с тем же индексом

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        boolean result = true;

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                result = false;
            }
        }
        return result;
    }
}
