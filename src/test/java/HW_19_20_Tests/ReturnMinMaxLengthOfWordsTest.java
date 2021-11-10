package HW_19_20_Tests;

import HW_19_20.ReturnMinMaxLengthOfWords;
import org.junit.Assert;
import org.junit.Test;

public class ReturnMinMaxLengthOfWordsTest {

    //“What a wonderful day!” -> [“a”, “wonderful”, “0”]
    //“I love to learn Java!” -> [“I”, “learn”, “2”]

    @Test
    public void testReturnMinMaxLengthOfWords() {

        String testData1 = "What a wonderful day!";
        String testData2 = "I love to learn Java!";

        String[] expectedData1 = {"a", "wonderful", "0"};
        String[] expectedData2 = {"I", "learn", "2"};

        Assert.assertEquals(expectedData1, ReturnMinMaxLengthOfWords.returnMinMaxLengthOfWords(testData1));
        Assert.assertEquals(expectedData2, ReturnMinMaxLengthOfWords.returnMinMaxLengthOfWords(testData2));
    }
}
