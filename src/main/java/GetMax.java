public class GetMax {

    //Напишите метод, который из двух параметров
    // типа int возвращает бОльшее значение.

    public static int getMax(int firstNumber, int secondNumber) {
        if (firstNumber >= secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}