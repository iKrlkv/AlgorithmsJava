package HW_19_20_Tests;

import HW_19_20.ReturnReversedString;
import org.junit.Assert;
import org.junit.Test;

public class ReturnReversedStringTest {

    @Test
    public void testReturnReversedString() {

        String testData1 = "abcdef";
        String expectedResult1 = "fedcba";

        Assert.assertEquals(expectedResult1, ReturnReversedString.returnReversedString(testData1));
    }
}
