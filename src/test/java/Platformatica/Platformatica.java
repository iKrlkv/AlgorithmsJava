import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

import static utils.TestUtils.scrollClick;

public class EntityArithmeticInline extends BaseTest {

    @Test
    public void testSaveDraft() {
        final String f1Value = "11";
        final String f2Value = "12";
        final int expectedAmountOfRows = 1;
        final String[] expectedValues = new String[] {"", "11", "12", "0", "0", "0", "0", "menu"};

        scrollClick(getDriver(), By.xpath("//p[text()=' Arithmetic Inline ']"));

        getDriver().findElement(By.xpath("//i[text()='create_new_folder']")).click();
        getDriver().findElement(By.xpath("//input[@id='f1']")).sendKeys(f1Value);
        getDriver().findElement(By.xpath("//input[@id='f2']")).sendKeys(f2Value);
        getWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='pa-entity-form-draft-btn']")));
        getDriver().findElement(By.xpath("//button[@id='pa-entity-form-draft-btn']")).click();

        List<WebElement> actualAmountOfRows = getDriver().findElements(By.xpath("//tbody//tr"));
        List<String> actualValues = getDriver().findElements(By.xpath("//tbody//td")).stream().map(WebElement::getText).collect(Collectors.toList());

        Assert.assertEquals(actualAmountOfRows.size(), expectedAmountOfRows);
        Assert.assertEquals(actualValues.size(), expectedValues.length);

        for (int i = 0; i < expectedValues.length; i++) {
            Assert.assertEquals(actualValues.get(i), expectedValues[i]);
        }
    }
}
