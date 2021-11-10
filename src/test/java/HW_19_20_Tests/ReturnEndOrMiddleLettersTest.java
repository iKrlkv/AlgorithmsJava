package HW_19_20_Tests;

import HW_19_20.ReturnEndOrMiddleLetters;
import org.junit.Assert;
import org.junit.Test;

public class ReturnEndOrMiddleLettersTest {

    //method(“QAForEveryone”) -> “oneQAF”
    //method(“Java”) -> “avavavav”
    //method(“A”) -> “A”

    @Test
    public void testReturnEndOrMiddleLettersTest() {
        String testData1 = "QAForEveryone";
        String testData2 = "Java";
        String testData3 = "A";

        String expectedResult1 = "oneQAF";
        String expectedResult2 = "avavavav";
        String expectedResult3 = "A";

        Assert.assertEquals(expectedResult1, ReturnEndOrMiddleLetters.returnEndOrMiddleLetters(testData1));
        Assert.assertEquals(expectedResult2, ReturnEndOrMiddleLetters.returnEndOrMiddleLetters(testData2));
        Assert.assertEquals(expectedResult3, ReturnEndOrMiddleLetters.returnEndOrMiddleLetters(testData3));
    }
}
