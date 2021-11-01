import org.junit.Assert;
import org.junit.Test;

public class ReplaceOtoZeroTest {

    //Test Data:
    //“QAF0rEvery0ne” -> “QAForEveryone” ”
    //“Java less0ns are fun” -> “Java lessons are fun”

    @Test
    public void testReplaceOtoZero() {

        String testData1 = "QAF0rEvery0ne";
        String testData2 = "Java lessons are fun";
        String expectedResult1 = "QAForEveryone";
        String expectedResult2 = "Java lessons are fun";

        Assert.assertEquals(expectedResult1, ReplaceOtoZero.replaceOtoZero(testData1));
        Assert.assertEquals(expectedResult2, ReplaceOtoZero.replaceOtoZero(testData2));
    }
}
