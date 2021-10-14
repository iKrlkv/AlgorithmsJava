public class FizzBuzzWoof {
    //Print integers 1 to N, 1 < N < 100
    // but print:
    // “Fizz” if an integer is divisible by 3
    // “Fizz” if an integer contains 3,
    // “Buzz” if an integer is divisible by 5
    // “Buzz” if an integer contains 5,
    // “Woof” if an integer is divisible by 7
    // “Woof” if an integer contains 7

    //Fizz Buzz Woof: одна вариация расширилась до такой степени,
    //что получила собственное имя.
    //В этом случае число 3 становится Fizz,
    //5 становится Buzz,
    //а 7 становится Woof.
    //Основные правила в этой игре: любое число,
    //которое содержит число или делится на это число, заменяется вхождением слова.
    //Если число имеет 2 экземпляра этого числа (т. Е. 33 или 55) и делится на это число,
    //то слово произносится в этом примере три раза.

    public static String[] fizzBuzzWoof(int number) {

        if (number > 99 || number < 2) {
            return new String[]{};
        }

        String[] numbers = new String[number];

        int newNumber = 1;

        for (int i = 0; i < number; i++) {

            if (       newNumber / 10 == 3 && newNumber % 10 == 3
                    || newNumber / 10 == 5 && newNumber % 10 == 5
                    || newNumber / 10 == 7 && newNumber % 10 == 7) {
                numbers[i] = "Fizz Buzz Woof";
                newNumber++;
                continue;
            }

            if (String.valueOf(newNumber).contains("3")) {
                numbers[i] = "Fizz";
                newNumber++;
                continue;
            } else if (String.valueOf(newNumber).contains("5")) {
                numbers[i] = "Buzz";
                newNumber++;
                continue;
            } else if (String.valueOf(newNumber).contains("7")) {
                numbers[i] = "Woof";
                newNumber++;
                continue;
            }

            if (newNumber % 3 == 0) {
                numbers[i] = "Fizz";
                newNumber++;
                continue;
            } else if (newNumber % 5 == 0) {
                numbers[i] = "Buzz";
                newNumber++;
                continue;
            } else if (newNumber % 7 == 0) {
                numbers[i] = "Woof";
                newNumber++;
                continue;
            }

            numbers[i] = String.valueOf(newNumber);
            newNumber++;
        }

        return numbers;
    }
}