import org.junit.Assert;
import org.junit.Test;

public class PosNeqSequenceTest {

    //Test Data:
    //n = 222;
    //Expected result = 24 753
    //n = -10;
    //Expected result = 56;

    @Test
    public void testPosNeqSequence() {

        int n1 = 222;
        int n2 = -10;
        int expectedResult = 24_753;

        Assert.assertEquals(expectedResult, PosNegSequence.posNeqSequence(n1));

        expectedResult = 56;
        Assert.assertEquals(expectedResult, PosNegSequence.posNeqSequence(n2));

    }

}
