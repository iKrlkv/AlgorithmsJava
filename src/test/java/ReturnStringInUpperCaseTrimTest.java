import org.junit.Assert;
import org.junit.Test;

public class ReturnStringInUpperCaseTrimTest {

    //Test Data:
    //“QA For  Everyone ” -> “QA FOR EVERYONE”
    //“ Java lessons  are fun” -> “JAVA LESSONS ARE FUN”

    @Test
    public void testReturnStringInUpperCaseTrim() {

        String testData1 = "QA For  Everyone ";
        String testData2 = " Java lessons  are fun";
        String expectedResult1 = "QA FOR EVERYONE";
        String expectedResult2 = "JAVA LESSONS ARE FUN";

        Assert.assertEquals(expectedResult1, ReturnStringInUpperCaseTrim.returnStringInUpperCaseTrim(testData1));
        Assert.assertEquals(expectedResult2, ReturnStringInUpperCaseTrim.returnStringInUpperCaseTrim(testData2));
    }
}
