import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzWoofTest {

    @Test
    public void testFizzBuzzWoof() {

        int testNumber1 = 10;
        int testNumber2 = 35;
        int testNumber3 = 78;
        int testNumber4 = 0;
        int testNumber5 = -10;
        int testNumber6 = 101;

        String[] expectedResult1 = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "Woof", "8", "Fizz", "Buzz"};
        String[] expectedResult2 =
                {"1", "2", "Fizz", "4", "Buzz", "Fizz", "Woof", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz",
                        "Woof", "Buzz", "16", "Woof", "Fizz", "19", "Buzz", "Fizz", "22", "Fizz", "Fizz",
                        "Buzz", "26", "Woof", "Woof", "29", "Fizz", "Fizz", "Fizz", "Fizz Buzz Woof", "Fizz",
                        "Fizz"};
        String[] expectedResult3 =
                {"1", "2", "Fizz", "4", "Buzz", "Fizz", "Woof", "8", "Fizz", "Buzz", "11", "Fizz", "Fizz",
                        "Woof", "Buzz", "16", "Woof", "Fizz", "19", "Buzz", "Fizz", "22", "Fizz", "Fizz",
                        "Buzz", "26", "Woof", "Woof", "29", "Fizz", "Fizz", "Fizz", "Fizz Buzz Woof", "Fizz",
                        "Fizz", "Fizz", "Fizz", "Fizz", "Fizz", "Buzz", "41", "Fizz", "Fizz", "44", "Buzz",
                        "46", "Woof", "Fizz", "Woof", "Buzz", "Buzz", "Buzz", "Fizz", "Buzz", "Fizz Buzz Woof",
                        "Buzz", "Buzz", "Buzz", "Buzz", "Fizz", "61", "62", "Fizz", "64", "Buzz", "Fizz", "Woof",
                        "68", "Fizz", "Woof", "Woof", "Woof", "Fizz", "Woof", "Buzz", "Woof", "Fizz Buzz Woof",
                        "Woof"};
        String[] expectedResult4 = {};
        String[] expectedResult5 = {};
        String[] expectedResult6 = {};

        String[] vas = new String[] {"a", "B"};
        vas.toString();

        Assert.assertArrayEquals(expectedResult1, FizzBuzzWoof.fizzBuzzWoof(testNumber1));
        Assert.assertArrayEquals(expectedResult2, FizzBuzzWoof.fizzBuzzWoof(testNumber2));
        Assert.assertArrayEquals(expectedResult3, FizzBuzzWoof.fizzBuzzWoof(testNumber3));
        Assert.assertArrayEquals(expectedResult4, FizzBuzzWoof.fizzBuzzWoof(testNumber4));
        Assert.assertArrayEquals(expectedResult5, FizzBuzzWoof.fizzBuzzWoof(testNumber5));
        Assert.assertArrayEquals(expectedResult6, FizzBuzzWoof.fizzBuzzWoof(testNumber6));
    }
}