import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

    @Test
    public void testFizzBuzz() {
        int startNumber = 1;
        int endNumber = 15;
        String[] expectedResult = {"1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "Fizz Buzz"};

        FizzBuzz fizzBuzz = new FizzBuzz();

        String[] actualResult = fizzBuzz.fizzBuzz(startNumber, endNumber);

        Assert.assertArrayEquals(expectedResult, actualResult);
    }
}