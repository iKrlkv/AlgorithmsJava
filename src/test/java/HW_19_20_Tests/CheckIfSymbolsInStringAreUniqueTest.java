package HW_19_20_Tests;

import HW_19_20.CheckIfSymbolsInStringAreUnique;
import org.junit.Assert;
import org.junit.Test;

public class CheckIfSymbolsInStringAreUniqueTest {

    @Test
    public void testCheckIfSymbolsInStringAreUnique() {
        String testData1 = "abcdef";
        String testData2 = "abcdaef";

        boolean expectedResult1 = true;
        boolean expectedResult2 = false;

        Assert.assertEquals(expectedResult1, CheckIfSymbolsInStringAreUnique.checkIfSymbolsInStringAreUnique(testData1));
        Assert.assertEquals(expectedResult2, CheckIfSymbolsInStringAreUnique.checkIfSymbolsInStringAreUnique(testData2));

    }
}
