public class CompareDigits {

    public static int compareDigits(int firstNumber, int secondNumber) {
        if (firstNumber == secondNumber) {
            return 0;
        } else if (firstNumber > secondNumber) {
            return 1;
        } else {
            return -1;
        }
    }
}