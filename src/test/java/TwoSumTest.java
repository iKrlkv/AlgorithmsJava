import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    // Test Data:
    // Input = {68, 5, 2, 100, 9, 12, 8}
    // targetNumber = 10
    // Expected Result =  {2, 6}

    // Input = {1, 20, 40, 60, -40, -20, -1}
    // targetNumber = -19
    // Expected Result =  {0, 5}

    // Input = {8, 5, 2, 0, 9, 12, 8}
    // targetNumber = 12
    // Expected Result =  {3, 5}

    @Test
    public void testTwoSum() {

        int[] testInput1 = {68, 5, 2, 100, 9, 12, 8};
        int[] testInput2 = {1, 20, 40, 60, -40, -20, -1};
        int[] testInput3 = {8, 5, 2, 0, 9, 12, 8};
        int testTargetNumber1 = 10;
        int testTargetNumber2 = -19;
        int testTargetNumber3 = 12;
        int[] expectedResult1 = {2, 6};
        int[] expectedResult2 = {0, 5};
        int[] expectedResult3 = {3, 5};

        Assert.assertArrayEquals(expectedResult1, TwoSum.twoSum(testInput1, testTargetNumber1));
        Assert.assertArrayEquals(expectedResult2, TwoSum.twoSum(testInput2, testTargetNumber2));
        Assert.assertArrayEquals(expectedResult3, TwoSum.twoSum(testInput3, testTargetNumber3));
    }

    @Test
    public void negativeTestTwoSum() {
        int[] testInput = {68, 5, 2, 100, 9, 12, 8};
        int testTargetNumber = Integer.MAX_VALUE;
        int[] expectedResult = {};

        Assert.assertArrayEquals(expectedResult, TwoSum.twoSum(testInput, testTargetNumber));
    }
}
