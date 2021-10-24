public class AscendingSequence {

    public static int[] ascendingSequence(int startNumber, int endNumber, int step) {

        //Написать алгоритм AscendingSequence,
        // который строит возрастающую последовательность чисел от a до b с шагом n.

        if (startNumber % step != 0) {
            System.out.println("Enter a startNumber multiple of step");
        } else if (endNumber % step != 0) {
            System.out.println("Enter a endNumber multiple of step");
        }

        if (endNumber <= startNumber) {
            return new int[]{-1};
        }

        int numberOfSteps = (endNumber - startNumber) / step + 1;
        int[] result = new int[numberOfSteps];

        for (int i = 0; i < numberOfSteps; i++) {
            result[i] = startNumber;
            startNumber += step;
        }

        return result;
    }
}
