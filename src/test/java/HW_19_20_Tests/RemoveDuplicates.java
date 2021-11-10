package HW_19_20_Tests;

import org.junit.Assert;
import org.junit.Test;

public class RemoveDuplicates {

    @Test
    public void testRemoveDuplicates() {
        String testData = "abcaczdbdakcazdbaz";
        String expectedResult = "abczdk";

        Assert.assertEquals(expectedResult, HW_19_20.RemoveDuplicates.removeDuplicates(testData));
    }
}
