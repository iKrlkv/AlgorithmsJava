import org.junit.Assert;
import org.junit.Test;

public class ArrayMaxMinAvgTest {

    //Test Data:
    //{1, 2, 3, 4, 5} -> {5, 1, 3}
    //{-3, 0, 155, -39, 1003} -> {1003, -39, 223}

    @Test
    public void testArrayMaxMinAvg() {

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {-3, 0, 155, -39, 1003};
        int[] array3 = {1};

        int[] expectedResult = {5, 1, 3};

        Assert.assertArrayEquals(expectedResult, ArrayMaxMinAvg.getArrayMaxMinAvg(array1));

        expectedResult = new int[]{1003, -39, 223};
        Assert.assertArrayEquals(expectedResult, ArrayMaxMinAvg.getArrayMaxMinAvg(array2));

        expectedResult = new int[]{1, 1, 1};
        Assert.assertArrayEquals(expectedResult, ArrayMaxMinAvg.getArrayMaxMinAvg(array3));

    }
}
