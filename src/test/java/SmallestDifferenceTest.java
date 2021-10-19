import org.junit.Assert;
import org.junit.Test;

public class SmallestDifferenceTest {

    // Test Data:
    // Input = {8, 5, 2, 0, 9, 12, 8}
    // Expected Result =  {9, 8}

    // Input = {8, -55, 2, -54, -12}
    // Expected Result =  {-55, -54}

    @Test
    public void testSmallestDifference() {

        int[] testInput1 = {8, 5, 2, 0, 9, 12, 8};
        int[] testInput2 = {8, -55, 2, -54, -12};
        int[] expectedResult1 = {8, 8};
        int[] expectedResult2 = {-55, -54};

        Assert.assertArrayEquals(expectedResult1, SmallestDifference.smallestDifference(testInput1));
        Assert.assertArrayEquals(expectedResult2, SmallestDifference.smallestDifference(testInput2));
    }
}
