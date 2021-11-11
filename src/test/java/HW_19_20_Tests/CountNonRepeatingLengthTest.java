package HW_19_20_Tests;

import HW_19_20.CountNonRepeatingLength;
import org.junit.Assert;
import org.junit.Test;

public class CountNonRepeatingLengthTest {

    @Test
    public void testCountNonRepeatingLength() {

        String testData1 = "aabcb";
        String testData2 = "aaaaa";

        int expectedResult1 = 4;
        int expectedResult2 = 1;

        Assert.assertEquals(expectedResult1, CountNonRepeatingLength.countNonRepeatingLength(testData1));
        Assert.assertEquals(expectedResult2, CountNonRepeatingLength.countNonRepeatingLength(testData2));

    }
}
