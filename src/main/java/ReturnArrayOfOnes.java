public class ReturnArrayOfOnes {

    //Написать метод, который принимает на вход массив чисел 0 и 1,
    // и возвращает самую длинную последовательность единиц из входящего массива

    public static int[] returnArrayOfOnes(int[] array) {
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count1++;
            } else {
                if (count2 < count1) {
                    count2 = count1;
                }
                count1 = 0;
            }
        }

        int[] result = new int[count2];

        for (int i = 0; i <result.length; i++) {
            result[i] = 1;
        }

        return result;
    }
}
