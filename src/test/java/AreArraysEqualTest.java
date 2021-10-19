import org.junit.Assert;
import org.junit.Test;

public class AreArraysEqualTest {

    //Test Data:
    //{1, 2, 3, 4, 5}
    //{1, 2, 3, 4, 5}
    //Expected result: true

    //{1, 2, 3, 4, 6}
    //{1, 2, 3, 4, 5}
    //Expected result: false

    @Test
    public void testAreArraysEqual() {
        int[] array1ToTest = {1, 2, 3, 4, 5};
        int[] array2ToTest = {1, 2, 3, 4, 5};
        boolean expectedResult1 = true;
        int[] array3ToTest = {1, 2, 3, 4, 6};
        int[] array4ToTest = {1, 2, 3, 4, 5};
        boolean expectedResult2 = false;

        Assert.assertEquals(expectedResult1, AreArraysEqual.areArraysEqual(array1ToTest, array2ToTest));
        Assert.assertEquals(expectedResult2, AreArraysEqual.areArraysEqual(array3ToTest, array4ToTest));
    }
}
