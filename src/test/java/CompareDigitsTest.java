import org.junit.Assert;
import org.junit.Test;

public class CompareDigitsTest {

    //Test Data:
    //89, 89
    //Expected result: 0
    //-89, 89
    //Expected result: -1
    //89, -89
    //Expected result: 1

    @Test
    public void testCompareDigits() {
        int firstNumber1 = 89;
        int secondNumber1 = 89;
        int firstNumber2 = -89;
        int secondNumber2 = 89;
        int firstNumber3 = 89;
        int secondNumber3 = -89;

        int expectedResult1 = 0;
        int expectedResult2 = -1;
        int expectedResult3 = 1;

        Assert.assertEquals(expectedResult1, CompareDigits.compareDigits(firstNumber1, secondNumber1));
        Assert.assertEquals(expectedResult2, CompareDigits.compareDigits(firstNumber2, secondNumber2));
        Assert.assertEquals(expectedResult3, CompareDigits.compareDigits(firstNumber3, secondNumber3));
    }
}