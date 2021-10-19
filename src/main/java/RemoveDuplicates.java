import java.awt.font.GraphicAttribute;
import java.util.Arrays;

public class RemoveDuplicates {

//      Написать алгоритм RemoveDuplicates,
//      который принимает на вход массив чисел,
//      и возвращает массив уникальных чисел.

    public static int[] removeDuplicates(int[] array) {

        int plug = findIntNotInArray(array);
        int plugs = 0;
        int[] resultArray;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == plug) {
                continue;
            } else {
                int uniqueElement = array[i];
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] == uniqueElement) {
                        array[j] = plug;
                        plugs++;
                    }
                }
            }
        }

        resultArray = new int[array.length - plugs];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] != plug) {
                resultArray[j] = array[i];
                j++;
            }
        }

        return resultArray;
    }


    private static int findIntNotInArray(int[] array) {
        int result = array[0];

        for (int i = 0; i < array.length; i++) {
            if (result == array[i]) {
                result--;
                i--;
            }
        }

        return result;
    }
}

