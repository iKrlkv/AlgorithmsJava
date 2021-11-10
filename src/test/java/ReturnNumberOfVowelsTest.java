import org.junit.Assert;
import org.junit.Test;

public class ReturnNumberOfVowelsTest {

    //Test Data:
    //“QA For Everyone” -> 6
    //“Java lessons are fun” -> 7

    @Test
    public void ReturnNumberOfVowels() {

        String testData1 = "QA For Everyone";
        String testData2 = "Java lessons are fun";
        int expectedResult1 = 6;
        int expectedResult2 = 7;

        Assert.assertEquals(expectedResult1, ReturnNumberOfVowels.returnNumberOfVowels(testData1));
        Assert.assertEquals(expectedResult2, ReturnNumberOfVowels.returnNumberOfVowels(testData2));

        Assert.assertEquals(expectedResult1, ReturnNumberOfVowels.returnNumberOfVowels2(testData1));
        Assert.assertEquals(expectedResult2, ReturnNumberOfVowels.returnNumberOfVowels2(testData2));
    }
}
