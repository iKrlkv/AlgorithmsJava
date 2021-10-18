import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicatesTest {

//      Test Data
//      {3, 4, 2, 6, 4, 3, 3, 3, 2, 2} -> {3, 4, 2, 6}
//      {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0} -> {0, 1, 2, 3, 4, 5}

    @Test
    public void testRemoveDuplicates() {

        int[] testArray1 = {3, 4, 2, 6, 4, 3, 3, 3, 2, 2};
        int[] testArray2 = {0, 1, 2, 3, 4, 5, 4, 3, 2, 1, 0};
        int[] testResult1 = {3, 4, 2, 6};
        int[] testResult2 = {0, 1, 2, 3, 4, 5};

        Assert.assertArrayEquals(testResult1, RemoveDuplicates.removeDuplicates(testArray1));
        Assert.assertArrayEquals(testResult2, RemoveDuplicates.removeDuplicates(testArray2));
    }
}
