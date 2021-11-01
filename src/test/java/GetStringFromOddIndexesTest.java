import org.junit.Assert;
import org.junit.Test;

public class GetStringFromOddIndexesTest {

    //Test Data:
    //“QAForEveryone” -> “AoEeyn”
    //“JavaLessonsAreFun” -> “aaesnAeu”

    @Test
    public void testGetStringFromOddIndexes() {

        String testData1 = "QAForEveryone";
        String testData2 = "JavaLessonsAreFun";
        String expectedResult1 = "AoEeyn";
        String expectedResult2 = "aaesnAeu";

        Assert.assertEquals(expectedResult1, GetStringFromOddIndexes.getStringFromOddIndexes(testData1));
        Assert.assertEquals(expectedResult2, GetStringFromOddIndexes.getStringFromOddIndexes(testData2));

    }
}
