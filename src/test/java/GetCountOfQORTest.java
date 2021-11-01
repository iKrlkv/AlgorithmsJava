import org.junit.Test;
import org.testng.Assert;

public class GetCountOfQORTest {

    //Test Data
    //“QAForEveryone”
    //“Java lessons are fun”

    @Test
    public void testGetCountOfQOR() {

        String firstStringToTest = "QAForEveryone";
        String secondStringToTest = "Java lessons are fun";
        String expectedResult1 = "Qorro";
        String expectedResult2 = "or";

        Assert.assertEquals(GetCountOfQOR.getCountOfQOR(firstStringToTest), expectedResult1);
        Assert.assertEquals(GetCountOfQOR.getCountOfQOR(secondStringToTest), expectedResult2);

    }
}
