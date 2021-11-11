package HW_19_20_Tests;

import HW_19_20.IsPossibleToMakeString;
import org.junit.Assert;
import org.junit.Test;

public class IsPossibleToMakeStringTest {

    @Test
    public void testIsPossibleToMakeString() {
        String testEnterString1 = "QAForEveryone";
        String testExitString1 = "Verona";
        String testEnterString2 = "QAForEveryone";
        String testExitString2 = "frog";

        boolean expectedResult1 = true;
        boolean expectedResult2 = false;

        Assert.assertEquals(expectedResult1, IsPossibleToMakeString.isPossibleToMakeString(testEnterString1, testExitString1));
        Assert.assertEquals(expectedResult2, IsPossibleToMakeString.isPossibleToMakeString(testEnterString2, testExitString2));
    }
}
