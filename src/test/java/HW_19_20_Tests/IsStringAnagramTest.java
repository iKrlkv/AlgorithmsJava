package HW_19_20_Tests;

import HW_19_20.IsStringAnagram;
import org.junit.Assert;
import org.junit.Test;

public class IsStringAnagramTest {

    @Test
    public void testIsStringAnagram() {
        String testData1 = "O, Draconian devil!";
        String testData2 = "!Leonardo Da Vinci,";
        String testData3 = "Oh, lame saint!";
        String testData4 = "The Mona Lisa,!";

        boolean expectedResult1 = true;
        boolean expectedResult2 = true;

        Assert.assertEquals(expectedResult1, IsStringAnagram.isStringAnagram(testData1, testData2));
        Assert.assertEquals(expectedResult2, IsStringAnagram.isStringAnagram(testData3, testData4));

    }
}
