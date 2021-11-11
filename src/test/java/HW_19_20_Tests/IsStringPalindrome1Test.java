package HW_19_20_Tests;

import HW_19_20.IsStringPalindrome1;
import org.junit.Assert;
import org.junit.Test;

public class IsStringPalindrome1Test {

    @Test
    public void testIsStringPalindrome1() {

        String testData = "А роза упала на лапу Азора";

        boolean expectedResult = true;

        Assert.assertEquals(expectedResult, IsStringPalindrome1.isStringPalindrome(testData));
    }
}
