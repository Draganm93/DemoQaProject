package demoqa.test.elementstests;

import demoqa.pages.base.BasePage;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ButtonsTest extends BasePage {

    @Test
    public void openButtonsPage() {
        navigateHomePage(0);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        waitFor(1);
        buttonPage.getButtonsLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/buttons");
    }

    @Test
    public void doubleClickCheck() {
        openButtonsPage();
        buttonPage.clickDoubleClickButton();
        Assert.assertTrue(buttonPage.getDoubleMsg().isDisplayed());
        Assert.assertEquals(buttonPage.getDoubleMsg().getText(), "You have done a double click");
    }

    @Test
    public void rightClickCheck() {
        openButtonsPage();
        buttonPage.rightClickButtonAction();
        Assert.assertTrue(buttonPage.getRightMsg().isDisplayed());
        Assert.assertEquals(buttonPage.getRightMsg().getText(), "You have done a right click");
    }

    @Test
    public void dynamicClickCheck() {
        openButtonsPage();
        buttonPage.normalBtnAction();
        Assert.assertTrue(buttonPage.getDynamicMsg().isDisplayed());
        Assert.assertEquals(buttonPage.getDynamicMsg().getText(), "You have done a dynamic click");
    }
}

