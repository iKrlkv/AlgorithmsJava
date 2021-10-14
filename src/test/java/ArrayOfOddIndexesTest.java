import org.junit.Assert;
import org.junit.Test;

public class ArrayOfOddIndexesTest {

    //Test Data:
    //Input = {-45, 590, 234, 985, 12, 68}
    //Expected Result =  {590, 985, 68}

    @Test
    public void testArrayOfOddIndexes() {

        int[] input = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        Assert.assertArrayEquals(expectedResult, ArrayOfOddIndexes.getArrayOfOddIndexes(input));

    }
}
