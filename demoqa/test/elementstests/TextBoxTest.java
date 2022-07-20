package demoqa.test.elementstests;

import demoqa.pages.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TextBoxTest extends BasePage {
    @Test
    public void openTexBoxPage() {
        navigateHomePage(0);
        textBox.getTextBoxLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/text-box");
    }

    @Test
    public void validTextBoxInput() {
        openTexBoxPage();
        textBox.enterfullName("Stevan Milovanovic");
        textBox.enterEmail("stvnmil1995@gmail.com");
        textBox.enterCurrAddress("Dr.Petra Markovica 23");
        textBox.enterPerrAddress("Dragana Mancea 145");

        Assert.assertEquals(textBox.getFullName().getAttribute("value"), "Stevan Milovanovic");
        Assert.assertEquals(textBox.getEmail().getAttribute("value"), "stvnmil1995@gmail.com");
        Assert.assertEquals(textBox.getCurrAddress().getAttribute("value"), "Dr.Petra Markovica 23");
        Assert.assertEquals(textBox.getPerrAddress().getAttribute("value"), "Dragana Mancea 145");

        textBox.clickSubmit();
    }
}
