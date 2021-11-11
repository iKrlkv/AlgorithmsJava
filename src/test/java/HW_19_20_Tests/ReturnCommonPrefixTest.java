package HW_19_20_Tests;

import HW_19_20.ReturnCommonPrefix;
import org.junit.Assert;
import org.junit.Test;

public class ReturnCommonPrefixTest {

    @Test
    public void testReturnCommonPrefix() {
        String[] testData1 = {"flower","flow","flight"};
        String[] testData2 = {"dog","racecar","car"};

        String expectedResult1 = "fl";
        String expectedResult2 = "";

        Assert.assertEquals(expectedResult1, ReturnCommonPrefix.returnCommonPrefix(testData1));
        Assert.assertEquals(expectedResult2, ReturnCommonPrefix.returnCommonPrefix(testData2));
    }
}
