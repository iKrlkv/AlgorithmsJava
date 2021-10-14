import org.junit.Assert;
import org.junit.Test;

public class AscendingSequenceTest {

    // Test Data:
    //a =  10
    //b =  25
    //n =  5
    //Expected result = {10, 15, 20, 25}
    //
    //
    //a =  10
    //b =  -25
    //n =  -5
    //Expected result = {-1}
    //
    //a =  10
    //b =  10
    //n =  2
    //Expected result = {-1}

    @Test
    public void testAscendingSequence() {
        int startNumber1 = 10;
        int endNumber1 = 25;
        int step1 = 5;
        int[] expectedResult1 = {10, 15, 20, 25};

        int startNumber2 = 10;
        int endNumber2 = -25;
        int step2 = -5;
        int[] expectedResult2 = {-1};

        int startNumber3 = 10;
        int endNumber3 = 10;
        int step3 = 2;
        int[] expectedResult3 = {-1};

        int[] actualResult = AscendingSequence.ascendingSequence(startNumber1, endNumber1, step1);
        Assert.assertArrayEquals(expectedResult1, actualResult);

        actualResult = AscendingSequence.ascendingSequence(startNumber2, endNumber2, step2);
        Assert.assertArrayEquals(expectedResult2, actualResult);

        actualResult = AscendingSequence.ascendingSequence(startNumber3, endNumber3, step3);
        Assert.assertArrayEquals(expectedResult3, actualResult);
    }
}
