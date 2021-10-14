import org.junit.Assert;
import org.junit.Test;

public class OddEvenTest {

    @Test
    public void testOddEven() {

        // -345 -> “Odd”
        //0 -> “Even”
        //222222 -> “Even”
        //2147483647 + 1 -> “Undefined”

        int testNumber1 = -345;
        int testNumber2 = 0;
        int testNumber3 = 222222;
        int testNumber4 = 2147483647 + 1;
        String expectedResult = "Odd";

        String actualResult =  OddEven.oddEven(testNumber1);
        Assert.assertEquals(expectedResult, actualResult);

        actualResult =  OddEven.oddEven(testNumber2);
        expectedResult = "Even";
        Assert.assertEquals(expectedResult, actualResult);

        actualResult = OddEven.oddEven(testNumber3);
        expectedResult = "Even";
        Assert.assertEquals(expectedResult, actualResult);

        actualResult = OddEven.oddEven(testNumber4);
        expectedResult = "Undefined";
        Assert.assertEquals(expectedResult, actualResult);

    }
}