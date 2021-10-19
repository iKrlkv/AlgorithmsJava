import org.junit.Assert;
import org.junit.Test;

public class ReturnArrayOfOnesTest {

    //Test Data:
    //Input = {1, 1, 1, 0, 0, 0, 1, 1}
    //Expected Result = {1, 1, 1}

    //	Input = {1, 0, 1, 1, 0, 1}
    //Expected Result = {1, 1}

    @Test
    public void testReturnArrayOfOnes() {

        int[] testInput1 = {1, 1, 1, 0, 0, 0, 1, 1};
        int[] expectedResult1 = {1, 1, 1};
        int[] testInput2 = {1, 0, 1, 1, 0, 1};
        int[] expectedResult2 = {1, 1};

        Assert.assertArrayEquals(expectedResult1, ReturnArrayOfOnes.returnArrayOfOnes(testInput1));
        Assert.assertArrayEquals(expectedResult2, ReturnArrayOfOnes.returnArrayOfOnes(testInput2));
    }
}
