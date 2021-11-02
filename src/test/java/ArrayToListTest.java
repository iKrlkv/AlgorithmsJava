import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ArrayToListTest {

    //Test Data:
    //“QA 4 Every1” -> [4, 1]
    //“45 тысяч 378” -> [4, 5, 3, 7, 8]

    @Test
    public void testArrayToList() {

        String testData1 = "QA 4 Every1";
        String testData2 = "45 тысяч 378";
        List<Integer> expectedResult1 = Arrays.asList(4, 1);
        List<Integer> expectedResult2 = Arrays.asList(4, 5, 3, 7, 8);

        Assert.assertEquals(expectedResult1, ArrayToList.arrayToList(testData1));
        Assert.assertEquals(expectedResult2, ArrayToList.arrayToList(testData2));
    }
}
