package demoqa.test.elementstests;

import demoqa.pages.base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioBtnTest extends BasePage {
    @Test
    public void openRadioBtnPage() {
        navigateHomePage(0);
        radioBtn.getRadioBtnLink().click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demoqa.com/radio-button");
    }

    @Test
    public void clickYesBtn()  {
        openRadioBtnPage();
        radioBtn.clickYes();
        Assert.assertTrue(radioBtn.getMessageEl().isDisplayed());
        Assert.assertEquals(radioBtn.getMessage(), "You have selected Yes");
    }

    @Test
    public void clickImpressiveBtn() {
        openRadioBtnPage();
        radioBtn.clickImpressive();
        Assert.assertTrue(radioBtn.getMessageEl().isDisplayed());
        Assert.assertEquals(radioBtn.getMessage(), "You have selected Impressive");
    }

    @Test
    public void checkIsNoDisabled() {
        openRadioBtnPage();
        Assert.assertFalse(radioBtn.checkIsNoDisabled());
    }
}
