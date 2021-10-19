import org.junit.Assert;
import org.junit.Test;

public class ZeroSumTest {

    //Test Data:
    //{35, 23, 12, 89, -23, -48, 100}
    //Expected result = {23, -23}

    @Test
    public void testZeroSum() {

        int[] testArray = {35, 23, 12, 89, -23, -48, 100};
        int[] expectedResult = {23, -23};

        Assert.assertArrayEquals(expectedResult, ZeroSum.zeroSum(testArray));
    }

}
