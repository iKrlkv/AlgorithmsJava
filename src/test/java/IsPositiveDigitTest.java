import org.junit.Assert;
import org.junit.Test;

public class IsPositiveDigitTest {

    @Test
    public void testIsPositiveDigit() {
        //Проверьте работу метода на числах 555, 0 и -555.

        int digit1 = 555;
        int digit2 = 0;
        int digit3 = -555;

        boolean expectedResult1 = true;
        boolean expectedResult2 = true;
        boolean expectedResult3 = false;

        Assert.assertEquals(expectedResult1, IsPositiveDigit.isPositiveDigit(digit1));
        Assert.assertEquals(expectedResult2, IsPositiveDigit.isPositiveDigit(digit2));
        Assert.assertEquals(expectedResult3, IsPositiveDigit.isPositiveDigit(digit3));
    }
}