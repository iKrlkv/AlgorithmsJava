import org.junit.Assert;
import org.junit.Test;

public class GetMaxTest {

    //Test Data:
    //3333, 9999
    //Expected Result = 9999

    @Test
    public void testGetMax() {

        int firstNumber = 3333;
        int secondNumber = 9999;
        int expectedResult = 9999;

        Assert.assertEquals(expectedResult, GetMax.getMax(firstNumber, secondNumber));
    }

}