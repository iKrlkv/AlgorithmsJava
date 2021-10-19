import org.junit.Assert;
import org.junit.Test;

public class IsSumOfFirstHalfEvenTest {

    //  Test Data:
    //  Input = {4, 6, 3, 7, 1, 2}
    //  Expected Result = true

    //  Input = {12, 48, 15, 125}
    //  Expected Result = false

    @Test
    public void testIsSumOfFirstHalfEven() {
        int[] testInput1 = {4, 6, 3, 7, 1, 2};
        boolean expectedResult1 = true;
        int[] testInput2 = {12, 48, 15, 125};
        boolean expectedResult2 = false;

        Assert.assertEquals(expectedResult1, IsSumOfFirstHalfEven.isSumOfFirstHalfEven(testInput1));
        Assert.assertEquals(expectedResult2, IsSumOfFirstHalfEven.isSumOfFirstHalfEven(testInput2));
    }
}
