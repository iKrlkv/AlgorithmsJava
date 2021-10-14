import org.junit.Assert;
import org.junit.Test;

public class CheckIntFor3And5Test {

    //Given an integer M perform the following conditional actions:
    //If M is multiple of 3 and 5 then return "Good Number".
    //If M is only multiple of 3 and not of 5 then return "Bad Number"
    //If M is only multiple of 5 and not of 3 then return "Poor Number"
    //If M doesn't satisfy any of the above conditions then return "-1"

    @Test
    public void testCheckIntFor3And5() {

        int number1 = 9;
        int number2 = 10;
        int number3 = 15;
        int number4 = 0;
        int number5 = -9;
        int number6 = -10;
        int number7 = -15;
        String expectedResult1 = "Bad Number";
        String expectedResult2 = "Poor Number";
        String expectedResult3 = "Good Number";
        String expectedResult4 = "Good Number";
        String expectedResult5 = "Bad Number";
        String expectedResult6 = "Poor Number";
        String expectedResult7 = "Good Number";

        Assert.assertEquals(expectedResult1, CheckIntFor3And5.checkIntFor3And5(number1));
        Assert.assertEquals(expectedResult2, CheckIntFor3And5.checkIntFor3And5(number2));
        Assert.assertEquals(expectedResult3, CheckIntFor3And5.checkIntFor3And5(number3));
        Assert.assertEquals(expectedResult4, CheckIntFor3And5.checkIntFor3And5(number4));
        Assert.assertEquals(expectedResult5, CheckIntFor3And5.checkIntFor3And5(number5));
        Assert.assertEquals(expectedResult6, CheckIntFor3And5.checkIntFor3And5(number6));
        Assert.assertEquals(expectedResult7, CheckIntFor3And5.checkIntFor3And5(number7));
    }
}