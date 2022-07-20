package demoqa.test.elementstests;

import demoqa.pages.base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest extends BasePage {
    @Test
    public void goToCheckBoxPage() {
        navigateHomePage(0);
        checkBox.getCheckBoxLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/checkbox");
    }

    @Test
    public void clickCheckBox() {
        goToCheckBoxPage();
        checkBox.clickCheckBox();
        Assert.assertTrue(checkBox.getCheckBox().isEnabled());
    }

    @Test
    public void checkIsMessageDisplayed() {
        clickCheckBox();
        Assert.assertTrue(checkBox.getMessageEl().isDisplayed());
    }

    @Test
    public void clickSomeCheckBoxes() {
        goToCheckBoxPage();
        checkBox.expandBtn();
        checkBox.clickCheckBoxInt(4);
        checkBox.clickCheckBoxInt(6);
        checkBox.clickCheckBoxInt(8);
        Assert.assertTrue(checkBox.getMessageEl().isDisplayed());
    }

    @Test
    public void expandBtn() {
        goToCheckBoxPage();
        checkBox.expandBtn();
        for (int i = 0; i < checkBox.getAllCheckBoxes().size(); i++) {
            Assert.assertTrue(checkBox.getAllCheckBoxes().get(i).isDisplayed());
        }
    }

    @Test
    public void expandThanCollapse() {
        expandBtn();
        checkBox.collapseBtn();
        Assert.assertTrue(checkBox.getCheckBox().isEnabled());
    }
}
