import org.junit.Assert;
import org.junit.Test;

public class SortedArrayTest {

    // Test Data:
    // {12, 2, 3, 4, 5} -> {2, 3, 4, 5, 12}
    // {-3, 0, 155, -39, 1003} -> {-39, -3, 0, 155, 1003}

    @Test
    public void testSortedArray() {

        int[] testArray1 = {12, 2, 3, 4, 5};
        int[] testArray2 = {-3, 0, 155, -39, 1003};
        int[] expectedResult1 = {2, 3, 4, 5, 12};
        int[] expectedResult2 = {-39, -3, 0, 155, 1003};

        Assert.assertArrayEquals(expectedResult1, SortedArray.sortedArray(testArray1));
        Assert.assertArrayEquals(expectedResult2, SortedArray.sortedArray(testArray2));
    }
}
