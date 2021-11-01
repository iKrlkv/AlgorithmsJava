import org.junit.Assert;
import org.junit.Test;

public class ReturnLowerCaseStringWithoutSpacesTest {

    //Test Data:
    //“QA For  Everyone ” -> “qaforeveryone”
    //“ Java lessons  are fun” -> “javalessonsarefun”

    @Test
    public void testReturnLowerCaseStringWithoutSpaces() {

        String testData1 = "QA For  Everyone ";
        String testData2 = " Java lessons  are fun";
        String expectedResult1 = "qaforeveryone";
        String expectedResult2 = "javalessonsarefun";

        Assert.assertEquals(expectedResult1, ReturnLowerCaseStringWithoutSpaces.returnLowerCaseStringWithoutSpaces(testData1));
        Assert.assertEquals(expectedResult2, ReturnLowerCaseStringWithoutSpaces.returnLowerCaseStringWithoutSpaces(testData2));
    }
}
