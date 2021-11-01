import org.junit.Assert;
import org.junit.Test;

public class CountOfSpacesTest {

    //Test Data:
    //“QA For Everyone” -> 2
    //“Java lessons  are fun” -> 4

    @Test
    public void testCountOfSpaces() {
        String testData1 = "QA For Everyone";
        String testData2 = "Java lessons  are fun";
        int expectedResult1 = 2;
        int expectedResult2 = 4;

        Assert.assertEquals(expectedResult1, CountOfSpaces.countOfSpaces(testData1));
        Assert.assertEquals(expectedResult2, CountOfSpaces.countOfSpaces(testData2));
    }
}
